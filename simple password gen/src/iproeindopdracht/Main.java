//Nick Mallinckrodt Inleidend programmeren 2 maart 2020
package iproeindopdracht;

public class Main {

    public static void main(String[] args) {
        System.out.println("Voer een getal in");
        System.out.println("Lengte wachtwoord: ");
        GeneratePassword password = new GeneratePassword();
        System.out.println(password.generatePassword());
        password.sterkteChecker();

    }

}
