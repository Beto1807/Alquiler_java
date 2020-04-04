
package Control;

import java.util.Scanner;

public class Vehiculo {
    Scanner leer = new Scanner(System.in);
    private int pos = 0;
    private String [][] autos = new String [999][4];
    
    public void BuscarMatricula(){
        String busqueda;
        System.out.print("Teclea la matricula para buscar: ");
        busqueda = leer.next();
        System.out.println("Vehiculo encontrado por matricula:");
        
        for (int i = 0; i < 999; i++) {
            if(autos[i][0].equals(busqueda)){
                System.out.println("Matricula: " + autos[i][0] + " | Modelo: " + autos[i][1] + " | Kilometraje: " + autos[i][2] + " | Alquilado: " + autos[i][3]);
            }
            else{
                System.out.println("Matricula incorrecta");
            }
        }//For
    }//Buscar
    
    
    public void BuscarKilometraje(){
        String busqueda;
        System.out.print("Teclea el kilometraje para buscar: ");
        busqueda = leer.next();
        System.out.println("Vehiculo encontrado por kilometraje:");
        for (int i = 0; i < 999; i++) {
            if(autos[i][2].equals(busqueda)){
                System.out.println("Matricula: " + autos[i][0] + " | Modelo: " + autos[i][1] + " | Kilometraje: " + autos[i][2] + " | Alquilado: " + autos[i][3]);
            }
            else{
                System.out.println("Kilometraje incorrecto");
            }
        }//For
    }//Buscar
    
    public void Lista(){
        for (int i = 0; i < 999; i++) {
            System.out.println("Matricula: " + autos[i][0] + " | Modelo: " + autos[i][1] + " | Kilometraje: " + autos[i][2] + " | Alquilado: " + autos[i][3]);
        }//For
    }//Lista

    public void Nuevo() {
        System.out.print("Teclea el modelo del nuevo auto: ");
        int modelo = leer.nextInt();
        System.out.print("Teclea la matricula: ");
        int matricula = leer.nextInt();
        System.out.print("Teclea el kilometraje: ");
        int kilometraje = leer.nextInt();
        boolean usada = false;
        
        for (int i = 0; i < 999; i++) {
            if(autos[i][0].equals(matricula)){
                usada = true;
            }
        }//For
        
        if (!usada){
            autos[pos][0] = matricula + "";
            autos[pos][1] = modelo + "";
            autos[pos][2] = kilometraje + "";
            autos[pos][3] = "falso";
            pos++;
            System.out.println("Auto registrado");
        }else{
            System.out.println("Matricula duplicada!");
        }
        
        
    }
}