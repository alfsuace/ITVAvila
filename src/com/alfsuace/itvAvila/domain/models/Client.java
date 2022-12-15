package com.alfsuace.itvAvila.domain.models;

public class Client {
    private String dni;
    private String name;
    private String surname1;
    private String surname2;
    private String mailingAddress;
    private String province;
    private String town;
    private String phoneNum;

    public String getDni () {
        return dni;
    }

    public void setDni (String dni) {
        this.dni = dni;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getSurname1 () {
        return surname1;
    }

    public void setSurname1 (String surname1) {
        this.surname1 = surname1;
    }

    public String getSurname2 () {
        return surname2;
    }

    public void setSurname2 (String surname2) {
        this.surname2 = surname2;
    }

    public String getMailingAddress () {
        return mailingAddress;
    }

    public void setMailingAddress (String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getProvince () {
        return province;
    }

    public void setProvince (String province) {
        this.province = province;
    }

    public String getTown () {
        return town;
    }

    public void setTown (String town) {
        this.town = town;
    }

    public String getPhoneNum () {
        return phoneNum;
    }

    public void setPhoneNum (String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
