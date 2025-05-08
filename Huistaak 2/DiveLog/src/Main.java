import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Certification myCertification = Certification.OWD;
        System.out.println("-- Duik Log --");
        System.out.println("Certificaat:" + myCertification);

        // stap 1: invoeren duiken
        final ArrayList<Dive> diveList = inputDives(myCertification);

        // stap 2: toon de lijst
        displayList(diveList);
    }

    public static ArrayList<Dive> inputDives(Certification myCertification){
        ArrayList<Dive> diveList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String cont;
        do {
            try {
                System.out.println("--Invoeren gegevens duik--");

                System.out.print("Geef datum duik (dd/mm/yyyy): ");
                String dateString = sc.nextLine();

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate diveDate = LocalDate.parse(dateString, formatter);

                System.out.print("Geef locatie duik (bvb Blue Hole): ");
                String location = sc.nextLine();

                System.out.print("Geef duur duik in minuten (geheel getal): ");
                String durationString = sc.nextLine();
                int duration = Integer.parseInt(durationString);

                System.out.print("Geef diepte duik in meter (geheel getal): ");
                String depthString = sc.nextLine();
                int depth = Integer.parseInt(depthString);

                Dive dive = new Dive(diveDate, location, depth, duration, myCertification);
                if (dive.isValid()) {
                    System.out.println("Duik is geldig toegevoegd.");
                }
                else{
                    System.out.println("Duik is ongeldig, maar toegevoegd.");
                }
                diveList.add(dive);

            } catch (DateTimeParseException e) {
                System.out.println("Ongeldig formaat. Gebruik dd/MM/yyyy.");
            }
            catch (NumberFormatException e) {
                System.out.println("Gelieve een geheel getal in te voeren.");
            }

            System.out.print("Wil je verder doen (j/n)? ");
            cont = sc.nextLine();

        } while (cont.equals("j"));

        return diveList;
    }

    public static void displayList(ArrayList<Dive> diveList){
        for (Dive d : diveList) {
            System.out.println(d);
        }
    }

}