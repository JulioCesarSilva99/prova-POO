package treino2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LojaMateriais {
	
	List<Produto> lojamateriais;
	
	public LojaMateriais() {
		lojamateriais = new ArrayList<Produto>();
	}
	public void adicionarProduto(Produto p) {
		lojamateriais.add(p);
	}
	
	public Produto obterProdutoMaisCaro(String marca) {
		
		int maisCaro = Integer.MIN_VALUE;
		Produto  produtoMaisCaro = null;
		
		for (Produto p : lojamateriais) {
			if (p.getPreco() > maisCaro) {
				maisCaro = p.getPreco();
				produtoMaisCaro = p;
			}
		}
		return produtoMaisCaro;
	}
	public List<Produto> obterProdutosMarca(String marca,double precoMin, double precoMax){
		
		List<Produto> listaPesquisa = new ArrayList<Produto>();
		
		for (Produto p : lojamateriais) {
			if(p.getMarca().equals(marca) && p.getPreco() < precoMin && p.getPreco() < precoMax) {
				listaPesquisa.add(p);
			}
		}
		return listaPesquisa;
	}

	public List<Produto> obterProdutosVencidos() {
		
		List<Produto> listaPesquisa = new ArrayList<Produto>();
		
		for(Produto p : lojamateriais) {
			if(p.getDataValidade().isBefore(LocalDate.now())) {
				listaPesquisa.add(p);
			}
		}
		return listaPesquisa;
	}
}
