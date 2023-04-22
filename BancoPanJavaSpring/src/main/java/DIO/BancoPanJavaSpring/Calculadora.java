package DIO.BancoPanJavaSpring;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public static int somar(int n1, int n2){
        return n1 + n2;
    }
    public static int subtrair(int n1, int n2){
        return n1 - n2;
    }
    public static int multiplicar(int n1, int n2){
        return n1 * n2;
    }
    public static int dividir(int n1, int n2){
        return n1 / n2;
    }
}