package com.java2;

public class Main {

    public static void main(String[] args) {
        
        
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
        int result = ages[ages.length - 1] - ages[0];
        System.out.println("Result of subtraction: " + result);

        
        
        int[] ages2 = new int[9];

        
        result = ages2[ages2.length - 1] - ages2[0];
        System.out.println("Result of subtraction for ages2: " + result);

    

        
        double sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double averageAge = sum / ages.length;
        System.out.println("Average age: " + averageAge);

        
        
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        sum = 0;
        for (String name : names) {
            sum += name.length();
        }
        double averageLetters = sum / names.length;
        System.out.println("Average number of letters per name: " + averageLetters);

        
        StringBuilder concatenatedNames = new StringBuilder();
        for (String name : names) {
            concatenatedNames.append(name).append(" ");
        }
        System.out.println("Concatenated names: " + concatenatedNames.toString().trim());


        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        
        sum = 0;
        for (int length : nameLengths) {
            sum += length;
        }
        System.out.println("Sum of name lengths: " + sum);

        
        System.out.println(concatenateWordNTimes("Hello", 3));



        







        
        
        System.out.println(getFullName("John", "Doe"));

        
        System.out.println(isSumGreaterThan100(ages));

        
        System.out.println(calculateAverage(ages));

        
        System.out.println(isFirstArrayAverageGreaterThanSecond(ages, ages2));

       
        System.out.println(willBuyDrink(true, 15.75));
    }

    
    public static String concatenateWordNTimes(String word, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(word);
        }
        return result.toString();
    }

    
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }


    public static boolean isSumGreaterThan100(int[] array) {
        int sum = Arrays.stream(array).sum();
        return sum > 100;
    }

    
    public static double calculateAverage(int[] array) {
        return Arrays.stream(array).average().orElse(Double.NaN);
    }

    
    public static boolean isFirstArrayAverageGreaterThanSecond(double[] firstArray, double[] secondArray) {
        double firstArrayAverage = Arrays.stream(firstArray).average().orElse(Double.NaN);
        double secondArrayAverage = Arrays.stream(secondArray).average().orElse(Double.NaN);
        return firstArrayAverage > secondArrayAverage;
    }

    
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }
}
