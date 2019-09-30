package com.rodrigomiragaya.fromjsontoview;

import java.util.List;

public class SerieDocumental {
    private String nombre;
    private int id;
    private List<Parametro> parametroList;

    public SerieDocumental(String nombre, int id, List<Parametro> parametroList) {
        this.nombre = nombre;
        this.id = id;
        this.parametroList = parametroList;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Parametro> getParametroList() {
        return parametroList;
    }

    public void setParametroList(List<Parametro> parametroList) {
        this.parametroList = parametroList;
    }
}
