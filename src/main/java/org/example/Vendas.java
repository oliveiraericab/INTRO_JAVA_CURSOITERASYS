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
        System.out.println("c - Calcular Total da Venda Modo Curto");
        System.out.println("e - Calcular Total da Venda Modo Extenso");
        System.out.println("i - Calcular Total da Venda Modo ifSimples");
        System.out.println("d - Contar Ate Dez de Forma Crescente");
        System.out.println("r - Contar Ate Zero de Forma Regressiva");
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
            case "d":
            case "D":
                System.out.println("Você escolheu executar o método contarAteDez Crescente");
                contarAteDez();
                break;
            case "r":
            case "R":
                System.out.println("Você escolheu executar o método contarAteZero Regressivo");
                contarAteZero();
                break;
            default:
                System.out.println("Você escolheu uma opção que não está associada a nenhum método no sistema.");
        }
    }

    public static void ifSimples() {
        // Condicional é verificar uma condição - Fazer uma pergunta para uma pessoa, um hardware ou um software.
        // if - se
        // else - senão
        String modo = "c";
        if (modo == "c") {
            calculoTotalCodigoCurto();
        } else {
            calculoTotalCodigoExtenso();
        }
    }

    public static void calculoTotalCodigoCurto() {
        System.out.println("Calcule o valor total da compra: (reduzido)");
        // Cálculo de total código reduzido
        int quantidade = 3;
        int valorunitario = 5;
        System.out.println("Para compra de " + quantidade + " itens que custam " + valorunitario + " reais cada, o valor total da compra é " + quantidade * valorunitario + " reais.");
    }

    public static void calculoTotalCodigoExtenso() {
        System.out.println("Calcule o valor total da compra: (extenso)");
        // Calculo do valor da venda - número de itens * valor unitario
        //declaro as variáveis
        int quantidade;
        int valorunitario;
        int total;
        quantidade = 3;
        valorunitario = 5;
        total = quantidade * valorunitario;
        System.out.println("Para compra de " + quantidade + " itens que custam " + valorunitario + " reais cada, o valor total da compra é " + total + " reais.");
    }

    public static void contarAteDez() {
        // Loops ou repetições. For - repetições incondicionais
        System.out.println("Contagem Crescente:");
        for (int numero = 1; numero <= 10; numero++) {
            System.out.println(numero);
        }
    }

    public static void contarAteZero() {
        System.out.println("Contagem Regressiva:");
        for (int numero = 10; numero > -1; numero--) {
            System.out.println(numero);
        }
    }

}


