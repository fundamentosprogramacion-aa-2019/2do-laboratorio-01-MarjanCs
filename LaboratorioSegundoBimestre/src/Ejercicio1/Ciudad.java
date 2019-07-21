
package Ejercicio1;

public class Ciudad {
    private String nombre;
    private double poblacion;
    private Provincia provincia;
    private Region region;
    
    public Ciudad(String n, double p, Provincia pr, Region rg){
     establecerNombre(n);
     establecerPoblacion(p);
     establecerProvincia(pr);
     establecerRegion(rg);
    }
  
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerPoblacion (double p){
        poblacion = p;
    }
    
    public void establecerProvincia(Provincia p){
        provincia = p;
    }
    
    public void establecerRegion(Region r){
        region = r;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public double obtenerPoblacion(){
        return poblacion;
    }
    
    public Provincia obtenerProvincia(){
        return provincia;
    }
    
    public Region obtenerRegion(){
        return region;
    }
    public String toString(){
        String cadena = String.format("Ciudad: \n\t%s\n\tPoblacion: %.0f\n\t"
                + "Provincia: %s\n\tRegion: %s\n"
                ,obtenerNombre(), obtenerPoblacion(), obtenerProvincia().obtenerNombre(),
                obtenerRegion().obtenerNombre());
        return cadena;
    }
            
}
