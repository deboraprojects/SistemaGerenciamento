package sisfacul;

import java.util.Scanner;

public class Professor extends Pessoa implements Imposto {

	private String titulo;
	private Forma formacao;
	private double salario;
	protected double salarioIR;
	Scanner leitura = new Scanner(System.in);

	public Professor() {
		super();
		this.formacao = new Forma();
	}

	public Professor(String nome, String cpf, String sexo, Endereco endereco, String titulo, String formacao,double salario, double salarioIR) {
		super();
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		System.out.print("Digite o seu titulo: ");
		titulo = leitura.nextLine();
		titulo = leitura.nextLine();
		this.titulo = titulo;
	}

	public Forma getFormacao() {
		return formacao;
	}

	public void setFormacao(Forma formacao) {
		this.formacao = formacao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		System.out.print("Digite o seu salario: ");
		salario = leitura.nextDouble();
		this.salario = salario;
	}

	public void cadastrarProfessor() {

		System.out.println("\n-- Cadastramento de professor --");

		setCpf(getCpf());
		setNome(getNome());
		setSexo(getSexo());
		setTitulo(titulo);
		formacao.cadastrarForma();
		setSalario(salario);
		IR(salario);
		endereco.cadastrarEndereco();

	}

	public void dadosProfessor() {
		System.out.println("\n Pessoa F�sica\n" + "-----------------" + "\n   CPF: " + getCpf() + "\n   Nome: "
		+ getNome() + "\n   Sexo: " + getSexo() + "\n   Titulo: " + getTitulo() + "\n   Salario: "
		+ getSalario() + "\n Salario com imposto de renda " + IR(salario));
		formacao.dadosForma();
		endereco.dadosEndereco();
	}

	@Override
	public double IR(double salario) { // porque � uma boa pr�tica � colocar o final aqui, no m�todo?
		// TODO Auto-generated method stub

		if (salario <= 1903.98) {
			salario -= faixa1;
		} else if (salario > 1903.98 && salario <= 2826.65) {
			salario -= faixa2;
		}

		else if (salario > 2826.66 && salario <= 3751.05) {
			salario -= faixa3;
		}

		else if (salario > 3751.06 && salario <= 4664.68) {
			salario -= faixa4;
		}

		else {
			salario -= faixa5;
		}

		salarioIR = salario;

		return salarioIR;
	}
}
