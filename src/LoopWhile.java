import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente 
		 * a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/

		//int a = 0;
		//while(a < 100) {
	//System.out.println("Esse � o oi de n�mero" + a);
//	a = a +1;
		
		Scanner leitor = new Scanner (System.in);
		int idade = 0;
		int i=0;
		int soma = 0, media;
		int qtde;
		System.out.println ("Quantos alunos existem nessa escola");
		qtde = leitor.nextInt();
		
		while (i<10) {
			System.out.println("Digite a idade do" + (i+1) + "� aluno");
			idade = leitor.nextInt();
			soma = soma + idade; 
			i = i + 1;
		}
		{
			media = soma / qtde;
			System.out.println("A m�dia de idades dos alunos �" + media);
			leitor.close();
			
		}
		System.out.println(idade);
}


}
