package br.com.torezan.clinica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private LocalDate data;
    private Paciente paciente;
    private Medico medico;
    private boolean disponivel = true;
    private boolean realizada = false;


    public Consulta(LocalDate data, Medico medico) {
        this.data = data;
        this.medico = medico;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public boolean isDisponivel(){
        return this.disponivel;
    }

    public Paciente getPaciente(){
        return paciente;
    }

    public LocalDate getData(){
        return this.data;
    }

    public void setPaciente(Paciente paciente){
        this.paciente = paciente;

    }

    public Medico getMedico(){
        return this.medico;
    }

    public String toString(){
        return "Dr(a)."+medico.getNome()+
                " - Dia: "+data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+" - "+
                (isDisponivel()?"Disponível":"Indisponível");
    }


}
