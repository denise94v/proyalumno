/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author EDD
 */
public class dbbEstudiante {
    public  Estudiante[] vec;
    private int tam; 
    
    
       public dbbEstudiante(int n) {
        vec = new Estudiante[n];

        setTam(0);

    }
   public void agregarCuenta(Estudiante objEstudiante) {
        vec[tam] = objEstudiante;
        tam++;

    }

    public Estudiante[] getVec() {
        return vec;
    }

    public void setVec(Estudiante[] vec) {
        this.vec = vec;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
   
   
   

   
       
}
