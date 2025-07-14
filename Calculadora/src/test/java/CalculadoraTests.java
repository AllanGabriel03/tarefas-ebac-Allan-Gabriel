
import org.example.Calculadora;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTests {
/*
  Método adicionar informa dois números e informa a expectativa do resultado para saber se o código está certo.
 */
    @Test
    public void testAdicionar_HappyPath(){
        final Calculadora calculadora = new Calculadora();

        final int soma = calculadora.adicionar(10, 10);

        Assert.assertEquals(20, soma);
    }
/*
  Método subtrair informa dois números e informa a expectativa do resultado para saber se o código está certo.
 */
    @Test
    public void testSubtrair_HappyPath(){
        final Calculadora calculadora = new Calculadora();

        final int subtracao = calculadora.subtrair(10, 10);

        Assert.assertEquals(0, subtracao);
    }

/*
  Método multiplicar informa dois números e informa a expectativa do resultado para saber se o código está certo.
 */
    @Test
    public void testMultiplicar_HappyPath(){
        final Calculadora calculadora = new Calculadora();

        final int multiplicacao = calculadora.multiplicar(10, 10);

        Assert.assertEquals(100, multiplicacao);
    }
/*
   Método dividir informa dois números e informa a expectativa do resultado para saber se o código está certo.
 */
    @Test
    public void testDividir_HappyPath(){
        final Calculadora calculadora = new Calculadora();

        final int divisao = calculadora.dividir(10, 10);

        Assert.assertEquals(1, divisao);
    }

}
