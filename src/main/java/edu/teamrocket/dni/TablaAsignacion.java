package edu.teamrocket.dni;

public class TablaAsignacion {
    
    //atributos
    final String[] tabla = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

    //constructor
    TablaAsignacion() {};

    //métodos
    String[] getTabla() {
        return this.tabla;
    }

    String getLetra (int index) {
        return this.tabla[index];
    }

    

}
