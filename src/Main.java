import Clase.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        RetailCompany company = enterCompany();

        System.out.println("ISPIS PODATAKA");
        System.out.println();

        company.printCompanyName();
        System.out.println("Klijenti i zaposlenici tvrtke:");
        company.printEmployees();
        company.printClients();

        ArticleSale[] articleSales = enterService(company);
        Alarm[] alarms = new Alarm[articleSales.length];
        for (int i = 0; i < articleSales.length; i++) {
            Alarm alarm = enterAlarm(articleSales[i].getDescription(), articleSales[i].getClient());
            alarms[i] = alarm;
        }

        for (int i = 0; i < alarms.length; i++) {
            try {
                activateAlarm(alarms[i]);
            } catch (AlarmExpiresException e) {
                System.out.println("Izuzetak: " + e.getMessage());
            }
        }
        scanner.close();
    }

    private static void activateAlarm(Alarm alarm) {
        if (alarm.isActive()) {
            throw new AlarmExpiresException(alarm.getDescription());
        }
        System.out.println("Alarm nije aktiviran.");
    }

    private static RetailCompany enterCompany() {
        System.out.println("KREIRANJE TVRTKE");
        System.out.print("Unesi ime Tvrtke: ");
        String companyName = scanner.nextLine();

        //do {
        System.out.print("Unesi OIB Tvrtke: ");
        String companyId = scanner.nextLine();
        //    if (!companyId.matches("\\d{11}")){
        //       System.out.println("Nevezaci OIB! Unesi ponovno (OIB mora sadrzavati 11 znamenki)");
        //     }
        // } while (!companyId.matches("\\d{11}"));

        System.out.print("Koliko zelite unijeti zaposelnika: ");
        int numberOfEmployees = scanner.nextInt();
        Employee[] employees = new Employee[numberOfEmployees];
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Unos " + (1 + i) + ". " + "ZAPOSLENIKA:");
            Employee employee = enterEmployees();
            employees[i] = employee;
        }
        System.out.println();

        System.out.print("Koliko zelite unijeti klijenata: ");
        int numberOfClients = scanner.nextInt();
        Client[] clients = new Client[numberOfClients];
        for (int i = 0; i < numberOfClients; i++) {
            System.out.println("Unos " + (1 + i) + ". " + "KLIJENTA:");
            Client client = enterClients();
            clients[i] = client;
        }
        System.out.println();

        System.out.println("UNESITE TRI ARTIKLA: ");
        Article[] articles = new Article[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Unos " + (1 + i) + ". " + "artikla: ");
            Article article = enterArticle();
            articles[i] = article;
        }

        RetailCompany company = new RetailCompany(articles, companyName, companyId);
        company.setClients(clients);
        company.setEmployees(employees);
        return company;
    }

    private static Employee enterEmployees() {
        System.out.print("Korisnicko ime zaposlenika: ");
        String username = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Ime zaposlenika: ");
        String firstName = scanner.nextLine();

        System.out.print("Prezime zaposlenika: ");
        String lastName = scanner.nextLine();

        System.out.print("Sifra zaposlenika: ");
        String password = scanner.nextLine();

        Employee employee = new Employee(username, firstName, lastName, password);
        return employee;
    }

    private static Client enterClients() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy.");

        //   do {
        System.out.print("OIB klijenta: ");
        String id = scanner.nextLine();
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
        return client;
    }

    private static Article enterArticle() {
        System.out.print("Unesite naziv artikla: ");
        String name = scanner.nextLine();
        System.out.print("Unesite kategoriju artikla: ");
        String category = scanner.nextLine();

        Article article = new Article(name, category);
        return article;
    }

    private static ArticleSale[] enterService(RetailCompany company) {
        System.out.print("Unesite broj usluga koje zelite izvrsiti: ");
        int numOfServices = scanner.nextInt();
        BigDecimal totalPrice = BigDecimal.ZERO;

        Date serviceDate = new Date();

        ArticleSale[] articleSale = new ArticleSale[numOfServices];
        for (int i = 0; i < numOfServices; i++) {
            System.out.println("UNESITE " + (i + 1) + ". USLUGU: ");
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


            ArticleSale sale = new ArticleSale(clientChoose, serviceType, serviceDescription, serviceDate, servicePrice, servicePrice);
            articleSale[i] = sale;

            BigDecimal singleServicePrice = sale.sale(numOfSellingArticles);
            totalPrice = totalPrice.add(singleServicePrice);

        }
        System.out.println("Ukupna cijena prodanih artikala je: " + totalPrice + " $");
        return articleSale;
    }

    private static Alarm enterAlarm(String serviceDescription, Client client) {
        LocalDate alarmDate = LocalDate.now();

        String alarmDescription = "Obavijest za " + serviceDescription + ", " + alarmDate;

        Alarm alarm = new Alarm(client, alarmDescription, alarmDate, true);
        return  alarm;
    }
}
