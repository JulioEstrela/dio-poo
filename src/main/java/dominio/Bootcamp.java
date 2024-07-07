package dominio;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Setter
@Getter
@ToString
public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Bootcamp(String nome) {
        this.nome = nome;
    }

    public double calcularCargaHoraria() {
        return this.conteudos.stream()
                .filter(Curso.class::isInstance)
                .map(Curso.class::cast)
                .mapToDouble(Curso::getCargaHoraria)
                .sum();
    }
}
