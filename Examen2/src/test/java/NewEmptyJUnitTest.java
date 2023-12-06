/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import cr.go.ucr.OperacionAritmetica;
import cr.go.ucr.operaciones.Division;
import cr.go.ucr.operaciones.Multiplicacion;
import cr.go.ucr.operaciones.Resta;
import cr.go.ucr.operaciones.Sumar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author z0d80
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testSuma() {
        OperacionAritmetica context = new OperacionAritmetica(new Sumar());
        int resultado = context.procesar(5, 10);
        assertEquals(15, resultado);
    }
    public void testSumaNotEquals() {
        OperacionAritmetica context = new OperacionAritmetica(new Sumar());
        int resultado = context.procesar(5, 10);
        assertNotEquals(10, resultado);
    }
       
    public void testResta() {
        OperacionAritmetica context = new OperacionAritmetica(new Resta());
        // Prueba de caso donde el primer dígito es mayor que el segundo
        int resultado = context.procesar(20, 4);
        assertEquals(-2, resultado);
    }
    public void testRestaNotEquals() {
        OperacionAritmetica context = new OperacionAritmetica(new Resta());
        int resultado = context.procesar(20, 4);
        assertNotEquals(15, resultado);
    }
    public void testMultiplicacion() {
        OperacionAritmetica context = new OperacionAritmetica(new Multiplicacion());
        int resultado = context.procesar(5, 4);
        assertEquals(20, resultado);
    }
    public void testDivision() {
        OperacionAritmetica context = new OperacionAritmetica(new Division());
        int resultado = context.procesar(20, 4);
        assertEquals(5, resultado);
    }
    public void testDivisionNotEquials() {
        OperacionAritmetica context = new OperacionAritmetica(new Division());
        int resultado = context.procesar(20, 4);
        assertNotEquals(20, resultado);
    }
    
    public void testDivisionPorCero() {
        OperacionAritmetica context = new OperacionAritmetica(new Division());
        // Prueba de división por cero
        int resultado = context.procesar(5, 0);
        assertEquals(-3, resultado);
    }
    public void testValoresNegativos() {
        OperacionAritmetica context = new OperacionAritmetica(new Sumar());
        // Prueba de valores negativos
        int resultado = context.procesar(-5, 10);
        assertEquals(-1, resultado);
    }
}

