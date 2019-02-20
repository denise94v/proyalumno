package Clases;

import Clases.Cliente;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author René
 */
public class Cuenta {
//atributos de la cuenta
     private int nroCuenta;
    private Cliente cliente;//tiene datos  de la clase Cliente en la variable cliente
    private String  fechaAbre;
    private String  tipoCta;
   private double saldo;

    //constructor con parametros//
  public Cuenta(int nroCuenta, Cliente cliente, String fechaabre, String tipoCta) {
      
        
        
        
        setNroCuenta(nroCuenta);
        setCliente(cliente);
        setFechaAbre(fechaabre);
        setTipoCta(tipoCta);
        setSaldo(50);//inicia con $50
        
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFechaAbre() {
        return fechaAbre;
    }

    public void setFechaAbre(String fechaAbre) {
        this.fechaAbre = fechaAbre;
    }

    public String getTipoCta() {
        return tipoCta;
    }

    public void setTipoCta(String tipoCta) {
        this.tipoCta = tipoCta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
          //funcion para depositar//
    public void depositar(double valor){
        saldo=saldo+valor;
    }
    
    //funcion para retirar//
     public void retirar(double valor){
         double Nsaldo=saldo-valor;
        if(Nsaldo>=10){
        saldo=saldo-valor;
        }else{
            JOptionPane.showMessageDialog(null,"Saldo insuficiente");
      
        }
        
     }
 
     
    }  
   
