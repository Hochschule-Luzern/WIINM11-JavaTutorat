# Generics

Buch Kapitel 11

# Ziele

Sie können...
* Enumeratoren erstellen und anwenden
* Generische Datentypen anwenden

Sie verstehen wie...
* Generische Datentypen deklariert werden und
* die Vererbung damit angwendet wird.

*Anmerkungen*

Halte wir für unrelevant:
* Generizität in alten Java Versionen

Halte ich für sehr wichtig:
* Generisches Programmieren im Allgemeinen. Wer generische programmieren kann spart viel Zeit und Aufwand und erhält zugleich mehr Flexibiltät bei weniger Code (Erfahrung Projekt 2. Semester).

Generische Datentypen sind nichts anderes als Platzhalter. Sie zu verstehen ist einfach, sie korrekt anzuwenden ist umso schwieriger.

# Praxisbeispiel

* [Issue Manager Projekt 2. Semester 2015](https://github.com/janikvonrotz/issue-manager)

# Theorie

Was wir noch vermisst haben:

**List der Platzhalter**

* E - Element (used extensively by the Java Collections Framework)
* K - Key
* N - Number
* T - Type
* V - Value
* S,U,V etc. - 2nd, 3rd, 4th types

**Klasse Class**

    Class<String> clazz = String.class;

Variable die Klassendeklarierung enthält.

# Aufgaben

Enumeratoren
* 11.1 S. 327

Generische Datentypen
* 11.4 S. 342 - Guter Einstieg
* 11.6 S. 343 -
