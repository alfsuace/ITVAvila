//package com.iesam.itvavila.demo.domain.usecase;
package com.alfsuace.itvAvila.domain.usecase;

//import com.iesam.itvavila.demo.data.DemoDataStore;
//import com.iesam.itvavila.demo.domain.models.Demo;

import com.alfsuace.itvAvila.data.VehicleDataStore;
import com.alfsuace.itvAvila.domain.models.Vehicle;

public class ModificarVehicleUseCase {
    private VehicleDataStore dataStore = VehicleDataStore.getInstance();

    public void execute(Vehicle model) {
        dataStore.modificar(model);
    }
}
