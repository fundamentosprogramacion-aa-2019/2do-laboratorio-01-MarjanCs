
package Ejercicio1;

public class Region {
    private String nombre;
    
    public Region (String n){
        establecerNombre(n);
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String toString(){
        String cadena = String.format("Provincia:\n\tNombre:%s\t"
                ,obtenerNombre());
        return cadena;
    }
}
