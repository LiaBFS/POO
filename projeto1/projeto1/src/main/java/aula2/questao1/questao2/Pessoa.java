package aula2.questao1.questao2;

/**
Escopo de variável:

	"O método consegue utilizar as variáveis da classe, porém a classe não consegue utilizar as variáveis do método"

**/

public class Pessoa {
	double peso; //variáveis da classe
	double altura;
	
	public double calcularIMC() {
		double resultado = peso/(altura*altura); //resultado = variavel própria do/criada no método
		return resultado;
	}

}
