package br.com.torezan.clinica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Consulta> dias = new ArrayList<>();
    private Medico medico;

    public Agenda(Medico medico){
        this.medico = medico;
        medico.setAgenda(this);
    }

    //Listar dias disponiveis
    public void listarDiasDisponiveis(){
        for(Consulta dia : dias){
            if(dia.isDisponivel()){
                System.out.println(dia.toString());
            }
        }
    }

    public void listarAgenda(){
        for(Consulta dia:dias){
            System.out.println(dia.toString());
        }
    }

    //Agendar novos dias Abertos
    public void inserirDiasDisponiveis(LocalDate data){
        Consulta dia = new Consulta(data, this.medico);
        dias.add(dia);
    }

    //Agendar pacientes nos dias Abertos
    public void agendarPaciente(LocalDate data, Paciente paciente){
        //verificar se o dia solicitado existe na agenda

        Consulta agendamento = null;

        for(Consulta dia:dias){
            if(isDiaLivre(dia, data)){
                agendamento = dia;
            }
        }
        if (agendamento != null){
            agendamento.setPaciente(paciente);
            paciente.adicionarConsulta(agendamento);
            agendamento.setDisponivel(false);
            System.out.println("Paciente "+paciente.getNome()+" agendado (a) com Dr(a). "+agendamento.getMedico().getNome()+" com êxito");
        }else{
            System.out.println("Agenda não aberta ou dia indisponível");
        }
    }

    public boolean isDiaLivre(Consulta dia, LocalDate data){
       return dia.getData().equals(data) && dia.isDisponivel();
    }
    //Listar dias com pacientes agendados por Médico
    public void listarPacientesAgendados(){
        for(Consulta dia : dias){
            if(dia.getPaciente()!= null){
                System.out.println("Paciente "+dia.getPaciente().getNome()+" "+
                        (dia.getPaciente().getSexo()=='M'?"agendado":"agendada")+
                        " para dia "+dia.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            }
        }
    }

    //TODO Reagendar Horarios
    public void reagendarConsulta(LocalDate dataAntiga, LocalDate novaData, Paciente paciente) {
        Consulta consultaAntiga = null;

        for (Consulta dia : dias) {
            if (dia.getData().equals(dataAntiga)&&dia.getPaciente().equals(paciente)) {
                consultaAntiga = dia;
            }
        }
        if (consultaAntiga != null) {
            agendarPaciente(novaData, paciente);
            consultaAntiga.setDisponivel(true);
            consultaAntiga.setPaciente(null);
            desmarcarConsulta(dataAntiga, paciente);
        }
    }

    public Consulta getConsulta(LocalDate data, Paciente paciente){
        Consulta consulta = null;
        for (Consulta dia : dias) {
            if (dia.getData().equals(data)&&dia.getPaciente().equals(paciente)) {
                consulta = dia;
            }
        }
        return consulta;
    }

    public void desmarcarConsulta(LocalDate data, Paciente paciente){
        paciente.getConsultas().removeIf(consulta -> consulta.getData().equals(data));
    }
}
