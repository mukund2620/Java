import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int studentAge = 20;
            double studentGPA = 9.5;
            String studentFirstName = "Mukundraj";
            String studentLastName = "Irkal";

            System.out.println(studentFirstName + " "+  studentLastName + " " + "Has GPS" + " " + studentGPA);
            System.out.println("What to update GPS?");
            Scanner input = new Scanner(System.in);
            studentGPA =  input.nextDouble();
            System.out.println(studentFirstName + " " + studentLastName + " " + "New GPA is" + " " + studentGPA);

    }
}
