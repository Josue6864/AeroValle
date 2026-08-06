package AeroValle.src;

import java.util.Objects;

public class Avion {
    private String modelo;
    private int capacidad;
    private Piloto piloto;

    public Avion() {
    }

    public Avion(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public Avion(String modelo, int capacidad, Piloto piloto) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.piloto = piloto;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidad(int capacidad, boolean vueloCarga) {

        if (vueloCarga) {
            this.capacidad = (int) (capacidad * 0.85);
        } else {
            this.capacidad = capacidad;
        }
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {

        return "Avion: " + modelo +
                " | Capacidad: " + capacidad +
                " | Operado por -> " + piloto;

    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Avion avioncito = (Avion) obj;

        return capacidad == avioncito.capacidad
                && Objects.equals(modelo, avioncito.modelo)
                && Objects.equals(piloto, avioncito.piloto);
    }

}
