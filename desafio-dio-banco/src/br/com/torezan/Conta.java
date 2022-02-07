package br.com.torezan;

import java.util.ArrayList;
import java.util.List;

public class Conta {
    private String conta;
    private String agencia;
    private double saldo;
    private String tipo;
    private ArrayList<String> extrato = new ArrayList<String>();


    public Conta(String conta, String agencia, String tipo) {
        this.conta = conta;
        this.agencia = agencia;
        this.tipo = tipo;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void depositarValor(double valor){
        saldo = saldo+valor;
        adicionarExtrato("Depósito Efetuado");
        adicionarExtrato("Saldo Atual:"+saldo);
    }

    public boolean sacarValor(double valorSaque){
        if(valorSaque>saldo){
            System.out.println("Saldo Indisponível");
            return false;
        }else{
            saldo = saldo - valorSaque;
            System.out.println("Saque Efetuado com Sucesso");
            System.out.printf("Saldo Atual: %.2f", saldo);

            adicionarExtrato("Saque Efetuado");
            adicionarExtrato("Saldo Atual:"+saldo);
            return true;
        }
    }

    public boolean tranferirValores(Conta origem, Conta destino, double valor){
        double saldoOrigem = origem.getSaldo();
        if(saldoOrigem<valor){
            System.out.println("Saldo Insuficiente");
            return false;
        }else{
            origem.sacarValor(valor);
            destino.depositarValor(valor);
            adicionarExtrato("Transferencia efetuada com sucesso.");
            adicionarExtrato("Saldo atual:"+origem.getSaldo());
            return true;
        }
    }

    public void adicionarExtrato(String registro){
        extrato.add(registro);
    }

    public void gerarExtrato(){
        for (String s : extrato) {
            System.out.println(s);
        }
    }



}

