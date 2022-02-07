package br.com.torezan;

import java.util.ArrayList;
import java.util.Scanner;


public class Banco {

    ArrayList<Conta> contas = new ArrayList<>();
    Scanner leitor = new Scanner(System.in);

    public boolean buscaConta(Conta conta){
        boolean achado = false;
        for (Conta valor : contas) {
            if (valor.getAgencia().equalsIgnoreCase(conta.getAgencia()) && valor.getConta().equalsIgnoreCase(conta.getConta())) {
                achado = true;
                break;
            }
        }
        return achado;
    }

    public void novaConta(Conta conta){
        contas.add(conta);
        System.out.println("Nova conta adicionada com sucesso!");
    }

    public void removeConta(Conta conta) {
        String option;
        System.out.println("Deseja excluir a conta nº" + conta.getConta() + "? [S]im ou [N]ão?");
        option = leitor.next();
        if (option.equalsIgnoreCase("s")) {
            contas.remove(conta);
            System.out.println("Conta nº" + conta.getConta() + " removida com sucesso");
        } else {
            System.out.println("Não foi realziada nenhuma alteração");
        }
    }
        
}
