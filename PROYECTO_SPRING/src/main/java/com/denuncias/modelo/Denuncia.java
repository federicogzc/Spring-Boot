package com.denuncias.modelo;

/**
 * Clase Modelo (Entity) que representa una denuncia ciudadana.
 * Sigue el estándar de encapsulamiento (POJO) con atributos privados y métodos de acceso.
 */
public class Denuncia {
    
    private String idRadicado;
    private String tipo;
    private String descripcion;

    // Constructor estándar
    public Denuncia(String idRadicado, String tipo, String descripcion) {
        this.idRadicado = idRadicado;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    // Getters y Setters exigidos por las buenas prácticas
    public String getIdRadicado() {
        return idRadicado;
    }

    public void setIdRadicado(String idRadicado) {
        this.idRadicado = idRadicado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}