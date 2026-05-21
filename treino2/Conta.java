package treino2;

public class Conta {
	
	private String nomeTitular;
	private double saldo;
	
	public Conta(String nomeTitular, double saldo) {
		setNomeTitular(nomeTitular);
		setSaldo(saldo);
	
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		if (nomeTitular == null || nomeTitular.isBlank()) {
			throw new IllegalArgumentException("Nome do Titular Invalido");
		}
		this.nomeTitular = nomeTitular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void depositar(double valor) {
		if(valor <=0) {
			throw new IllegalArgumentException("Valor a ser depositado invalido");
		}
		
		System.out.println("Deposito realizado");
		saldo += valor;
		System.out.println(nomeTitular +", seu saldo é de: R$"+ saldo);
		
	}
	public void sacar(double valor) {
		if (valor <=0) {
			throw new IllegalArgumentException("Valor a ser sacado Invalido por ser negativo");
		}
		if (valor > saldo) {
			throw new IllegalArgumentException("Valor a ser sacado excede o saldo");
		}
		
		System.out.println("Saque realizado");
		saldo -= valor;
		System.out.println(nomeTitular +", seu saldo é de: R$"+ saldo);
		
	}
	
	public void transferir(Conta destinatario, double valor) {
		
		if (destinatario.equals(this)) {
			throw new IllegalArgumentException("A Conta não pode ser a sua");
		}
		if (valor <=0) {
			throw new IllegalArgumentException("Valor a ser transferido nao pode ser negativo");
		}
		if (valor > saldo) {
			throw new IllegalArgumentException("Valor a ser transferido excede o saldo");	
		}
		this.saldo -= valor;
		
		System.out.println("Transferencia realizada");
		destinatario.saldo += valor;
		System.out.println(nomeTitular +", seu saldo é de: R$"+ saldo);
	}
	public String simularInvestimento(double capitalInicial, int tempo) {
		if (capitalInicial <=0) {
			throw new IllegalArgumentException("Valor a ser investido Invalido por ser negativo");
		}
		if (tempo <= 0) {
			throw new IllegalArgumentException("Tempo de investimento Invalido por ser negativo");
		}
		
		double montante = capitalInicial * Math.pow(1 + 0.01, tempo);
		
		return "O valor seria de: R$" + montante;
	}
	
	@Override
	public String toString() {
		return "Conta [nomeTitular=" + nomeTitular + ", saldo=" + saldo + "]";
	}
	
	

}
