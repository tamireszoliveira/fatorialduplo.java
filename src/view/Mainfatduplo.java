package view;

import javax.swing.JOptionPane;

import controller.FatduploController;
/* 4. Faça uma função recursiva que receba um número inteiro posi�vo ímpar N e retorne o fatorial duplo
desse número (A entrada deve ser validada fora da função recursiva). O fatorial duplo é definido como o
produto de todos os números naturais ímpares de 1 até algum número natural ímpar N. Assim, o fatorial
duplo de 5 é: */

public class Mainfatduplo {
    public static void main(String[] args) {
        FatduploController fatduplo = new FatduploController();

        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro positivo ímpar"));

        fatduplo.calcularFatorialDuplo(n);
    }
}
