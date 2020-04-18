package com.laupicero.wordsrandomnizathor.Controllers;

import android.content.Context;

import com.laupicero.wordsrandomnizathor.DAO_Model.Listado_DAO;

public class CtrlPPL {
    public static void prepararDB(Context context){
        Listado_DAO.createInstance(context);

    }
}
