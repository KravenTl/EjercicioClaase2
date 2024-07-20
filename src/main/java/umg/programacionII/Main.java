package umg.programacionII;

import umg.programacionII.PKG_Grupo1.ClsGrupo1;
import umg.programacionII.PKG_Grupo2.ClsGrupo2;
import umg.programacionII.PKG_Grupo3.ClsGrupo3;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float a,b,c;
        ClsGrupo1 G1 = new ClsGrupo1();
        ClsGrupo2 G2 = new ClsGrupo2();
        ClsGrupo3 G3 = new ClsGrupo3();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Por favor ingrese el radio del circulo: ");
        a=sc1.nextFloat();
        c= G1.radio(a);
        System.out.println("El area del circulo: "+c);
        System.out.println("\nIngrese la base del tiangulo");
        a=sc1.nextFloat();
        System.out.println("Ingrese la altura del tiangulo");
        b=sc1.nextFloat();
        c=G2.triarea(a,b);
        System.out.println("El area del tiangulo: "+c);
        System.out.println("\nIngrese el area del prisma rectangular");
        a=sc1.nextFloat();
        System.out.println("Ingrese la altura del prisma rectangular");
        b=sc1.nextFloat();
        c=G3.prisma(a,b);
        System.out.println("El area del prisma rectangular: "+c);
    }
}