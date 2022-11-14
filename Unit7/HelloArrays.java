//Example code
//
// HelloArrays.java
//


public class HelloArrays
{
    public static double average(double[] values)
    {
        double total = 0;

        for (double value : values)
            total += value;

        return total / values.length;
    }

    public static void testAverage(double[] values, double expected)
    {
        double result = average(values);

        System.out.print("values: ");
        for (double value : values)
            System.out.print(value + " " );

        System.out.println();

        System.out.println("expected: " + expected + " result: " + result);

        if (Math.abs(result - expected) < 1e-6)
            System.out.println("Yay!");
        else
            System.out.println("Boo.");
    }

    public static void main(String[] args)
    {
        String[] names = {"Sarah", "Alene", "Riley", "Chase"};

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println("length: " + names.length);

        System.out.println();

        // for loop

        for (int i=0; i<names.length; i++)
        {
            String name = names[i];
            System.out.println(name);
        }

        System.out.println();

        // for-each loop

        for (String name : names)
        {
            System.out.println(name);
        }

        //double[] values = {99.0, 100.0, 101.0};

        double[] values = new double[3];
        values[0] = 99.0;
        values[1] = 100.0;
        values[2] = 101.0;

        double[] values2 = new double[4];
        values2[0] = 99.0;
        values2[1] = 100.0;
        values2[2] = 101.0;
        values2[3] = 102.0;

        double[] values3 = new double[3];
        values3[0] = 10;
        values3[1] = 20;
        values3[2] = 30;

        testAverage(values, 100.0);
        testAverage(values2, 100.5);
        testAverage(values3, 20);
    }
}
