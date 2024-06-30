package org.example;

import org.example.movie.step01.Movie;
import org.example.movie.step01.MovieType;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        new Movie(MovieType.AMOUNT_DISCOUNT);
    }
}