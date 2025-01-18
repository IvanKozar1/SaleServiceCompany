# CRM App - Assignment 01

## Description

This is first exercise for CRM App.
The goal is to create a simple console application that will allow user to add clients, employees and companies and
after see the output.

## Requirements

- [ ] User should be able to add new clients
- [ ] User should be able to add new employees
- [ ] User should be able to add new companies
- [ ] User should be able to assign clients to a company
- [ ] User should be able to assign employees to a company
- [ ] User should be asked how many clients or employees he wants to add
- [ ] After input is done, application should print out everything that was added in a nice and readable format

## Class Model

```
Client
- oib: str
- first_name: str
- last_name: str
- phone_number: str
- email: str
- birth_date: datetime

Employee
- username: str
- first_name: str
- last_name: str
- password: str

Company
- name: str
- oib: str
- clients: Array[Client]
- employees: Array[Employee]
```

## Example

```
UNOS 1. KLIJENTA: 
Unesite OIB klijenta: 38383838383
Unesite ime klijenta: Marco
Unesite prezime klijenta: Polo
Unesite broj telefona klijenta: 0111929292
Unesite e-mail adresu klijenta: marco.polo@avence.hr
Unesite datum rodenja klijenta (dd.MM.yyyy.): 01.01.1992.

UNOS 2. KLIJENTA: 
Unesite OIB klijenta: 3838383838
Unesite ime klijenta: Tara
Unesite prezime klijenta: Young
Unesite broj telefona klijenta: 0101001000
Unesite e-mail adresu klijenta: tara.young@avence.hr
Unesite datum rodenja klijenta (dd.MM.yyyy.): 02.02.1992.

Koliko zelite unijeti zaposlenika: 2

UNOS 1. ZAPOSLENIKA: 
Unesite korisnicko ime zaposlenika: r.sigul
Unesite ime zaposlenika: Robert
Unesite prezime zaposlenika: Sigul
Unesite sifru zaposlenika: 001

UNOS 2. ZAPOSLENIKA: 
Unesite korisnicko ime zaposlenika: h.herman
Unesite ime zaposlenika: Hector
Unesite prezime zaposlenika: Herman
Unesite sifru zaposlenika: 002
Unesite naziv tvrtke: Avence
Unesite oib tvrtke: 010334242344

UNOS TVRTKE:

Unesite ime tvrtke: Avence d.o.o.
Unesite OIB tvrtke: 010334242344

ISPIS PODATAKA: 

Naziv tvrtke: Avence
OIB tvrtke: 010334242344

1. KLIJENT : 
OIB klijenta: 38383838383
Ime klijenta : Marco
Prezime klijenta : Polo
Broj telefona klijenta : 0111929292
E-mail adresa klijenta: marco.polo@avence.hr
Datum rodenja klijenta: 1992-01-01

2. KLIJENT : 
OIB klijenta: 3838383838
Ime klijenta : Tara
Prezime klijenta : Young
Broj telefona klijenta : 0101001000
E-mail adresa klijenta: tara.young@avence.hr
Datum rodenja klijenta: 1992-02-02

1. ZAPOSLENIK: 
Korisnicko ime zaposlenika: r.sigul
Ime zaposlenika: Robert
Prezime zaposlenika: Sigul
Sifra zaposlenika: 001

2. ZAPOSLENIK: 
Korisnicko ime zaposlenika: h.herman
Ime zaposlenika: Hector
Prezime zaposlenika: Herman
Sifra zaposlenika: 002
```
