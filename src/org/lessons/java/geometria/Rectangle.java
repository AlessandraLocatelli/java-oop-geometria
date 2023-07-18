package org.lessons.java.geometria;

// Classe con due attributi interi: base e altezza.
// Aggiungere un opportuno costruttore con parametri.
// Aggiungere due metodi: calcolaArea e calcolaPerimetro che calcolano
// e restituiscono, rispettivamente, l’area e il perimetro del rettangolo.
//BONUS Aggiungere alla classe Rettangolo un metodo disegna()
// che stampa in console il rettangolo con le sue dimensioni.


public class Rectangle {

    //CAMPI
    int base;
    int height;


    //COSTRUTTORI
    Rectangle(int base, int height)
    {
        this.base = base;
        this.height = height;

    }


    //METODI
    int getArea()
    {
      int area = base * height;

      return area;

    }


    int getPerimeter()
    {

        int perimeter = (base*2) + (height*2);

        return perimeter;

    }

    //BONUS
    void Draw()
    {


        for (int i = 0; i < height; i++) {
            for (int j = 0; j < base; j++) {
                if ( j == 0 || j == base-1 || i == 0 || i == height-1)
                    System.out.print("o");
                else
                    System.out.print(" ");
            }

            System.out.println();

        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
