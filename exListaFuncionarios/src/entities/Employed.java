package entities;

public class Employed {
	private int id;
	private String name;
	private double salary;
	
	public Employed() {
		
	}
	
	public Employed(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Employed(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}
	
	
	public void aumento(double tax) {
		salary += (salary*(tax/100));
	}

	public String toString() {
		return "Employed [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	

}
