package se.systementor;

public class Lab7 {
    public void run() {
        System.out.println("Mata in din lön:");
        float salary = Float.parseFloat(System.console().readLine());
        float taxes = calculateTaxesOnSalary(salary);
        System.out.printf("Taxes id :%.2f\n",taxes);
    }

    private float calculateTaxesOnSalary(float salary) {
        if(salary > 30000)
            return salary * 0.33f;
        if(salary > 15000)
            return salary * 0.12f;
        return salary * 0.28f;
    }
    
}
