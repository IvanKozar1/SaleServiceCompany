# CRM App - Assignment 01

## Description

This is second exercise for CRM App.

## Requirements

- [ ] Create Class Article
- [ ] Create Class Retail Company that extends Company class
- [ ] Create Interface Merchandise that has one method called "sale", method should accept one parametar of type Integer
  which represents the number of the articles and returns BigDecimal of this parametar
- [ ] Create class "Service"
- [ ] Create class "ArticleSale" that extends "Service" class and implements "Merchandise" interface, method "sale"
  should return
  BigDecimal of the price of the article multiplied by the number of the articles and it should also set "completed" to
  true and "charged" to true
- [ ] Create input and output as in example:
  - input of client, employees and comapny is the same as in the first exercise

## Class Model

```
Article{
    name: string
    category: string
    }
    
RetailCompany{
    articles: Article[]
    name: string -> taken from Company
    oib: string -> taken from Company
    }
Service{
    client: Client,
    type: string,
    description: string,
    date: Date,
    price: BigDecimal,
    completed: boolean,
    charged: boolean
    }
ArticleSale{
    client: Client, -> taken from Service
    type: string, -> taken from Service
    description: string, -> taken from Service
    date: Date, -> taken from Service
    price: BigDecimal, -> taken from Service
    completed: boolean, -> taken from Service
    charged: boolean, -> taken from Service
    article: Article
    }
```

## Example

```
Koliko zelite unijeti klijenata: 2

UNOS 1. KLIJENTA: 
Unesite OIB klijenta: 123
Unesite ime klijenta: John
Unesite prezime klijenta: Doe
Unesite broj telefona klijenta: 123
Unesite e-mail adresu klijenta: john.doe@avence.hr
Unesite datum rodenja klijenta (dd.MM.yyyy.): 11.11.1992.

UNOS 2. KLIJENTA: 
Unesite OIB klijenta: 321
Unesite ime klijenta: Tara
Unesite prezime klijenta: Young
Unesite broj telefona klijenta: 321
Unesite e-mail adresu klijenta: tara.young@avence.hr
Unesite datum rodenja klijenta (dd.MM.yyyy.): 11.11.1992.

Koliko zelite unijeti zaposlenika: 2

UNOS 1. ZAPOSLENIKA: 
Unesite korisnicko ime zaposlenika: Miro
Unesite ime zaposlenika: Miroslav
Unesite prezime zaposlenika: Miric
Unesite sifru zaposlenika: 1

UNOS 2. ZAPOSLENIKA: 
Unesite korisnicko ime zaposlenika: u.user
Unesite ime zaposlenika: Unique
Unesite prezime zaposlenika: User
Unesite sifru zaposlenika: 2

UNOS TVRTKE: 
Unesite naziv tvrtke: Avence d.o.o.
Unesite oib tvrtke: 332211

UNESITE TRI ARTIKLA: 
Unos 1. Artikla: 
Unesite naziv artikla: USB 3.0
Unesite kategoriju artikla: Storage
Unos 2. Artikla: 
Unesite naziv artikla: Ryzen 5
Unesite kategoriju artikla: CPU
Unos 3. Artikla: 
Unesite naziv artikla: RTX 6000xt
Unesite kategoriju artikla: GPU

Klijenti i zaposlenici tvrtke: 
Prezime i ime: Doe John
Ova osoba je klijent. 
Prezime i ime: Miric Miroslav
Ova osoba je zaposlenik
Prezime i ime: User Unique
Ova osoba je zaposlenik
Prezime i ime: Young Tara
Ova osoba je klijent. 

Unesite broj usluga koje zelite izvrsiti: 2
UNESITE 1. USLUGU: 
ODABERITE REDNI BROJ KLIJENTA: 
1) John Doe
2) Tara Young
Odabir: 1
Vrsta usluge: Prodaja
Opis usluge: Prodaja
Cijena usluge: 10
ODABIR ARTIKLA: 
1) 
Naziv artikla: USB 3.0
Kategorija artikla: Storage
2) 
Naziv artikla: Ryzen 5
Kategorija artikla: CPU
3) 
Naziv artikla: RTX 6000xt
Kategorija artikla: GPU
Odabir: 
1

Unesite broj artikala koji zelite prodati: 10
UNESITE 2. USLUGU: 
ODABERITE REDNI BROJ KLIJENTA: 
1) John Doe
2) Tara Young
Odabir: 2
Vrsta usluge: Prodaja
Opis usluge: Prodaja
Cijena usluge: 50
ODABIR ARTIKLA: 
1) 
Naziv artikla: USB 3.0
Kategorija artikla: Storage
2) 
Naziv artikla: Ryzen 5
Kategorija artikla: CPU
3) 
Naziv artikla: RTX 6000xt
Kategorija artikla: GPU
Odabir: 
2

Unesite broj artikala koji zelite prodati: 2
Ukupna cijena prodanih artikala je: 200.0 $
```