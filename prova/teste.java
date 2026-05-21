package prova;

import java.time.LocalDate;

public class teste {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro("Volkswagen","Gol", "FTX2A45", 2010, 21000, LocalDate.of(2024, 3, 14));
		Carro c2 = new Carro("Chevrolet", "Onix", "JKM9B12", 2015, 38000, LocalDate.of(2024, 11, 29));
		Carro c3 = new Carro("Honda", "Civiv", "LPR4C67", 2010, 34000, LocalDate.of(2023, 6, 7));
		Carro c4 = new Carro("Chevrolet", "Cruise", "QWE7D89", 2019 ,79000, LocalDate.of(2025, 1, 18));
		Carro c5 = new Carro("Volkswagen", "Polo", "ZTR1F23", 2019, 58000, LocalDate.of(2024, 8, 25));

		Revendedora r1 = new Revendedora();
		
		r1.adicionarCarro(c1);
		r1.adicionarCarro(c2);
		r1.adicionarCarro(c3);
		r1.adicionarCarro(c4);
		r1.adicionarCarro(c5);
		
		//Um carro a partir de sua placa, retornando null caso o carro não exista
		System.out.println(r1.obterCarroPelaPlaca("2"));
		
		System.out.println();
		
		//O carro mais caro de um determinado ano
		System.out.println(r1.obterCarroMaisCaroAno(2019));
		
		System.out.println();
		
		//Todos os carros de uma determinada marca, cujo preço esteja entre um intervalo de X e Y
		System.out.println(r1.obterCarrosMarca("Volkswagen", 10000,60000));
		
		System.out.println();
		
		System.out.println(c1.calcularDepreciacao(2010,21000));
	}

}
