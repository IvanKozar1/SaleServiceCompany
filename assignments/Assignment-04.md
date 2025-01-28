# CRM App - Assignment 04


## Description

For every input you must verify application will not stop execution if something goes wrong.
For example:
- if you enter string instead of number, application should not stop, instead it should handle the error and ask user to enter the value again
- if you enter date in wrong format, application should not stop, instead it should handle the error and ask user to enter the value again

## Requirements

- [] Replace all Fields with Lists- DONE
- [] Create abstract class `Person` with firstName and lastName - DONE
- [] Update Client and Employee classes to extend `Person`- DONE
- [] Adjust the print of client and employees to print all `Persons` in alphabetical order by name and next to each person print if it is client or employee 
- [] Create enum `ArticleCategory` with values: `Software`, `Hardware`, `Mechanic` - DONE
- [] Ask user to select article category after he enters article name - DONE
- [] Create enum `ServiceType` with values: `Retail`, `Wholesale`, `Service` - DONE
- [] Ask user to select service type after he selects the client for the service - DONE
- [] After execution, check if there are active alarms => you can do that by comparing current time with alarm time - DONE
- [] If there are active alarms, throw `AlarmExpiresException` with alarm description - DONE
- [] You should keep checking for active alarms every 5 seconds until all alarms are turned off -> check `Thread.sleep()` method - DONE
- [] After all alarms are turned off, display message `All alarms are turned off` 
- [] Create class `Communication` - DONE
- [] Create enum `CommunicationType` with values: `Email`, `Phone`, `SMS` - DONE
- [] Add communication as a variable to the `Company` class - CHECK
- [] For every active alarm, ask user if he wants to open communication - 
- [] If user selects no, do nothing, wait for another alarm check
- [] If user selects yes, proceed with communication (check output example)
- [] After communication is done, save it to the company communication list, set that alarm status to false, and proceed with another alarm check until there are no active alarms
- [] At the end of the program, print all communications in the company
## Class Model

```
Communication{
	client => client
	employee => employee
	communicationType => communicationType
	content => string
	time => localDateTime
    }
    
 Company{
 .....
	communications => List<Communication>
    }
```


## Example

```
Koliko zelite unijeti klijenata: ne znam
Pogresan unos, molimo Vas unesite cijeli broj. Primjer: 2 
Koliko zelite unijeti klijenata: 2

UNOS 1. KLIJENTA: 
Unesite OIB klijenta: 1
Unesite ime klijenta: Vedran
Unesite prezime klijenta: Presecki
Unesite broj telefona klijenta: 1
Unesite e-mail adresu klijenta: vp@mail.com
Unesite datum rodenja klijenta (dd.MM.yyyy.): 30.11.1992.

UNOS 2. KLIJENTA: 
Unesite OIB klijenta: 2
Unesite ime klijenta: Tea
Unesite prezime klijenta: Presecki
Unesite broj telefona klijenta: 2
Unesite e-mail adresu klijenta: tp@mail.com
Unesite datum rodenja klijenta (dd.MM.yyyy.): 19.07.1992.

Koliko zelite unijeti zaposlenika: ne znam
Pogresan unos, molimo Vas unesite cijeli broj. Primjer: 2 

Koliko zelite unijeti zaposlenika: 2

UNOS 1. ZAPOSLENIKA: 
Unesite korisnicko ime zaposlenika: vk
Unesite ime zaposlenika: Valerija
Unesite prezime zaposlenika: Kozar
Unesite sifru zaposlenika: 2

UNOS 2. ZAPOSLENIKA: 
Unesite korisnicko ime zaposlenika: ik
Unesite ime zaposlenika: Ivan
Unesite prezime zaposlenika: Kozar
Unesite sifru zaposlenika: 2

UNOS TVRTKE: 
Unesite naziv tvrtke: Svadba d.o.o.
Unesite oib tvrtke: 333

UNESITE TRI ARTIKLA: 
Unos 1. Artikla: 
Unesite naziv artikla: Cvijece
Unesite kategoriju artikla:
1. SOFTVER
2. ELEKTROTEHNIKA
3. MEHANIKA
Odabir >> 1
Unos 2. Artikla: 
Unesite naziv artikla: Tamburasi
Unesite kategoriju artikla:
1. SOFTVER
2. ELEKTROTEHNIKA
3. MEHANIKA
Odabir >> 3
Unos 3. Artikla: 
Unesite naziv artikla: Hrana
Unesite kategoriju artikla:
1. SOFTVER
2. ELEKTROTEHNIKA
3. MEHANIKA
Odabir >> 2

Klijenti i zaposlenici tvrtke: 
Prezime i ime: Presecki Vedran
Ova osoba je klijent. 
Prezime i ime: Presecki Tea
Ova osoba je klijent. 
Prezime i ime: Kozar Valerija
Ova osoba je zaposlenik
Prezime i ime: Kozar Ivan
Ova osoba je zaposlenik

Unesite broj usluga koje zelite izvrsiti: 2
UNESITE 1. USLUGU: 
ODABERITE REDNI BROJ KLIJENTA: 
1. Vedran Presecki
2. Tea Presecki
Odabir: 1
Vrsta usluge:
1. PRODAJNA
2. PRAVNA
Odabir >> 2
Opis usluge: Pravna pomoc
Cijena usluge: 5000

ODABIR ARTIKLA: 
1) 
Naziv artikla: Cvijece
Kategorija artikla: SOFTVER
2) 
Naziv artikla: Tamburasi
Kategorija artikla: MEHANIKA
3) 
Naziv artikla: Hrana
Kategorija artikla: ELEKTROTEHNIKA
Odabir: 
1

Unesite broj artikala koji zelite prodati: 10
UNESITE 2. USLUGU: 
ODABERITE REDNI BROJ KLIJENTA: 
1. Vedran Presecki
2. Tea Presecki
Odabir: 2
Vrsta usluge:
1. PRODAJNA
2. PRAVNA
Odabir >> 1
Opis usluge: Kupovina cvijeca
Cijena usluge: 10000

ODABIR ARTIKLA: 
1) 
Naziv artikla: Cvijece
Kategorija artikla: SOFTVER
2) 
Naziv artikla: Tamburasi
Kategorija artikla: MEHANIKA
3) 
Naziv artikla: Hrana
Kategorija artikla: ELEKTROTEHNIKA
Odabir: 
3

Unesite broj artikala koji zelite prodati: 10
Ukupna cijena prodanih artikala je: 150000.0 $
ALARM: Povratna informacija za obavljenu uslugu Kupovina cvijeca
Zelite li obaviti komunikaciju za ovaj alarm? DA/NE
NE
Nastavljam s provjerom alarma...
ALARM: Povratna informacija za obavljenu uslugu Kupovina cvijeca
Zelite li obaviti komunikaciju za ovaj alarm? DA/NE
DA
Unesite ime zaposlenika za komunikaciju:
Odaberite jednog od ponudjenih zaposlenika:
1. Valerija Kozar
2. Ivan Kozar
Unesite broj zaposlenika: 1
Odaberite vrstu komunikacije:
1. VERBALNA
2. PISMENA
3. ELEKTRONICKA
Unesite broj vrste komunikacije: 1
Unesite sadrzaj komunikacije:
Zakaj tolko cveca???
Komunikacija je uspjesno unesena!
Nema aktivnih alarma!
2025-01-25T01:14:22.865347 Tea Presecki Zakaj tolko cveca???