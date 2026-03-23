package edu.teamrocket.dni;


public class Dni {

    //atributos
    TablaAsignacion tablaAsignacion = new TablaAsignacion();
    boolean numero_sano;
    boolean letra_sana;
    String numeroPersonal;
    String letraAsignacion;
    String dniOriginal;

    //constructor
    Dni (String dni) {
        this.dniOriginal = dni;
        this.numeroPersonal = dni.substring(0, dni.length() - 1);
        this.letraAsignacion = dni.substring(dni.length() - 1);
        this.numero_sano = esNumeroSano();
        this.letra_sana = esLetraSana();
    }

    //metodos
    boolean esNumeroSano() {
        try {
            Integer.parseInt(numeroPersonal);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    boolean esLetraSana() {
        if (letraAsignacion.length() != 1) {
            return false;
        }
        return tablaAsignacion.esLetraPermitida(letraAsignacion);
    }

    String getDniOriginal() {
        return dniOriginal;
    }

    boolean getNumeroSano() {
        return numero_sano;
    }

    boolean getLetraSana() {
        return letra_sana;
    }

    String getParteAlfabetica() {
        return letraAsignacion;
    }

    String getParteNumerica() {
        return numeroPersonal;
    }

    String getLetraCalculada() {
        if (!numero_sano) {
            return "Número no sano, no se puede calcular letra";
        }
        return tablaAsignacion.calcularLetra(Integer.parseInt(numeroPersonal));
    }

    boolean checkDniValido() {
        //parte numérica son numeros, numero personal es UNA letra, la letra calculada es valida
        if (!numero_sano) {
            return false;
        } else if (!letra_sana) {
            return false;
        } else if (!getLetraCalculada().equals(letraAsignacion)) {
            return false;
        } else {
            return true;
        }
    }








}
