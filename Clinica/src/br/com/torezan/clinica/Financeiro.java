package br.com.torezan.clinica;

import java.time.format.DateTimeFormatter;

public class Financeiro {
    private final float VALOR_CONSULTA = 35.0f;


    public void imprimirFatura(Paciente paciente){
        int total = 0;
        System.out.println("\n*** Imprimindo Fatura ***");
        for(Consulta consulta : paciente.getConsultas()){
            if(consulta.isRealizada()) {
                System.out.println("Dia: " + consulta.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " - Dr(a). " + consulta.getMedico().getNome());
                total++;
            }
        }
        System.out.println("Total: " + total*VALOR_CONSULTA);

    }

}
