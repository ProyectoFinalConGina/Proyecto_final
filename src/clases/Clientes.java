/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Calendar;

/**
 *
 * @author Mario Garcia
 */
public class Clientes {
    private String nombre;
    private String ciudad;
    private String tipo;
    private Integer total;
    private String fechasalida;
    private String fechaentrada;
    private String cuarto;

    public Clientes(String nombre, String ciudad, String tipo, Integer total, String fechasalida, String fechaentrada, String cuarto) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.tipo = tipo;
        this.total = total;
        this.fechasalida = fechasalida;
        this.fechaentrada = fechaentrada;
        this.cuarto = cuarto;
    }

    Clientes(String nombre, String ciudad, String tipo, String fechasalida, String fechaentrada, int total) {
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Cudad: " + ciudad + ", Tipo: " + tipo + ", Total: " + total + ", Fechasalida: " + fechasalida + ", Fechaentrada: " + fechaentrada + ", Cuarto: " + cuarto ;
    }
    


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(String fechasalida) {
        this.fechasalida = fechasalida;
    }

    public String getFechaentrada() {
        return fechaentrada;
    }

    public void setFechaentrada(String fechaentrada) {
        this.fechaentrada = fechaentrada;
    }

    public String getCuarto() {
        return cuarto;
    }

    public void setCuarto(String cuarto) {
        this.cuarto = cuarto;
    }
    
    
    
}
