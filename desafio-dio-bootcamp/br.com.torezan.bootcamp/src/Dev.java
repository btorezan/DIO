import java.util.Collection;
import java.util.List;

public class Dev {

    private String nome;
    private List<Conteudo> conteudos;

    public int xp = 0;

    //construtor vazio
    public Dev() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void inscrever(Bootcamp bootcamp){
        bootcamp.addDev(this);
        Collection.addAll(this.conteudos, bootcamp.getConteudos());
        System.out.println("Inscrição efetuada com sucesso");
    };

    public void progredir(Conteudo conteudo, int porcentagem){
        this.xp = this.xp + (conteudo.XP * porcentagem);

    }

    public void calcularXP(){
        System.out.println("XP: "+this.xp);
    }
    public void exibirCursos(){
        for(Conteudo conteudo : this.conteudos){
            System.out.println(conteudo.getTitulo());
        }
    }

}
