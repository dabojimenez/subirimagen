package com.example.consumirapirest.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SubirImagen {
    @SerializedName("imagenbase")
    @Expose
    public String imagenbase;
    @SerializedName("nombreimagen")
    @Expose
    public String nombreimagen ;
    @SerializedName("nombrecarpeta")
    @Expose
    public String nombrecarpeta ;
    @SerializedName("origen")
    @Expose
    public String origen ;

    public String getImagenbase() {
        return imagenbase;
    }

    public void setImagenbase(String imagenbase) {
        this.imagenbase = imagenbase;
    }

    public String getNombreimagen() {
        return nombreimagen;
    }

    public void setNombreimagen(String nombreimagen) {
        this.nombreimagen = nombreimagen;
    }

    public String getNombrecarpeta() {
        return nombrecarpeta;
    }

    public void setNombrecarpeta(String nombrecarpeta) {
        this.nombrecarpeta = nombrecarpeta;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }



}
