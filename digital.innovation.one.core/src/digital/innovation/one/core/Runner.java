package digital.innovation.one.core;

import digital.innovation.one.utils.Calculadora;
import java.util.List;
import java.util.ArrayList; // classe visível por padrão na modularização

public class Runner {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        ArrayList<Object> objects = new ArrayList<>();
        System.out.println(calculadora.div(15, 3));


    }
}
