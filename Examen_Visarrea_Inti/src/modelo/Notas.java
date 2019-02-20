package modelo;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author René
 */
public class Notas {
    private String alumno;
    private String materia;
    private double nota1;
    private double nota2;
    private double nota3;
    private double prom;
    
    public Notas() {
    }

    public Notas(String alumno, String materia, double nota1, double nota2,double nota3,double prom) {
        setAlumno(alumno);
        setMateria(materia);
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
        setProm(nota1+nota2+nota3);
    }
    
    public String imprimir(){
        return "ALUMNO = "+getAlumno()+", MATERIA= "+getMateria()+ ", NOTA1= "+getNota1()+", NOTA2= "+getNota2()+", NOTA3= "+getNota3()+", PROMEDIO= "+getProm();
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
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

    public double getProm() {
        return prom;
    }

    public void setProm(double prom) {
        this.prom = prom;
    }

    

    
}