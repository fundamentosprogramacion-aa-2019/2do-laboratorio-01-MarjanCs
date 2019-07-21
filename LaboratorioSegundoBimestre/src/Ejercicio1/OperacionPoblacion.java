
package Ejercicio1;


public class OperacionPoblacion {
    
    private Ciudad [] poblacion;
    double promedioPoblacion;
    
    public OperacionPoblacion(Ciudad [] promedio){
        poblacion = promedio;
    }
    
    public void establecerCiudad(Ciudad [] pb){
        poblacion = pb;
    }
    
    public void establecerPromedioPoblacion(){
        double suma = 0;
        for (int i = 0; i < poblacion.length; i++) {
            
             suma = poblacion[i].obtenerPoblacion()+ suma;
        }
        
        promedioPoblacion = suma/poblacion.length;
    }
    
    public Ciudad[] obtenerCiudad(){
        return poblacion;
    }
    
    public double obtenerPromedioPoblacion(){
        return promedioPoblacion;
    }
    
     public String toString(){
        String cadena = String.format("Promedio Edades: %.2f\n"
        ,obtenerPromedioPoblacion());
        
        return cadena;
    }
}
