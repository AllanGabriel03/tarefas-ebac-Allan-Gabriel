package modulo3;

import java.util.*;

public class TrocoGuloso {

    public static int calcularMinimoMoedas(int quantia, int[] moedas) {
        Arrays.sort(moedas); // Ordena crescente
        int totalMoedas = 0;
        
        for (int i = moedas.length - 1; i >= 0; i--) {
            int moeda = moedas[i];
            while (quantia >= moeda) {
                quantia -= moeda;
                totalMoedas++;
            }
        }

        return totalMoedas;
    }

    public static void main(String[] args) {
        int[] moedas = {5, 2, 1};
        int quantia = 60;
        int resultado = calcularMinimoMoedas(quantia, moedas);
        System.out.println("Menor número de moedas: " + resultado); // Saída: 5
    }
}
