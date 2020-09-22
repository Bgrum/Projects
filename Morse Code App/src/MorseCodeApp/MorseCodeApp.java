package MorseCodeApp;


import java.util.HashMap;
import java.util.Scanner;

public class MorseCodeApp {
    public static void main(String[] args) {


        HashMap <Character, String> morseCodeConversion = new HashMap<Character, String>();

        morseCodeConversion.put('a', ".-");
        morseCodeConversion.put('b', "-...");
        morseCodeConversion.put('c', "-.-.");
        morseCodeConversion.put('d', "-..");
        morseCodeConversion.put('e', ".");
        morseCodeConversion.put('f', "..-.");
        morseCodeConversion.put('g', "--.");
        morseCodeConversion.put('h', "....");
        morseCodeConversion.put('i', "..");
        morseCodeConversion.put('j', ".---");
        morseCodeConversion.put('k', "-.-");
        morseCodeConversion.put('l', ".-..");
        morseCodeConversion.put('m', "--");
        morseCodeConversion.put('n', "-.");
        morseCodeConversion.put('o', "---");
        morseCodeConversion.put('p', ".--.");
        morseCodeConversion.put('q', "--.-");
        morseCodeConversion.put('r', ".-.");
        morseCodeConversion.put('s', "...");
        morseCodeConversion.put('t',"-");
        morseCodeConversion.put('u', "..-");
        morseCodeConversion.put('v', "...-");
        morseCodeConversion.put('w', ".--");
        morseCodeConversion.put('x', "-..-");
        morseCodeConversion.put('y', "-.--");
        morseCodeConversion.put('z', "--..");


        morseCodeConversion.put('1', ".----");
        morseCodeConversion.put('2', "..---");
        morseCodeConversion.put('3', "...--");
        morseCodeConversion.put('4', "....-");
        morseCodeConversion.put('5', ".....");
        morseCodeConversion.put('6', "-....");
        morseCodeConversion.put('7', "--...");
        morseCodeConversion.put('8', "---..");
        morseCodeConversion.put('9', "----.");
        morseCodeConversion.put('0', "-----");

        morseCodeConversion.put(' ', " ");
        morseCodeConversion.put('!', " ");
        morseCodeConversion.put('.', " ");
        morseCodeConversion.put('?', " ");
        morseCodeConversion.put(',', " ");
        morseCodeConversion.put('\'', " ");



        Scanner userInput = new Scanner(System.in);
        String answer = " ";
        do {
            System.out.println("Please enter the text you would like to convert into Morse code.");

            String strToConvert = userInput.nextLine();
            char[] givenString = strToConvert.toLowerCase().toCharArray();
            System.out.println("Your message: " + strToConvert);

            for (char c : givenString) {
                System.out.print(morseCodeConversion.get(c) + " ");

            }
            System.out.println("\nWould you like to enter another message? Y/N");
            answer = userInput.nextLine();
        }
        while (answer.equals("Y") || (answer.equals("y")));
        System.exit(0);


    }
}
