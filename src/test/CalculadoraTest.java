package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import app.*;

class CalculadoraTest {

    @Test
    @DisplayName("La multiplicación de 3x5 es 15")
    void test3x5() {
        //fail("Not yet implemented");
       // 1 - preracion del test
       Calculadora calc = new Calculadora();
       // 2 - Ejecutar lo que vamos a validar
       int result = calc.multiplica(3,5);
       // 3 - Aserciones
       assertEquals( 15, result, "3x5=15");
    }

    @Test
    @DisplayName("La división de 10/5 es 2")
    void test10dividir5() {
        //fail("Not yet implemented");
       // 1 - preracion del test
       Calculadora calc = new Calculadora();
       // 2 - Ejecutar lo que vamos a validar
       int result = calc.division(10,5);
       // 3 - Aserciones
       assertEquals( 2, result, "10/5=2");
    }

    @Test
    @DisplayName("La suma de 20+10 es 30")
    void test20suma10() {
        //fail("Not yet implemented");
       // 1 - preracion del test
       Calculadora calc = new Calculadora();
       // 2 - Ejecutar lo que vamos a validar
       int result = calc.suma(20,10);
       // 3 - Aserciones
       assertEquals( 30, result, "20+10=30");
    }

    @Test
    @DisplayName("La resta de 20-10 es 10")
    void test20resta10() {
        //fail("Not yet implemented");
       // 1 - preracion del test
       Calculadora calc = new Calculadora();
       // 2 - Ejecutar lo que vamos a validar
       int result = calc.resta(20,10);
       // 3 - Aserciones
       assertEquals( 10, result, "20-10=10");
    }

    @Test
    @DisplayName("La suma de 5/10 + 3/6 es 48/60")
    void test2x4() {
        //fail("Not yet implemented");
       // 1 - preracion del test
       Fraccion f1 = new Fraccion(5,10);
       Fraccion f2 = new Fraccion(3,6);

       Calculadora calc = new Calculadora();
       // 2 - Ejecutar lo que vamos a validar
       Fraccion result = calc.suma(f1,f2);
       // 3 - Aserciones
       assertAll("Mensaje TODOS",
       () -> assertEquals(60, result.numerador),
       () -> assertEquals(60, result.denominador)
       );
    }




}