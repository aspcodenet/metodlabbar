package se.systementor;

public class Lab2 {
    public void run() {
        System.out.print("Skriv in ålder:");
        var age = Integer.parseInt( System.console().readLine() );
        System.out.print("Skriv in var du är (K = krogen, S = systemet)");
        var location =  System.console().readLine().charAt(0) ;

        var allowed = canBuyBeer(age, location);
        if(allowed)
            System.out.println("Jepp");
        else
            System.out.println("Nope");
    }

    private boolean canBuyBeer(int age, char location) {
        if(age >=18 && location == 'K')
            return true;
        if(age >=20 && location == 'S')
            return true;
        return false;
    }
    
}
