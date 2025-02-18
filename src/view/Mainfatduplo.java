package view;

import javax.swing.JOptionPane;

import controller.FatduploController;


public class Mainfatduplo {
    public static void main(String[] args) {
        FatduploController fatduplo = new FatduploController();

        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro positivo ímpar"));

        fatduplo.calcularFatorialDuplo(n);
    }
}
