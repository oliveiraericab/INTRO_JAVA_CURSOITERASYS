//Classe aberta em Main > Nem Class.
// Qual a diferença de abrir assim ou apenas digitar na aba anterior build.gradle(INTRO*)

// 1. Pacote
package org.example;

// 2. Referência às bibliotecas

// 3. Classes
public class Vendas {
    // 3.1 Atributos - caracteristicas


    // 3.2 Metodos e funcoes
    public static void main(String[] args) {
        System.out.println("Minha primeira funcao executada!");

// Calculo do valor da venda - número de itens * valor unitario
        //variáveis
        int quantidade;
        int valorunitario;
        int total;

        quantidade = 2;
        valorunitario = 5;
        total = quantidade * valorunitario;

        System.out.println( "O valor total da compra é " + total + " reais" );




    }

}
