package DesafiosIntermediarios;

import java.util.Scanner;

public class ValidacaoDeParenteses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean caracter = ehvalido(sc.nextLine());
        System.out.println(caracter);
    }

    public static boolean ehvalido(String s) {
        if (s.equals("[]")) {
            return true;
        } else if (s.equals("()")) {
            return true;
        }
        return s.equals("{}");
    }
}



