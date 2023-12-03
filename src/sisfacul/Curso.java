package sisfacul;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Curso implements Mensalidade {

	private NomeCurso nome;
	private int tipo;
	private int ch;
	private float duracao;
	private double mensalidade;
	Scanner leitura = new Scanner(System.in);

	public Curso() {
	}

	public Curso(NomeCurso nome, int tipo, int ch, float duracao, float mensalidade) {
		this.nome = nome;
		this.tipo = tipo;
		this.ch = ch;
		this.duracao = duracao;
		this.mensalidade = mensalidade;
	}

	public NomeCurso getNome() {
		return nome;
	}

	public void setNome(NomeCurso nome) {
		
		boolean saida = true;

		do {
			
			try {
			System.out.println("Qual o curso?\n(1,2 ou 3)");
			System.out.println("1- ADS" + "\n2- Ciencia da Computacao" + "\n3-Sistema da Informacao");
			byte opcNomeCurso = leitura.nextByte();
			switch (opcNomeCurso) {
			case 1:
				nome = NomeCurso.ADS;
				saida = true;
				break;
			case 2:
				nome = NomeCurso.COMPUTACAO;
				saida = true;
				break;
			case 3:
				nome = NomeCurso.SISINFO;
				saida = true;
				break;
			default:
				System.out.println("\n ...por favor, digite 1 ou 2! ...\n");
				saida = false;
				break;
				}
			}
			
			catch(InputMismatchException e) {
				
				System.out.println("Digite o numero do curso, por favor!\n");
			
				saida = false;
				leitura.next();
			}
			
			finally {
				this.nome = nome;
			}
			
		} while (saida != true);

		this.nome = nome;
	}

	

	public int getTipo() {

		switch (tipo) {
		case 1:
			System.out.println("Licenciatura");
			break;
		case 2:
			System.out.println("Tecnologo");
			break;
		case 3:
			System.out.println("Bacharelado");

		}

		return tipo;
	}

	public void setTipo(int tipo) {
		System.out.print("Digite o tipo do curso: \n");
		System.out.println("1- Licenciatura");
		System.out.println("2- Tecnologo");
		System.out.println("3- Bacharelado)");
		tipo = leitura.nextInt();

		if (tipo == 1 || tipo == 2 || tipo == 3) {

			this.tipo = tipo;

		}

		else {
			System.out.println("A opcao é inválida! Digite novamente uma das opcoes listadas: \n ");

		}
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		System.out.print("Digite a carga horaria: ");
		ch = leitura.nextInt();
		this.ch = ch;
	}

	public float getDuracao() {
		return duracao;
	}

	public void setDuracao(float duracao) {
		System.out.print("Digite a duracao do curso: ");
		duracao = leitura.nextFloat();
		this.duracao = duracao;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void cadastrarCurso() {
		setNome(nome);
		setTipo(tipo);
		setCh(ch);
		setDuracao(duracao);
		CalculoMensalidade(tipo);
	}

	public void dadosCurso() {
		System.out.println("\n   Nome: " + getNome() + "\n   Tipo do curso: " + getTipo() + "\n   Carga horaria: "
				+ getCh() + "\n   Duracao: " + getDuracao() + "\n   Mensalidade: " + getMensalidade());
	}

	@Override
	public final double CalculoMensalidade(int Curso) {

		if (Curso == 1) {
			mensalidade = Licenciatura;
		}

		else if (Curso == 2) {
			mensalidade = Tecnologo;
		} else {
			mensalidade = Bacharelado;
		}

		return mensalidade;
	}
}
