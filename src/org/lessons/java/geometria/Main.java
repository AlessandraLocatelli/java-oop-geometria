package org.lessons.java.geometria;
import org.w3c.dom.css.Rect;

import java.util.Scanner;




//chiedete all’utente di inserire, da console, i valori di base e di altezza
// con cui istanziare un nuovo Rettangolo.
// Dopo averlo istanziato, stampate a video il perimetro e l’area.

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Insert base: ");
    int baseInput = Integer.parseInt(sc.nextLine());
    System.out.println("Insert height: ");
    int heightInput = Integer.parseInt(sc.nextLine());

    Rectangle rectangle = new Rectangle(baseInput,heightInput);
    System.out.println("Data: "+rectangle);
    System.out.println("Area: "+rectangle.getArea());
    System.out.println("Perimeter: "+rectangle.getPerimeter());







    sc.close();
    }




}
