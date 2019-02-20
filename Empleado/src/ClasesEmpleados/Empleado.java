/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesEmpleados;

import java.util.Date;

/**
 *
 * @author alumno
 */
public class Empleado {
    
    private String cedula;
    private String nombres;
    private int horastrabajadas;
    
    public Empleado(String cedula, String nombres, int horastrabajadas) {
        setCedula(cedula);
        setNombres(nombres);
        setHorastrabajadas(horastrabajadas);
        
    }
    
    public String getCedula() {
        return cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public String getNombres() {
        return nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    public int getHorastrabajadas() {
        return horastrabajadas;
    }
    
    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;

    }
    
}
