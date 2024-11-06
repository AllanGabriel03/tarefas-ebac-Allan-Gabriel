import java.util.*;
import java.util.stream.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        System.out.print("Informe a quantidade de pessoas: ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < quantidade; i++){
            System.out.println("Pessoa " + (i+1) + ":");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Gênero (F/M): ");
            String genero = sc.nextLine();

            Pessoa pessoa = new Pessoa(nome, genero);
            pessoas.add(pessoa);

        }
        List<Pessoa> apenasMulheres = pessoas.stream().filter(pessoa -> pessoa.getGenero().equals("F"))
                .collect(Collectors.toList());
        apenasMulheres.forEach(pessoa -> System.out.println(pessoa));


    sc.close();
    }
}