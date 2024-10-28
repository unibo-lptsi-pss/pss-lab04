# Principio di incapsulamento

**NOTA**: Da questo laboratorio in poi viene richiesto di effettuare un commit ogni volta che lo si trova opportuno.

## Fase 1

* Analizzare la classe `Student`
* È una versione modificata della classe vista negli scorsi laboratori.
    - I campi sono ora privati: un client della classe non sarà mai influenzato dalla modifica di meri aspetti implementativi
    - Sono stati introdotti dei selettori per ottenere le proprietà dell'oggetto: `getName()`, `getSurname()`, ...
* Si modifichino similmente le classi `Calculator` e `Smartphone`:
    - Si rendano privati tutti i campi
    - Si introducano selettori opportuni per recuperare o modificare le proprietà di interesse
