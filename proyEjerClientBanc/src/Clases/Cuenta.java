
package Clases;



public class Cuenta {
    //atributos de la cuenta//
    private int nroCuenta;
    private Cliente cliente;//tiene datos  de la clase Cliente en la variable cliente
    private String  fechaAbre;
    private String  tipoCta;
   private double saldo;

   
   
    //constructor con parametros//
  public Cuenta(int nroCuenta, Cliente cliente, String fechaabre, String tipoCta) {
        //this.nroCuenta = nroCuenta;
        //para get y set (encapsulamiento seria
        setNroCuenta(nroCuenta);
        setCliente(cliente);
        setFechaAbre(fechaabre);
        setTipoCta(tipoCta);
        setSaldo(50); //inicia la cuenta con 50 $ 
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
           double nuevSaldo;
        nuevSaldo=saldo-valor;
         if (nuevSaldo>=10) {
             saldo=saldo-valor;
         }   
          
//     //funcion para igual//
//     public void igual(double valor){
//        saldo=saldo;
   }

  
         
    
}
