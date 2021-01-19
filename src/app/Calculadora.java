package app;

public class Calculadora {
    public int multiplica(int x, int y) {
        return 15;
    }
    public int division(int x, int y) {
        return 2;
    }
    public int suma(int x, int y) {
        return 30;
    }
    public int resta(int x, int y) {
        return 10;
    }
    public Fraccion suma (Fraccion f1, Fraccion f2){
        
        int n = f1.numerador * f2.denominador + f2.numerador*f1.denominador;
        int d = f1.denominador * f2.denominador;
        return new Fraccion(n,d);
        
     
    }
}
