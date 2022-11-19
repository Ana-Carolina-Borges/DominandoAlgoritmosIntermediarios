package DesafiosIntermediarios;

import java.util.Scanner;

public class ChecagemPolindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();
        String aux = "";

        aux = new StringBuffer(palavra).reverse().toString();


        if (palavra.equals(aux)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FAlSE");
        }

    }
}