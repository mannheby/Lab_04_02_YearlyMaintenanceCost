public class Main
{
    public static void main(String[] args)
    {
        final double SPRING_COST = 250.00;
        final double SUMMER_COST = 125.59;
        final double FALL_COST = 85.89;
        final double WINTER_COST = 375.75;
        double yearlyCost = 0;
        yearlyCost = SPRING_COST + SUMMER_COST + FALL_COST + WINTER_COST;
System.out.println("The spring cost of " + SPRING_COST + ", the summer cost of " + SUMMER_COST + ", the fall cost of " + FALL_COST + ", the winter cost of " + WINTER_COST + " add to a yearly cost of " + yearlyCost);
    }
}