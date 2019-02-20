/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class PersonaEstudiante {
        private String Cedula;
        private String Nombres; 
        private String Apellidos;
        private String Curso;
        private int notas;
        private int edad;
       private double estatura;
       private char genero;

    public PersonaEstudiante(String Cedula, String Nombres, String Apellidos,String Curso, int notas, int edad, double estatura,char genero) {
        setCedula(Cedula);
        setNombres(Nombres);
        setApellidos(Apellidos);
        setNotas(notas);
        setEdad(edad);
        setEstatura(estatura);
        setCurso(Curso);
        setGenero(genero);
    }
 public String imprimir(){
        return "CEDULA="+getCedula()+", NOMBRE="+ getNombres()+",APELLIDOS="+getApellidos()+", CURSO="+ getCurso()+",NOTAS="+getNotas()+",Edad=" +getEdad()+",ESTATURA="+getEstatura()+",GENERO="+getGenero();
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char especialidad) {
        this.genero = especialidad;
    }
 
    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
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

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
       
    
}
