public class Wage {
    public double calculateWage(double hoursWorked, double hourlyRate) {
        return hoursWorked * hourlyRate;
    }

    public static void main(String[] args) {
        Wage wage = new Wage();
        double hoursWorked = 8.0;
        double hourlyRate = 15.0;
        double result = wage.calculateWage(hoursWorked, hourlyRate);
        System.out.println("The total wage is: " + result);
    }
    
}
