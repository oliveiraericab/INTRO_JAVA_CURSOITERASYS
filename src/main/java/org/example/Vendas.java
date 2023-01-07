//Classe aberta em Main > Nem Class.
// Qual a diferença de abrir assim ou apenas digitar na aba anterior build.gradle(INTRO*)

// 1. Pacote
package org.example;

// 2. Referência às bibliotecas

import java.util.Scanner;

// 3. Classes
public class Vendas {
    // 3.1 Atributos - caracteristicas
    // 3.2 Metodos e funcoes
    public static void main(String[] args) {
        // Condicional é verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou um software.

        //Utilizar a classe Scanner do Java para ler a escolha do usuário no Console.
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU DE OPÇÕES");
        System.out.println("c - Calcular Area Modo Curto");
        System.out.println("e - Calcular Area Modo Extenso");
        System.out.println("i - ifSimples");
        System.out.println("Digite a opcao desejada:");
        String opcao = scanner.next();

        // Switch - selecionar o comportamento do programa conforme a escolha do usuário ou software.
        switch (opcao) {
            case "i":
            case "I":
                System.out.println("Você escolheu executar o método ifSimples");
                ifSimples();
                break;
            case "c":
            case "C":
                System.out.println("Você escolheu executar o método calculoTotalCodigoCurto");
                calculoTotalCodigoCurto();
                break;
            case "e":
            case "E":
                System.out.println("Você escolheu executar o método calculoTotalCodigoExtenso");
                calculoTotalCodigoExtenso();
                break;
            default:
                System.out.println("Você escolheu uma opção que não está associada a nenhum método no sistema.");
        }
        }
    public static void ifSimples(){
        // Condicional é verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou um software.
        // if - se
        // else - senão
        String modo = "c";
        if (modo == "c"){
            calculoTotalCodigoCurto();
        }
        else {
            calculoTotalCodigoExtenso();
        }
    }
    public static void calculoTotalCodigoCurto(){
        System.out.println("Calcule o valor total da compra: (reduzido)");
        // Cálculo de total código reduzido
        int quantidade = 3;
        int valorunitario = 5;
        System.out.println( "Para compra de " + quantidade + " itens que custam " + valorunitario + " reais cada, o valor total da compra é " + quantidade * valorunitario + " reais." );
    }
    public static void calculoTotalCodigoExtenso(){
        System.out.println("Calcule o valor total da compra: (extenso)");
        // Calculo do valor da venda - número de itens * valor unitario
        //declaro as variáveis
        int quantidade;
        int valorunitario;
        int total;
        quantidade = 3;
        valorunitario = 5;
        total = quantidade * valorunitario;
        System.out.println( "Para compra de " + quantidade + " itens que custam " + valorunitario + " reais cada, o valor total da compra é " + total + " reais." );
    }
}


