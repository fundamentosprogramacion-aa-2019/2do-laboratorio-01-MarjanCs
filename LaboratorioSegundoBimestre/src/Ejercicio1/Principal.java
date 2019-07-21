
package Ejercicio1;

public class Principal {
    
    public static void main(String[] args) {
        
        Region r1 = new Region("Costa");
        Region r2 = new Region("Sierra");
        Region r3 = new Region("Oriente");
        
        Provincia p1 = new Provincia("Azuay",r2);
        Provincia p2 = new Provincia("Zamora Chinchipe",r3);
        Provincia p3 = new Provincia("Loja",r2);
        Provincia p4 = new Provincia("Guayas",r1);
        Provincia p5 = new Provincia("Pichincha",r2);
        
        
         Ciudad c1 = new Ciudad("Cuenca",331888 ,p1, r2);
         Ciudad c2 = new Ciudad("Gualaceo", 42709, p1, r2);
         Ciudad c3 = new Ciudad("Zamora", 25510, p2, r3);
         Ciudad c4 = new Ciudad("Yantzaza", 18500, p2, r3);
         Ciudad c5 = new Ciudad("Catamayo", 29452, p3, r3);
         Ciudad c6 = new Ciudad("Loja", 180617, p3, r3);
         Ciudad c7 = new Ciudad("Guayaqui",2291568, p4, r1);
         Ciudad c8 = new Ciudad("Duran", 235769, p4, r1);
         Ciudad c9 = new Ciudad("Quito",1619575, p5, r2);
         Ciudad c10 = new Ciudad("Sangolqui",75080, p5,r2);
         
         Ciudad [] promedio = new Ciudad[10];
         
         promedio [0] = c1;
         promedio [1] = c2;
         promedio [2] = c3;
         promedio [3] = c4;
         promedio [4] = c5;
         promedio [5] = c6;
         promedio [6] = c7;
         promedio [7] = c8;
         promedio [8] = c9;
         promedio [9] = c10;
         
         for (int i = 0; i < promedio.length; i++) {
            System.out.println(promedio[i]);
        }
         
         OperacionPoblacion operacion = new OperacionPoblacion(promedio);
         operacion.establecerPromedioPoblacion();
         
         System.out.printf("%s",operacion);
         
         
    }
}
