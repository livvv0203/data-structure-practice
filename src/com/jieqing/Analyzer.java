package com.jieqing;

import java.awt.image.VolatileImage;
import java.util.ArrayList;

public class Analyzer {

    public static void runCarAnalysis() {

        // Print all cars in the ArrayList
        FileProcessor fileReader = new FileProcessor();
        ArrayList<String> r;
        r = fileReader.ReadFromFile(fileReader.fileNameCar);

        ArrayList<Car> cars = new ArrayList<Car>();
        System.out.println("All cars in the list are: ");

        // Print oldest car, youngest car and the average price
        double sumOfPrice = 0.0d;
        Car oldestCar = null;
        Car newestCar = null;

        // Split String into pieces
        for (int i = 0; i < r.size(); i++) {
            String[] split = r.get(i).split(" ");

            Car c = new Car(split[0], Integer.parseInt(split[1]),
                    Integer.parseInt(split[2]));
            cars.add(c);

            sumOfPrice += c.getPrice();

            // Find Oldest and newest car
            if ( oldestCar == null || oldestCar.getYear() > c.getYear()) {
                oldestCar = c;
            }
            if ( newestCar == null || newestCar.getYear() < c.getYear()) {
                newestCar = c;
            }
            System.out.println(c);
        } // Now all cars are stored in cars

        System.out.println("\nOldest Car is: \n" + oldestCar);
        System.out.println("Newest Car is: \n" + newestCar);
        System.out.println(String.format("Average Price is : %.1f", sumOfPrice / cars.size()));
    }

    public static void runPersonAnalysis() {

        FileProcessor fileReader = new FileProcessor();
        ArrayList<String> r= fileReader.ReadFromFile(fileReader.fileNamePerson);;
        System.out.println("\nAll persons in the list are: ");

        ArrayList<Person> persons = new ArrayList<Person>();
        double sumOfAge = 0.0d; // Format variable
        Person oldestPerson = null;
        Person youngestPerson = null; // Declare and initialize variables

        // Split String into two pieces accordingly
        for (int i = 0; i < r.size(); i++) {
            String[] split = r.get(i).split(" ");
            Person p = new Person(split[0], Integer.parseInt(split[1]));
            persons.add(p);
            System.out.println(p);

            sumOfAge += p.getAge();

            // Find the oldest person
            if (oldestPerson == null || oldestPerson.getAge() < p.getAge()) {
                oldestPerson = p;
            }
            // Find the youngest person
            if (youngestPerson == null || youngestPerson.getAge() > p.getAge()) {
                youngestPerson = p;
            }
        } // end of for loop
        // Display the result
        System.out.println("\nThe oldest person is: " + oldestPerson);
        System.out.println("\nThe youngest person is: " + youngestPerson);
        System.out.println(String.format("\nAverage age is: %.1f", sumOfAge / persons.size()));
    } // end of method

}


















