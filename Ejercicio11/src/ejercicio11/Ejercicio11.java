package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número para operar: "); int num1 = leer.nextInt();
        System.out.print("Ingrese otro número para operar: "); int num2 = leer.nextInt();
        int opc; char opc2;
        do{   
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Opcion: "); opc = leer.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + num1*num2);
                    break;
                case 4:
                    System.out.println("Resultado: " + num1/num2);
                    break;
                case 5:
                    System.out.print("¿Desea salir? S/N ");
                    opc2 = leer.next().charAt(0);
                    if (opc2 == 'S' || opc2 == 's'){
                        break;
                    }else {
                        opc = 0;
                        break;
                    }
                    
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }while(opc != 5);
        System.out.println("Gracias por usar nuestro programa.");
    }    
}