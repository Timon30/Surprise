package com.company;
import com.company.Film;

public class FilmTester {
    public static void main(String[] args){
        Film pierwszy = new Film();
        pierwszy.tytuł = "Szybcy i wsciekli!";
        pierwszy.rodzaj = "Akcja";
        pierwszy.ocena = 4;
        Film drugi = new Film();
        drugi.tytuł = "Matrix";
        drugi.rodzaj = "Przygodowy";
        drugi.ocena = 2;
        Film trzeci = new Film();
        trzeci.tytuł = "Pompeja";
        trzeci.rodzaj = "Dramat";
        trzeci.ocena = 5;

    }
}
