package com.alfsuace.itvAvila.data;

import com.alfsuace.itvAvila.domain.models.Client;
import com.alfsuace.itvAvila.domain.models.Vehicle;

import java.util.Map;
import java.util.TreeMap;

public class ClientDataStore {

        private static com.alfsuace.itvAvila.data.VehicleDataStore instance = null;

        private Map<String, Client> dataStore = new TreeMap<>();

        public void guardar(Client model) {
            dataStore.put(model.getCodigo(), model);
        }

        public void eliminar(String codigo) {
            dataStore.remove(codigo);
        }

        public Vehicle buscar(String codigo) {
            return dataStore.get(codigo);
        }

        public void modificar(Client model) {
            dataStore.put(model.getCodigo(), model);
        }

        public static com.alfsuace.itvAvila.data.VehicleDataStore getInstance() {
            if (instance == null) {
                instance = new com.alfsuace.itvAvila.data.VehicleDataStore();
            }
            return instance;
        }
    }


