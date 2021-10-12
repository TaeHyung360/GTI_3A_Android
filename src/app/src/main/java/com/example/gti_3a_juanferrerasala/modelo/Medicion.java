package com.example.gti_3a_juanferrerasala.modelo;


import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Medicion {

    private static final String FECHA_FROMATO = "yyyy-MM-dd hh:mm:ss";

    private Timestamp fecha;

    private Ubicacion ubicacion;

    private int idUsuario;

    private double valor;

    private  int idSensor;

    public Medicion(Ubicacion ubicacion, int idUsuario, double valor, int idSensor) {
        this.ubicacion = ubicacion;
        this.idUsuario = idUsuario;
        this.valor = valor;
        this.idSensor = idSensor;
        this.fecha = new Timestamp(System.currentTimeMillis());
    }

    public String toJSON(){
        String fechaConFormato = new SimpleDateFormat(FECHA_FROMATO).format(this.fecha);

        String res = "{" +
                "\"valor\":\""+this.valor+ "\", " +
                "\"fecha\":\""+fechaConFormato+"\", " +
                "\"latitud\":\""+this.ubicacion.getLatitud()+"\", " +
                "\"longitud\":\""+this.ubicacion.getLongitud()+"\", " +
                "\"idUsuario\":\""+this.idUsuario+"\", " +
                "\"idSensor\":\""+this.idSensor+"\"" +

                "}";

        return res;


    }
}
