package com.alfsuace.itvAvila.domain.models;

public class Motorbike implements Vehicle{

    private String motorbikeId;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private String matriculacion;
    private String diamRueda;

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

    public String getMotorbikeId () {
        return motorbikeId;
    }

    public void setMotorbikeId (String motorbikeId) {
        this.motorbikeId = motorbikeId;
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

    public String getDiamRueda () {
        return diamRueda;
    }

    public void setDiamRueda (String diamRueda) {
        this.diamRueda = diamRueda;
    }
}
