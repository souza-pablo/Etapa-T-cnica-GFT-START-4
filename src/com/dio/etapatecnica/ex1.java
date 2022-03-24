package com.dio.etapatecnica;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int senha;

            System.out.println("Digite a senha:");
            senha = scan.nextInt();
        while (senha != 2018) {
                System.out.println("Senha inválida");
            System.out.println("Digite a senha novamente");
                senha = scan.nextInt();
        }
        System.out.println("Acesso garantido");
    }
}