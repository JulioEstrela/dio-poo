package dominio;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public abstract class Conteudo {
    protected static final int XP_PADRAO = 10;
    private String titulo;
    private String descricao;

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public abstract double calcularXp();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conteudo conteudo)) return false;
        return Objects.equals(getTitulo(), conteudo.getTitulo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo());
    }
}
