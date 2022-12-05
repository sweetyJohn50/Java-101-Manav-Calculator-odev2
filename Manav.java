package manavcalculator;
import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        
        double elma , armut , patlican , domates , muz ;

        Scanner i = new Scanner(System.in);
        
        System.out.print("Armut kac kg : ");

        armut = i.nextDouble();

        System.out.print("Elma kac kg : ");

        elma = i.nextDouble();

        System.out.print("Domates kac kg : ");

        domates = i.nextDouble();

        System.out.print("Muz kac kg : ");

        muz = i.nextDouble();

        System.out.print("Patlican kac kg ; ");

        patlican = i.nextDouble();

        i.close();

        double pear = 2.14 , apple = 3.67 , tomato = 1.11 , 
        banana = 0.95 , eggplant = 5.00 ;

        double kgToplam = (pear * armut)+(apple * elma)+
        (tomato * domates)+(banana * muz)+(eggplant * patlican);

        System.out.print("Toplam tutar : " + kgToplam + " TL");
    }


}

        // Hakan Çoban
        // Küsürat girerken virgül kullanınız.
        // https://app.patika.dev/hknxx
