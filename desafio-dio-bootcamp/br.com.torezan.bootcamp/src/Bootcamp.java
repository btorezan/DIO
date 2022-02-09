import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bootcamp {
    private Date dataInicial;
    private String nome;
    private String Descricao;
    private List<Conteudo> conteudos = new ArrayList<>();
    private List<Dev> devs = new ArrayList<>();


    public Bootcamp() {}

    public void addConteudo(Conteudo conteudo){
        conteudos.add(conteudo);
        System.out.println("Conteudo adicionado com sucesso");
    }

    public void removerConteudo(Conteudo conteudo){
        conteudos.remove(conteudo);
        System.out.println("Conteúdo removido com sucesso");
    }

    public void listarConteudos(){
        System.out.println("-------------");
        for (Conteudo conteudo : conteudos) {
            System.out.println(conteudo.getTitulo());
        }
        System.out.println("-------------");
    }

    public void addDev(Dev dev){
        devs.add(dev);
        System.out.println("Dev adicionado com sucesso");
    }

    public void removeDev(Dev dev){
        devs.remove(dev);
    }

    public void listarDevs(){
        System.out.println("----- Devs Inscritos ----");
        for(Dev dev: devs){
            System.out.println(dev.getNome());
        }
    }

    public List<Conteudo> getConteudos(){
        return this.conteudos;
    }

}
