package com.InClassLabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String keepGoing = "yes";

        do {
            System.out.println("Enter word to translate:");
            String wordToTranslate = scan.nextLine();

            String victoryVowel = "aeiouAEIOU";
            char z;
            z = wordToTranslate.charAt(0);
            if (z != 'a' && z != 'e' && z != 'i' && z != 'o' && z != 'u' && z != 'A' && z != 'E' && z != 'I' && z != 'O' && z != 'U') { //why doesn't this work with || operator?
                for (int i = 0; i < wordToTranslate.length(); i++) {
                    if (victoryVowel.contains("" + wordToTranslate.charAt(i))) {
                        String prefix = wordToTranslate.substring(0, i);
                        String suffix = wordToTranslate.substring(i);
                        wordToTranslate = (suffix + prefix + "ay");
                        System.out.println(wordToTranslate);
                        break;
                    }
                }
            } else System.out.println(wordToTranslate + "way");

            System.out.println("Would you like to keep translating? Enter yes or no:");
            keepGoing = scan.nextLine();

        } while (keepGoing.equalsIgnoreCase("yes"));
        System.out.println("Exiting the translator program.");
    }
}
