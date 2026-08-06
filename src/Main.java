package AeroValle.src;

public class Main {

    public static void main(String[] args) {


        Piloto piloto1 = new Piloto("Ana Gomez", "ATP-2291", 5400);

        Piloto piloto2 = new Piloto("Luis Rivas", "PPL-1187");
        piloto2.setHorasVuelo(320);


        piloto1.setHorasVuelo(300, true);

        Avion avion1 = new Avion("Boeing 737", 160, piloto1);

        Avion avion2 = new Avion("Cessna 172", 4);
        avion2.setPiloto(piloto2);

        avion2.setCapacidad(4, true);


        System.out.println(piloto1);
        System.out.println(piloto2);

        System.out.println();

        System.out.println(avion1);
        System.out.println(avion2);

        Avion avion3 = new Avion("Boeing 737", 160, piloto1);

        System.out.println();
        System.out.println("¿avion1 es igual a avion3? " + avion1.equals(avion3));

    }
}
