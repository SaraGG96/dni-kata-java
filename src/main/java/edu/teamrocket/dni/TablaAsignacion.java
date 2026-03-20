package edu.teamrocket.dni;

import java.util.Arrays;

public class TablaAsignacion {
    
    //atributos
    final String[] tabla = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

    //constructor
    TablaAsignacion() {};

    //métodos
    String[] getTabla() {
        return this.tabla;
    }

    String getLetra (int posicion) {
        try {
            return this.tabla[posicion];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Letra fuera de rango";
        }
    }

    int getModulo() {
        return this.tabla.length;
    }

    boolean esLetraPermitida(String letra) {
        return Arrays.asList(this.tabla).contains(letra);
    }

    String calcularLetra(int numeroDni) {
        int posicion = numeroDni % getModulo();
        return getLetra(posicion);
    }

}
