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
        System.out.println("Olá, Vendedor!");
        System.out.println("Calcule o valor total da compra:");
                    // Cálculo de total código reduzido
            int quantidade = 3;
            int valorunitario = 5;
            System.out.println( "(reduzido) Para compra de " + quantidade + " itens que custam " + valorunitario + " reais cada, o valor total da compra é " + quantidade * valorunitario + " reais." );

        }

    public void calculoTotalCodigoExtenso(){
        // Calculo do valor da venda - número de itens * valor unitario
        //declaro as variáveis
        int quantidade;
        int valorunitario;
        int total;

        quantidade = 3;
        valorunitario = 5;
        total = quantidade * valorunitario;

        System.out.println( "(extenso) Para compra de " + quantidade + " itens que custam " + valorunitario + " reais cada, o valor total da compra é " + total + " reais." );
    }
}


