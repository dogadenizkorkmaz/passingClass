
import java.util.Scanner;

public class PassingClass {

    public static void main(String[] args) {

        double math, physics, eng, chem, music, result;

//define scanner
        Scanner doa = new Scanner(System.in);
//get value from user
        System.out.print("Math grade: ");
        math = doa.nextDouble();

        if ((math >= 0) && (math<=100)) {
            System.out.print("Physics grade: ");
            physics = doa.nextDouble();
        }
//The relevant value continues within the defined range. if not it stops
        else {
            System.out.print("The grade you enter must be in the range of 0-100");
            return;
        }
        if ((physics >= 0) && (physics<=100))  {
            System.out.print("Eng grade: ");
            eng = doa.nextDouble();
        }
        else {
            System.out.print("The grade you enter must be in the range of 0-100");
            return;
        }
        if ((eng >= 0) && (eng<=100)) {
            System.out.print("Chem grade: ");
            chem = doa.nextInt();
        }
        else {
            System.out.print("The grade you enter must be in the range of 0-100");
            return;
        }
        if ((chem >= 0) && (chem<=100)) {
            System.out.print("Muzik notunuzu giriniz!: ");
            music = doa.nextInt();
        }
        else {
            System.out.print("The grade you enter must be in the range of 0-100");
            return;
        }
        if ((music >= 0) && (music<=100)) {
// Calculating
            result=(math + physics + eng + chem + music)/5;

            if(result>=55){

                System.out.println("Congratulations you passed the class");
            }
            else{

                System.out.print("sorry you failed the class.");
            }

            System.out.println("Your GPA: " + result);
        }
        else {
            System.out.print("The grade you enter must be in the range of 0-100");

        }
    }
}
