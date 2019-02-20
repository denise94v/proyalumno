package modelo;

import modelo.Cliente;
import java.util.Date;

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

    private int nroCuenta;
    private Cliente cliente;
    private String fechaAbre;
    private String tipoCta;
    private double saldo;
  
    public Cuenta(int nroCuenta, Cliente cliente, String fechaabre, String tipoCta) {
        setNroCuenta(nroCuenta);
        setCliente(cliente);
        setFechaAbre(fechaabre);
        setTipoCta(tipoCta);
        setSaldo(50);
        
        
        
        
        
    }

    public Cuenta() {
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

  

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public void retirar(double valor) {
        saldo = saldo - valor;
    }

    public String imprimirDatosCuenta() {
        return "";
    }
}
