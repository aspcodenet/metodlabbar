package se.systementor;

public class Lab6 {
    public void run() {
        String []words = {"Hej", "Tjena", "What", "Hockey", "s"};

        String longestWord = getLongestWord(words);
        System.out.printf("Longest word is:%s\n",longestWord);
    }

    private String getLongestWord(String[] words) {
        String longestSoFar = "";

        for(String word: words){
            if(word.length() > longestSoFar.length())
                longestSoFar = word;
        }
        return longestSoFar;


    }
    
}
