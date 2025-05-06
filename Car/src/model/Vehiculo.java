package model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import model.ColorEnum;
import model.FuelType;

public class Vehiculo {

    // Definición de los atributos de la clase
    private String brand;            // Marca del coche (ejemplo: "Toyota")
    private String carplate;         // Matrícula del coche (ejemplo: "XYZ 1234")
    private String model;            // Modelo del coche (ejemplo: "Corolla")
    private int hp;                  // Caballos de fuerza del coche (ejemplo: 150)
    private int places;              // Número de plazas (ejemplo: 5)
    private ColorEnum color;         // Color del coche, usando el tipo ColorEnum
    private FuelType fuelType;       // Tipo de combustible (Gasolina, Diesel, Eléctrico, etc.)
    private String manufactureDate;  // Fecha de fabricación del coche (ejemplo: "15/03/2010")
    private int speed;
    // Constructor: inicializa los atributos del coche
    public Vehiculo(String brand, String carplate, String model, int hp, int places, ColorEnum color, FuelType fuelType, String manufactureDate, int speed, int numDoors) {
        this.brand = brand;                      
        this.carplate = carplate;                
        this.model = model;                      
        this.hp = hp;                            
        this.places = places;                    
        this.color = color;                     
        this.fuelType = fuelType;                
        this.manufactureDate = manufactureDate;  
        this.speed = speed;                      
    }

    public void accelerate() {
        this.speed += 20;
    }

    public void accelerate(int amount) {
        this.speed += amount;
    }

    public void brake() {
        this.speed = Math.max(0, this.speed - 20);
    }

    public void brake(int amount) {
        this.speed = Math.max(0, this.speed - amount);
    }

    public int getAge() {
        if (manufactureDate == null || manufactureDate.isEmpty()) {
            return 0;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate manufactureLocalDate = LocalDate.parse(manufactureDate, formatter);
        return Period.between(manufactureLocalDate, LocalDate.now()).getYears();
    }

    // Método que devuelve la descripción completa del coche en formato de texto
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (brand != null) {
            sb.append("Brand: ").append(brand).append("\n");
        }

        if (model != null) {
            sb.append("Model: ").append(model).append("\n");
        }

        if (carplate != null) {
            sb.append("Carplate: ").append(carplate).append("\n");
        }

        if (color != null) {
            sb.append("Color: ").append(color).append("\n");
        }

        if (fuelType != null) {
            sb.append("Fuel Type: ").append(fuelType).append("\n");
        }

        if (manufactureDate != null) {
            sb.append("Manufacture Date: ").append(manufactureDate).append("\n");
        }
             
        sb.append("Speed: ").append(speed).append(" km/h\n");

        sb.append("Car Age: ").append(getAge()).append(" years\n");

        return sb.toString();
    }

    // Métodos getter y setter para acceder y modificar los atributos
    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarplate() {
        return carplate;
    }

    public void setCarplate(String carplate) {
        this.carplate = carplate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
