package DIO.BancoPanJavaSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {
    @Autowired
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("A soma de N1 e N2 é: " + Calculadora.somar(5,2));
        System.out.println("A subtração de N1 e N2 é: " + Calculadora.subtrair(5,2));
        System.out.println("A multiplicação de N1 e N2 é: " + Calculadora.multiplicar(5,2));
        System.out.println("A divisão de N1 e N2 é: " + Calculadora.dividir(5,2));
    }
}
