import java.util.Date;

public abstract class Conteudo {
    private String titulo;
    private String descricao;
    public final int XP = 100;


    public double calcularXP() {
        return 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}