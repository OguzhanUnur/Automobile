/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Oğuzhan
 */
interface Arac {

    public void hizlan(double hizlanmaOrani);

    public void yavasla(double yavaslamaOrani);

    public void stop();
}

public class Automobile implements Arac {

     double fuel;
     double speed;
     String license;
     long girisZamani;

    public Automobile(String l) {
        setLicense(l);
    }

   

    @Override
    public void hizlan(double hizlanmaOrani) {
        double a = this.speed + this.speed * hizlanmaOrani;
        if (a <= 300 && hizlanmaOrani > 0.0 && hizlanmaOrani <= 1.0) {
            this.speed += this.speed * hizlanmaOrani;
        } else {
            this.speed = this.speed;
            System.out.println("Hiz degismedi");
        }
    }

    @Override
    public void yavasla(double yavaslamaOrani) {
        double b = this.speed - this.speed * yavaslamaOrani;
        if (yavaslamaOrani > 0.0 && yavaslamaOrani <= 1.0) {
            if (b < 0) {
                this.speed = 0;
            } else {
                this.speed -= this.speed * yavaslamaOrani;
            }
        } else {
            this.speed = this.speed;
            System.out.println("Hiz degismedi");
        }
    }

    @Override
    public void stop() {
        this.speed = 0;
        System.out.println("Hiz sifirlandi");
    }
 

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public long getGirisZamani() {
        return girisZamani;
    }

    public void setGirisZamani(long girisZamani) {
        this.girisZamani = girisZamani;
    }

}
