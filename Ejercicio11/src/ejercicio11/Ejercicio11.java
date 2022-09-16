package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número para operar: "); int num1 = leer.nextInt();
        System.out.print("Ingrese otro número para operar: "); int num2 = leer.nextInt();
        int opc;
        /*menu*/
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
            }
            if (opc == 5){
                System.out.println("¿Está seguro que desea salir? S/N ");
                String salir = leer.nextLine();
                if (salir.equals("S")){
                    System.out.println("Saliste.");
                }else{
                    opc = 0;
                }
            }
        }while(opc!=5);
    }    
}