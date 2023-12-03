package sisfacul;

public interface Mensalidade {
	
	
	// Valores ficticios
	final double Licenciatura = 500.00; // mensalidade do Ensino M�dio  
	final double Tecnologo = 300.80; // mensalidade do Ensino Fundamental
	final double Bacharelado = 1000.80; // mensalidade do Curso integral (EM + T�cnico)
	
		
	public abstract double CalculoMensalidade (int Curso);
}
