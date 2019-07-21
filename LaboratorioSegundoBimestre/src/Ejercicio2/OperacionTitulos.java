
package Ejercicio2;
    
public class OperacionTitulos {
    private Equipo [] equipo;
    int sumaTitulos;
    
    public OperacionTitulos(Equipo [] estadistica){
        equipo = estadistica;
    }
    
    public void establecerEquipos(Equipo [] eq){
        equipo = eq;
        
    }
    public void establecerPromedioPoblacion(){
        int suma = 0;
        for (int i = 0; i <equipo.length; i++) {
            
             suma = equipo[i].obtenernumeroCampeonatos()+ suma;
        }
        
         sumaTitulos = suma;
    }
    
    public Equipo [] obtenetEquipos(){
        return equipo;
    }
    
    public int obtenerPromedioEquipos(){
        return sumaTitulos;
    }
    
    public String toString(){
        String cadena = String.format("Suma de Titulos Total: %d\n"
        ,obtenerPromedioEquipos());
        
        return cadena;
    }
}
