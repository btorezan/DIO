package br.com.torezan.clinica;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Paciente {
    private String nome;
    private int idade;
    private char sexo;
    private ArrayList<Consulta> consultas = new ArrayList<>();


    public Paciente(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void adicionarConsulta(Consulta consulta){
        this.consultas.add(consulta);
    }

    public void listarConsultasAgendadas(){
        for(Consulta consulta : consultas){
            System.out.println("Consulta com Dr(a) "+consulta.getMedico().getNome()
                    +" agendada para dia "+consulta.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        }
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public String toString(){
        return "Nome: "+this.nome+" Idade: "+this.idade+" Sexo:"+ (this.sexo=='M'?"Masculino":"Feminino");
    }
}
