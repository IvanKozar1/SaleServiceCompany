import Clase.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//Company

//Client

//Employee

//Article

//RetailCompany

//Merchandise

//Service

//ArticleSale

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String companyId;
        int numOfArticles = 3;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy.");

        System.out.println("KREIRANJE TVRTKE");
        System.out.print("Unesi ime Tvrtke: ");
        String companyName = scanner.nextLine();

        //do {
            System.out.print("Unesi OIB Tvrtke: ");
            companyId = scanner.nextLine();
        //    if (!companyId.matches("\\d{11}")){
        //       System.out.println("Nevezaci OIB! Unesi ponovno (OIB mora sadrzavati 11 znamenki)");
        //     }
        // } while (!companyId.matches("\\d{11}"));


        System.out.print("Koliko zelite unijeti zaposelnika: ");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        System.out.print("Koliko zelite unijeti klijenata: ");
        int numberOfClients = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        RetailCompany company = new RetailCompany(companyName, companyId, numberOfClients, numberOfEmployees, numOfArticles);



        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Unos " + (1 + i) + ". " + "ZAPOSLENIKA:");

            System.out.print("Korisnicko ime zaposlenika: ");
            String username = scanner.nextLine();

            System.out.print("Ime zaposlenika: ");
            String firstName = scanner.nextLine();

            System.out.print("Prezime zaposlenika: ");
            String lastName = scanner.nextLine();

            System.out.print("Sifra zaposlenika: ");
            String password = scanner.nextLine();

            Employee employee = new Employee(username, firstName, lastName, password);
            company.addEmployee(employee, i);
        }

        System.out.println();

        System.out.println();

        for (int i = 0; i < numberOfClients; i++) {
            System.out.println("Unos " + (1 + i) + ". " + "KLIJENTA:");
            String id;

            //   do {
                System.out.print("OIB klijenta: ");
                id = scanner.nextLine();
            //      if (!id.matches("\\d{11}")){
            //          System.out.println("Nevezaci OIB! Unesi ponovno (OIB mora sadrzavati 11 znamenki)");
            //      }
            //  } while (!id.matches("\\d{11}"));

            System.out.print("Ime klijenta: ");
            String firstName = scanner.nextLine();

            System.out.print("Prezime klijenta: ");
            String lastName = scanner.nextLine();

            System.out.print("Kontakt broj klijenta: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("E-mail klijenta: ");
            String email = scanner.nextLine();

            System.out.print("Datum rođenja (dd.MM.yyyy): ");
            String birthDateInput = scanner.nextLine();
            LocalDate birthDate = LocalDate.parse(birthDateInput, formatter);

            Client client = new Client(id, firstName, lastName, phoneNumber, email, birthDate);
            company.addClient(client, i);

        }

        System.out.println("UNESITE TRI ARTIKLA: ");


        for(int i = 0; i < 3; i++) {
            System.out.println("Unos " + (1+i) + ". " + "artikla: ");
            System.out.print("Unesite naziv artikla: ");
            String name = scanner.nextLine();
            System.out.print("Unesite kategoriju artikla: ");
            String category = scanner.nextLine();

            Article article = new Article(name, category);
            company.addArticle(article, i);
        }


        System.out.println();
        System.out.println("ISPIS PODATAKA");
        System.out.println();

        company.printCompanyName();
        System.out.println("Klijenti i zaposlenici tvrtke:");
        company.printEmployees();
        company.printClients();

        System.out.print("Unesite broj usluga koje zelite izvrsiti: ");
        int numOfServices = scanner.nextInt();

/// ///////////////////////////////////////////////////////////////////////////////////////////////
        Date serviceDate = new Date();
        LocalDate alarmDate = LocalDate.now();
/// //////////////////////////////////////////////////////////////////////////////////////////
        int j = 0;
        for(int i = 0; i < numOfServices; i++) {
            System.out.println("UNESITE " + (i+1) + ". USLUGU: ");
            System.out.println("ODABERITE REDNI BROJ KLIJENTA: ");
            company.printClientForService();
            System.out.print("Odabir: ");
            int clientIndex = scanner.nextInt();

            Client clientChoose = company.getClientByIndex(clientIndex);
            if (clientChoose == null) {
                System.out.println("Pogrešan unos! Pokušajte ponovno.");
                continue;
            }

            System.out.print("Vrsta usluge: ");
            scanner.nextLine();
            String serviceType = scanner.nextLine();
            System.out.print("Opis usluge: ");
            String serviceDescription = scanner.nextLine();
            System.out.print("Cijena usluge: ");
            BigDecimal servicePrice = scanner.nextBigDecimal();
            System.out.println("ODABIR ARTIKLA:");
            company.printArticle();
            System.out.print("Odabir: ");
            int articleChoose = scanner.nextInt();

            System.out.print("Unesite broj artikala koji zelite prodati: ");
            int numOfSellingArticles = scanner.nextInt();

            ArticleSale articleSale = new ArticleSale(clientChoose, serviceType, serviceDescription, serviceDate, servicePrice, servicePrice);
            BigDecimal totalSingleServicePrice = articleSale.sale(numOfSellingArticles);

            BigDecimal totalPrice = BigDecimal.ZERO;
            totalPrice = totalPrice.add(totalSingleServicePrice);

            String alarmDescription = "Obavijest za " + serviceDescription + ", " + alarmDate;

            SaveAlarm saveAlarm = new SaveAlarm(articleSale.getClient(),alarmDescription, alarmDate, true, numOfServices);
            saveAlarm.addAlarm(saveAlarm, i);

            j++;
            if (j == numOfServices){
                System.out.println("Ukupna cijena prodanih artikala je: " + totalPrice + " $");
                System.out.println();
                saveAlarm.printAlarms();
            }
        }


        System.out.println();

        scanner.close();
    }
}