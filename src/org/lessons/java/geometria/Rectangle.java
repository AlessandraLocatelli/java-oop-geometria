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


    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
