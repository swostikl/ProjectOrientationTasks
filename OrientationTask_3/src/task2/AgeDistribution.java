package task2;

import java.util.Random;

public class AgeDistribution{
    public static void main(String[] args) {
        final int REITERATIONS = 1000;   // number of ages to generate
        final int MAXAGE = 35;         // maximum age value

        // Cumulative distribution table: {cumulative %, age}
        int[][] ageDistribution = {
                {16, 20},
                {34, 21},
                {52, 22},
                {68, 23},
                {82, 24},
                {89, 25},
                {94, 26},
                {96, 28},
                {98, 30},
                {100, 35}
        };

        // Array to store count of each age
        int[] ageCounts = new int[MAXAGE + 1];


        // Generate 1000 random ages
        for (int i = 0; i < REITERATIONS; i++) {
            int x = (int) (Math.random() * 100) + 1;  // generate random number 1..100
            int j = 0;
            while (x > ageDistribution[j][0]) j++;  // search the correct row and find matching age
            int age = ageDistribution[j][1];
            ageCounts[age]++;                       // increment counter
        }

        // Display results of the generation
        System.out.println("Age  Count  %-Share");
        for (int age = 0; age <= MAXAGE; age++) {
            if (ageCounts[age] > 0) {
                double percent = (double)ageCounts[age] / REITERATIONS * 100;
                System.out.printf("%-4d %-8d %-8.2f\n", age, ageCounts[age], percent);
            }
        }
    }
}
