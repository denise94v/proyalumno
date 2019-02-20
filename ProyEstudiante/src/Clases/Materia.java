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
public class Materia {

    private String Codigo;
    private String NombreMat;
    private Double n1;
    private Double n2;
    private Double n3;

    public Materia(String Codigo, String NombreMat, Double n1, Double n2, Double n3) {
        setCodigo(Codigo);
        setNombreMat(NombreMat);
        setN1(n1);
        setN2(n2);
        setN3(n3);
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombreMat() {
        return NombreMat;
    }

    public void setNombreMat(String NombreMat) {
        this.NombreMat = NombreMat;
    }

    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    public Double getN3() {
        return n3;
    }

    public void setN3(Double n3) {
        this.n3 = n3;
    }



    public String imprimir() {
        String estado = "";
        double suma;
        suma = getN1() + getN2() + getN3();
        if (suma >= 21) {
            estado = "APROBADO";
        } else if (suma < 16) {
            estado = "REPRUEBA";
        } else {
            estado = "SUPLE";
        }
        return getCodigo() + ","
                + getNombreMat() + ","
                + getN1() + "," 
                +getN2()+","
                +getN3()+","
                + suma + "," 
                + estado;
    }
   
  

}
