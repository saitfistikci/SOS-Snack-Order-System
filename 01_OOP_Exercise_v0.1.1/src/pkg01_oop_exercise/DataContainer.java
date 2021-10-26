/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_oop_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Sait Fistikci
 */
public class DataContainer<T> {

    private List<T> data = new ArrayList<T>(0);     //Generieren der ArrayListe mit einem beliebigen Datentyp "T"

    public DataContainer() {
    }

    public int getSize() {      //Rückgabe der aktuellen Listengröße
        return data.size();
    }

    public void add(T object) { //Hinzufügen eines Objects
        data.add(object);
    }

    public T getObject(int id) {    //Ausgabe einer bestimmten Objects anhand der ID
        return data.get(id);
    }

    public void setObject(int id, T object) {   //Setzen eines Objects mit der ID & Object
        data.set(id, object);
    }

    public void deleteObject(int id) {  //Löschen eines Objects mithilfe der ID
        data.remove(id);
    }

    public void printAll() {    //Ausgabe aller Objecte von der Arrayliste

        int i = 0;
        while (i < data.size()) {
            System.out.println(getObject(i));
            i++;
        }

    }

}
