package Control;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Menu me = new Menu();
        Scanner leer = new Scanner(System.in);
        int op = 0;
        Vehiculo v = new Vehiculo();
        //Clientes c = new Clientes();
        //Kilometraje k = new Kilometraje();
        //Alquiler a = new Alquiler();
        
        while (op != 11) {
            me.menuPrincipal();
            op = leer.nextInt();
            System.out.println("");
            switch (op) {
                    case 1:
                        v.Nuevo();
                        break;
    
                    case 2:
                       //c.NuevoCliente();
                        break;
    
                    case 3:
                       v.BuscarKilometraje();
                        break;
    
                    case 4:
                        v.BuscarMatricula();
                        break;
    
                    case 5:
                        v.Lista();
                        break;
                        
                    case 6:
                        //c.ListaCientes();
                        break;
                        
                    case 7:
                        //a.ListadoAuto();
                        break;
                        
                    case 8:
                        //a.ListadoClientes();
                        break;
                        
                    case 9:
                        //a.Registro();
                        
                        break;
                        
                    case 10:
                        //a.Devolucion();
                        break;
                    
                    default:
                    break;
                        
                }   
        }
    }
}