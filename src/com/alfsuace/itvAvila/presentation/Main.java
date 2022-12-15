package com.alfsuace.itvAvila.presentation;

//import com.iesam.itvavila.demo.presentation.DemoMain;

import com.alfsuace.itvAvila.domain.models.Car;
import com.alfsuace.itvAvila.domain.models.Client;
import com.alfsuace.itvAvila.domain.models.Inspeccion;
import com.alfsuace.itvAvila.domain.models.Truck;

public class Main {

    public static void main(String[] args) {
        //Aquí comienza el ejercicio. Revisa la carpeta demo para obtener ejemplos.
        //DemoMain demoMain = new DemoMain();
        //DemoMain.main();

        //Cliente (Propietario segun enunciado)
        Client cliente = new Client();
        cliente.setDni("12345678l");
        cliente.setName("Alfonso");
        cliente.setSurname1("Suarez");
        cliente.setSurname2("Acena");
        cliente.setProvince("Avila");
        cliente.setTown("Avila");
        cliente.setPhoneNum("12345679");
        cliente.setMailingAddress("05005");

        //Camion
        Truck camion = new Truck();
        camion.setColor("rojo");
        camion.setLongitud(12);
        camion.setMarca("Scania");
        camion.setModelo("adsfklj");
        camion.setTara(15000);
        camion.setMatricula("1203 abc");
        camion.setMatriculacion("10/10/2010");
        camion.setTruckId("1");

        //Coche
        Car coche = new Car();
        coche.setCarId("1");
        coche.setColor("Azul");
        coche.setMarca("Ford");
        coche.setModelo("añsdkfj");
        coche.setNumPuertas("5");
        coche.setMatricula("1234 adc");
        coche.setMatriculacion("20/05/2015");

        //Inspeccion 1
        Inspeccion inspeccion1 = new Inspeccion();
        inspeccion1.setInspeccionId("1");
        inspeccion1.setDate("15/12/2022");
        inspeccion1.setResult(true);
        inspeccion1.setVehicle(camion);
        inspeccion1.setClient(cliente);

        //Inspeccion 2
        Inspeccion inspeccion2 = new Inspeccion();
        inspeccion2.setInspeccionId("2");
        inspeccion2.setDate("15/12/2022");
        inspeccion2.setResult(false);
        inspeccion2.setVehicle(camion);
        inspeccion2.setClient(cliente);

    }
}
