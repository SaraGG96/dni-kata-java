package edu.teamrocket.dni;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DniTest {

    Dni dni1 = new Dni("486958867U");
    Dni dni2 = new Dni("839586867R");
    Dni dni3 = new Dni("986958867A");
    Dni dni4 = new Dni("299586867R");
    Dni dni5 = new Dni("645958867S");
    Dni dni6 = new Dni("486958867T");
    Dni dni7 = new Dni("982958867A");
    Dni dni8 = new Dni("665958867M");
    Dni dni9 = new Dni("826958867Y");
    Dni dni10 = new Dni("021958867F");
    
    @Test
    void esNumeroSanoTest() {
        assertEquals(dni1.getNumeroSano(), true);
        assertEquals(dni2.getNumeroSano(), true);
        assertEquals(dni3.getNumeroSano(), true);
        assertEquals(dni4.getNumeroSano(), true);
        assertEquals(dni5.getNumeroSano(), true);
        assertEquals(dni6.getNumeroSano(), true);
        assertEquals(dni7.getNumeroSano(), true);
        assertEquals(dni8.getNumeroSano(), true);
        assertEquals(dni9.getNumeroSano(), true);
        assertEquals(dni10.getNumeroSano(), true);
    }

    @Test
    void esLetraSanaTest() {
        assertEquals(dni1.getLetraSana(), false);
        assertEquals(dni2.getLetraSana(), true);
        assertEquals(dni3.getLetraSana(), true);
        assertEquals(dni4.getLetraSana(), true);
        assertEquals(dni5.getLetraSana(), true);
        assertEquals(dni6.getLetraSana(), true);
        assertEquals(dni7.getLetraSana(), true);
        assertEquals(dni8.getLetraSana(), true);
        assertEquals(dni9.getLetraSana(), true);
        assertEquals(dni10.getLetraSana(), true);
    }

    @Test
    void getLetraCalculadaTest() {
        assertEquals(dni1.getLetraCalculada(), "S");
        assertEquals(dni2.getLetraCalculada(), "L");
        assertEquals(dni3.getLetraCalculada(), "W");
        assertEquals(dni4.getLetraCalculada(), "E");
        assertEquals(dni5.getLetraCalculada(), "A");
        assertEquals(dni6.getLetraCalculada(), "S");
        assertEquals(dni7.getLetraCalculada(), "R");
        assertEquals(dni8.getLetraCalculada(), "P");
        assertEquals(dni9.getLetraCalculada(), "P");
        assertEquals(dni10.getLetraCalculada(), "P");
    }

    @Test
    void getDniOriginalTest() {
        assertEquals(dni1.getDniOriginal(), "486958867U");
        assertEquals(dni2.getDniOriginal(), "839586867R");
        assertEquals(dni3.getDniOriginal(), "986958867A");
        assertEquals(dni4.getDniOriginal(), "299586867R");
        assertEquals(dni5.getDniOriginal(), "645958867S");
        assertEquals(dni6.getDniOriginal(), "486958867T");
        assertEquals(dni7.getDniOriginal(), "982958867A");
        assertEquals(dni8.getDniOriginal(), "665958867M");
        assertEquals(dni9.getDniOriginal(), "826958867Y");
        assertEquals(dni10.getDniOriginal(), "021958867F");
    }

    @Test
    void getParteNumericaTest() {   
        assertEquals(dni1.getParteNumerica(), "486958867");
        assertEquals(dni2.getParteNumerica(), "839586867");
        assertEquals(dni3.getParteNumerica(), "986958867");
        assertEquals(dni4.getParteNumerica(), "299586867");
        assertEquals(dni5.getParteNumerica(), "645958867");
        assertEquals(dni6.getParteNumerica(), "486958867");
        assertEquals(dni7.getParteNumerica(), "982958867");
        assertEquals(dni8.getParteNumerica(), "665958867");
        assertEquals(dni9.getParteNumerica(), "826958867");
        assertEquals(dni10.getParteNumerica(), "021958867");
    }

    @Test
    void getParteAlfabeticaTest() {
        assertEquals(dni1.getParteAlfabetica(), "U");
        assertEquals(dni2.getParteAlfabetica(), "R");
        assertEquals(dni3.getParteAlfabetica(), "A");
        assertEquals(dni4.getParteAlfabetica(), "R");
        assertEquals(dni5.getParteAlfabetica(), "S");
        assertEquals(dni6.getParteAlfabetica(), "T");
        assertEquals(dni7.getParteAlfabetica(), "A");
        assertEquals(dni8.getParteAlfabetica(), "M");
        assertEquals(dni9.getParteAlfabetica(), "Y");
        assertEquals(dni10.getParteAlfabetica(), "F");
    }

    @Test
    void checkDniValidoTest() {
        assertEquals(dni1.checkDniValido(), false);
        assertEquals(dni2.checkDniValido(), false);
        assertEquals(dni3.checkDniValido(), false);
        assertEquals(dni4.checkDniValido(), false);
        assertEquals(dni5.checkDniValido(), false);
        assertEquals(dni6.checkDniValido(), false);
        assertEquals(dni7.checkDniValido(), false);
        assertEquals(dni8.checkDniValido(), false);
        assertEquals(dni9.checkDniValido(), false);
        assertEquals(dni10.checkDniValido(), false);
    }
}
