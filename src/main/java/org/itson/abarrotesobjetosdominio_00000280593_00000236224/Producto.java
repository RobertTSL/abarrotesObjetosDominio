package org.itson.abarrotesobjetosdominio_00000280593_00000236224;

import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Laboratorios
 */
public class Producto {
    
    protected String clave;
    protected String nombre;
    protected char tipo;
    protected String unidad;

    
    public Producto() {
    }

    public Producto(String clave, String nombre, char tipo, String unidad) {
        this.clave = clave;
        this.nombre = nombre;
        this.tipo = tipo;
        this.unidad = unidad;
    }

    public Producto(String clave) {
        this.clave = clave;
        this.nombre = null;
        this.tipo = ' ';
        this.unidad = null;
    }
    
    public Producto(Producto otro) {
        this.clave = otro.clave;      
        this.nombre = otro.nombre;    
        this.tipo = otro.tipo;
        this.unidad = otro.unidad; 
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public int hashCode() {
       return Objects.hash(clave);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return Objects.equals(this.clave, other.clave);
    }

    @Override
    public String toString() {
        return "Producto{" + "clave=" + clave + ", nombre=" + nombre + ", tipo=" + tipo + ", unidad=" + unidad + '}';
    }
    
    
    
    
}
