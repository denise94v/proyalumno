/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author René
 */
public class Banco {

    public Cuenta[] vecCta;
    private int tam;

    public Banco(int n) {
        vecCta = new Cuenta[n];
        tam = 0;
    }

    public void agregaCuenta(Cuenta cta) {
        vecCta[tam] = cta;
        tam++;
    }

    public int getTam() {
        return tam;
    }
    

}
