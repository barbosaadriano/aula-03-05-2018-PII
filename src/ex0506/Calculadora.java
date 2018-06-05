
package ex0506;

import java.util.Scanner;

/**
 *
 * @author drink
 */
public class Calculadora {
    
    private int numero1;
    private int numero2;
    private String resultado;
    Scanner scan;
    
    public Calculadora() {
        this.scan = new Scanner(System.in);
        this.pedirNumeros();
        this.calcular();
        this.exibirResultado();
    }

    private void pedirNumeros() {
        System.out.println("Informe um inteiro:");
        numero1 = scan.nextInt();
        System.out.println("Informe outro inteiro:");
        numero2 = scan.nextInt();
    }

    private void calcular() {
        resultado = "A soma de "+numero1+" com "+numero2+" é "+(numero1+numero2);
    }

    private void exibirResultado() {
        System.out.println(this.resultado);
    }
    
    
    
}
