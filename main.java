public class main {

    // Recursive methods
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int sumArray(int[] arr, int index) {
        if (index < 0) {
            return 0;
        } else {
            return arr[index] + sumArray(arr, index - 1);
        }
    }

    public static void printReverse(String str, int index) {
        if (index >= 0) {
            System.out.print(str.charAt(index));
            printReverse(str, index - 1);
        }
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }

    // Vehicle class
    public static class Vehicle {
        private String brand;
        protected String model;
        int year;
        public String color;

        public Vehicle(String brand, String model, int year, String color) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.color = color;
        }

        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
            System.out.println("Color: " + color);
        }
    }

    // Child classes of Vehicle
    public static class Car extends Vehicle {
        private int numberOfDoors;

        public Car(String brand, String model, int year, String color, int numberOfDoors) {
            super(brand, model, year, color);
            this.numberOfDoors = numberOfDoors;
        }

        public void displayCarInfo() {
            displayInfo();
            System.out.println("Number of Doors: " + numberOfDoors);
        }
    }

    public static class Truck extends Vehicle {
        private double payloadCapacity;

        public Truck(String brand, String model, int year, String color, double payloadCapacity) {
            super(brand, model, year, color);
            this.payloadCapacity = payloadCapacity;
        }

        public void displayTruckInfo() {
            displayInfo();
            System.out.println("Payload Capacity: " + payloadCapacity + " tons");
        }
    }

    public static class Motorcycle extends Vehicle {
        private boolean hasFairing;

        public Motorcycle(String brand, String model, int year, String color, boolean hasFairing) {
            super(brand, model, year, color);
            this.hasFairing = hasFairing;
        }

        public void displayMotorcycleInfo() {
            displayInfo();
            System.out.println("Has Fairing: " + (hasFairing ? "Yes" : "No"));
        }
    }

    public static class Bicycle extends Vehicle {
        private int numberOfGears;

        public Bicycle(String brand, String model, int year, String color, int numberOfGears) {
            super(brand, model, year, color);
            this.numberOfGears = numberOfGears;
        }

        public void displayBicycleInfo() {
            displayInfo();
            System.out.println("Number of Gears: " + numberOfGears);
        }
    }

    public static void main(String[] args) {
        // Call recursive methods
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Fibonacci sequence up to 7th term: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println("\nSum of elements in array [1, 2, 3, 4, 5]: " + sumArray(new int[]{1, 2, 3, 4, 5}, 4));
        System.out.print("Reverse of 'Hello': ");
        printReverse("Hello", 4);
        System.out.println("\n2^3 (2 raised to the power of 3): " + power(2, 3));

        // Create and display vehicles
        Car myCar = new Car("Toyota", "Camry", 2022, "Blue", 4);
        Truck myTruck = new Truck("Ford", "F-150", 2021, "Red", 2.5);
        Motorcycle myMotorcycle = new Motorcycle("Honda", "CBR500R", 2020, "Black", true);
        Bicycle myBicycle = new Bicycle("Schwinn", "Cruiser", 2023, "Green", 7);

        System.out.println("\nCar Information:");
        myCar.displayCarInfo();

        System.out.println("\nTruck Information:");
        myTruck.displayTruckInfo();

        System.out.println("\nMotorcycle Information:");
        myMotorcycle.displayMotorcycleInfo();

        System.out.println("\nBicycle Information:");
        myBicycle.displayBicycleInfo();
    }
}
