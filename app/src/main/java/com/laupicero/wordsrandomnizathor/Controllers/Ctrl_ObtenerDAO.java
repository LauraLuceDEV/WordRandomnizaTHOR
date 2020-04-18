package com.laupicero.wordsrandomnizathor.Controllers;

import com.laupicero.wordsrandomnizathor.DAO_Model.Listado_DAO;
import com.laupicero.wordsrandomnizathor.POJOS.Palabra;

import java.util.ArrayList;
import java.util.List;

public class Ctrl_ObtenerDAO {

    //-----------------------------------
    //Obtencion de los Listados completos de la DB
    //-----------------------------------

    /**
     * Obtiene el listado de palabras completo
     */
    private static List<Palabra> getListadoEntradasTodo() {
        List<Palabra> miList = Listado_DAO.getInstance().getListadoEntradas();
        int a = 0;
        return miList;

    }

    /**
     * Obtiene el listado completo de las palabras que le pasemos por parámetro
     */
    private static List<Palabra> getListadoEntradasFiltradas(String tipoPalabra) {
        return Listado_DAO.getInstance().getListadoEntradasFiltradas(tipoPalabra);
    }

    /**
     * Obtiene un número de palabras aleatorias a partir del listado que le pasemos
     * y el número de palabras también
     */
    private static List<Palabra> obtenerPalabrasRandom(List<Palabra> listado, int numPalabras) {
        List<Palabra> miListadoRdn = new ArrayList<>();

        for (int i = 0; i < numPalabras; i++) {
            int num_pos_random = (int) (Math.random() * listado.size());
            miListadoRdn.add(listado.get(num_pos_random));
            listado.remove(num_pos_random);
        }
        return miListadoRdn;
    }


    //-----------------------------------
    // Obtencion de los Listados ya filtrados
    //-----------------------------------
    public static List<Palabra> obtenerResultados(int numPalabras, String tipoPalabra) {
        List<Palabra> miListado = new ArrayList<>();

        //Dependiendo del tipoPalabra
        if (tipoPalabra.equalsIgnoreCase("Sustantivos")) {
            miListado = getListadoEntradasFiltradas("Sustantivo");

        } else if (tipoPalabra.equalsIgnoreCase("Adjetivos")) {
            miListado = getListadoEntradasFiltradas("Adjetivo");

        } else if (tipoPalabra.equalsIgnoreCase("Verbos")) {
            miListado = getListadoEntradasFiltradas("Verbo");

        } else {
            miListado = getListadoEntradasTodo();
        }

        miListado = obtenerPalabrasRandom(miListado, numPalabras);
        return miListado;
    }



    /**
     * Método que nos devolverá un número de palabras que le pasaremos por parámetro
     * del String que también le pasamos por parámetro
     * */
    public static String ObtenerPalabrasListadoRandom(int numPalabras, String palabras) {
        String resultadoPalabras = "";
        List<Palabra> listado = obtenerListadodeEditText(palabras);
        listado = obtenerPalabrasRandom(listado, numPalabras);
        resultadoPalabras = mostrarPalabras(listado);
        return resultadoPalabras;
    }


    //---------------------------
    //  MÉTODOS RECURSOS
    //---------------------------

    //Nos transforma un String que le pasemos en un listado de palabras
    public static List<Palabra> obtenerListadodeEditText(String texto){
        String[] vectorPalabra = texto.split(",");
        List<Palabra> listado = crearListadoPalabras(vectorPalabra);
        return listado;
    }

    //Nos transforma un Array de Strings en un Listado de Palabras
    private static List<Palabra> crearListadoPalabras(String[] vectorPalabra) {
        List<Palabra> listado = new ArrayList<>();

        for(int i=0; i < vectorPalabra.length; i++){
            listado.add(new Palabra(vectorPalabra[i]));
        }
        return listado;
    }


    //MOSTRAR RESULTADOS POR PANTALLA
    public static String mostrarPalabras(List<Palabra> listado) {
        String palabras = "";

        for (int i = 0; i < listado.size(); i++) {
            if (i%3 == 0 && i != 0)
                palabras += listado.get(i).getNombre() + "\n";
            else
                palabras += listado.get(i).getNombre() + " ";

        }
        return palabras;
    }
}
