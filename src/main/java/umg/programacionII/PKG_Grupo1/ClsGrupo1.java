package umg.programacionII.PKG_Grupo1;

public class ClsGrupo1 {
    public float pi=3.1416f;

    //Para calcular el area de un circulo
    public float radio(float radio){
        float area,pi=3.1416f;
        return pi*(radio*radio);
    }

    //para calcular la circunferencia de un círculo
    public float circunferencia(float radio){
        return 2*pi*radio;
    }
    public float volumencubo(float lados){
        return lados*lados*lados;
    }
}
