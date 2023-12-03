package sisfacul;

import java.util.Scanner;

public abstract class Pessoa {
	protected String nome;
	protected String cpf;
	protected Sexo sexo;
	protected Endereco endereco;
	Scanner leitura = new Scanner(System.in);

	public Pessoa() {
		this.endereco = new Endereco();
	}

	public Pessoa(String nome, String cpf, Sexo sexo, Endereco endereco, String tipoEndereco, String logradouro, String numero, String complemento, String cidade, String uf) {

		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {		
		System.out.println("Digite seu nome: ");
		nome = leitura.nextLine().toUpperCase();
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		System.out.println("Digite seu CPF: ");
		cpf = leitura.nextLine();

		while (cpf.length() != 11) {
			System.out.println("\nCPF invalido!");
			System.out.println("Informe o CPF: ");
			cpf = (leitura.nextLine());
		}
		this.cpf = cpf;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		boolean saida;
		do {	
		System.out.println("Qual o seu sexo?");
		System.out.println("1 - Masculino ");
		System.out.println("2 - Feminino ");
		System.out.print("Digite 1 ou 2: ");
		byte opcSexo = leitura.nextByte();
			switch (opcSexo) {
			case 1:
				sexo = Sexo.MASCULINO;
				saida = true;
				break;
			case 2:
				sexo = Sexo.FEMININO;
				saida = true;
				break;
			default:
				System.out.println("\n ...por favor, digite 1 ou 2! ...\n");
				saida = false;
				break;
			}
			} while(saida != true);
			
		this.sexo=sexo;
		}	
	

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
