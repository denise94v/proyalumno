/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author hp
 */
public class Pasajero {
   
     private String cedula;
     private String nombre;
      private String apellido;
       private String fecha;
       private String telefono;
     private String categoria;
     private Double costoboleto;
       private String asiento;
     private String origen;
     private String destino;

    public Pasajero() {
    }

    public Pasajero(String cedula, String nombre, String apellido, String fecha, String telefono, String categoria, Double costoboleto, String asiento, String origen, String destino) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.telefono = telefono;
        this.categoria = categoria;
        this.costoboleto = costoboleto;
        this.asiento = asiento;
        this.origen = origen;
        this.destino = destino;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Double getCostoboleto() {
        return costoboleto;
    }

    public void setCostoboleto(Double costoboleto) {
        this.costoboleto = costoboleto;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
     
     

   




 }
