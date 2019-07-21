
package Ejercicio2;


public class Principal {
    
    public static void main(String[] args) {
        
        Confederacion c1 = new Confederacion("Confederacion Sudamericana de Futbol", "Conmebol");
        Confederacion c2 = new Confederacion("Confederacion Asiatica de Futbol", "afc");
        Confederacion c3 = new Confederacion("Confederacion Africana de Futbol", "caf");
        Confederacion c4 = new Confederacion("Union de Asociaciones Europeas de Futbol", "uefa");   
        
        Federacion f1 = new Federacion ("Federacion Ecuatoriana de Futbol", c1, "futbol");
        Federacion f2 = new Federacion ("Federacion Argentina de Futbol", c1, "futbol");
        Federacion f3 = new Federacion ("Federacion Japonesa de Futbol", c2, "futbol");
        Federacion f4 = new Federacion ("Federacion Koreana de Futbol", c2, "futbol");
        Federacion f5 = new Federacion ("Federacion Sudafricana de Futbol", c3, "futbol");
        Federacion f6 = new Federacion ("Federacion Nigeriana de Futbol", c3, "futbol");
        Federacion f7 = new Federacion ("Federacion Española de Futbol", c4, "futbol");
        Federacion f8 = new Federacion ("Federacion Francesa de Futbol", c4, "futbol");
        
        Equipo e1 = new Equipo ("Liga de Quito", 12, f1,c1);
        Equipo e2 = new Equipo ("Barcelona S.C", 16, f1,c1);
        Equipo e3 = new Equipo ("River Plate", 65, f2,c1);
        Equipo e4 = new Equipo ("Boca Juniors", 68, f2,c1);
        Equipo e5 = new Equipo ("Kashima", 8, f3,c2);
        Equipo e6 = new Equipo ("Kawasaki", 5, f3,c2);
        Equipo e7 = new Equipo ("Paris Saint Germain", 36, f8,c4);
        Equipo e8 = new Equipo ("Barcelona F.C", 96, f7,c4);
        Equipo e9 = new Equipo ("Real Madrid", 93, f7,c4);
        Equipo e10 = new Equipo ("Akwa United", 8, f6,c3);
        Equipo e11 = new Equipo ("Heartland ", 5, f6,c3);
        Equipo e12 = new Equipo ("Gangwon", 7, f4,c4);
        
        Equipo [] estadistica = new Equipo[12];
        
        estadistica[0] = e1;
        estadistica[1] = e2;
        estadistica[2] = e3;
        estadistica[3] = e4;
        estadistica[4] = e5;
        estadistica[5] = e6;
        estadistica[6] = e7;
        estadistica[7] = e8;
        estadistica[8] = e9;
        estadistica[9] = e10;
        estadistica[10] = e11;
        estadistica[11] = e12;
        
        
        for (int i = 0; i < estadistica.length; i++) {
            System.out.println(estadistica[i]);
        }
       
        OperacionTitulos operacion = new OperacionTitulos(estadistica);
        operacion.establecerPromedioPoblacion();
        
        System.out.printf("%s",operacion);
    }
    
}
