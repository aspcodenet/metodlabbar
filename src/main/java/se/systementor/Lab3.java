package se.systementor;

public class Lab3 {
    public void run() {
        System.out.print("Skriv in mening:");
        String mening = System.console().readLine();

        int antal = countWords(mening);
        System.out.println("Antal ord blev "+ antal);
    }

    private int countWords(String input) {
        int words = 0;
        
        boolean isword = false;
        for(int i = 0; i < input.length();i++){
            char ch = input.charAt(i);
            if(Character.isLetter(ch)){
                if(isword == false){
                    isword = true;
                    words++;
                }
            }
            else{
                isword = false;
            }

        }
        return words;
    }
    
}
