package sisfacul;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Program - Classe Scanner
		
		Scanner read = new Scanner (System.in);
		int escolha = 0;
		Aluno a = new Aluno ();
		Professor p = new Professor();
		
		do {
			
			Menu();
			escolha = read.nextInt();
			
			switch(escolha) {
			case 1:
				a.cadastrarAluno();
				break;
			case 2:
				p.cadastrarProfessor();
				break;
			case 3:
				a.dadosAluno();
				break;
			case 4:
				p.dadosProfessor();
				break;
			case 5:
				break;
			}
			
			 
		}while (escolha != 3);
				
		read.close(); // Fecha o objeto

	}

	public static  void Menu () {
		System.out.println("MENU PRINCIPAL: ");
		System.out.println("-----------------");
		System.out.println("1 - Cadastrar aluno: \n");
		System.out.println("2 - Cadastrar professor: \n");
		System.out.println("3 - Exibir os dados do aluno: \n");
		System.out.println("4 - Exibir os dados do professor: \n");
		System.out.println("5 - Sair!");
	}
	
}
