package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class Libros {

    private int código;
    private String nombre;
    private String autor;
    private String editorial;
    private String materia;
    private String anioedi;
    private int númcopias;
    private String disponibilidad;

    public Libros(int código, String nombre, String autor, String editorial, String materia, String anioedi, int númcopias, String disponibilidad) {
        setCódigo(código);
        setNombre(nombre);
        setAutor(autor);
        setEditorial(editorial);
        setMateria(materia);
        setAnioedi(anioedi);
        setNúmcopias(númcopias);
        setDisponibilidad(disponibilidad);

    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Libros() {
    }

    
    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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

    public String getAnioedi() {
        return anioedi;
    }

    public void setAnioedi(String anioedi) {
        this.anioedi = anioedi;
    }

    public int getNúmcopias() {
        return númcopias;
    }

    public void setNúmcopias(int númcopias) {
        this.númcopias = númcopias;
    }

}
