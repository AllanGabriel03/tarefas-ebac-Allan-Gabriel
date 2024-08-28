package mod10;

import java.util.Scanner;

public class aplicandoLogica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota do aluno: ");
		double num1 = sc.nextInt();
		System.out.print("Informe a segunda nota do aluno: ");
		double num2 = sc.nextInt();
		System.out.print("Informe a terceira nota do aluno: ");
		double num3 = sc.nextInt();
		System.out.print("Informe a quarta nota do aluno: ");
		double num4 = sc.nextInt();
		
		double media = (num1 + num2 + num3 + num4) / 4;
		
		if(media >= 7) {
			System.out.println("O aluno está aprovado");
		}
		else if (media >= 5 ) {
			System.out.println("O aluno está de recuperação");
		}
		else {
			System.out.println("O aluno está reprovado");
		}
		
	}

}
