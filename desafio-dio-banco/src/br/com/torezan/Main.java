package br.com.torezan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int option;
        Scanner leitor = new Scanner(System.in);
        Banco banco = new Banco();

        System.out.println("Bem Vindo ao Banco do Bruno ");
        String novo;
        do {
            System.out.println("Digite o número da Agência ");
            int agenciaNumero = leitor.nextInt();
            System.out.println("Digite o número da Conta ");
            int contaNumero = leitor.nextInt();
            System.out.println("Digite o tipo da Conta: [C]orrente ou [P]oupança");
            String tipoConta = leitor.next();
            if (banco.buscaConta(new Conta("" + contaNumero, "" + agenciaNumero, tipoConta))) {
                Conta conta = new Conta("" + contaNumero, "" + agenciaNumero, tipoConta);
                do {
                    System.out.println("\n\n\nDigite:" +
                            "\n(1) para efetuar um depósito " +
                            "\n(2) para Exibir o Extrato da Conta " +
                            "\n(3) para Efetuar um Saque e " +
                            "\n(0) para Finalizar");

                    option = leitor.nextInt();

                    switch (option) {
                        case 1 -> {
                            System.out.println("Digite o valor do depósito");
                            double deposito = leitor.nextDouble();
                            conta.depositarValor(deposito);
                        }
                        case 2 -> conta.gerarExtrato();
                        case 3 -> {
                            System.out.println("Digite o valor do saque");
                            double saque = leitor.nextDouble();
                            conta.sacarValor(saque);
                        }
                        case 0 -> System.out.println("\n\nObrigado por utilizar-se de nossos serviços! Até mais!");
                        default -> System.out.println("Digito inválido digitado.");
                    }
                } while (option != 0);
            } else {
                System.out.println("Conta não encontrada. Deseja cadastrar nova Conta? [S]im [N]ão");
                String op = leitor.next();
                if (op.equalsIgnoreCase("S")) {
                    System.out.println("Cadastro de Nova Conta");
                    System.out.println("--------------------------------");
                    System.out.println("Digite o número da Agência ");
                    int novaAgencia = leitor.nextInt();
                    System.out.println("Digite o número da Conta ");
                    int novaConta = leitor.nextInt();
                    System.out.println("Digite o tipo da Conta: [C]orrente ou [P]oupança");
                    String novoTipo = leitor.next();
                    banco.novaConta(new Conta("" + novaConta, "" + novaAgencia, novoTipo));
                }
            }
            System.out.println("Deseja executar outra operação? [S]im ou [N]ão?");
            novo = leitor.next();
        } while (novo.equalsIgnoreCase("s"));
    }
}
