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
public class CityBike extends Bike { //Class CityBike erbt von der Class Bike

    public String type;
    private boolean light;
    private String status = "";

    public CityBike(String rider, String color, boolean light) {    //CityBike Konstruktor
        super(rider, color);
        this.light = light;
    }

    public CityBike(String type, String rider, String color, int direction, double kmh, boolean light) {    //CityBike Konstruktor
        super(rider, color);
        this.light = light;
        this.type = type;
    }

    public String setLight(boolean light) {     //Licht-Status festlegen

        String lights_status;
        lights_status = isLight(light);
        return lights_status;
    }

    public String isLight(boolean lights) {      //Licht-Status Abfrage

        if (lights = true) {
            status = "on";
        } else {
            status = "off";
        }

        return status;
    }

    @Override
    public String toString() {       //tooString, festlegen der String Ausgabeformats

        String s2 = String.format("Type: %s | Rider: %s | Color: %s | Direction: %d | kmh: %.2f"
                + " | Lights: %s", this.type, this.rider, this.color, this.direction, this.speed, this.setLight(light));

        return s2;
    }

    public static void main(String args[]) {
        CityBike b = new CityBike("Thomas", "black", false);
        b.steer(10);
        b.accelerate(0.3, 9.8);
        b.setLight(true);
        System.out.println(b);
    }

}
