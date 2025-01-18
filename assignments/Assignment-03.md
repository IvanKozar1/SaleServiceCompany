# CRM App - Assignment 03

## Description

This is third exercise for CRM App.

## Requirements

- [ ] Create Class Alarm
- create unchecked exception `AlarmExpiresException` that can have a custom message
- create new alarm for each completed service, always with status true, and current time
- description of the alarm should be in format `Obavijest za $opisUsluge , $vrijemeAlarma`
- at the end of program execution create logic that will:
  - for every active alarm (with true status) throw AlarmExpiresException and display
  message inside of it. 
  - Message should always be description of the alarm
  - exception should never be thrown and catched at the same place

## Class Model

```
Alarm{
	client => client
	description => string
	time => localDateTime
	status => boolean
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