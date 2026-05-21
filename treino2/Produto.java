package treino2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Produto {
	
	private String marca;
	private String modelo;
	private int preco;
	private int qtdEstoque;
	private LocalDate dataValidade;
	
	public Produto(String marca, String modelo, int preco, int qtdEstoque, LocalDate dataValidade) {
		super();
		setMarca(marca);
		setModelo(modelo);
		setPreco(preco);
		setQtdEstoque(qtdEstoque);
		setDataValidade(dataValidade);
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

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		if (preco < 0) {
			throw new IllegalArgumentException("Preço Invalido");
		}
		this.preco = preco;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		if (qtdEstoque < 0) {
			throw new IllegalArgumentException("Quantidade no estoque invalida");
		}
		this.qtdEstoque = qtdEstoque;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate dataValidade) {
		if (dataValidade == null) {
			throw new IllegalArgumentException("Data de validade Invalida");
		}
		this.dataValidade = dataValidade;
	} 
	
	List<Produto> produto;
	
	public Produto() {
		produto = new ArrayList<Produto>();
	}
	
	
	public void adicionarEstoque(Produto p){
		produto.add(p);
	}
	
	public int venderProduto(int valor) {
		if (valor > qtdEstoque) {
			throw new IllegalArgumentException("O valor ultrapassa a quantidade do estoque");
		}
		return qtdEstoque - valor;
	}
	public void verificarValidade() {
		
		for (Produto p : produto) {
			if (p.getDataValidade().isBefore(LocalDate.now())) {
				System.out.println("Dentro da Validade");
			}
			System.out.println("Vencido");
		}
	}

	@Override
	public String toString() {
		return "Produto [marca=" + marca + ", modelo=" + modelo + ", preco=" + preco + ", qtdEstoque=" + qtdEstoque
				+ ", dataValidade=" + dataValidade + "]";
	}
	
	

}
