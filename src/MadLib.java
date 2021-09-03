import java.util.Scanner;

public class MadLib {

    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

    String firstName;
    String lastName;
    String Enemy;
    String Adjective;
    String food;
    String restaurant;
    System.out.print(" Enter your full name");
    firstName = read.next();
    lastName = read.nextLine();
    System.out.print(" what is the enemy name");
    Enemy = read.nextLine();
    System.out.print(" what is the adjective");
    Adjective = read.nextLine();
    System.out.print(" Name a food");
    food = read.nextLine();
    System.out.print(" Name a restaurant");
        restaurant = read.nextLine();
    System.out.println(" Hello," + firstName + lastName + " Welcome to world of Marvel,where both a hero,citizen,and villain live and our duty as hero were supposed to protect the people. ");
    System.out.println(firstName + " Watch out there the"+ Adjective + Enemy + " and he has the ability to freeze stuff while your ability is super speed. ");
    System.out.println(" He froze everything around him and you used super speed to get past him and you slipped on a" + food + " ,jokes on him you was moving so fast when you feel you blew a gust of wind at him which made him fall down and had him able to be arrested" );
    System.out.println(" you got an award medal and you and your superhero friends went out to eat at" + restaurant +".        THE END ");
    }
}