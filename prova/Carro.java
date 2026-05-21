package prova;

import java.time.LocalDate;

public class Carro {
	
	private String marca;
	private String modelo;
	private String placa;
	private int ano;
	private double preco;
	private LocalDate dataAquisicao;
	
	public Carro(String marca, String modelo, String placa, int ano, double preco, LocalDate dataAquisicao) {
		setMarca(marca);
		setModelo(modelo);
		setPlaca(placa);
		setAno(ano);
		setPreco(preco);
		setDataAquisicao(dataAquisicao);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca == null || marca.isBlank()) {
			throw new IllegalArgumentException("Marca Invalida");
		}
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo == null || modelo.isBlank()) {
			throw new IllegalArgumentException("Modelo Invalido");
		}
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		if (placa == null || placa.isBlank()) {
			throw new IllegalArgumentException("Placa Invalida");
		}
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano <= 0) {
			throw new IllegalArgumentException("Ano Invalido");
		}
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 0) {
			throw new IllegalArgumentException("Preço Invalido");
		}
		this.preco = preco;
	}

	public LocalDate getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(LocalDate dataAquisicao) {
		if (dataAquisicao == null) {
			throw new IllegalArgumentException("Data da Aquisição Invalida");
		}
		this.dataAquisicao = dataAquisicao;
	}
	
	public double calcularDepreciacao(int ano, double preco) {
		
		double montante = 0;
		
		if (ano <= 0) {
			throw new IllegalArgumentException("O ano do Carro não pode ser negativo");
		}
		if (ano < 2016) {
			montante = preco * Math.pow(1 + 0.07, LocalDate.now().getYear() - ano);
			
		}
		if (ano >= 2016) {
			 montante = preco * Math.pow(1 + 0.05, LocalDate.now().getYear() - ano);
		}
		
		return montante;
		
	}

	@Override
	public String toString() {
		return "Marca:" + marca + "\nModelo:" + modelo + "\nPlaca:" + placa + "\nAno=" + ano + "\nPreco:" + preco
				+ "\nData da Aquisicao:" + dataAquisicao + "]";
	}
	
	
	
	

}
