package com.example.PintutasAPI.models;

import javax.persistence.*;

@Entity
@Table(name="info_pinturas")

public class PinturaModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true , nullable = false )

    private Long id_pintura;
    private String nombre_pintura;
    private String nombre_artista;
    private String anio_pintura;
    private String pais_artista;


    public Long getid_pintura() {
        return id_pintura;
    }

    public String getnombre_pintura() {
        return nombre_pintura;
    }

    public String getnombre_artista() {
        return nombre_artista;
    }

    public String getanio_pintura() {
        return anio_pintura;
    }

    public String getpais_artista() {
        return pais_artista;
    }
    

    public void setid_pintura(Long id_pintura) {
        this.id_pintura = id_pintura;
    }

    public void setnombre_pintura(String nombre_pintura) {
        this.nombre_pintura = nombre_pintura;
    }

    public void setnombre_artist(String nombre_artista) {
        this.nombre_artista= nombre_artista;
    }

    public void setanio_pintura(String anio_pintura) {
        this.anio_pintura= anio_pintura;
    }

    public void setpais_artista(String pais_artista) {
        this.pais_artista= pais_artista;
    }   
    
}




