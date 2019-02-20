/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class vector {
    
    PersonaEstudiante vec[];
    int tam;
   
    public vector(int n){
        vec=new PersonaEstudiante[n];
        tam=0;
    }
    public void agregar(PersonaEstudiante per){
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
         String nombres, apellidos, cedula;
        int notas,edad;
        double estatura;
        for (int j = pos; j <getTam() - 1; j++) {

            cedula = getVec()[j + 1].getCedula();
            getVec()[j].setCedula(cedula);
            nombres = getVec()[j + 1].getNombres();
            getVec()[j].setNombres(nombres);
            apellidos = getVec()[j + 1].getApellidos();
            getVec()[j].setApellidos(apellidos);
            notas = getVec()[j + 1].getNotas();
            getVec()[j].setNotas(notas);

            estatura = getVec()[j + 1].getEstatura();
            getVec()[j].setEstatura(estatura);
        }
        setTam(getTam() - 1);
    }

    public PersonaEstudiante[] getVec() {
        return vec;
    }

    public void setVec(PersonaEstudiante[] vec) {
        this.vec = vec;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
    
}

