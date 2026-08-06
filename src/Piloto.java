package AeroValle.src;

import java.util.Objects;

public class Piloto {
    private String nombre;
    private String licencia;
    private double horasVuelo;

    public Piloto() {

    }

    public Piloto(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public Piloto(String nombre, String licencia, double horasVuelo) {
        this.nombre = nombre;
        this.licencia = licencia;
        this.horasVuelo = horasVuelo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public double getHorasVuelo() {
        return horasVuelo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public void setHorasVuelo(double horasVuelo) {
        this.horasVuelo = horasVuelo;
    }

    public void setHorasVuelo(double horas, boolean acumular) {
        if (acumular) {
            this.horasVuelo += horas;
        } else {
            this.horasVuelo = horas;
        }
    }

    @Override
    public String toString() {
        return "Piloto: " + nombre +
                " | Licencia: " + licencia +
                " | Horas: " + horasVuelo;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Piloto pilotos = (Piloto) obj;

        return Double.compare(horasVuelo, pilotos.horasVuelo) == 0
                && Objects.equals(nombre, pilotos.nombre)
                && Objects.equals(licencia, pilotos.licencia);
    }
}
