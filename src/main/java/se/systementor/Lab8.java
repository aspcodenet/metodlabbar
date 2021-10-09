package se.systementor;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab8 {
    public void run(){
        System.out.print("Mata in en bokstav:");
        char ch = System.console().readLine().charAt(0);
        if(isVowel(ch))
            System.out.println("Vokal");
        else
            System.out.println("Inte vokal");
    }

        

    public boolean isVowel(char ch) {
        char lower = Character.toLowerCase(ch);
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'o', 'u', 'å', 'e', 'i', 'y', 'ä', 'ö'));
        
        return vowels.contains(lower);
    }

}
