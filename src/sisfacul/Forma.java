package sisfacul;

import java.util.Scanner;

public class Forma {
	private String titulo;
	private String nomeCurso;
	private int chCurso;
	Scanner leitura = new Scanner(System.in);


	public Forma() {

	}
	
	public Forma(String titulo, String nomeCurso, int chCurso) {
		this.titulo = titulo;
		this.nomeCurso = nomeCurso;
		this.chCurso = chCurso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		System.out.print("Digite o seu titulo: ");
		titulo = leitura.nextLine();
		this.titulo = titulo;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		System.out.print("Digite o nome do seu curso: ");
		nomeCurso = leitura.nextLine();
		this.nomeCurso = nomeCurso;
	}

	public int getChCurso() {
		return chCurso;
	}

	public void setChCurso(int chCurso) {
		System.out.print("Digite a carga horaria do seu curso: ");
		chCurso = leitura.nextInt();
		this.chCurso = chCurso;
	}
	
	public void cadastrarForma() {
		setTitulo(titulo);
		setNomeCurso(nomeCurso);
		setChCurso(chCurso);		
	}
	
	public void dadosForma() {
		System.out.println( "\n   Titulo: " +getTitulo()
				+ "\n   Nome do curso: " + getNomeCurso() + "\n   Carga horaria do curso: " + getChCurso());
	}


}
