/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;


public class Banco {

    public Cuenta[] vecCta;
    private int tam;
  private double saldo;

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
    

    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    public void depositar(double valor) {
        saldo = saldo + valor;
      
    }

    public void retirar(double valor) {
        
      
        saldo=saldo-valor;
}
}

    
//
//    public String imprimirDatosCuenta() {
//        return "";
//    }
    
//public int buscarcuenta(int cuenta){
//    int j=0;
//    int re= -1;
//    while (j< getTam()&&re == -1){
//        if (cuenta ==vecCta[j].getNroCuenta()){
//            re=j;
//        }
//       j++;
//    }
//    return re;
//}
//}
