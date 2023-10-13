# Principio di incapsulamento

**NOTA**: Da questo laboratorio in poi viene richiesto di effettuare un commit ogni volta che lo si trova opportuno.

## Fase 1

* Analizzare la classe `oop.lab03.encapsulation.Student`
* È una versione modificata della classe vista negli scorsi laboratori.
    - I campi sono ora privati: un client della classe non sarà mai influenzato dalla modifica di meri aspetti implementativi
    - Sono stati introdotti dei selettori per ottenere le proprietà dell'oggetto: `getName()`, `getSurname()`, ...
* Si modifichino similmente le classi `Calculator` e `Smartphone` contenute nel package `oop.lab03.encapsulation`:
    - Si rendano privati tutti i campi
    - Si introducano selettori opportuni per recuperare o modificare le proprietà di interesse

## Fase 2

* Creare autonomamente la classe `SmartLamp`, rispettando i principi di incapsulamento.
* La modellazione di `SmartLamp` può essere fatta a piacere, ma gli oggetti di tipo `SmartLamp` devono fornire obbligatoriamente i seguenti servizi. Data una `SmartLamp` infatti, deve poter essere possibile :
    - accenderla e spegnerla.
    - impostare l'intensità di luce. Esitono solo tre livelli possibili di intensità.
    - impostare il colore della luce. È possibile scegliere solo tra i colori bianco, rosso, blu e verde.
Inoltre in un qualsiasi momento deve essere possibile recuperare ogni possibile informazione sullo stato della `SmartLamp` (es: il colore attualmente impostato).

## Fase 3

* La classe `TestAllClasses` contiene il metodo `main`.
    * Configurare Gradle per fare in modo che quest'ultima classe venga eseguita quando viene lanciato il task `run`.
* All'interno del metodo `main`, testare il funzionamento di tutti i selettori creati nella fase 1.
* Creare una nuova `SmartLamp` e fare in ordine le seguenti operazioni:
    - accenderla;
    - verificare che sia accesa;
    - verificare l'intensità;
    - cambiare l'intensità a piacere;
    - verificare nuovamente l'intensità;
    - verificare il colore;
    - impostare il colore a verde;
    - verificare nuovamente il colore;
    - spegnerla;
    - verificare che sia spenta.
