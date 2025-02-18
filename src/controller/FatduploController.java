package controller;

public class FatduploController {

    
    public int fatorialDuplo(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * fatorialDuplo(n - 2);
        }
    }


    public void calcularFatorialDuplo(int n) {
        if (n > 0 && n % 2 != 0) {
            int resultado = fatorialDuplo(n);
            System.out.println("O fatorial duplo de " + n + " é = " + resultado);
        } else {
            System.out.println("Insira um número inteiro positivo ímpar.");
        }
    }
}
