package com.dio.etapatecnica;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade;
        double peso;
        int quantidadePessoas = 10;
        int i = 1;
         double soma = 0;
         double pesoPessoas1a10 = 0;
         double pesoPessoas11a20 = 0;
         double pesoPessoas21a30 = 0;
         double pesoPessoas31mais = 0;
         int quantidadePessoas1a10 = 0;
         int quantidadePessoas11a20 = 0;
         int quantidadePessoas21a30 = 0;
         int quantidadePessoas31mais = 0;
         double media;
        do {
            System.out.println("Digite a idade (em anos) da pessoa " + i +":");
            idade = scan.nextInt();
            System.out.println("Digite o peso (em kg) da pessoa " + i +":");
            peso = scan.nextDouble();
            if (idade >= 1 && idade <= 10){
                pesoPessoas1a10 += peso;
                quantidadePessoas1a10++;
            } else if (idade >= 11 && idade <= 20) {
                pesoPessoas11a20 += peso;
                quantidadePessoas11a20++;
            } else if (idade >= 21 && idade <= 30) {
                pesoPessoas21a30 += peso;
                quantidadePessoas21a30++;
            } else if (idade >= 31) {
                pesoPessoas31mais += peso;
                quantidadePessoas31mais++;
            } else{
                System.out.println("Idade inválida");
            }
            i++;
        } while (i <= quantidadePessoas);

        System.out.println("Média de peso das pessoas de 1 a 10 anos: " + pesoPessoas1a10/quantidadePessoas1a10);
        System.out.println("Média de peso das pessoas de 11 a 20 anos: " + pesoPessoas11a20/quantidadePessoas11a20);
        System.out.println("Média de peso das pessoas de 21 a 30 anos: " + pesoPessoas21a30/quantidadePessoas21a30);
        System.out.println("Média de peso das pessoas maiores de 31 anos: " + pesoPessoas31mais/quantidadePessoas31mais);


        }
    }

