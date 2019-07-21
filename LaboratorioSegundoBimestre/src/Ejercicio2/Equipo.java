
package Ejercicio2;

public class Equipo {
    private String nombre;
    private int numeroCampeonatos;
    private Federacion federacion;
    private Confederacion confederacion;
    
    public Equipo(String n, int nc, Federacion f, Confederacion c){
        establecerNombre(n);
        establecernumeroCampeonatos(nc);
        establecerFederacion(f);
        establecerConfederacion(c);
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecernumeroCampeonatos(int n){
        numeroCampeonatos = n;
    }
    public void establecerFederacion(Federacion f){
        federacion = f;
    }
    
    public void establecerConfederacion(Confederacion c){
        confederacion = c;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenernumeroCampeonatos(){
        return numeroCampeonatos;
    }
    
    public Federacion obtenerFederacion(){
        return federacion;
    }
    
    public Confederacion obtenerConfederacion(){
        return confederacion;
    }
    public String toString(){
        String cadena = String.format("Equipo: \n\t%s\n\tNro de Campeonatos: %d\n\t"
                + "Federacion: %s\n\tConfederacion: %s  %s\n", obtenerNombre(), 
                obtenernumeroCampeonatos(),obtenerFederacion().obtenerNombre(), 
                obtenerConfederacion().obtenerNombre(),obtenerConfederacion().obtenerSiglas());
        
        return cadena;
    }
}
