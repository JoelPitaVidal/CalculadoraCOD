import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Testing {
    @Test
    public void testearSuma10mas2() {
        Assertions.assertEquals(12, Calculos.calc(10, 2, Calculos.SUMA));
    }
    @Test
    public void testearSuma13mas2() {
        Assertions.assertEquals(15 ,Calculos.calc(13,2,Calculos.SUMA));
    }
    @Test
    public void testearSuma5mas4() {
        Assertions.assertEquals(9 ,Calculos.calc(5,4,Calculos.SUMA));
    }
    @Test
    public void testResta5menos4() {
        Assertions.assertEquals(1, Calculos.calc(5, 4, Calculos.RESTA));
    }
    @Test
    public void testResta10menos9() {
        Assertions.assertEquals(1, Calculos.calc(10, 9, Calculos.RESTA));
    }
    @Test
    public void testResta5menos7() {
        Assertions.assertEquals(-2, Calculos.calc(5, 7, Calculos.RESTA));
    }
    @Test
    public void testMultiplicacion2por3() {
        Assertions.assertEquals(6, Calculos.calc(2, 3, Calculos.MULTIPLICACION));
    }
    @Test
    public void testMultiplicacion5por5() {
        Assertions.assertEquals(25, Calculos.calc(5, 5, Calculos.MULTIPLICACION));
    }
    @Test
    public void testMultiplicacion0por10() {
        Assertions.assertEquals(0, Calculos.calc(0, 10, Calculos.MULTIPLICACION));
    }
    @Test
    public void testDivision5entre2() {
        Assertions.assertEquals(2.5, Calculos.calc(5, 2, Calculos.DIVISION));
    }
    @Test
    public void testDivision0entre10() {
        Assertions.assertEquals(0, Calculos.calc(0, 10, Calculos.DIVISION));
    }
    @Test
    public void testDivision10entre0() {
        Assertions.assertEquals(0, Calculos.calc(10, 0, Calculos.DIVISION));
    }
    @Test
    public void test4raizde2() {
        Assertions.assertEquals(2, Calculos.calc(4, 2, Calculos.RAIZ));
    }
    @Test
    public void test0raizde5() {
        Assertions.assertEquals(0, Calculos.calc(0, 5, Calculos.RAIZ));
    }


}
