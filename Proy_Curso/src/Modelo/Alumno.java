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
public class Alumno {

    private String Cedula;
    private String Nombres;
    public Materia[] materia;
    private int tam;

    public Alumno(String Cedula, String Nombres, int nMateria) {
        setCedula(Cedula);
        setNombres(Nombres);
        materia = new Materia[nMateria];
        tam = 0;
    }

    public void agregarMateria(Materia mate) {
        materia[tam] = mate;
        tam++;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public int getTamM() {
        return tam;
    }

    public void setTamM(int tam) {
        this.tam = tam;
    }

}
