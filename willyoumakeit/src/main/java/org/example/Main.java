package org.example;

public class Main {

    public boolean willIMakeIt(float distanceToPump, float remainingFuel, float milesPerGallon) {
        return (milesPerGallon*remainingFuel - distanceToPump) >= 0;
    }

    public static void main(String[] args) {

    }
}
