//Nick Mallinckrodt Inleidend programmeren 2 maart 2020
package iproeindopdracht;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GeneratePassword {
    
    Scanner sc = new Scanner(System.in); //scanner zodat er een getal kan worden meegegeven door de gebruiker
    int length = sc.nextInt();
    
    char[] password = new char[length]; //een array om te vullen met een char value
    
    //deze aantal String variabelen worden gebruikt om de char Array te vullen 
    String hoofdLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String kleineLetters = "abcdefghijklmnopqrstuvwxyz";
    String specialeTekens = "!@#$";
    String nummers = "1234567890";
    //Hier worden de alle karakters in 1 variabel gezet
    String combined = hoofdLetters + kleineLetters + specialeTekens + nummers; 
    Random random = new Random();

    //method om een wachtwoord te genereren met de String variabelen
    public String generatePassword() {
        try {
            //de Array word gevuld met een random char die uit de String variabelen word gehaald 
            password[0] = kleineLetters.charAt(random.nextInt(kleineLetters.length()));
            password[1] = hoofdLetters.charAt(random.nextInt(hoofdLetters.length()));
            password[2] = specialeTekens.charAt(random.nextInt(specialeTekens.length()));
            password[3] = nummers.charAt(random.nextInt(nummers.length()));
            //er word door de Array heen gelust en er worden chars uit de Array gehaald
            for (int i = 4; i < length; i++) {
                password[i] = combined.charAt(random.nextInt(combined.length()));
            }
            //exception omdat de Array een index van 4 heeft en als length lager dan 3 word ingegeven onstaat een error
        } catch (Exception e) {

        }
        return new String(password);
    }
    
    //method om aan te geven wat voor sterkte het wachtwoord zou hebben op basis van de lengte
    public void sterkteChecker() {
        if (length >= 8) {
            System.out.println("Sterk wachtwoord");
        } else if (length >= 5) {
            System.out.println("Matig wachtwoord");
        } else if (length < 5) {
            System.out.println("Zwak wachtwoord");
        }
    }

}
