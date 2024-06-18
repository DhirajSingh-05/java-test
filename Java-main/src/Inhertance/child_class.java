package Inhertance;

import javax.swing.text.AsyncBoxView;

public class child_class extends Parent_Class {
    public void Eating(){
        System.out.println("Chole bhature");
    }
    public void Bathing(){
        System.out.println("Dettol");
    }

    public static void main(String[] args) {
        child_class c = new child_class();
        c.Bathing();
        c.Eating();
        c.Drinking();
        c.Sleep();
        c.getClass();

    }
}
