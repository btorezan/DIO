import br.com.torezan.clinica.*;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        //cria agenda para dois medicos
        Agenda agendaMedico1;
        Agenda agendaMedico2;

        //instanacia dois medicos
        Medico medico1 = new Medico("Bruno", 1, "CRMSP 1234");
        Medico medico2 = new Medico("Aline", 1, "CRMSP 1235");

        //instancia as agendas para os dois medicos
        agendaMedico1 = new Agenda(medico1);
        agendaMedico2 = new Agenda(medico2);

        //agenda para medico 1
        agendaMedico1.inserirDiasDisponiveis(LocalDate.of(2022, 2, 18));
        agendaMedico1.inserirDiasDisponiveis(LocalDate.of(2022, 2, 19));
        agendaMedico1.inserirDiasDisponiveis(LocalDate.of(2022, 2, 20));
        agendaMedico1.inserirDiasDisponiveis(LocalDate.of(2022, 2, 21));

        //agenda para o medico 2
        agendaMedico2.inserirDiasDisponiveis(LocalDate.of(2022, 2, 17));
        agendaMedico2.inserirDiasDisponiveis(LocalDate.of(2022, 2, 16));
        agendaMedico2.inserirDiasDisponiveis(LocalDate.of(2022, 2, 15));
        agendaMedico2.inserirDiasDisponiveis(LocalDate.of(2022, 2, 14));

        //consulta dias disponiveis medico 1
        medico1.getAgenda().listarDiasDisponiveis();
        System.out.println("-------------------");
        //consulta dias disponiveis medico 2
        medico2.getAgenda().listarDiasDisponiveis();

        System.out.println("Cadastrando Pacientes ...");
        //pacientes
        Paciente aline = new Paciente("Aline", 32, 'F');
        Paciente bruno = new Paciente("Bruno", 33, 'M');

        //agenda pacientes medico 1 dia que está aberto
        medico1.getAgenda().agendarPaciente(LocalDate.of(2022,2,18), aline);
        medico1.getAgenda().agendarPaciente(LocalDate.of(2022,2,19), aline);

        //agenda paciente medico 1 dia que não está aberto
        //medico1.getAgenda().agendarPaciente(LocalDate.of(2022,2,19), bruno);

        System.out.println("\n*** Listando dias disponíveis Medico 1 ***");
        //listar dias disponiveis
        medico1.getAgenda().listarDiasDisponiveis();
        System.out.println("\n*** Listando dias disponíveis Medico 2 ***");
        medico2.getAgenda().listarDiasDisponiveis();

        System.out.println("\n*** Listando pacientes agendados Medico 1 ***");
        //listar dias pacientes agendados
        medico1.getAgenda().listarPacientesAgendados();


        System.out.println("\n*** Exibindo informações dos pacientes ***");
        //Consultar dados cdadstrais do paciente
        System.out.println(aline.toString());
        System.out.println(bruno.toString());


        //TODO listar consultas por paciente
        System.out.println("\n*** Listando consultas agendadas para Bruno ***");
        bruno.listarConsultasAgendadas();

        System.out.println("\n*** Listando consultas agendadas para Aline ***");
        aline.listarConsultasAgendadas();

        System.out.println("\n*** Listando Agenda Medico 1 ***");
        medico1.getAgenda().listarAgenda();

        System.out.println("\n*** Reagendando consulta do dia 18 para dia 20 Medico 1 ***");
        //TODO Reagendar consulta
        LocalDate dataAntiga = LocalDate.of(2022,2,18);
        LocalDate novaData = LocalDate.of(2022,2,20);

        medico1.getAgenda().reagendarConsulta(dataAntiga, novaData, aline);

        System.out.println("\n*** Listando Agenda Medico 1 ***");
        medico1.getAgenda().listarAgenda();


        System.out.println("\n*** Listando consultas agendadas para Aline ***");
        aline.listarConsultasAgendadas();

        LocalDate dataAtendimento = LocalDate.of(2022,2, 19);
        System.out.println("******"+dataAtendimento);
        Atendimento atendimento = new Atendimento(dataAtendimento, medico1, aline);

        System.out.println("\n*** Resumo do Atendimento ***");
        System.out.println("Nome do Médico: "+atendimento.getMedico().getNome());
        System.out.println("Status do Médico: "+(atendimento.getMedico().isEmAtendimento()?"Em Atendimento":"Livre"));
        System.out.println("Status do Atendimento: "+(atendimento.isAberto()?"Em Atendimento":"Atendimento Finalizado"));
        System.out.println("Paciente: "+atendimento.getPaciente().toString());

        atendimento.encerrarAtendimento();

        System.out.println("\n*** Resumo do Atendimento ***");
        System.out.println("Nome do Médico: "+atendimento.getMedico().getNome());
        System.out.println("Status do Médico: "+(atendimento.getMedico().isEmAtendimento()?"Em Atendimento":"Livre"));
        System.out.println("Status do Atendimento: "+(atendimento.isAberto()?"Em Atendimento":"Atendimento Finalizado"));
        System.out.println("Paciente: "+atendimento.getPaciente().toString());

        System.out.println("\n*** Gerando fatura para Aline ***");
        Financeiro financeiro = new Financeiro();
        financeiro.imprimirFatura(aline);


    }
}
