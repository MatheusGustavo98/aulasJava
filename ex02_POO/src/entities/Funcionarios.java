package entities;

public class Funcionarios {
	public String nome;
	public double salBruto;
	public double taxaDesconto;
	
	public double salLiquido() {
		return (salBruto - taxaDesconto);
	}
	
	public void incremento(double percentage) {
		salBruto = (salBruto*(percentage/100))+salBruto;
	}
	
	public String toString() {
		return "Funcionário:"
			+ nome
			+ ", $ "
			+ String.format("%.2f\n", salLiquido());		
	}
}
