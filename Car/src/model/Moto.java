package model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import model.ColorEnum;
import model.FuelType;

public class Moto extends Vehiculo {
    private int numDoors; // Número de puertas del coche

    // Constructor
    public Moto(String brand, String carplate, String model, int hp, int places, ColorEnum color, FuelType fuelType, String manufactureDate, int speed, int numDoors) {
        super(brand, carplate, model, hp, places, color, fuelType, manufactureDate, speed, numDoors);
        this.numDoors = numDoors;
    }

    // Getter y Setter
    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    // Sobrescribimos el método toString para incluir el número de puertas
    @Override
    public String toString() {
        return super.toString() + "Number of doors: " + numDoors + "\n";
    }

    public static void main(String[] args) {
        // Crear el objeto coche1
        Moto moto1 = new Moto("Toyota", "XYZ 1234", "Corolla", 150, 5, ColorEnum.BLUE, FuelType.GASOLINA, "15/03/2010", 0, 4);
        
        // Imprimir la información del coche
        System.out.println(moto1);
    }
}