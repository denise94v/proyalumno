/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author alumno
 */
public class Curso {
    public String codCurso;
    public Estudiante vecE[];
  
     public  int tamE;

    public Curso() {
    }
   
    
    public Curso(String Curso,int n){
        this.codCurso=codCurso;
        vecE=new Estudiante[n];
     
        tamE=0;
    }

    public String getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }

    public int getTamE() {
        return tamE;
    }

    public void setTamE(int tamE) {
        this.tamE = tamE;
    }

    public Estudiante[] getVecE() {
        return vecE;
    }

    public void setVecE(Estudiante[] vecE) {
        this.vecE = vecE;
    }


   
    public void agregarEstudiante(Estudiante per){
        vecE[tamE]=per;
        tamE++;
    }
     public int buscarPersona(String ced){
        int k=0, posi=-1;
        boolean existe=false;
        while(k<tamE && existe==false){
            if(vecE[k].getCedula().compareTo(ced)==0){
                existe=true;
                posi=k;
            }
            k++;
        }
        return posi;
    }
      public void eliminarPersona(int pos){
         String nombres, apellidos, cedula;
        
        
        for (int j = pos; j <getTamE() - 1; j++) {

            cedula = getVecE()[j + 1].getCedula();
            getVecE()[j].setCedula(cedula);
            nombres = getVecE()[j + 1].getNombres();
            getVecE()[j].setNombres(nombres);
            apellidos = getVecE()[j + 1].getApellidos();
            getVecE()[j].setApellidos(apellidos);
           
          }
        
        setTamE(getTamE()-1);
    }
    
       public int buscarmat(int posE,String cod){
        int posM=-1;
        boolean existe=false;
        int j=0;
        while(j<tamE&& existe==false){
            if(vecE[posE].vecM[j].getCodigo().equals(cod)){
                existe=true; 
                posM=j;
                
        }
       j++;
                 }
        
        return posM;
    }
    
}
