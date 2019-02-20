package CLASES;

public class Empleado {

    public int cedula;
    public String nombre;
    public String Apellido;
    public String email;
    public int Nhijos;
    public double Sueldo;
    public String edad;
    public String estadocivil; 
    public String Genero;
    
    //metodo constructor vacio

    // metodos constructor con parametros
   public Empleado(int cedulaI, String nombreI, String ApellidoI,String emailI,int NhijosI,double SueldoI ,String estadocivilI,String generoI ) {
        this.cedula = cedulaI;
        this.nombre = nombreI;
        this.Apellido=ApellidoI;
        this.email=emailI;
        this.Nhijos=NhijosI;
        this.Sueldo=SueldoI;        

        this.estadocivil = estadocivilI;
        this.Genero=generoI;


    }
 @Override
    public String toString(){
         return "Cedula: "+cedula+"\nNombre: "+nombre+"\nApellido: "+Apellido+"\nemail: "+email+"\nNumero Hijos: "+Nhijos+
                "\nSueldo: "+Sueldo+"\nEstado civil: "+estadocivil+"\nGenero: "+Genero;
}
}