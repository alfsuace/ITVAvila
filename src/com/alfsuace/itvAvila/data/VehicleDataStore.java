//package com.iesam.itvavila.demo.data;
package com.alfsuace.itvAvila.data;
//import com.iesam.itvavila.demo.domain.models.Demo;
import com.alfsuace.itvAvila.domain.models.Vehicle;

import java.util.Map;
import java.util.TreeMap;

public class VehicleDataStore {
    private static VehicleDataStore instance = null;

    private Map<String, Vehicle> dataStore = new TreeMap<>();

    public void guardar(Vehicle model) {
        dataStore.put(model.getCodigo(), model);
    }

    public void eliminar(String codigo) {
        dataStore.remove(codigo);
    }

    public Vehicle buscar(String codigo) {
        return dataStore.get(codigo);
    }

    public void modificar(Vehicle model) {
        dataStore.put(model.getCodigo(), model);
    }

    public static VehicleDataStore getInstance() {
        if (instance == null) {
            instance = new VehicleDataStore();
        }
        return instance;
    }
}
