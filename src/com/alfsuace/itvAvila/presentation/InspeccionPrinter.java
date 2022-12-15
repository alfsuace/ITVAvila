package com.alfsuace.itvAvila.presentation;

import com.alfsuace.itvAvila.data.VehicleDataStore;
import com.alfsuace.itvAvila.domain.models.Inspeccion;
import com.alfsuace.itvAvila.domain.models.Vehicle;

public class InspeccionPrinter {
    public void inspeccionPrinter(){
        System.out.println("Codigo de inspeccion: " );
        System.out.println("Fecha de inspeccion: " );
        System.out.println("Matrícula: " + VehicleDataStore.getInstance().buscar().getMatricula());
        System.out.println("Modelo: " + VehicleDataStore.getInstance().buscar().getModelo());
        System.out.println("Dni del propietario: " );
        System.out.println("Nombre del propietario: " );
        System.out.println("Resultado de la inspeccion: " );
    }
}
