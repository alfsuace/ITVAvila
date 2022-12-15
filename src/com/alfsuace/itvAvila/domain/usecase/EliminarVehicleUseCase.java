//package com.iesam.itvavila.demo.domain.usecase;
package com.alfsuace.itvAvila.domain.usecase;

import com.alfsuace.itvAvila.data.VehicleDataStore;
//import com.iesam.itvavila.demo.data.DemoDataStore;
//import com.iesam.itvavila.demo.domain.models.Demo;

public class EliminarVehicleUseCase {
    private VehicleDataStore dataStore = VehicleDataStore.getInstance();

    public void execute(String codigo) {
        dataStore.eliminar(codigo);
    }
}
