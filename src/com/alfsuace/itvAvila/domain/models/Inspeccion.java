package com.alfsuace.itvAvila.domain.models;

public class Inspeccion {

    private String inspeccionId;
    private String date;
    private Boolean result;
    private Vehicle vehicle;
    private Client client;

    public String getInspeccionId () {
        return inspeccionId;
    }

    public void setInspeccionId (String inspeccionId) {
        this.inspeccionId = inspeccionId;
    }

    public String getDate () {
        return date;
    }

    public void setDate (String date) {
        this.date = date;
    }

    public Boolean getResult () {
        return result;
    }

    public void setResult (Boolean result) {
        this.result = result;
    }

    public Vehicle getVehicle () {
        return vehicle;
    }

    public void setVehicle (Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Client getClient () {
        return client;
    }

    public void setClient (Client client) {
        this.client = client;
    }
}
