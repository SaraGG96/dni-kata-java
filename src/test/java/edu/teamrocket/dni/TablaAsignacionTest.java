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
    }















} 
