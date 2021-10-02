/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    private final Scanner scanner = new Scanner(System.in);
    private Float peso;
    private Float estatura;
    private Integer edad;

    public static void main(String[] args) {
        Reto1 reto1 = new Reto1();
        reto1.run();
    }

    public String read() {
        return this.scanner.nextLine();
    }

    private void run() {
        String[] valueInto = this.read().split(" ");
        this.peso = Float.parseFloat(valueInto[0]);
        this.estatura = Float.parseFloat(valueInto[1]);
        this.edad = Integer.parseInt(valueInto[2]);
        double estatura2;
        double IMC;

        if (this.peso >= 0 && this.peso <= 150 && this.estatura >= 0.1 && this.estatura <= 2.5 && this.edad >= 0 && this.edad <= 110) {
            estatura2 = Math.pow(this.estatura, 2);
            IMC = this.peso / estatura2;
            if (IMC < 22 && this.edad <= 45) {
                System.out.println(String.format("%.1f", IMC) + " RIESGO BAJO");
            } else if ((IMC < 22 && this.edad > 45) || (IMC >= 22 && this.edad <= 45)) {
                System.out.println(String.format("%.1f", IMC) + " RIESGO MEDIO");
            } else if (IMC >= 22 && this.edad > 45){
                System.out.println(String.format("%.1f", IMC) + " RIESGO ALTO");
            }
        } else {
            System.out.println("ERROR");
        }

    }

}
