
package Ejercicio2;

public class Federacion {
    private String nombre;
    private Confederacion confederacion;
    private String deporte;
    
    public Federacion(String n, Confederacion c, String dp){
        establecerNombre(n);
        establecerConfederacion(c);
        establecerDeporte(dp);
        
    }
    
        public void establecerNombre(String n){
        nombre = n;
        }
        
        public void establecerConfederacion(Confederacion c){
        confederacion = c;
        }
        
        public void establecerDeporte(String d){
        deporte = d;
        }
        
        public String obtenerNombre(){
            return nombre;
        }
        
        public Confederacion obtenerConfederacion(){
            return confederacion;
        }
        
        public String obtenerDeporte(){
            return deporte;
        }
        public String toString(){
        String cadena = String.format("tConfederacion: %s\n\t"
                + "Deporte %s\n"
                ,obtenerConfederacion().obtenerNombre(), obtenerDeporte());
        return cadena;
    }
}
