package com.laupicero.wordsrandomnizathor.DAO_Model;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.laupicero.wordsrandomnizathor.POJOS.Palabra;

import java.util.ArrayList;
import java.util.List;

public class Listado_DAO extends SQLiteOpenHelper {
    private static Listado_DAO listSingleton;
    private static final String DB = "Listado";
    private static final int DBVersion = 1;
    //Creamos la tabla
    private String sqlCreate = "CREATE TABLE IF NOT EXISTS  Entradas (nombre_palabra TEXT, tipo_palabra TEXT)";

    //CONSTRUCTOR
    public Listado_DAO(Context contexto, SQLiteDatabase.CursorFactory factory){
        super(contexto, DB, factory, DBVersion);
    }

    //SINGLETON DIVIDIDO EN 2 MÉTODOS
    public static void createInstance(Context context) {
        listSingleton = new Listado_DAO(context, null);
    }

    public static Listado_DAO getInstance() {
        return listSingleton;
    }


    //Para crear las tablas
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sqlCreate);

        //Datos de base
        //VERBOS
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Luchar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Extrañar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Conjurar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Animar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Posar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Admirar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Curar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Descansar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Navegar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Marcar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Expulsar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Deslumbrar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Maltratar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Agarrar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Esperar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Reparar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Robar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Revelar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Cantar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Preparar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Alegrar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Asustar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Azotar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Burbujear', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Bautizar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Preparar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Calentar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Enamorar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Fallar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Granizar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Purificar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Quitar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Regar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Teclear', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Triunfar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Tentar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Viajar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Vomitar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Olvidar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Mutar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Instalar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Fumar', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Evolucionar', 'Verbo')");

        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Encender', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Temer', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Oler', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Leer', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Nacer', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Esconder', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Arder', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Crecer', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Florecer', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Fallecer', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Llover', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Torcer', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Vencer', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Perder', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Prometer', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Envejecer', 'Verbo')");

        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Construir', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Deprimir', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Escribir', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Gemir', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Fingir', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Influir', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Mentir', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Crujir', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Huir', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Perseguir', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Reir', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Dormir', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Sumergir', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Sobresalir', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Sacudir', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Sentir', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Parir', 'Verbo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Malcedir', 'Verbo')");

        //SUSTANTIVOS
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Flor', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Girasol', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Virus', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Justicia', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Emperador/-triz', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Sangre', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Libro', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Rosal', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Esqueleto', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Baile', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Espejo', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Sombra', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Nieve', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Azúcar', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Cerradura', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Angustia', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Salud', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Piedad', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Terror', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Cariño', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Amistad', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Empatía', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Progreso', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Suerte', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Admiración', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Recuerdos', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Explosión', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Llave', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Vela', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Carta', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Café', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Bebida', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Detective', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Conejo', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Nube', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Refugio', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Gato', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Animal', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Estudiante', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Estrella', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Caballero', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Rey', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Esclavo', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Brujo/-a', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Mapa', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Hoja', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Metal', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Planeta', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Sol', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Luna', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Mercurio', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Marte', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Saturno', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Urano', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Dios', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Moño', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Diamante', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Donut', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Júpiter', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Libro', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Instituto', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Astucia', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Magia', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Sombrero', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Murciélago', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Dinero', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Arma', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Acero', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Planta', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Agua', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Hielo', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Insecto', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Fuego', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Tierra', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Aire', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Guardaespaldas', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Electricidad', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Serpiente', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Montaña', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Guerrero', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Verano', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Primavera', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Otoño', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Invierno', 'Sustantivo')");

        //Adjetivos
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Bruto', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Marginado', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Mitológico', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Difícil', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Amable', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Ruidoso', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Vulgar', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Imperfecto', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Desordenado', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Frágil', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Refinado', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Caótico', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Triste', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Caliente', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Frío', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Ordenado', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Abstracto', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Cruel', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Extrovertido', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Perfecto', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Simple', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Alegre', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Luminoso', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Realista', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Brillante', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Valiente', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Arrugado', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Transparente', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Dulce', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('feroz', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Reconfortante', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Bueno', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Negro', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Pacífico', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Hermoso', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Santo', 'Sustantivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Único', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Encantador', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Maravilloso', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Delicioso', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Firme', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Protector', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Orgulloso', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Enorme', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Minúsculo', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Abuhado', 'Adjetivo')");
        db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('Bruto', 'Adjetivo')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Se elimina la versión anterior de la tabla
        db.execSQL("DROP TABLE IF EXISTS Entrada");
        onCreate(db);
    }

    //---------------------
    // CONSULTAS - QUERYS
    //---------------------
    /**
     * Obtiene un listado con todas las palabras
    * */
    public List<Palabra> getListadoEntradas() {
        List<Palabra> list_Entradas = new ArrayList<Palabra>();

        String sql = "SELECT * FROM Entradas";

        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {
                Palabra entrada = new Palabra(cursor.getString(0), cursor.getString(1));

                list_Entradas.add(entrada);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return list_Entradas;
    }

    /**
     * Obtiene un listado con todas las palabras dependiendo del parámetro que le pases
     * @param tipo
     * */
    public List<Palabra> getListadoEntradasFiltradas(String tipo) {
        List<Palabra> list_Entradas = new ArrayList<Palabra>();

        String sql = "SELECT * FROM Entradas WHERE tipo_palabra  ='" +tipo+ "'";

        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {
                Palabra entrada = new Palabra(cursor.getString(0), cursor.getString(1));

                list_Entradas.add(entrada);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return list_Entradas;
    }


    /**
     * Comprobamos que la palabra que vamos a introducir no se encuentra en la DB.
     * Para así podernos evitar que se nos dupliquen las entradas
     *
     * @param entrada - instancia que vamos a comprobar antes de insertarla
     */
    public boolean cheking_palabraExiste_in_DB(Palabra entrada) {
        boolean coincidence = false;
        String sql = "SELECT * FROM Entradas";

        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {
                if (cursor.getString(0).equalsIgnoreCase(entrada.getNombre()) &&
                        cursor.getString(1).equalsIgnoreCase(entrada.getTipo())) {
                    coincidence = true;
                }
            } while (cursor.moveToNext());
        }
        return coincidence;
    }

    //---------------------
    // INSERTAR PALABRA
    //---------------------
    /**
     * Nos inserta una entrada en nuestra DB_Diccionario (embebida)
     * Pero antres llamamos al método 'cheking_palabraExiste_in_DB'
     * para comprobar que no existe esa palabra dentro de la DB
     *
     * @param entrada - Objeto Entrada_Diccionario
     * @return res - Nos devolverá un enterio y dependiendo veremos si ha resultado con éxito o no
     */
    public int insertar_EntradaDiccionario(Palabra entrada) {
        int res = 0;

        SQLiteDatabase db = getWritableDatabase();

        boolean existeEntrada = cheking_palabraExiste_in_DB(entrada);
        if (existeEntrada) {
            res = -1;

        } else {
            db.execSQL("INSERT INTO Entradas (nombre_palabra, tipo_palabra) VALUES ('" +entrada.getNombre()+ "', '" +entrada.getTipo()+ "')");
        }
        return res;
    }
}
