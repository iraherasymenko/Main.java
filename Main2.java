package org.example;

import net.thauvin.erik.crypto.CryptoPrice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        //System.out.println("What is the fuel consumption per 100 km?");
        //var liters = scanner.nextDouble();
        var liters = CryptoPrice.spotPrice("fuel consumption per 100 km");
        System.out.println("fuel consumption per 100 km is " + liters.getAmount());

       while (true) {
        System.out.println("What is the distance (in km) travelled by the car?");
        var distance = scanner.nextDouble();

        if (distance == 0)
            break;

        var result = (liters.getAmount().doubleValue()*distance)/100;

        System.out.println("Result = " + result);


        }
    }
}
