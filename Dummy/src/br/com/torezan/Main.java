package br.com.torezan;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input =new Scanner(System.in);
        int tamanhoTabuleiro = 0;
        int operacoes = 0;

        //define tabuleiro
        tamanhoTabuleiro = input.nextInt();
        ArrayList<ArrayList<Integer>> tabuleiro = new ArrayList<ArrayList<Integer>>();
        //int [][] tabuleiro = new int[tamanhoTabuleiro][tamanhoTabuleiro];

        //define quantidade de operacoes
        operacoes = input.nextInt();

        //preenche tabuleiro com 0
        preencheTabuleiro(tamanhoTabuleiro, tabuleiro);
        imprimeMatriz(tabuleiro);

        int cont =0;
        //loop operacoes
        while(cont<operacoes){
            int operacao = input.nextInt();
            int valorX = 0;
            int valorR = 0;


            switch (operacao) {
                case 1 -> {
                    valorX = input.nextInt();
                    valorR = input.nextInt();
                    preencheLinha(valorR, valorX, tabuleiro);
                }
                //imprimeMatriz(tabuleiro);
                case 2 -> {
                    valorX = input.nextInt();
                    valorR = input.nextInt();
                    preencheColuna(valorR, valorX, tabuleiro);
                }
                //imprimeMatriz(tabuleiro);
                case 3 -> {
                    valorX = input.nextInt();
                    percorreLinha(valorX, tabuleiro);
                }
                //imprimeMatriz(tabuleiro);
                case 4 -> {
                    valorX = input.nextInt();
                    percorreColuna(valorX, tabuleiro);
                }
                // imprimeMatriz(tabuleiro);
                default -> {
                }
            }
            imprimeMatriz(tabuleiro);
            cont++;
        }
    }

    public static void imprimeMatriz(ArrayList<ArrayList<Integer>> tabuleiro){
        System.out.println("\n--------------------------");
        for (ArrayList<Integer> ints : tabuleiro) {
            for (int j = 0; j < tabuleiro.size(); j++) {
                System.out.printf("%d ", ints.get(j));
            }
            System.out.printf("%n");
        }
           System.out.println("--------------------------\n");
    }

    public static void preencheTabuleiro(int tamanhoTabuleiro, ArrayList<ArrayList<Integer>> tabuleiro){
        for(int i=0; i<tamanhoTabuleiro; i++){
            for(int j = 0; j<tamanhoTabuleiro; j++){
                tabuleiro.get(i).add(0);
            }
        }
    }

    public static void percorreLinha(int linha, ArrayList<ArrayList<Integer>> tabuleiro){
        int moda = 0;
        int frequenciaAnterior = 0;
        for(int coluna = 0; coluna<tabuleiro.get(0).size(); coluna++){
            int elementoAtual = tabuleiro.get(linha-1).get(coluna);
            for(int posicao = 0; posicao<tabuleiro.size(); posicao++){
                int frequencia = 1;
                if(elementoAtual == tabuleiro.get(linha-1).get(posicao)){frequencia ++;}
                if(frequencia>=frequenciaAnterior){
                    if(elementoAtual>moda) {
                        moda = elementoAtual;
                        frequenciaAnterior = frequencia;
                    }
                }
            }
        }
        System.out.println(moda);
    }

    public static void percorreColuna(int coluna, ArrayList<ArrayList<Integer>> tabuleiro){
        int moda = 0;
        int frequenciaAnterior = 0;
        for(int linha = 0; linha<tabuleiro.size(); linha++){
            int elementoAtual = tabuleiro.get(linha).get(coluna-1);
            for (ArrayList<Integer> integers : tabuleiro) {
                int frequencia = 1;
                if (elementoAtual == integers.get(coluna)) {
                    frequencia++;
                }
                if (frequencia >= frequenciaAnterior) {
                    if (elementoAtual > moda) {
                        moda = elementoAtual;
                        frequenciaAnterior = frequencia;
                    }
                }
            }
        }
        System.out.println(moda);
    }

    public static void preencheLinha(int valor, int linha, ArrayList<ArrayList<Integer>> tabuleiro) {
        for (int coluna = 0; coluna < tabuleiro.size(); coluna++) {
              tabuleiro.get(linha-1).add(coluna, valor);
            //tabuleiro[linha-1][coluna] = valor;
        }
  }

    public static void preencheColuna(int valor, int coluna, ArrayList<ArrayList<Integer>> tabuleiro) {
        for (ArrayList<Integer> integers : tabuleiro) {
            integers.add(coluna - 1, valor);
        }
    }

}
