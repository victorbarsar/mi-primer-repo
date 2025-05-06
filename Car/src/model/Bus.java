package model;

public class Bus extends Vehiculo {
    private int numSeats;      // Número de asientos en el bus
    private int passengerCapacity; // Capacidad total de pasajeros

    // Constructor sin parámetros
    public Bus() {
        super("", "", "", 0, 0, ColorEnum.BLACK, FuelType.DIESEL, "", 0, 0);
        this.numSeats = 0;
        this.passengerCapacity = 0;
    }

    // Constructor con parámetros
    public Bus(String brand, String carplate, String model, int hp, int places, ColorEnum color, FuelType fuelType, String manufactureDate, int speed, int numSeats, int passengerCapacity) {
        super(brand, carplate, model, hp, places, color, fuelType, manufactureDate, speed, numSeats);
        this.numSeats = numSeats;
        this.passengerCapacity = passengerCapacity;
    }

    // Getters y Setters
    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    // Sobrescribir el método toString para mostrar todos los atributos del Bus
    @Override
    public String toString() {
        return super.toString() + 
               "Number of Seats: " + numSeats + "\n" +
               "Passenger Capacity: " + passengerCapacity + "\n";
    }
}
