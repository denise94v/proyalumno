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
public class libre {
        public Libros[] vecCta;
    private int tam;

    public libre(int n) {
        vecCta = new Libros[n];
        tam = 0;
    }

    public void agregaCuenta(Libros lbl) {
        vecCta[tam] = lbl;
        tam++;
    }

    public int getTam() {
        return tam;
    }
    public void ordSelDesc(Libros[] arreglo) {
        //iteramos sobre los elementos del arreglo
        Libros aux = new Libros();
        for (int i = 0; i < tam - 1; i++) {
            int max = i;

            //buscamos el mayor número
            for (int j = i + 1; j < tam; j++) {
                if (vecCta[j].getNúmcopias() > vecCta[max].getNúmcopias()) {
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
