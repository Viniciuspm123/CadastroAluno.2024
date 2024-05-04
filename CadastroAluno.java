package cadastroAluno;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroAluno {

	public static void main(String[] args) {
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Cadastrar aluno :");
			System.out.println("2. Mostrar todos os alunos cadastrados :");
			System.out.println("3. Sair");
			System.out.println("");
			System.out.println("Escolha uma opção :");
			int opcao = sc.nextInt();

			if (opcao == 1) {
				System.out.println("Cadastrar aluno:");
				System.out.println("Digite o nome do aluno(a):");
				String nome = sc.next();
				System.out.println("Digite a idade do aluno :");
				int idade = sc.nextInt();
				System.out.println("Digite a nota do aluno :");
				double nota = sc.nextDouble();

				Aluno aluno = new Aluno(nome, idade, nota);
				alunos.add(aluno);
				System.out.println("Aluno Cadastrado com sucesso!");

			} else if (opcao == 2) {
				System.out.println("2. Mostrar todos os alunos cadastrados :");
				for (Aluno aluno : alunos) {
					System.out.println(aluno);
				}
			} else if (opcao == 3) {
				System.out.println("Saindo.......");
				break;
			} else {
				System.out.println("Opção Inválida. Tente Novamente");
			}

		}
		sc.close();
	}

}