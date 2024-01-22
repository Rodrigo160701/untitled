import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestComparadorDePeso {

    @Test
    public void getPersonaMasPesada() {
        ComparadorDePeso comparador = new ComparadorDePeso();

        Persona persona1 = new Persona("Persona 1", 65);
        Persona persona2 = new Persona("Persona 2", 70);

        Pesoable personaMasPesada = comparador.getPersonaMasPesada(persona1, persona2);

        assertEquals(persona2, personaMasPesada, "La persona más pesada debe ser Persona 2");
    }
}
