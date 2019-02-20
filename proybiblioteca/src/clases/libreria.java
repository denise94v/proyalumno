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
public class libreria {
    public libro[] vecLib;
    private int tam;

    public libreria(int n) {
        vecLib = new libro[n];
        tam = 0;
    }

    public void agregalibro(libro lbr) {
        vecLib[tam] = lbr;
        tam++;
    }

    public int getTam() {
        return tam;
    }
     public void ordSelCopias() {
        //iteramos sobre los elementos del arreglo
        libro aux=new libro();
        for (int i = 0; i < tam - 1; i++) {
            int max = i;
            //buscamos el mayor número
            for (int j = i + 1; j < tam; j++) {
                if (vecLib[j].getNrocopias()> vecLib[max].getNrocopias()) {
                    max = j;    //encontramos el mayor número
                }
            }
            if (i != max) {
                //permutamos los valores
                aux = vecLib[i];
                vecLib[i] = vecLib[max];
                vecLib[max] = aux;
            }
        }
    }
     
    public void ordSelByTitulo() {
        //iteramos sobre los elementos del arreglo
        libro aux=new libro();
        for (int i = 0; i < tam - 1; i++) {
            int max = i;
            //buscamos el mayor número
            for (int j = i + 1; j < tam; j++) {
                if (vecLib[j].getNrocopias()> vecLib[max].getNrocopias()) {
                    max = j;    //encontramos el mayor número
                }
            }
            if (i != max) {
                //permutamos los valores
                aux = vecLib[i];
                vecLib[i] = vecLib[max];
                vecLib[max] = aux;
            }
        }
    }     
     public int buscarlibro(int cod){
         
         int k = 0, posi = -1;
         boolean existe = false;
         while (k < tam && existe == false) {
             if (vecLib[k].getCodigo()==cod ) {
                 existe = true;
                 posi = k;
             }
             k++;
         }
        return posi;
    }
      
      public void eliminarLibro(int pos){
        for(int k=pos;k<tam-1;k++){
            vecLib[pos]=vecLib[pos+1];
        }
        tam--;
    }
    
     
}


