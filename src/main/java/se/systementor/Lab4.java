package se.systementor;

public class Lab4 {
    public void run() {
        System.out.print("Skriv in ett tal:");
        int tal = Integer.parseInt(System.console().readLine());

        int summanAvSiffror = sumAllDigits(tal);
        System.out.println("Summan= "+ summanAvSiffror);
    }

    private int sumAllDigits(int tal) {
        
        String s = Integer.toString(tal);
        int summa = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int num = Integer.parseInt(String.valueOf(ch));
            summa += num;
        }
        return summa;
    }
    
}
