package com.dio.etapatecnica;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int quantidadeIncomoda;
        int i;
        System.out.println("Digite o número de vezes que a palavra ''Incomoda'' estará na frase:");
        quantidadeIncomoda = scan.nextInt();
        for (i = 0; i< quantidadeIncomoda ;i++){
            System.out.print("Incomoda ");
        }
        System.out.print("muito mais");



    }
}
