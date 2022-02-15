import java.util.Scanner;

public class DesafioTabuleiro {
    /*
    Scanner input =new Scanner(System.in);
    int tamanhoTabuleiro = 0;
    int operacoes = 0;

    //define tabuleiro
    tamanhoTabuleiro = input.nextInt();
    int [][] tabuleiro = new int[tamanhoTabuleiro][tamanhoTabuleiro];

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


        switch (operacao){
            case 1:
                valorX = input.nextInt();
                valorR = input.nextInt();
                preencheLinha(valorR, valorX, tabuleiro);
                //imprimeMatriz(tabuleiro);
                break;
            case 2:
                valorX = input.nextInt();
                valorR = input.nextInt();
                preencheColuna(valorR, valorX, tabuleiro);
                //imprimeMatriz(tabuleiro);
                break;
            case 3:
                valorX = input.nextInt();
                percorreLinha(valorX, tabuleiro);
                //imprimeMatriz(tabuleiro);
                break;
            case 4:
                valorX = input.nextInt();
                percorreColuna(valorX, tabuleiro);
                // imprimeMatriz(tabuleiro);
                break;
            default:
                break;

        }
        imprimeMatriz(tabuleiro);
        cont++;
    }
}

    public static void imprimeMatriz(int[][] tabuleiro){
        System.out.println("\n--------------------------");
        for (int[] ints : tabuleiro) {
            for (int j = 0; j < tabuleiro.length; j++) {
                System.out.printf("%d ", ints[j]);
            }
            System.out.printf("%n");
        }
        System.out.println("--------------------------\n");
    }

    public static void preencheTabuleiro(int tamanhoTabuleiro, int[][] tabuleiro){
        for(int i=0; i<tamanhoTabuleiro; i++){
            for(int j = 0; j<tamanhoTabuleiro; j++){
                tabuleiro[i][j] = 0;
            }
        }
    }

    public static void percorreLinha(int linha, int[][] tabuleiro){
        int moda = 0;
        int frequenciaAnterior = 0;
        for(int coluna = 0; coluna<tabuleiro.length; coluna++){
            int elementoAtual = tabuleiro[linha-1][coluna];
            for(int posicao = 0; posicao<tabuleiro.length; posicao++){
                int frequencia = 1;
                if(elementoAtual == tabuleiro[linha-1][posicao]){frequencia ++;}
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

    public static void percorreColuna(int coluna, int[][] tabuleiro){
        int moda = 0;
        int frequenciaAnterior = 0;
        for(int linha = 0; linha<tabuleiro.length; linha++){
            int elementoAtual = tabuleiro[linha][coluna-1];
            for(int posicao = 0; posicao<tabuleiro.length; posicao++){
                int frequencia = 1;
                if(elementoAtual == tabuleiro[posicao][coluna-1]){frequencia ++;}
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

    public static void preencheLinha(int valor, int linha, int[][] tabuleiro) {
        for (int coluna = 0; coluna < tabuleiro.length; coluna++) {
            tabuleiro[linha-1][coluna] = valor;
        }
    }

    public static void preencheColuna(int valor, int coluna, int[][] tabuleiro) {
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            tabuleiro[linha][coluna-1] = valor;
        }
    }*/
}
