package com.dio.etapatecnica;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double i, j;
        int opcao;
        double soma;
        double peso;
        double altura;
        double resultadoIMC;
        System.out.print("Menu de opções:" +
                "\n\n1.Soma" +
                "\n2.IMC" +
                "\n3.Sair" +
                "\nDigite a opção desejada: ");
        opcao = scan.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Digite dois números para efetuar a soma entre eles.");
                System.out.println("Numero 1: ");
                i = scan.nextDouble();
                System.out.println("Numero 2: ");
                j = scan.nextDouble();
                soma = (i + j);
                System.out.println("A soma é: " + soma);
                break;
            case 2:
                System.out.println("Vamos calular seu IMC através do seu peso e sua altura.");
                System.out.println("Digite seu peso(em kg): ");
                peso = scan.nextDouble();
                System.out.println("Digite sua altura (em metro): ");
                altura = scan.nextDouble();
                resultadoIMC = (peso/(altura*altura));

                if (resultadoIMC < 18.5){
                    System.out.println("Peso abaixo do normal");
                } else if(resultadoIMC >= 18.5 && resultadoIMC <= 25){
                    System.out.println("Peso normal");
                } else if (resultadoIMC > 25 && resultadoIMC <= 30){
                    System.out.println("Sobre o peso");
                } else if (resultadoIMC > 30 && resultadoIMC <= 35){
                    System.out.println("Grau de obesidade I");
                } else {
                    System.out.println("Não foi possível definir uma categoria");
                }
                break;
            case 3:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
