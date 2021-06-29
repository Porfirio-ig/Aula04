import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão quantos alunos existem e sem a necessidade de armazenar permanentemente 
		 * a idade de cada um desses alunos, qual é a melhor forma de calcular essa média?*/

		//int a = 0;
		//while(a < 100) {
	//System.out.println("Esse é o oi de número" + a);
//	a = a +1;
		
		Scanner leitor = new Scanner (System.in);
		int idade = 0;
		int i=0;
		int soma = 0, media;
		int qtde;
		System.out.println ("Quantos alunos existem nessa escola");
		qtde = leitor.nextInt();
		
		while (i<10) {
			System.out.println("Digite a idade do" + (i+1) + "º aluno");
			idade = leitor.nextInt();
			soma = soma + idade; 
			i = i + 1;
		}
		{
			media = soma / qtde;
			System.out.println("A média de idades dos alunos é" + media);
			leitor.close();
			
		}
		System.out.println(idade);
}


}
