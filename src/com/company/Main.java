package com.company;
import javax.swing.*;
import java.text.DecimalFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        double hTimesCbyK = 0.0143876515;
        double lamb;
        double temperatureInDegreesKelvin;
        double B;
        double LTreciprocal;
        double e;
        double c = 1.19104292;

        Scanner input = new Scanner(System.in);
        lamb = input.nextDouble();
        temperatureInDegreesKelvin = input.nextDouble();
        double micro2meter = Math.pow(10,-6);
        lamb*=micro2meter;
        LTreciprocal = 1/(lamb*temperatureInDegreesKelvin);
        e = Math.exp(hTimesCbyK*LTreciprocal);
        e--;
        e*=(Math.pow(10,16));
        e*=Math.pow(lamb,5);
        B = c/e;
        System.out.println("Radiant photon flux at a given wavelength");
        System.out.println("and temperature using Planck's Law.");
        DecimalFormat df1 = new DecimalFormat( "0.00E00");
        System.out.println("wavelength in microns: temperature in degrees Kelvin: radiant flux B = " + df1.format(B).toLowerCase() + " Wm-3steradian-1");
    }


}
