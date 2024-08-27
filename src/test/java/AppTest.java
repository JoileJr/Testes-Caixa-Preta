import org.junit.Test;
import static org.junit.Assert.assertEquals;

// Importe a classe que está dentro do Joile.jar
import paranavai.ifpr.edu.br.SimuladorCashBack;

public class AppTest {

    // Cara deveria obter 5% de desconto
    @Test
    public void testCashbackLimiteInferiorPrimeiraFaixaValoresBronze() {
        double resultado = SimuladorCashBack.calculaCashBack (100, "Bronze");
        assertEquals(5.0, resultado, 0.01);
    }

    // Cara deveria obter 10% de desconto
    @Test
    public void testCashbackLimiteInferiorSegundaFaixaValoresBronze() {
        double resultado = SimuladorCashBack.calculaCashBack (200, "Bronze");
        assertEquals(20.0, resultado, 0.01);
    }

    // Cara deveria obter 15% de desconto
    @Test
    public void testCashbackLimiteInferiorTerceiraFaixaValoresBronze() {
        double resultado = SimuladorCashBack.calculaCashBack (1000, "Bronze");
        assertEquals(150.0, resultado, 0.01);
    }

    // Cara deveria obter 10% de desconto
    @Test
    public void testCashbackLimiteInferiorPrimeiraFaixaValoresPrata() {
        double resultado = SimuladorCashBack.calculaCashBack (100, "Prata");
        assertEquals(10.0, resultado, 0.01);
    }

    // Cara deveria obter 15% de desconto
    @Test
    public void testCashbackLimiteInferiorSegundaFaixaValoresPrata() {
        double resultado = SimuladorCashBack.calculaCashBack (200, "Prata");
        assertEquals(30.0, resultado, 0.01);
    }

    // Cara deveria obter 20% de desconto
    @Test
    public void testCashbackLimiteInferiorTerceiraFaixaValoresPrata() {
        double resultado = SimuladorCashBack.calculaCashBack (1000, "Prata");
        assertEquals(200.0, resultado, 0.01);
    }

    // Cara deveria obter 15% de desconto
    @Test
    public void testCashbackLimiteInferiorPrimeiraFaixaValoresOuro() {
        double resultado = SimuladorCashBack.calculaCashBack (100, "Ouro");
        assertEquals(15.0, resultado, 0.01);
    }

    // Cara deveria obter 20% de desconto
    @Test
    public void testCashbackLimiteInferiorSegundaFaixaValoresOuro() {
        double resultado = SimuladorCashBack.calculaCashBack (200, "Ouro");
        assertEquals(40.0, resultado, 0.01);
    }

    // Cara deveria obter 25% de desconto
    @Test
    public void testCashbackLimiteInferiorTerceiraFaixaValoresOuro() {
        double resultado = SimuladorCashBack.calculaCashBack (1000, "Ouro");
        assertEquals(250.0, resultado, 0.01);
    }

    

}