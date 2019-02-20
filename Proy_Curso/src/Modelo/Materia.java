/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author alumno
 */
public class Materia {

    private String nombre;
    private double N1;
    private double N2;
    private double N3;

    public Materia(String nombre, double N1, double N2, double N3) {
        setNombre(nombre);
        setN1(N1);
        setN2(N2);
        setN3(N3);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getN1() {
        return N1;
    }

    public void setN1(double N1) {
        this.N1 = N1;
    }

    public double getN2() {
        return N2;
    }

    public void setN2(double N2) {
        this.N2 = N2;
    }

    public double getN3() {
        return N3;
    }

    public void setN3(double N3) {
        this.N3 = N3;
    }

    public String imprimir() {
        String estado = "";
        double suma;
        suma = getN1() + getN2() + getN3();
        if (suma >= 21) {
            estado = "APROBADO";
        } else if (suma < 16) {
            estado = "REPRUEBA";
        } else {
            estado = "SUPLETORIO";
        }
        return  "Materia: "+ getNombre()+": " + "1 Parcial: " + getN1()+"  " + "2 Parcial: " + getN2()+"  "+"3 Parcial: "+getN3()+"  "+"Promedio: "+ suma +"  "+ "Estado: " + estado;
    }

}
