# Task1 W
**Compile statistics on the age structure of students in our group.Draw 1000 age values and these should be distributed 
in the same way as the age distribution of the students in the group. How do you do it? Explain the algorithm in enough 
details to be able to program it directly.**

- Create a cumulative distribution table for age and cumulative %.
- Initialize an array to store counts for each age.
- Repeat 1000 times:
    a. Generate a random number between 1 and 100.
    b. Compare the random number to the cumulative % table.
    c. Assign the age corresponding to the first cumulative % ≥ random number.
    d. Increment the counter for that age in the array.

- After 1000 iterations, the generated ages approximate the specified distribution.
- Optionally, calculate and print the percentage of each age.

# Task2 P (Implementing the task1 programmatically)
```
```java
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

```

# Task 3

**(W) Why can't a Singleton object be created from outside the Singleton class using the new operation?**
- Because  Singleton design pattern is specifically designed where only one instance of class can exist. Also,the 
constructor is private which is accessed through a public static method like getInstance().


# Task 4

**Familiarize yourself with a few distributions that could be used in the simulator for experimentation**

1. Normal Distribution (Gaussian) : Symmetric, bell-shaped curve around the mean. Most values cluster near the average; extreme values are rare.

- Use in simulations: Modeling natural variations or measurement errors.

- Real-life examples:

- Height of People: Most are average height; very tall or short are rare.

- Rolling Dice: Sums of multiple dice rolls form a bell-shaped distribution.

- Tossing a Coin: Multiple tosses approximate 50% heads.

2. Poisson Distribution : Counts the number of rare events happening in a fixed interval of time or space.
- Use in simulations: Modeling random arrivals or occurrences over time.
- Examples: Number of customers arriving at a bank per hour, number of calls at a call center.


# Task 5
```
```java

package task5;

public class Clock {
    // The single instance
    private static Clock instance;

    // Internal time variable
    private double currentTime;

    // Private constructor
    private Clock() {
        currentTime = 0.0; // start at time 0
    }

    // Public method to get the single instance
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    // Get current time
    public double getTime() {
        return currentTime;
    }

    // Set or change time
    public void setTime(double newTime) {
        currentTime = newTime;
    }
}
// to demostrate the functionality

class ClockTest{
    public static void main(String[] args) {
        // Get the singleton instance
        Clock clock = Clock.getInstance();

        // Show initial time
        System.out.println("Initial time: " + clock.getTime());

        // Change the time
        clock.setTime(8.55);
        System.out.println("Updated time: " + clock.getTime());

        // Try to get another instance
        Clock anotherClock = Clock.getInstance();
        System.out.println("Another instance time: " + anotherClock.getTime());

        // Verify that both references point to the same object
        System.out.println("Both instances are the same: " + (clock == anotherClock));
    }
}

```

# task 6
