package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author René
 */
public class Vector {
    
    public Notas[] vec;
    int tam;
    
    public Vector(int n){
        vec=new Notas[n];
        tam=0;
    }
    public void agregar(Notas est){
        vec[tam]=est;
        tam++;
    }
    public int getTam() {
        return tam;
    }
    //Buscar Persona
    public int buscarEstudiante(String ced){
        int k=0, posi=-1;
        boolean existe=false;
        while(k<tam && existe==false){
            if(vec[k].getAlumno().compareTo(ced)==0){
                existe=true;
                posi=k;
            }
            k++;
        }
        return posi;
    }
    //Eliminar
    public void eliminarEstudiante(int pos){
        for(int k=pos;k<tam-1;k++){
            vec[pos]=vec[pos+1];
        }
        tam--;
    }
    
    public void OrdenarNotas(Notas[] arreglo) {
        Notas aux = new Notas();
        for (int i = 0; i < tam - 1; i++) {
            int max = i;
            for (int j = i + 1; j < tam; j++) {
                if (vec[j].getProm() > vec[max].getProm()) {
                    max = j;
                }
            }
            if (i != max) {
                aux = vec[i];
                vec[i] = vec[max];
                vec[max] = aux;
            }
        }
    }
    
    public void Estado(){
        
    }
    
}
