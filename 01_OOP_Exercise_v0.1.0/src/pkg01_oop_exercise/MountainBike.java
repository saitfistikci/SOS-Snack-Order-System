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
public class MountainBike extends Bike {

    public String type;
    private boolean damping;
    private String damping_info = "";

    public MountainBike(String rider, String color) {
        super(rider, color);
    }

    public MountainBike(String type, String rider, String color, int direction, double kmh, boolean damping) {
        super(rider, color);
        this.type = type;
    }

    public String setDamping(boolean damping) {
        String damping_status;
        damping_status = isDamping(damping);
        return damping_status;
    }

    public String isDamping(boolean damping_status) {
        if (damping_status = true) {
            damping_info = "on";
        } else {
            damping_info = "off";
        }

        return damping_info;
    }

    @Override
    public String toString() {       //tooString, festlegen der String Ausgabeformats

        String s3 = String.format("Type: %s | Rider: %s | Color: %s | Direction: %d | kmh: %.2f"
                + " | Damping: %s", this.type, this.rider, this.color, this.direction, this.speed, this.setDamping(damping));

        return s3;
    }

    public static void main(String args[]) {
        MountainBike m = new MountainBike("Thomas", "black");
        m.steer(10);
        m.accelerate(0.3, 9.8);
        m.setDamping(true);

        System.out.println(m);
    }

}
