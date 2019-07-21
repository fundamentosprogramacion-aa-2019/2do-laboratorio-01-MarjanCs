
package Ejercicio2;

public class Confederacion {
    private String nombre;
    private String siglas;
    
    public Confederacion(String n, String s){
        establecerNombre(n);
        establecerSiglas(s.toUpperCase());
    }
    
    public void establecerNombre(String n){
       nombre = n;
    }
    
    public void establecerSiglas(String s){
        siglas = s;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerSiglas(){
        return siglas;
    }
    
    public String toString(){
        
        String cadena = String.format("Confederacion: \n\t%s\n\tSiglas: %s\n\t"
            ,obtenerNombre(), obtenerSiglas());
        
        return cadena;
    }
}
