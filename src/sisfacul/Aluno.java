package sisfacul;

import java.util.Scanner;

public class Aluno extends Pessoa {

	private String ra;
	private Curso curso;
	private Scanner leitura = new Scanner(System.in);

	public Aluno() {
		super();
		this.curso = new Curso (); 
	}

	public Aluno(String nome, String cpf, String sexo, String ra, Curso curso, Endereco endereco) {
		super();		
		this.ra = ra;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		System.out.print("Digite o Registro academico do aluno(a): ");
		ra = leitura.nextLine();
		this.ra = ra;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public void cadastrarAluno() {
		System.out.println("\n-- Cadastro de aluno --");
		setCpf(getCpf());
		setNome(getNome());
		setSexo(getSexo());
		setRa(ra);
		curso.cadastrarCurso();
		endereco.cadastrarEndereco();
	}


	public void dadosAluno() {
		System.out.println("\n Pessoa Fisica\n" + "-----------------" + "\n   CPF: " + getCpf() + "\n   Nome: "
				+ getNome() + "\n   Sexo: " + getSexo() + "\n   RA: " + getRa()); curso.dadosCurso(); endereco.dadosEndereco();
	}
	
}

