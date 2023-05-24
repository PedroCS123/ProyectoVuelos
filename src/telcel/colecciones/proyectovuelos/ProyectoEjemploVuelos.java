package telcel.colecciones.proyectovuelos;

import telcel.colecciones.proyectovuelos.dominio.Vuelo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProyectoEjemploVuelos {
    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");

        List<Vuelo> llegadas = new ArrayList<>();

        llegadas.add(new Vuelo("AAL933", "New York", "Mexico", df.parse("2022-08-28 05:39"),62));
        llegadas.add(new Vuelo("LAT755", "Sao paolo", "Mexico", df.parse("2022-08-31 04:45"),47));
        llegadas.add(new Vuelo("SKU621", "Rio Janeiro", "Mexico", df.parse("2022-08-30 04:00"),52));
        llegadas.add(new Vuelo("DAL147", "Atlanta", "Mexico", df.parse("2022-08-29 13:22"),59));
        llegadas.add(new Vuelo("AVA241", "Bogotá", "Mexico", df.parse("2022-08-30 02:25"),25));
        llegadas.add(new Vuelo("AMX10", "Hermosillo", "Mexico", df.parse("2022-08-31 05:20"),29));
        llegadas.add(new Vuelo("IDF683", "Londres", "Mexico", df.parse("2022-08-31 08:45"),355));

        llegadas.sort( (v1,v2)  -> v2.getFechayHoraLlegada().compareTo(v1.getFechayHoraLlegada()));
        llegadas.forEach(System.out::println);
        Vuelo ultimoVuelo = llegadas.get(0);
        System.out.println("El ultimo vuelo en llegar es: " + ultimoVuelo.getNombre() + " : " +ultimoVuelo.getOrigen() + " aterriza el " + ultimoVuelo.getFechayHoraLlegada() );

        llegadas.sort((v1,v2) -> Integer.valueOf(v2.getNumeroPasajeros()).compareTo(v1.getNumeroPasajeros()));
        Vuelo vueloMenorNuero = new LinkedList<>(llegadas).peekLast();
        System.out.println("el ultimo vuelo con el menor numero de pasajeros es : "+ vueloMenorNuero.getNombre() + " : " +
                vueloMenorNuero.getOrigen() + " ,con " + vueloMenorNuero.getNumeroPasajeros());



    }

}
