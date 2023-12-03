package sisfacul;

import java.util.Scanner;

public class Endereco {

	private String tipoEndereco, logradouro, numero, complemento, uf;
	private Cidade cidade;
	Scanner leitura = new Scanner(System.in);

	public Endereco() {

	}

	public Endereco(String tipoEndereco, String logradouro, String numero, String complemento, Cidade cidade,
			String uf) {
		this.tipoEndereco = tipoEndereco;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.uf = uf;
	}

	public String getTipoEndereco() {
		return tipoEndereco;
	}

	public void setTipoEndereco(String tipoEndereco) {
		System.out.println("Digite seu tipo de endereco: ");
		tipoEndereco = leitura.nextLine().toUpperCase();
		this.tipoEndereco = tipoEndereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		System.out.println("Digite seu logradouro: ");
		logradouro = leitura.nextLine().toUpperCase();
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		System.out.println("Digite seu numero: ");
		numero = leitura.nextLine().toUpperCase();
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		System.out.println("Digite seu complemento: ");
		complemento = leitura.nextLine().toUpperCase();
		this.complemento = complemento;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		boolean saida = true;

		do {
			try {
				System.out.println("Qual a sua cidade?\n Digite o numero(1,2,3...)");
				System.out.println("1 - Belo Horizonte \t 5 - Sabara ");
				System.out.println("2 - NovaLima       \t 6 - Caete ");
				System.out.println("3 - Contagem       \t 7 - Neves ");
				System.out.println("4 - Betim          \t 8 - SantaLuzia ");
				byte opcCidade = leitura.nextByte();
				
				switch (opcCidade) {
				case 1:
					cidade = Cidade.BELOHORIZONTE;
					saida = true;
					break;
				case 2:
					cidade = Cidade.NOVALIMA;
					saida = true;
					break;
				case 3:
					cidade = Cidade.CONTAGEM;
					saida = true;
					break;
				case 4:
					cidade = Cidade.BETIM;
					saida = true;
					break;
				case 5:
					cidade = Cidade.SABARA;
					saida = true;
					break;
				case 6:
					cidade = Cidade.CAETE;
					saida = true;
					break;
				case 7:
					cidade = Cidade.NEVES;
					saida = true;
					break;
				case 8:
					cidade = Cidade.SANTALUZIA;
					saida = true;
					break;
				default:
					System.out.println("\n ...por favor, digite um n�mero da lista! ...\n");
					saida = false;
					break;
				} 
			}
				catch(Exception e) {
					System.out.println("ERROR: " + e.getMessage());
					saida = false;
					leitura.next();
			}				
			
		} while (saida != true);
		this.cidade = cidade;
	}
	

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		System.out.println("Digite seu UF: ");
		uf = leitura.nextLine().toUpperCase();
		uf = leitura.nextLine().toUpperCase();
		this.uf = uf;
	}

	public void cadastrarEndereco() {
		setTipoEndereco(tipoEndereco);
		setLogradouro(logradouro);
		setNumero(numero);
		setComplemento(complemento);
		setCidade(cidade);
		setUf(uf);
	}

	public void dadosEndereco() {
		System.out.println("\n   Tipo de Endereco: " + getTipoEndereco() + "\n   Logradouro: " + getLogradouro()
				+ "\n   Numero: " + getNumero() + "\n   Complemento: " + getComplemento() + "\n   Cidade: "
				+ getCidade() + "\n   UF: " + getUf());
	}
}
