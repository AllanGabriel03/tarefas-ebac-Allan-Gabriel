package org.example;

/*
 Classe calculadora utilizada para somar, subtrair, multiplicar e dividir dois número.
 */

public class Calculadora {

    public int adicionar(int a, int b){
        return a + b;
    }

    public int subtrair(int a, int b){
        return a - b;
    }

    public int multiplicar(int a, int b){
        return a * b;
    }

    /*
     No Método dividir foi foi feito uma condição para garantir que não tivesse o erro division by zero
    */
    public int dividir(int a, int b){
        if(b != 0){
            return a / b;
        }
        else{
            return  0;
        }
    }
}
