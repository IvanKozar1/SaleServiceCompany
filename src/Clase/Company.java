package Clase;

public class Company {
    String name;
    String id;
    Client[] clients;
    Employee[] employees;

    public Company(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    public void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Prezime i ime: " + employees[i].lastName + " " + employees[i].firstName);
            System.out.println("Ova osoba je zaposlenik");
        }
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
}
