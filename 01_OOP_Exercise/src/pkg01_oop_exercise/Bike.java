/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_oop_exercise;

/**
 *
 * @author Sait Fistikci
 */
public class Bike {

    public String rider;
    public String color;
    public String type;
    public int direction;      //steering angle in degrees: -45 to 45
    public double speed;       // m/sec
    private double way;
    private double time;

    public Bike(String type, String rider, String color, int direction, double kmh) {   //Bike Konstruktor
        this.rider = rider;
        this.color = color;
        this.direction = direction;
        this.type = type;

    }

    public Bike(String rider, String color) {   //Bike Konstruktor
        this.rider = rider;
        this.color = color;

    }

    public void steer(int deltaR) {          //Zuweisung der deltaR Variable zu steer
        this.direction = deltaR;

    }

    public void accelerate(double a, double sec) {      //Geschw. BErechnung & m/s auf kmh
        this.way = a * 3.6;
        this.time = sec;
        getKmh();
    }

    public double getKmh() {                         //Geschw. Berechnungsfunktion
        double v = 0;
        this.speed = v + (this.way) * (this.time);
        return speed;   //String.format

    }

    public static void main(String args[]) {     //Main Programm, Ausgabe String b 

        Bike b = new Bike("Strampler", "blue");
        b.steer(10);
        b.accelerate(0.3, 9.8);  // v = v + 0.3 * 9.8
        System.out.println(b);

    }

    @Override
    public String toString() {   //To String Ausgabe Befehl (Format)

        String s1 = String.format("Type: %s | Rider: %s | Color: %s | Direction: %d | kmh: %.2f",
                this.type, this.rider, this.color, this.direction, this.speed);

        return s1;
    }

}
