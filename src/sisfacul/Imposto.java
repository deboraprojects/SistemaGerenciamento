package sisfacul;

public interface Imposto {
	
	
	final double faixa1 = 0; //at� R$ 1.903,98 � Isento.  
	final double faixa2 = 142.80; //de R$ 1.903,99 a R$ 2.826,65, a al�quota � de 7,5% e o trabalhador tem um desconto mensal de R$ 142,80.
	final double faixa3 = 354.80; //de R$ 2.826,66 a R$ 3.751,05, a al�quota � de 15% e o desconto mensal � de R$ 354,80.
	final double faixa4 = 636.13; // de R$ 3.751,06 a R$ 4.664,68, a al�quota sobe para 22,5% e o desconto passa a ser de R$ 636,13.
	final double faixa5 = 869.36; // acima de R$ 4.664,68, o trabalhador entra na maior al�quota do IR, 27,5%, e o desconto mensal � de R$ 869,36.
	
		
	public abstract double IR (double salario);
}

