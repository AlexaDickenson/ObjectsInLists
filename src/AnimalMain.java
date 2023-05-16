import java.util.ArrayList;
import java.util.Scanner;
public class AnimalMain {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();
        }
        System.out.printIn("Animal Menu");
        System.out.printIn("Entering nothing will stop the loop");

        while (true){
            System.out.printLn("Please enter a name");
            String name= scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            System.out.println("Is it a dog? yes/no");
            String answer= scanner.nextLine(). toLowerCase();
            boolean isDog = answer.equals("yes");

            Animal myAnimals= new Animal(name, isDog);
            animals.add(myAnimals);
        }
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }