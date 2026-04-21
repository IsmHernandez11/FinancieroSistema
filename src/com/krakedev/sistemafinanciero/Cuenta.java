package com.krakedev.sistemafinanciero;


public class Cuenta {

    private String id;
    private double saldoActual;
    private String tipo; 
    private Cliente propietario; 

    // Constructor
    public Cuenta(String id) {
        this.id = id;
        this.saldoActual = 0;
        this.tipo = "A";
    }

    // Getters
    public String getId() {
        return id;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public String getTipo() {
        return tipo;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    // Método imprimir
    public void imprimir() {
        System.out.println("ID: " + id);
        System.out.println("Saldo Actual: " + saldoActual);
        System.out.println("Tipo: " + tipo);

        if (propietario != null) {
            System.out.println("Cédula cliente: " + propietario.getCedula());
        } else {
            System.out.println("Sin propietario asignado");
        }
    }
}