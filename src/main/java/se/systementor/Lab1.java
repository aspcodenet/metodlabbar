package se.systementor;

public class Lab1 {
    
    public void run() {
        System.out.print("Skriv in tal 1:");
        var num1 = Integer.parseInt( System.console().readLine() );
        System.out.print("Skriv in tal 2:");
        var num2 = Integer.parseInt( System.console().readLine() );
        System.out.print("Skriv in tal 3:");
        var num3 = Integer.parseInt( System.console().readLine() );

        var smallest = getSmallestNumber(num1,num2,num3);
        System.out.printf("Minst är:%d\n",smallest);
    }

    private int getSmallestNumber(int num1, int num2, int num3) {
        if(num1 > num2 && num1 > num3)
            return num1;
        if(num2 > num1 && num2 > num3)
            return num2;
        return num3;
    }
}
