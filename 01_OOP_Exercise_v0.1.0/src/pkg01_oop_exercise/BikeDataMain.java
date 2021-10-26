/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_oop_exercise;

import java.util.Scanner;

/**
 *
 * @author Sait Fistikci
 */
public class BikeDataMain {

    public static void main(String[] args) {

        DataContainer<Bike> list = new DataContainer<>(); //Deklaration des DataContainers mit der Variable list &  des Objekts Bike dürfen geaddet werden
        Scanner sc = new Scanner(System.in);            //Scanner-Initialisierung
        StringBuffer bike_data = new StringBuffer("");  //Stringbuffer Zwischenspeicherung der bike_data

        boolean run = true;     //Loop-Schleife Variable run mithilfe true startet die while

        while (run) {

            System.out.println("Please type in a method! ");
            System.out.println("Methods: add / size / rm / printAll / print / set / quit ");
            String modus = sc.nextLine();   //Eingabe der gewünschten Funktion, Eingabe Init

            if (modus.equalsIgnoreCase("add Bike")) {   //Abfrage der Eingabe "Bike"
                String type = "Bike";
                System.out.println("Rider: ");
                String rider = sc.nextLine();           //Einlesen des Parameters Rider

                System.out.println("Color: ");
                String color = sc.nextLine();

                System.out.println("Direction: ");
                int direction = sc.nextInt();

                System.out.println("kmh: ");
                double kmh = sc.nextDouble();

                System.out.println("The bike has been added successfully!");
                Bike add_bike = new Bike(type, rider, color, direction, kmh);   //Erstellen des Bikes mithilfe Bike Konstruktor
                list.add(add_bike);         //Hinzuügen in die Liste
            }

            if (modus.equalsIgnoreCase("add CityBike")) {       //Abfrage der Eingabe "CityBike"
                String type = "CityBike";   
                System.out.println("Rider: ");
                String rider = sc.nextLine();

                System.out.println("Color: ");
                String color = sc.nextLine();

                System.out.println("Direction: ");
                int direction = sc.nextInt();

                System.out.println("kmh: ");
                double kmh = sc.nextDouble();

                System.out.println("Lights: ");
                boolean lights = sc.nextBoolean();

                System.out.println("The CityBike has been added successfully!");
                CityBike add_citybike = new CityBike(type, rider, color, direction, kmh, lights);   //Erstellen des CityBikes mithilfe CityBike Konstruktor
                list.add(add_citybike);     //Hinzufügen in die CityBike Liste
            }

            if (modus.equalsIgnoreCase("add MountainBike")) {
                String type = "MountainBike";
                System.out.print("Rider: ");
                String rider = sc.nextLine();

                System.out.print("Color: ");
                String color = sc.nextLine();

                System.out.print("Direction: ");
                int direction = sc.nextInt();

                System.out.print("kmh: ");
                double kmh = sc.nextDouble();

                System.out.print("Damping: ");
                boolean damping = sc.nextBoolean();

                System.out.println("The MountainBike has been added successfully!");
                MountainBike add_mountainbike = new MountainBike(type, rider, color, direction, kmh, damping);
                list.add(add_mountainbike);
            }

            if (modus.equalsIgnoreCase("size")) {   //Abfrage der aktuellen Größe der Liste
                System.out.println(list.getSize() + " elements are currently stored");      //Ausgabe der aktuellen Elementeanzahl
            }

            if (modus.startsWith("rm")) {       //Löschen eines Bikes aus der Liste, anhand der Id
                String remove = modus.substring(3);
                int remove_id = Integer.parseInt(remove);

                if (remove_id <= list.getSize() && list.getSize()!= 0 ) {       //Abfrage ob dieses Element & Generell Elemente in der Liste sich befinden
                    list.deleteObject(remove_id);
                    System.out.println("done");
                } else {
                    System.out.println("number does not exist, size = " + list.getSize());
                }
            }

            if (modus.equalsIgnoreCase("printAll")) {

                if (list.getSize() == 0) {      //Abfrage auf vorhandensein von Objekten in list
                    System.out.println("No bikes are existing in the Array!");
                } else {
                    System.out.print("The following data set is existing ");
                    list.printAll();    //Aufrufen der Funktion printAll
                   
                }

            }

            if (modus.startsWith("print") && !modus.equalsIgnoreCase("printAll")) { //eine id die nicht vorhanden ist filtern
                String print = modus.substring(6);
                int print_id = Integer.parseInt(print);

                if (print_id > list.getSize() || list.getSize() == 0) {      //Abfrage auf vorhandensein von Objekten in list
                    System.out.println("number does not exist, size = " + list.getSize());
                } else {
                    System.out.println(list.getObject(print_id));
                   
                }

            }

            if (modus.startsWith("set")) {
                String remove = modus.substring(4);
                int remove_id = Integer.parseInt(remove);

                list.deleteObject(remove_id);

                if (remove_id <= list.getSize()) {
                    System.out.print("Please Type in: (Bike or CityBike or MountainBike) ");
                    String type = sc.nextLine();

                    switch (type) {
                        case "Bike":
                            type = "Bike";
                            System.out.println("Rider: ");
                            String rider = sc.nextLine();

                            System.out.println("Color: ");
                            String color = sc.nextLine();

                            System.out.println("Direction: ");
                            int direction = sc.nextInt();

                            System.out.println("kmh: ");
                            double kmh = sc.nextDouble();

                            System.out.println("The Bike has been added successfully!");
                            Bike add_bike = new Bike(type, rider, color, direction, kmh);
                            list.add(add_bike);
                            break;

                        case "CityBike":
                            type = "CityBike";
                            System.out.println("Rider: ");
                            rider = sc.nextLine();

                            System.out.println("Color: ");
                            color = sc.nextLine();

                            System.out.println("Direction: ");
                            direction = sc.nextInt();

                            System.out.println("kmh: ");
                            kmh = sc.nextDouble();

                            System.out.println("Lights: ");
                            boolean lights = sc.nextBoolean();

                            System.out.println("The CityBike has been added successfully!");
                            CityBike add_citybike = new CityBike(type, rider, color, direction, kmh, lights);
                            list.add(add_citybike);
                            break;

                        case "MountainBike":
                            type = "MountainBike";
                            System.out.print("Rider: ");
                            rider = sc.nextLine();

                            System.out.print("Color: ");
                            color = sc.nextLine();

                            System.out.print("Direction: ");
                            direction = sc.nextInt();

                            System.out.print("kmh: ");
                            kmh = sc.nextDouble();

                            System.out.print("Damping: ");
                            boolean damping = sc.nextBoolean();

                            System.out.println("The MountainBike has been added successfully!");
                            MountainBike add_mountainbike = new MountainBike(type, rider, color, direction, kmh, damping);
                            list.add(add_mountainbike);
                            break;

                        default:
                            System.out.println("Dieser Typ ist nicht möglich!");
                            break;
                    }
                } else {
                    System.out.println("number does not exist, size = " + list.getSize());
                }
            }

            if (modus.equalsIgnoreCase("quit")) {           //Beenden des Programmes mithilfe "Quit"
                System.out.println("Program has been quited");
                run = false;            //Run Parameter auf false setzen um while loop zu stoppen
            }

        }

    }
}
