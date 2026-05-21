package treino2;

import java.time.LocalDate;

public class ClassePrincipal {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Urbano", "Arroz", 10, 100, LocalDate.of(2026, 7, 3));
		Produto p2 = new Produto("SevenBoys", "Pão de Forma", 5, 200, LocalDate.of(2025, 10, 20));
		Produto p3 = new Produto("Urbano", "Feijão", 12, 50, LocalDate.of(2024, 8, 12));
		Produto p4 = new Produto("Jack Daniels", "Whisky", 120, 30, LocalDate.of(2029, 1, 30));

		LojaMateriais l1 = new LojaMateriais();
		
		l1.adicionarProduto(p1);
		l1.adicionarProduto(p2);
		l1.adicionarProduto(p3);
		l1.adicionarProduto(p4);
		
		
		System.out.println(l1.obterProdutoMaisCaro(null));
	
		System.out.println(l1.obterProdutosVencidos());
		
		System.out.println(l1.obterProdutosMarca("Urbano", 0, 110));

		System.out.println();
		
		Conta c1 = new Conta("Julio", 3000);
		Conta c2 = new Conta("Andreia", 10000);
		
		c1.sacar(200);
		System.out.println();
		c2.depositar(300);
		System.out.println();
		c1.transferir(c2, 10);
		System.out.println();
		c2.simularInvestimento(1000, 12);
	}

}
