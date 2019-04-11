package com.e.bmicalculator;

import android.support.v7.app.AppCompatActivity;


public class Nabin_BMI extends AppCompatActivity {

    private double height, weight;

    public Nabin_BMI(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double calcBMI() {

        double BMI = weight / (height * height / 100);
        return BMI;
    }
}
