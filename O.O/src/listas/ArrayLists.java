package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayLists {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Informe os nomes: ");
	    String nome = sc.next();
	    
	    List<String> usuarios = new ArrayList<String>(Arrays.asList(nome.split(",")));
		
	    Collections.sort(usuarios);
	    System.out.println(usuarios);
 
	}
}
