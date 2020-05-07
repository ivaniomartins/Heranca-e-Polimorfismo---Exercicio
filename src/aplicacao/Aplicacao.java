package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.PessoaFisica;
import entidades.PessoaJuridica;
import entidades.Pessoas;

public class Aplicacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner print = new Scanner(System.in);

		List<Pessoas> list = new ArrayList<>();

		System.out.println("Entre com a quantidade de Declarantes:  ");
		int n = print.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.print("Pessoa Fisíca ou Jurídica (f / j) ? : ");
			char ch = print.next().charAt(0);
			System.out.println();
			System.out.print("Nome:  ");
			print.nextLine();
			String nome = print.nextLine();
			System.out.print("Renda Anual: ");
			Double rendaAnual = print.nextDouble();

			if (ch == 'f') {

				System.out.println("Informe os Gastos com Saude: ");
				double gastosSaude = print.nextDouble();

				list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));

			} else {

				System.out.println("Informe a quantidade de Funcionários");
				int nrFuncionarios = print.nextInt();

				list.add(new PessoaJuridica(nome, rendaAnual, nrFuncionarios));
			}
		}
// Variável sum vai pegar ela mesma e somar com o total de impostos da lista
		
		double sum = 0.0;
		System.out.println("Relação dos declarantes: ");
		
		for(Pessoas pessoa: list) {
			
			double imposto = pessoa.imposto();
			
			System.out.println("Nome: " + pessoa.getNome() + "\n" +
			 "Valor a Pagar: "+ "R$" + String.format("%.2f", imposto));			
			sum += imposto;	
			
		}
		
		System.out.println();
		
		System.out.println("Valor total arrecadado :  " + "R$" + sum);
		
		print.close();

	}

}
