package umg.programacionII;
import umg.programacionII.PKG_Grupo1.ClsGrupo1;
import umg.programacionII.PKG_Grupo2.ClsGrupo2;
import umg.programacionII.PKG_Grupo3.ClsGrupo3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float a, b, c;
        ClsGrupo1 G1 = new ClsGrupo1();
        ClsGrupo2 G2 = new ClsGrupo2();
        ClsGrupo3 G3 = new ClsGrupo3();
        Scanner sc1 = new Scanner(System.in);
        int oper;

        do {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Calcular el área de un círculo");
            System.out.println("2. Calcular la circunferencia de un círculo");
            System.out.println("3. Calcular el volumen de un cubo");
            System.out.println("4. Calcular el área de una triangulo");
            System.out.println("5. Calcular el volumen de la pirámide cuadrada");
            System.out.println("6. Calcular el volumen de un prisma rectangular");
            System.out.println("7. Calcular el área de un paralelogramo");
            System.out.println("8. Calcular el volumen de un cilindro");
            System.out.println("-1. Salir");
            oper = sc1.nextInt();
            switch (oper) {
                case 1:
                    System.out.print("Por favor ingrese el radio del círculo: ");
                    a = sc1.nextFloat();
                    c = G1.radio(a);
                    System.out.print("El área del círculo es: " + c);
                    break;
                case 2:
                    System.out.print("Ingrese el radio del círculo: ");
                    a = sc1.nextFloat();
                    c = G1.circunferencia(a);
                    System.out.print("La circunferencia de la esfera es: " + c);
                case 3:
                    System.out.print("Ingrese la medida de un de los lados del cubo: ");
                    a = sc1.nextFloat();
                    c = G1.volumencubo(a);
                    System.out.print("El volumen del cubo es: " + c);
                    break;
                case 4:
                    System.out.print("Ingrese la base de la piramide cuadrada: ");
                    a = sc1.nextFloat();
                    System.out.println("Ingrese la altura de la piramide cuadrada: ");
                    b = sc1.nextFloat();
                    c = G2.triarea(a, b);
                    System.out.print("El área de la piramide cuadrada es: " + c);
                    break;
                case 5:
                    System.out.print("Ingrese la base de la pirámide: ");
                    a = sc1.nextFloat();
                    System.out.print("Ingrese la altura de la pirámide: ");
                    b = sc1.nextFloat();
                    c =G2.piravol(a,b);
                    System.out.print("El volumen de la pirámide es: " + c);
                    break;
                case 6:
                    System.out.print("Ingrese el área de la base del prisma rectangular: ");
                    a = sc1.nextFloat();
                    System.out.println("Ingrese la altura del prisma rectangular: ");
                    b = sc1.nextFloat();
                    c = G3.prisma(a, b);
                    System.out.print("El volumen del prisma rectangular es: " + c);
                    break;
                case 7:
                    System.out.println("Ingrese la base del paralelogramo: ");
                    a = sc1.nextFloat();
                    System.out.print("Ingrese la altura del paralelogramo: ");
                    b = sc1.nextFloat();
                    c = G3.paraleloarea(a, b);
                    System.out.println("El área del paralelogramo es: " + c);
                    break;
                case 8:
                    System.out.print("Ingrese el radio del cilindro: ");
                    a = sc1.nextFloat();
                    System.out.print("Ingrese la altura del cilindro: ");
                    b = sc1.nextFloat();
                    c = G3.cilinvolo(a, b);
                    System.out.print("El volumen del cilindro es: " + c);
                    break;
                case -1:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        } while (oper != -1);
        sc1.close();
    }
}