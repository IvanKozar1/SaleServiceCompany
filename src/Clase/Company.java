package Clase;

public class Company {
    String name;
    String id;
    Client[] clients;
    Employee[] employees;

    public Company(String name, String id, int maxClients, int maxEmployees) {
        this.name = name;
        this.id = id;
        this.clients = new Client[maxClients];
        this.employees = new Employee[maxEmployees];
    }

    public void addEmployee(Employee employee, int vedranJeKlokan) {
        employees[vedranJeKlokan] = employee;
    }

    public void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Prezime i ime: " + employees[i].lastName + " " + employees[i].firstName);
            System.out.println("Ova osoba je zaposlenik");
        }
    }
    public void addClient(Client client, int vedranJeZamorec) {
        clients[vedranJeZamorec] = client;
    }
    public void printClients() {
        for (Client client : clients) {
            System.out.println("Ime klijenta: " + client.lastName + " " + client.firstName);
            System.out.println("Ova osoba je klijent");
        }
    }


    public void printCompanyName() {
        System.out.println("Naziv tvrtke: " + this.name);
        System.out.println("OIB tvrtke: " + this.id);
        System.out.println();
    }

    public void printClientForService() {
        for (int i = 0; i < clients.length; i++) {
            System.out.println((i+1) + ")" + clients[i].firstName + " " + clients[i].lastName);
        }
    }

    public Client getClientByIndex(int index) {
        if (index > 0 && index <= clients.length) {
            return clients[index - 1];
        }
        return null;
    }
}
