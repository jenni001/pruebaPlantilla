import app.Calculadora;
import app.Fraccion;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Calculadora
        Calculadora calc = new Calculadora();
            //Multiplicación
            System.out.println(calc.multiplica(3,5));
            //División
            System.out.println(calc.division(10,5));
            //Suma
            System.out.println(calc.suma(20,10));
            //Resta
            System.out.println(calc.resta(20,10));


        //Fraccion
        Fraccion f1 = new Fraccion(5,10);
        Fraccion f2 = new Fraccion(7,20);
        System.out.println(f1);
        System.out.println(f2);
        



    }
}
