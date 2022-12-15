package com.alfsuace.itvAvila.domain.models;

public class Truck implements Vehicle {

    private String truckId;
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private String matriculacion;
    private Integer tara;
    private Integer longitud;


    @Override
    public String getCodigo () {
        return truckId;
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


    public void setTruckId (String truckId) {
        this.truckId = truckId;
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

    public Integer getTara () {
        return tara;
    }

    public void setTara (Integer tara) {
        this.tara = tara;
    }

    public Integer getLongitud () {
        return longitud;
    }

    public void setLongitud (Integer longitud) {
        this.longitud = longitud;
    }
}
