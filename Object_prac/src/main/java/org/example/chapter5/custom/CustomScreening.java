package org.example.chapter5.custom;

import org.example.chapter5.money.Money;
import org.example.chapter5.step03.Movie;

public class CustomScreening {
    private CustomMovie customMovie;

    int sequence;

    int day;

    public void calculateFee(int audienceCount) {
        customMovie.calculateMovieFee(this);
    }

    public void setCustomMovie(CustomMovie customMovie) {
        this.customMovie = customMovie;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getSequence() {
        return sequence;
    }

    public int getDay() {
        return day;
    }
}
