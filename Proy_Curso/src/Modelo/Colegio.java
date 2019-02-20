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
public class Colegio {

    public Alumno[] vecCta;
    private int tam;

    public Colegio() {
    }

    public Colegio(int n) {
        vecCta = new Alumno[n];
        tam = 0;
    }

    public void agregaCuenta(Alumno lbl) {
        vecCta[tam] = lbl;
        tam++;
    }
 public int getTam() {
        return tam;
    }
 public int buscarPersona(String ced){
        int k=0, posi=-1;
        boolean existe=false;
        while(k<tam && existe==false){
            if(vecCta[k].getCedula().compareTo(ced)==0){
                existe=true;
                posi=k;
            }
            k++;
        }
        return posi;
    }
 
}
