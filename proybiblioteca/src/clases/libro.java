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
public class libro {

    private int codigo;
    private String titulo;
    private String autor;
    private String editorial;
    private String anioedi;
    private String materia;
    private int nrocopias;
  

    public libro() {

    }

    public libro(int codigo, String autor, String titulo, String editorial, String anioedi, String materia, int nrocopias) {
        setCodigo(codigo);
        setTitulo(titulo);
        setEditorial(editorial);
        setAnioedi(anioedi);
        setMateria(materia);
        setNrocopias(nrocopias);
        setAutor(autor);
   

    }

    public String getAnioedi() {
        return anioedi;
    }

    public void setAnioedi(String anioedi) {
        this.anioedi = anioedi;
    }

 
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getNrocopias() {
        return nrocopias;
    }

    public void setNrocopias(int nrocopias) {
        this.nrocopias = nrocopias;
    }
}
