package daniel.interfazgrafica;

import java.util.ArrayList;

public class GestorEnvios {
    ArrayList<Envio> envios;

    public GestorEnvios() {
        this.envios = new ArrayList<>();
    }

    public void agregarEnvio(Envio envio) {
        this.envios.add(envio);
    }

    public ArrayList<Envio> obtenerEnvios() {
        return this.envios;
    }
}