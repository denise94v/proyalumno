/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesEmpleados;

/**
 *
 * @author alumno
 */
public class Empresa {
    //Aqui valida la cantidad de empleados que vas a  ingresar
    public Empleado[] vecCta;
    private int tam;

    public Empresa(int n) {
        vecCta = new Empleado[n];
        tam = 0;
    }
// te agrega el empleado
    public void agregaCuenta(Empleado cta) {
        vecCta[tam] = cta;
        tam++;
    }
// Inicializa tamaño del formulario
    public int getTam() {
        return tam;
    }
}
