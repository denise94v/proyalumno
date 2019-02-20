/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Materia {

    private String codMate;
    private String nomMate;
    private double nota1;
    private double nota2;
    private double nota3;

    public String getCodMate() {
        return codMate;
    }

    public void setCodMate(String codMate) {
        this.codMate = codMate;
    }

    public String getNomMate() {
        return nomMate;
    }

    public void setNomMate(String nomMate) {
        this.nomMate = nomMate;
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

    public Materia(String codMate, String nomMate, double nota1, double nota2, double nota3) {
        this.codMate = codMate;
        this.nomMate = nomMate;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String imprimir() {
        double suma=0;
        String estado="";
        suma=getNota1()+getNota2()+getNota3();
        if(suma>=21)
            estado="APRUEBA";
        else
            if(suma<16)
                estado="PIERDE";
            else
                estado="SUPLETORIO";
        
        return getCodMate() + " , "
                + getNomMate() + " , "
                + getNota1() + " , "
                + getNota2() + " , "
                + getNota3() + " , "
                + suma+ " , "
                + estado+ " , " ;

    }
}
