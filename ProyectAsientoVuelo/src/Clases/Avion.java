/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Avion {
       
        public Pasajero[] vecPasajero;
        Pasajero a,a1;
        public int tamP;
        
        public Avion(){
            
        }

         public Avion( int np)
        {
            vecPasajero = new Pasajero[np];
            tamP = 0;
        }

    public Pasajero[] getVecPasajero() {
        return vecPasajero;
    }

    public void setVecPasajero(Pasajero[] vecPasajero) {
        this.vecPasajero = vecPasajero;
    }

    public int getTamP() {
        return tamP;
    }

    public void setTamP(int tamP) {
        this.tamP = tamP;
    }
         
        
        public void agregaPasajero(Pasajero pajro)
         {
             vecPasajero[tamP] = pajro;
             tamP++;
             
                 
         }
    
    
}
