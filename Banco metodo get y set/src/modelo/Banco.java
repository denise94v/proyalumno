/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
     public void ordSelDesc(Cuenta[] arreglo) {
        //iteramos sobre los elementos del arreglo
        Cuenta aux = new Cuenta();
        for (int i = 0; i < tam - 1; i++) {
            int max = i;

            //buscamos el mayor número
            for (int j = i + 1; j < tam; j++) {
                if (vecCta[j].getSaldo() > vecCta[max].getSaldo()) {
                    max = j;    //encontramos el mayor número
                }
            }

            if (i != max) {
                //permutamos los valores
                aux = vecCta[i];
                vecCta[i] = vecCta[max];
                vecCta[max] = aux;
            }
        }
    }
     

}
