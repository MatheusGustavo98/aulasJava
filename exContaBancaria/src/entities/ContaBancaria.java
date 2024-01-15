package entities;

public class ContaBancaria {
	private int numeroConta;
	private String nomeTitular;
	private double saldoConta;
	
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(depositoInicial);
	}	
	public ContaBancaria(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}	
	

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldoConta() {
		return saldoConta;
	}
	

	public void deposito(double deposito) {
		saldoConta += deposito; 
	}
	
	public void saque(double valorSaque) {
		saldoConta -= (valorSaque+5);
	}
	
	
	public String toString() {
		return "numero da conta: "
				+String.format("%d\n", numeroConta)
				+"Nome do Titular: "
				+ nomeTitular
				+"\nSaldo da conta: "
				+ saldoConta;
	}

}
