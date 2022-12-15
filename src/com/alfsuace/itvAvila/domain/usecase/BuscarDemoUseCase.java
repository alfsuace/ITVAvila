//package com.iesam.itvavila.demo.domain.usecase;
package com.alfsuace.itvAvila.domain.usecase;

//import com.iesam.itvavila.demo.data.DemoDataStore;
//import com.iesam.itvavila.demo.domain.models.Demo;
import com.alfsuace.itvAvila.data.VehicleDataStore;
import com.alfsuace.itvAvila.domain.models.*;
public class BuscarDemoUseCase {
    private VehicleDataStore dataStore = VehicleDataStore.getInstance();

    public Vehicle execute(String codigo) {
        return dataStore.buscar(codigo);
    }
}
