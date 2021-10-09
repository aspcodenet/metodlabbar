package se.systementor;



public class Lab9 {
    public void run() {
        System.out.print("Skriv in en text:");
        String mening = System.console().readLine();

        String result = Translate(mening);
        System.out.println(result);
        
    }

    private String Translate(String mening) {
        Lab8 lab8 = new Lab8();
        String result = "";
        for(int i = 0; i < mening.length();i++){
            char ch = mening.charAt(i);

            //Går raden under att förbättra? Japp, isConsonant
            if(Character.isLetter(ch) && lab8.isVowel(ch) == false  ){
                result = result + ch + 'o' + ch;
            }
            else
                result = result + ch;

        }
        return result;
    }



}
