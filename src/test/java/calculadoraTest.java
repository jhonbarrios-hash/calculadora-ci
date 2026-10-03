import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
 
public class CalculadoraTest {
 
@Test
void pruebaSuma() {
 
Calculadora calculadora = new Calculadora();
 
assertEquals(5,
calculadora.sumar(2,3));
}
}