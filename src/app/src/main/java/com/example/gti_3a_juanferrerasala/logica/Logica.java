package com.example.gti_3a_juanferrerasala.logica;

import android.util.Log;

import com.example.gti_3a_juanferrerasala.modelo.Medicion;

public class Logica {

    public Logica(){

    }

    public void insertarMedicion(Medicion medicion){

        PeticionarioREST elPeticionarioREST = new PeticionarioREST();

        // 192.168.1.114 ip portatil
        // 192.168.85.84 ip pc sobremesa

        String restEndpoint = "http://192.168.1.114:8081/medicion";

        Log.d("PRUEBA", "publicarMediciones endpoint: "+restEndpoint);

        elPeticionarioREST.hacerPeticionREST("POST", restEndpoint,
                medicion.toJSON(),
                new PeticionarioREST.RespuestaREST () {
                    @Override
                    public void callback(int codigo, String cuerpo) {

                        Log.d ("PRUEBA","codigo respuesta: " + codigo + " <-> \n" + cuerpo);

                    }
                });
    }
}
