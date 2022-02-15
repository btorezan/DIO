package br.com.torezan.clinica;

public class Medico {
    private final String nome;
    private int id;
    private final String crm;
    private Agenda agenda;
    private boolean emAtendimento = false;

    public Medico(String nome, int id, String crm) {
        this.nome = nome;
        this.id = id;
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setAgenda(Agenda agenda){
        this.agenda = agenda;
    }

    public Agenda getAgenda(){
        return this.agenda;
    }

    public boolean isEmAtendimento() {
        return emAtendimento;
    }

    public void setEmAtendimento(boolean emAtendimento) {
        this.emAtendimento = emAtendimento;
    }
}
