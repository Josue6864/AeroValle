package AeroValle.src;

public  class Avion {
    private String modelo;
    private int capacidad;
    private String Piloto;

    public Avion() {
    }

    public Avion(String modelo, int capacidad, String Piloto) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.Piloto = Piloto;
    }

    public String getModelo() {
        return modelo;
    }


    public int getCapacidad() {
        return capacidad;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public void setCapacidad(int capacidad) {
        if (capacidad >= 0) {
            this.capacidad = capacidad;
        }
    }
    
}
