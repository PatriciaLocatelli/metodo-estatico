package teste;

import Entidades.ClassPI;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O meu nome é: " + retornaNome(sc.nextLine()));
        System.out.println(12.2 * ClassPI.PI);
    }

    public static String retornaNome(String nome) {
        return nome;
    }

}
