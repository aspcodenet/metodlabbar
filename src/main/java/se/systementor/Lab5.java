package se.systementor;

public class Lab5 {
    public void run(){
        System.out.print("Skriv in lösenord:");
        String password = System.console().readLine();

        String error = isValidPassword(password);
        if(error.isEmpty())
            System.out.println("Password is valid:" + password);
        else
            System.out.println(error);
    }

    private String isValidPassword(String password) {
        if(password.length() < 8) 
            return "A password must have at least eight characters.";
        
        if(containsOtherThanLetterAndDigits(password)) 
            return "A password consists of only letters and digits";

        if(numberOfDigits(password) < 2)            
            return "A password must contain at least two digits";
        
        return "";
    }

    private int numberOfDigits(String password) {
        int count = 0;
        for(int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);
            if(Character.isDigit(ch))
                count++;
        }
        return count;
    }

    private boolean containsOtherThanLetterAndDigits(String password) {
        for(int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);
            if(!Character.isLetterOrDigit(ch))
                return true;
        }
        return false;
    }
}
