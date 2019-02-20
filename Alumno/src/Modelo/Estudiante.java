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
public class Estudiante {
   String nombre;
   String materia;
   double nota1;
   double nota2;
   double nota3;
double promedio;
    public Estudiante(String nombre, String materia, double nota1, double nota2, double nota3) {
       setNombre (nombre);
       setMateria (materia);
        setNota1 (nota1);
        setNota2 (nota2);
        setNota3(nota3);

    }
public double prom(double prom){
    double prome=0;
    return prom;
}
    public double getPromedio() {
        return promedio;
        
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
        double prom=0;
        nota1=getNota1();
        nota2=getNota2();
        nota3=getNota3();
        prom=nota1+nota2+nota3;
        setPromedio(prom);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }


    
    
    
}
