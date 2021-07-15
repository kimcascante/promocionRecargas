package Semana4;

/**
 * Nombre del programa: 
 * Descripcion: El operador de telefonía móvil principal de la cuidad, decidió realizar una promoción
    basada en el monto de la recarga que realice el cliente y en los años que tiene de utilizar
    los servicios del operador. El operador no acepta recargas inferiores a los dos mil
    colones ni mayores a 5000. Si el cliente tiene menos de un año de estar registrado con
    el operador, no participa en la promoción. Si la recarga es mayor o igual a 2000 colones,
    pero menor a 3800, y tiene un año y hasta no más de 3 años de estar registrado con el
    operador, se le duplica la recarga. Para todos los clientes que tengan más de tres y no
    más de 5 años y la recarga sea mayor o igual a 3 800 colones y hasta un máximo de
    5000 mil colones, se le triplica la recarga. Para los clientes que tienen más de cinco
    años, sin importar el monto de la recarga, se les triplica la misma. Haga un programa
    que reciba el nombre del cliente, el monto de la recarga y la cantidad de años que tienen
    de ser cliente, y retorne si le aplica o no la promoción, y el monto total de la recarga
    incluyendo la promoción.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ej4w4 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{
        String masAno;
        int montoRecarga;
        int anos;
        String promocion;
        String nombreCliente;

        escribir.println("Digite el monto de la recarga:");
        montoRecarga = Integer.parseInt(leer.readLine());

        escribir.println("Digite el nombre del cliente");
        nombreCliente = leer.readLine();

        if (montoRecarga < 2000 && montoRecarga > 5000){
            escribir.println("No es un monto valido para la recarga");
        }
        
        escribir.println("El cliente tiene menos de un año de estar registrado");
        masAno = leer.readLine();

        if (masAno.equalsIgnoreCase("Si")){
            escribir.println("No participa en la promocion");
        } 
            
        escribir.println("Digite la cantidad de años de estar registrado");
            
        anos = Integer.parseInt(leer.readLine());
        
        if ((montoRecarga >= 2000 && montoRecarga < 3800) && (anos >= 1 && anos < 3)){
            promocion = "Se le duplica la recarga a: " +(montoRecarga*2);
        } else if((anos>=3 && anos <5) && (montoRecarga > 3800 && montoRecarga < 5000)){
            promocion = "Se le triplica la recarga a: " +(montoRecarga*3);
        } else if(anos>=5){
            promocion = "Se le triplica la recarga a: " +(montoRecarga*3);
        } else {
            promocion = "No participa en la promocion";
        }

        escribir.println("El cliente " + nombreCliente + " " + promocion);
    }
}