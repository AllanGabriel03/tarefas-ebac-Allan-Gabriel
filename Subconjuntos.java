package modulo3;

import java.util.ArrayList;
import java.util.List;

public class Subconjuntos {

    public static List<List<Integer>> gerarSubconjuntos(int[] S, int n) {
        List<List<Integer>> resultado = new ArrayList<>();
        backtrack(S, n, 0, new ArrayList<>(), resultado);
        return resultado;
    }

    /**
     * @param S
     * @param n
     * @param inicio
     * @param caminho
     * @param resultado
     */
    private static void backtrack(int[] S, int n, int inicio, List<Integer> caminho, List<List<Integer>> resultado) {
        if (caminho.size() == n) {
            resultado.add(new ArrayList<>(caminho));
            return;
        }

        for (int i = inicio; i < S.length; i++) {
            caminho.add(S[i]); // Escolha
            backtrack(S, n, i + 1, caminho, resultado); // Exploração
            caminho.remove(caminho.size() - 1); // Desfaz a escolha (backtrack)
        }
    }

    public static void main(String[] args) {
        int[] S1 = {1, 2, 3, 4, 5, 6 , 8, 9, 10};
        int n1 = 20;
        System.out.println("Saída: " + gerarSubconjuntos(S1, n1));

        int[] S2 = {1, 2, 3, 4};
        int n2 = 1;
        System.out.println("Saída: " + gerarSubconjuntos(S2, n2));
    }
}