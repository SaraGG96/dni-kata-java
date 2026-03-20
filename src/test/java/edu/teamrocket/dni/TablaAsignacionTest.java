package edu.teamrocket.dni;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TablaAsignacionTest {

    TablaAsignacion tablaAsignacion = new TablaAsignacion();
    // hay que instanciarlo para usar sus métodos

    
    @Test 
    public void getTablaTest() {
        String[] tablaEsperada = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        assertArrayEquals(tablaEsperada, tablaAsignacion.getTabla());
    }

    @Test 
    public void getLetraTest() {
        assertEquals(tablaAsignacion.getLetra(0), "T");
        assertEquals(tablaAsignacion.getLetra(2), "W");
        assertEquals(tablaAsignacion.getLetra(3), "A");
        assertEquals(tablaAsignacion.getLetra(4), "G");
        assertEquals(tablaAsignacion.getLetra(6), "Y");
        assertEquals(tablaAsignacion.getLetra(8), "P");
        assertEquals(tablaAsignacion.getLetra(10), "X");
        assertEquals(tablaAsignacion.getLetra(23), "Letra fuera de rango");
    }

    @Test
    public void getModuloTest() {
        assertEquals(tablaAsignacion.getModulo(), 23);
    }

    @Test
    public void esLetraPermitidaTest() {
        assertEquals(tablaAsignacion.esLetraPermitida("W"), true);
        assertEquals(tablaAsignacion.esLetraPermitida("J"), true);
        assertEquals(tablaAsignacion.esLetraPermitida("H"), true);
        assertEquals(tablaAsignacion.esLetraPermitida("L"), true);
        assertEquals(tablaAsignacion.esLetraPermitida("Ñ"), false);
    }

    @Test
    public void calcularLetraTest() {
        assertEquals(tablaAsignacion.calcularLetra(574382930), "C");
        assertEquals(tablaAsignacion.calcularLetra(12345678), "Z");
        assertEquals(tablaAsignacion.calcularLetra(98765432), "M");
        assertEquals(tablaAsignacion.calcularLetra(11111111), "H");
        assertEquals(tablaAsignacion.calcularLetra(23456789), "D");
        assertEquals(tablaAsignacion.calcularLetra(87654321), "X");
    }








} 
