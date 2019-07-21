
package Ejercicio1;

public class Provincia {
    
    private String nombre;
    private Region region;
    
    public Provincia(String n, Region rg){
        establecerNombre(n);
        establecerRegion(rg);
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }   
    
    public void establecerRegion (Region r){
        region = r;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public Region obtenerRegion(){
        return region;
    }
    public String toString(){
        String cadena = String.format("Region:%s\n\t"
                , obtenerRegion());
        return cadena;
    }
}
