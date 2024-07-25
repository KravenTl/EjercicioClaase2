package umg.programacionII.PKG_Grupo3;

public class ClsGrupo3 {
    public float pi=3.1416f;

    //Para calcular el volumen de un prisma rectangular
    public float prisma(float area_base,float altura){
        return area_base * altura;
    }

    //Para calcular el área de un paralelogramo
    public float paraleloarea(float base, float altura){
        return base*altura;
    }

    //Para calcular el área volumen de un cilindro
    public float cilinvolo (float radio, float altura){
        return pi*(radio*radio)*altura;
    }
}
