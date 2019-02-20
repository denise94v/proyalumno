package CLASES;
public class Arreglo {
private int tam;
private int cant;
private Object[]datos ;

public Arreglo(int tam){
this.tam=tam;
datos=new Object[tam];
cant=0;
}
/*
retornar la cantidad de elementos

*/
public int cantidadElementos(){
   return cant; 
}
        
//insertar elementos
public boolean insertarElemento(int indice,Object valor){
    if (indice<tam){
        datos [indice]=valor;
            return true;
    }
return false;
}
//otra forma de añadir
public boolean addElemento(Object valor){
    if (cant<tam){
        datos [cant]=valor;
        cant ++;
        return true;
    }
    return false;
}
//retirar elementos del arreglo
     public Object retirarElementos(int indice){
         if (indice<tam){
           return datos[indice];  
         }
         return null;
   }  
     //retornar todos los elementos del arreglo
     public Object getElementos(int i){
         return datos [i];
     }
}
