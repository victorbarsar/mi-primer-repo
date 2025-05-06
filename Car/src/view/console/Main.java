package view.console;

import model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehiculo> vehicleList = new ArrayList<>();
        int cocheCount = 0, motoCount = 0, busCount = 0;

        while (true) {
            // Mostrar el menú
            System.out.println("\nMenu:");
            System.out.println("1. Create a car");
            System.out.println("2. Create a motorcycle");
            System.out.println("3. Create a bus");
            System.out.println("4. Show all vehicles' plate numbers");
            System.out.println("5. Show vehicle details by plate");
            System.out.println("6. Show total vehicles created");
            System.out.println("7. Show total cars created");
            System.out.println("8. Show total motorcycles created");
            System.out.println("9. Show total buses created");
            System.out.println("10. Delete a vehicle by plate");
            System.out.println("0. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1: // Create a car
                    System.out.println("Enter car details:");
                    System.out.print("Brand: ");
                    String brandCar = scanner.nextLine();
                    System.out.print("Plate: ");
                    String plateCar = scanner.nextLine();
                    System.out.print("Model: ");
                    String modelCar = scanner.nextLine();
                    System.out.print("Horsepower: ");
                    int hpCar = scanner.nextInt();
                    System.out.print("Seats: ");
                    int seatsCar = scanner.nextInt();
                    System.out.print("Color (1: RED, 2: BLUE, 3: GREEN): ");
                    ColorEnum colorCar = ColorEnum.values()[scanner.nextInt() - 1];
                    System.out.print("Fuel type (1: GASOLINA, 2: DIESEL, 3: ELECTRICO): ");
                    FuelType fuelTypeCar = FuelType.values()[scanner.nextInt() - 1];
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Manufacture date (dd/MM/yyyy): ");
                    String dateCar = scanner.nextLine();
                    System.out.print("Speed: ");
                    int speedCar = scanner.nextInt();
                    System.out.print("Number of doors: ");
                    int doorsCar = scanner.nextInt();
                    Coche coche = new Coche(brandCar, plateCar, modelCar, hpCar, seatsCar, colorCar, fuelTypeCar, dateCar, speedCar, doorsCar);
                    vehicleList.add(coche);
                    cocheCount++;
                    break;

                case 2: // Create a motorcycle
                    System.out.println("Enter motorcycle details:");
                    System.out.print("Brand: ");
                    String brandMoto = scanner.nextLine();
                    System.out.print("Plate: ");
                    String plateMoto = scanner.nextLine();
                    System.out.print("Model: ");
                    String modelMoto = scanner.nextLine();
                    System.out.print("Horsepower: ");
                    int hpMoto = scanner.nextInt();
                    System.out.print("Seats: ");
                    int seatsMoto = scanner.nextInt();
                    System.out.print("Color (1: RED, 2: BLUE, 3: GREEN): ");
                    ColorEnum colorMoto = ColorEnum.values()[scanner.nextInt() - 1];
                    System.out.print("Fuel type (1: GASOLINA, 2: DIESEL, 3: ELECTRICO): ");
                    FuelType fuelTypeMoto = FuelType.values()[scanner.nextInt() - 1];
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Manufacture date (dd/MM/yyyy): ");
                    String dateMoto = scanner.nextLine();
                    System.out.print("Speed: ");
                    int speedMoto = scanner.nextInt();
                    System.out.print("Number of doors: ");
                    int doorsMoto = scanner.nextInt(); // Not relevant for motorcycles but included for consistency
                    Moto moto = new Moto(brandMoto, plateMoto, modelMoto, hpMoto, seatsMoto, colorMoto, fuelTypeMoto, dateMoto, speedMoto, doorsMoto);
                    vehicleList.add(moto);
                    motoCount++;
                    break;

                case 3: // Create a bus
                    System.out.println("Enter bus details:");
                    System.out.print("Brand: ");
                    String brandBus = scanner.nextLine();
                    System.out.print("Plate: ");
                    String plateBus = scanner.nextLine();
                    System.out.print("Model: ");
                    String modelBus = scanner.nextLine();
                    System.out.print("Horsepower: ");
                    int hpBus = scanner.nextInt();
                    System.out.print("Seats: ");
                    int seatsBus = scanner.nextInt();
                    System.out.print("Color (1: RED, 2: BLUE, 3: GREEN): ");
                    ColorEnum colorBus = ColorEnum.values()[scanner.nextInt() - 1];
                    System.out.print("Fuel type (1: GASOLINA, 2: DIESEL, 3: ELECTRICO): ");
                    FuelType fuelTypeBus = FuelType.values()[scanner.nextInt() - 1];
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Manufacture date (dd/MM/yyyy): ");
                    String dateBus = scanner.nextLine();
                    System.out.print("Speed: ");
                    int speedBus = scanner.nextInt();
                    System.out.print("Number of seats: ");
                    int numSeatsBus = scanner.nextInt();
                    System.out.print("Passenger capacity: ");
                    int passengerCapacityBus = scanner.nextInt();
                    Bus bus = new Bus(brandBus, plateBus, modelBus, hpBus, seatsBus, colorBus, fuelTypeBus, dateBus, speedBus, numSeatsBus, passengerCapacityBus);
                    vehicleList.add(bus);
                    busCount++;
                    break;

                case 4: // Show all vehicles' plate numbers
                    System.out.println("\nAll vehicle plate numbers:");
                    for (Vehiculo vehicle : vehicleList) {
                        System.out.println(vehicle.getCarplate());
                    }
                    break;

                case 5: // Show vehicle details by plate
                    System.out.print("Enter the plate number: ");
                    String plateToFind = scanner.nextLine();
                    for (Vehiculo vehicle : vehicleList) {
                        if (vehicle.getCarplate().equals(plateToFind)) {
                            System.out.println(vehicle);
                        }
                    }
                    break;

                case 6: // Show total vehicles created
                    System.out.println("Total vehicles created: " + vehicleList.size());
                    break;

                case 7: // Show total cars created
                    System.out.println("Total cars created: " + cocheCount);
                    break;

                case 8: // Show total motorcycles created
                    System.out.println("Total motorcycles created: " + motoCount);
                    break;

                case 9: // Show total buses created
                    System.out.println("Total buses created: " + busCount);
                    break;

                case 10:
                    // Eliminar un vehículo por matrícula
                    System.out.println("Introduce la matrícula del vehículo que deseas eliminar:");
                    String matriculaEliminar = scanner.nextLine();
                    
                    // Buscar el vehículo con la matrícula indicada y eliminarlo
                    boolean encontrado = false;
                    for (Vehiculo v : vehicleList) {
                        if (v.getCarplate().equals(matriculaEliminar)) {
                            vehicleList.remove(v);
                            encontrado = true;
                            
                            // Actualizar el contador dependiendo del tipo de vehículo
                            if (v instanceof Coche) {
                                cocheCount--;  // Decrementar el contador de coches
                                System.out.println("Coche con matrícula " + matriculaEliminar + " ha sido eliminado.");
                            } else if (v instanceof Moto) {
                                motoCount--;  // Decrementar el contador de motos
                                System.out.println("Moto con matrícula " + matriculaEliminar + " ha sido eliminada.");
                            } else if (v instanceof Bus) {
                                busCount--;  // Decrementar el contador de buses
                                System.out.println("Bus con matrícula " + matriculaEliminar + " ha sido eliminado.");
                            }
                            break; // Salir del bucle una vez encontrado y eliminado el vehículo
                        }
                    }
                    
                    if (!encontrado) {
                        System.out.println("No se ha encontrado ningún vehículo con esa matrícula.");
                    }
                    break;

                case 0: // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
