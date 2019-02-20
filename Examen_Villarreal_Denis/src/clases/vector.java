/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author alumno
 */
public class vector {
  public  nota vec[];
   public int tam;
   
    public vector(int n){
        vec=new nota[n];
        tam=0;
    }
    public void agregar(nota per){
        vec[tam]=per;
        tam++;
    }
    
    public int buscarPersona(String ced){
        int k=0, posi=-1;
        boolean existe=false;
        while(k<tam && existe==false){
            if(vec[k].getCedula().compareTo(ced)==0){
                existe=true;
                posi=k;
            }
            k++;
        }
        return posi;
    }
    
    public void eliminarPersona(int pos){
         String nombres, apellidos, cedula,asignatura;
        int n1,n2,n3;
        
        for (int j = pos; j <getTam() - 1; j++) {

            cedula = getVec()[j + 1].getCedula();
            getVec()[j].setCedula(cedula);
            nombres = getVec()[j + 1].getNombres();
            getVec()[j].setNombres(nombres);
            apellidos = getVec()[j + 1].getApellidos();
            getVec()[j].setApellidos(apellidos);
            asignatura= getVec()[j + 1].getAsignatura();
            getVec()[j].setAsignatura(asignatura);
            n1 = getVec()[j + 1].getN1();
            getVec()[j].setN1(j);
             n2 = getVec()[j + 1].getN2();
            getVec()[j].setN2(n2);
               n3 = getVec()[j + 1].getN3();
            getVec()[j].setN3(n3);

            
        }
        setTam(getTam() - 1);
    }

    public nota[] getVec() {
        return vec;
    }

    public void setVec(nota[] vec) {
        this.vec = vec;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
    public void ordSelDesc(nota[] arreglo) {
        //iteramos sobre los elementos del arreglo
        nota aux = new nota();
        for (int i = 0; i < tam - 1; i++) {
            int max = i;

            //buscamos el mayor número
            for (int j = i + 1; j < tam; j++) {
                if (vec[j].getSuma() > vec[max].getSuma()) {
                    max = j;    //encontramos el mayor número
                }
            }

            if (i != max) {
                //permutamos los valores
                aux = vec[i];
                vec[i] = vec[max];
                vec[max] = aux;
            }
    
        }
    }
}      
    



