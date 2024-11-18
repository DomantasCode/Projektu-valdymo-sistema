import java.util.Scanner;

import ui.ProjectsUI;

public class ProjectManager {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("----PROJEKTU VALDYMO SISTEMA----!");
            System.out.println("Pasirinkite veiksma:");

            System.out.println("1. PROJEKTAI");
            System.out.println("2. DARBUOTOJAI");
            System.out.println("3. EXIT");
            int operation = scanner.nextInt();

            switch (operation) {
            case 1:
                ProjectsUI.Display();
                break;
            case 2:
                break;
            default:
                System.out.println("You have entered wrong operation");
                return;
            }
            if (operation == 3) {
                break;
            }
        }

    }
}
