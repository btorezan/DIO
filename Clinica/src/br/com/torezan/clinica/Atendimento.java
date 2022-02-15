package br.com.torezan.clinica;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Atendimento {
    private Medico medico;
    private Paciente paciente;
    private boolean aberto = false;
    private Consulta consulta;
    private LocalDate data;

    public Atendimento(LocalDate data, Medico medico, Paciente paciente) {
        this.medico = medico;
        this.data = data;
        iniciarAtendimento(paciente);

    }

    public Atendimento(){}

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void iniciarAtendimento(Paciente paciente){
        if(!aberto) {
            aberto = true;
            this.paciente = paciente;
            this.consulta = medico.getAgenda().getConsulta(data, paciente);
            this.medico.setEmAtendimento(true);
        }else{
            System.out.println("Necessário encerrar atendimento anterior antes de iniciar um novo");
        }
    }

    public void encerrarAtendimento(){
        if(aberto){
            this.aberto = false;
            this.consulta.setRealizada(true);
        }else{
            System.out.println("Não há atendimentos abertos.");
        }
    }
}
