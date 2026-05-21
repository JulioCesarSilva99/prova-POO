package prova;

import java.util.ArrayList;
import java.util.List;

public class Revendedora {
	
	List<Carro> revendedora;
	
	public Revendedora() {
		revendedora = new ArrayList<Carro>();
	}
	public void adicionarCarro(Carro c) {
		revendedora.add(c);
		
		//Um carro a partir de sua placa, retornando null caso o carro não exista
	}
	public List<Carro> obterCarroPelaPlaca(String placa){
		
		List<Carro> listaPesquisa = new ArrayList<Carro>();
		
		for (Carro c: revendedora) {
			
			if(c.getPlaca().equals(placa)) {
				listaPesquisa.add(c);
				return listaPesquisa;
			}
		}
		return null;
		
		
		}
	//O carro mais caro de um determinado ano
	public Carro obterCarroMaisCaroAno(int ano){
		
		double maisCaro = Integer.MIN_VALUE;
		Carro carroMaisCaro = null;
		
		for(Carro c : revendedora) {
			if(c.getPreco() > maisCaro && c.getAno() == ano) {
				maisCaro = c.getPreco();
			carroMaisCaro = c;
			}
		}
		return carroMaisCaro;
	}
	////Todos os carros de uma determinada marca, cujo preço esteja entre um intervalo de X e Y
	public List<Carro> obterCarrosMarca(String marca, double precoMin,double precoMax){
		
		List<Carro> listaPesquisa = new ArrayList<Carro>();
		
		for(Carro c: revendedora) {
			if(c.getMarca().equals(marca) && c.getPreco() > precoMin && c.getPreco() < precoMax) {
				listaPesquisa.add(c);
			}
		}
		return listaPesquisa;
	}

}
