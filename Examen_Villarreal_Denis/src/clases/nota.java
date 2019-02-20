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
public class nota {
         private String Cedula;
        private String Nombres; 
        private String Apellidos;
        private String Asignatura;
        private int n1,n2,n3;
       int suma;
        
        

    public nota(String Cedula, String Nombres, String Apellidos, String Asignatura, int n1, int n2, int n3) {
        setCedula(Cedula);
        setNombres(Nombres);
        setApellidos(Apellidos);
        setAsignatura(Asignatura);
        setN1(n1);
        setN2(n2);
        setN3(n3);
        
    }

    nota() {
   }

    public void setSuma(int suma) {
        this.suma = n1+n2+n3;
        
    }

    public int getSuma() {
        return suma;
    }
    
    
  public String imprimir(){
        return "CEDULA="+getCedula()+", NOMBRE="+ getNombres()+",APELLIDOS="+getApellidos()+", ASIGNATURA="+ getAsignatura() +",NOTA 1="+getN1()+",NOTA 2="+getN3()+",NOTA 3="+getN3();
    }
  public double prom(double prom){
    double prome=0;
    return prom;
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

    public String getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(String Asignatura) {
        this.Asignatura = Asignatura;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }
   
        
}

