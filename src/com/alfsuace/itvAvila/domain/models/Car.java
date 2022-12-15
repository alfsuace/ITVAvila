package com.alfsuace.itvAvila.domain.models;

public class Car implements Vehicle{

    private String carId;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private String matriculacion;
    private String numPuertas;


    @Override
    public String getCodigo () {
        return carId;
    }

    @Override
    public String getMatricula () {
        return matricula;
    }

    @Override
    public String getMarca () {
        return marca;
    }

    @Override
    public String getModelo () {
        return modelo;
    }

    @Override
    public String getColor () {
        return color;
    }

    @Override
    public String getMatriculacion () {
        return matriculacion;
    }


    public void setCarId (String carId) {
        this.carId = carId;
    }

    public void setMatricula (String matricula) {
        this.matricula = matricula;
    }

    public void setMarca (String marca) {
        this.marca = marca;
    }

    public void setModelo (String modelo) {
        this.modelo = modelo;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public void setMatriculacion (String matriculacion) {
        this.matriculacion = matriculacion;
    }

    public String getNumPuertas () {
        return numPuertas;
    }

    public void setNumPuertas (String numPuertas) {
        this.numPuertas = numPuertas;
    }
}
