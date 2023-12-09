package dev.ali.imc;

import dev.ali.imc.models.IMC;
import dev.ali.imc.models.Person;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {

        Person Maria = new Person("Maria", 64, 1.68);
        IMC calculO = new IMC();
        String estado = calculO.calcularIMC(Maria);

        System.out.println(Maria.getName()+" con peso " + Maria.getPeso() + " y altura " + Maria.getAltura() + " indica un estado " + estado );
        
    }

    
}
