import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;

public class Main
{
    public static void main(String[] args)
    {
        //Task 1
        int ARRAY_SIZE = 100;
        int[] dataPoints = new int[ARRAY_SIZE]; //data = name of array; index 0 - 99
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        //Task 2
        for(int e = 0; e < dataPoints.length; e++) //initialize data array data 1-100
        {
            dataPoints[e] = rnd.nextInt(100) + 1;//+1 = 1-100
        }
        for(int e = 0; e < dataPoints.length; e++) //print out
        {
            System.out.printf("%5d", dataPoints[e]);//display random array
            if(e % 20 == 0 && e > 0)
            {
                System.out.println("");
            }
        }
        System.out.println("\n");

        //Task 3
        int val = 0;
        for(int e = 0; e < dataPoints.length; e++)
        {
            System.out.print("val" + dataPoints[e] + " | ");
        }

        //Task 4
        int sum = 0;
        for(int e = 0; e < dataPoints.length; e++) //print out
        {
             sum = sum + dataPoints[e];
        }
        System.out.println("\n\nThe sum of the data set is " + sum);
        int ave = sum / dataPoints.length;
        System.out.println("The average of the data set is " + ave);

        //Task 5 & 6
        int target = SafeInput.getRangedInt(in, "Enter search value", 1, 100);
        int count = 0;
        int finalCount = 0;
        boolean foundFlag = false;
        for(int e = 0; e < dataPoints.length; e++)
        {
            if(dataPoints[e] == target)  // got a new max
            {
                count++;
                finalCount = count;
                foundFlag = true;
                System.out.println("Value " + target + " found: " + finalCount + " times");
            }

        }
        if(!foundFlag)
        {
            System.out.println("Value not found");
        }
        foundFlag = false;

//Task 7
        int searchTarget = SafeInput.getRangedInt(in, "Enter search value", 1, 100);

        for(int e = 0; e < dataPoints.length; e++) //initialize data array data 1-100
        {
            if (dataPoints[e] == searchTarget) {
                foundFlag = true;
                System.out.println("Value " + searchTarget + " first found at index " + e);
                break;
            }
        }
            if(!foundFlag)
            {
                System.out.println("Target " + searchTarget + " not found!");
            }


//Task 8
        int min = dataPoints[0];
        int max = dataPoints[0];
        for(int e = 0; e < dataPoints.length; e++) //initialize data array data 1-100
        {
            if (min > dataPoints[e])
            {
                min = dataPoints[e];
            }
            if (max < dataPoints[e])
            {
                max = dataPoints[e];
            }
        }
        System.out.println("The min is " + min);
        System.out.println("The max is " + max);
  }
    public static double getAverage(int values[])
    {
        //Task 9
        int ARRAY_SIZE = 100;
        int[] dataPoint = new int[ARRAY_SIZE];
        int sum = 0;

        for(int e = 0; e < dataPoint.length; e++)
        {
            sum = sum + dataPoint[e];  // sum += e
        }
        int ave = sum / dataPoint.length;
        System.out.println("Average of dataPoints is: " + getAverage(dataPoint));
        return sum;
    }




}
