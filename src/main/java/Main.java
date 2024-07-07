import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso("Java", "Curso de Java", 24);
        System.out.println(cursoJava);
        Curso cursoSpringBoot = new Curso("Spring Boot", "Curso de Spring Boot", 24);
        System.out.println(cursoSpringBoot);
        Mentoria mentoria = new Mentoria("Mentoria", "Descrição da mentoria", LocalDate.now());
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp("Backend com Java");
        bootcamp.setConteudos(Set.of(cursoJava, cursoSpringBoot, mentoria));
        System.out.println(bootcamp.calcularCargaHoraria());

        Dev dev = new Dev("Júlio");
        dev.inscreverBootcamp(bootcamp);
        dev.finalizarConteudo(cursoJava);
        System.out.println(dev.getConteudosInscritos());
        System.out.println(dev.getConteudosConcluidos());
        System.out.println(dev.calcularTotalXp());
    }
}
