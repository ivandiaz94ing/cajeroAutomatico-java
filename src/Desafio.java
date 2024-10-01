import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Ivan Arturo Diaz Rosso";
        String tipoCuenta = "Ahorro";
        double saldo = 532000;
        int opcion= 0;
        float cantidadRetiro=0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("******************************************** \n");
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
//        System.out.println("Saldo disponible: $ " + saldo);
        while (opcion != 9){
            System.out.println("\n********************************************");
            System.out.println("""
                    ** Ingrese la opcion deseada: **
                    1 - Consultar saldo
                    2 - Retirar
                    3 - Depositar
                    9 - Salir
                    """);
            System.out.print("Opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Tu saldo actual es: " + saldo);
                    break;
                case 2:
                    System.out.println("Cual es el valor que deseas retirar? ");
                    cantidadRetiro = teclado.nextFloat();

                    if (cantidadRetiro> saldo){
                        System.out.println("Saldo insufieciente");
                    }else if(cantidadRetiro < saldo){
                        saldo = saldo - cantidadRetiro;
                        System.out.println("Operacion exitosa");
                    }
                    break;
                case 3:
                    System.out.println("Cual es el valor que deseas consignar? ");
                    cantidadRetiro = teclado.nextFloat();
                    saldo += cantidadRetiro;
                    break;
                case 9:
                    System.out.println("Finalizando el programa. Muchas gracias por usar nuestros servicios");
                    break;
                default:
                    System.out.println("Esta opción no se encuentra en el menú");
                    break;
            }



        }

    }
}



