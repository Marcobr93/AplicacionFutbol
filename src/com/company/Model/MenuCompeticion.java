package com.company.Model;

import java.util.ArrayList;

/**
 * Created by marco on 20/05/2017.
 */
public class MenuCompeticion {

    public ArrayList<Competicion> competiciones = new ArrayList<>();

    // Métodos

    public void primeraDivision(){
        int indice = 0;

        for (Competicion competicion: competiciones){
            System.out.println((indice++) + " - " + competicion);
        }
    }
}
