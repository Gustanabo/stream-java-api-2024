package functional_interface.examples;

import java.util.Arrays;
import java.util.List;

public class BinaryOperatorExemple {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        int resultado = numeros.stream().reduce(0, Integer::sum);

        System.out.println("A soma dos numeros é: " + resultado);
    }
}
