/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Oğuzhan
 */
public class Test {
      public static void main(String[] args) throws InterruptedException {
        Automobile ford = new Automobile("34 bg 123");
        System.out.println(ford.getLicense());
        Automobile audi = new Automobile("34 TR 456 ");
        Automobile tofas = new Automobile("45 MBK 045");

        Autopark park = new Autopark(3);
        park.girisYap(ford);

        park.girisYap(audi);
        park.girisYap(tofas);
        Thread.sleep(200);

        park.girisYap(audi);
        Thread.sleep(999);
        Thread.sleep(500);
        park.cikisYap(audi);
        park.cikisYap(ford);
        park.cikisYap(tofas);

    }


 }
 


