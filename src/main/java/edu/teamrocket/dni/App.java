package edu.teamrocket.dni;

public class App {
    public static void main(String[] args) {

        TablaAsignacion tablaAsignacion = new TablaAsignacion();
        Dni dni = new Dni("663645805S");

        boolean letraPermitida = tablaAsignacion.esLetraPermitida(dni.getParteAlfabetica());
        boolean valido = dni.getNumeroSano() && letraPermitida && dni.checkDniValido();

        if (valido) {
            System.out.println("DNI valido: " + dni.getDniOriginal());
        } else {
            System.out.println("DNI no valido: " + dni.getDniOriginal());
            System.out.println("Letra esperada para " + dni.getParteNumerica() + ": " + dni.getLetraCalculada());
        }

    }
}