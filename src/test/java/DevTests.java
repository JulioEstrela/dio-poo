import dominio.Conteudo;
import dominio.Curso;
import dominio.Dev;
import static org.junit.Assert.*;
import org.junit.Test;

public class DevTests {
    @Test
    public void Should_ThrowError_When_DevNotEnrolled () {
        Dev dev = new Dev("name");
        Conteudo curso = new Curso("n", "d", 10);

        assertThrows(RuntimeException.class, () -> dev.finalizarConteudo(curso));
    }
}
