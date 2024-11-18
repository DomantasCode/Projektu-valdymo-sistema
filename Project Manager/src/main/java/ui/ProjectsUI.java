package ui;

import java.util.Scanner;

import service.ProjectsService;

public class ProjectsUI {
    public static void Display() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("----PROJEKTU MENIU----");
            System.out.println("1. Perziureti visus projektus");
            System.out.println("2. Pasirinkti projekta pagal id");
            System.out.println("3. Sukurti projekta");
            System.out.println("4. Atgal");
            int operation = scanner.nextInt();

            switch (operation) {
            case 1:
                ProjectsService.getAllProjects();
                break;
            case 2:
                int id = scanner.nextInt();

                break;
            case 3:
                DisplayCreateProject();
                break;
            case 4:

                break;
            default:
                System.out.println("You have entered wrong operation");
                return;
            }
            if (operation == 4) {
                break;
            }
        }

    }

    private void DisplayProject() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("----PROJEKTAS----");
            System.out.println("1. Perziureti uzduotis");
            System.out.println("2. Perziureti darbuotojus");
            System.out.println("3. Prideti darbuotojus");
            System.out.println("4. Sukurti uzduoti");
            System.out.println("5. Istrinti uzduoti");
            System.out.println("6. Redaguoti uzduoti");
            System.out.println("7. Priskirti uzduoti darbuotojui");
            System.out.println("8. Uzbaigti projekta");
            System.out.println("8. Atgal");
            int operation = scanner.nextInt();
            switch (operation) {
            case 1:
                ProjectsService.getAllProjects();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            default:
                System.out.println("You have entered wrong operation");
                return;
            }
            if (operation == 39) {
                break;
            }

        }
    }

    public static void DisplayCreateProject() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----KURIMAS----");
        System.out.println("1. Iveskite pavadinima");
        String pavadinimas = scanner.nextLine();
        System.out.println(pavadinimas);
        System.out.println("8. Atgal");
        int operation = scanner.nextInt();
    }
}
