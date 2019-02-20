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
public class Estudiante {

    private String Cedula;
    private String Nombres;
    private String Apellidos;
    public Materia [] vecM ;
    public int nmaterias;
    public int tamM;

    public Estudiante(String Cedula, String Nombres, String Apellidos, int nM) {
        setCedula(Cedula);
        setNombres(Nombres);
        setApellidos(Apellidos);
        nmaterias=nM;
        vecM=new Materia[nM];
        this.tamM=0;
    }
    
 
  public void agregarMateria(Materia mate){
        vecM[tamM]=mate;
        tamM++;
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

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }


    public int getTamM() {
        return tamM;
    }

    public void setTamM(int tamM) {
        this.tamM = tamM;
    }

    public Materia[] getVecM() {
        return vecM;
    }

    public void setVecM(Materia[] vecM) {
        this.vecM = vecM;
    }
    
  
 public int buscarMateria(String cod){
        int k=0, posi=-1;
        boolean existe=false;
        while(k<tamM && existe==false){
            if(vecM[k].getCodigo().compareTo(cod)==0){
                existe=true;
                posi=k;
            }
            k++;
        }
        return posi;
    }
 public Estudiante(){
     
 }
 
 


   
}
