# Vorbereitung Zwischenprüfung

### Aufgabe 1 - Code lesen (1.5 min)

Markiere folgende Blöcke im Code:

* Klassenkopf
* Klassenkörper
* Methodenkopf
* Methodenkörper

```
public class StockHandler {
	public void execute() {
		System.out.println("Hallo")
	}
}
```

### Aufgabe 2 - Code lesen (1.5 min)

Markiere folgende Blöcke im Code:

* Klassenkopf
* Klassenkörper
* Methodenkopf
* Methodenkörper

```
public class StockHandler {
	public void execute() {
		System.out.println("Hallo")
	}
}
```

### Aufgabe 3 - Fehlersuche (5 min)

Finde die Fehler im Code:

```java
public class Student {
   private string name;
   private int alter
   public void setAlter(int alter) {
	alter = this.alter;
   }
   public void getAlter() {
	return alter;
   }
   public void setName(String s) {
	this.name = name;
   }
   public String getName() {
	return name;
   }
}

public class main {
    public static void main(String args)
   {
	Student st1;
	Student st2;
	Student st3 = new Student("Max", 22);
		st1 = new Student();
	st1.setName("Hans");
	st1.setAlter(23);
	st2.setName("Peter");

	if (st1.getAlter = 23 ) {
	   System.out.println("Hans ist 23!!")
	}
}
```

### Aufgabe 4 - Theorie (5 min)

1. Was ist ein Objekt? Nenne dazu die 3 wichtigen Merkmale eines Objekts.
2. Was ist Vererbung?
3. Unterschied Klasse – Objekt?


### Aufgabe 5 - Programmieren (15 min)

1. Schreibe eine Klasse Student, die Informationen wie Name und Matrikelnummer speichert, sowie die zugehörigen Getter und Setter beinhaltet. Erzeuge einen Studenten Max (Matrikelnummer 1) in der Main-Klasse über den Standardkonstruktor und setze die Attribute mithilfe der Setter. Lies die Werte aus der Instanz wieder aus und gib sie auf dem Bildschirm aus.
2. Schreibe einen (benutzerdefinierten) Konstruktor für die Klasse Student, der die Attribute des erzeugten Objekts mit Werten füllt. Erzeuge einen Studenten Paul (Matrikelnummer 2) in der Mainklasse mithilfe dem soeben erstellten benutzerdefinierten Konstruktor. Lies die Werte aus der Instanz wieder aus und gib sie auf dem Bildschirm aus. 
3. Lege ein Array studenten mit 10 Studentenobjekten an, die die Matrikelnummern 1-10 haben und gib alle auf der Konsole aus. Schreibe eine Methode in der Klasse Main, welche den Inhalt des übergebenen Arrays auf der Konsole ausgibt.
4. Füge die Studenten Paul und Max ins Array ein und gib die Werte des Arrays aus.
5. Lösche das Studentenobjekt mit der Matrikelnummer 3 aus dem Array studenten und gib die Werte des Arrays aus.

### Aufgabe 6 - Verständnis Referenzierung (10 min)

Schauen Sie sich den Code an und zeichnen Sie anschliessend den Zustatand im Speicher für das Szenario 1.
Ergänzen Sie anschliessend ihre Zeichnung für Szenario 2-4.

```java
public class IntKlasse {
	public int a;
	public IntKlasse(int a) {
		this.a = a;
	}
}
public class RefIntKlasse {
	public IntKlasse x;
	public double y;
	public RefIntKlasse(int u, int v) {
		x = new IntKlasse(u);
		y = v;
	}
}
public class KlassenTest {
  public RefIntKlasse q;
	public static void copy1(RefIntKlasse f, RefIntKlasse g) {
		g.x.a = f.x.a;
		g.y = f.y;
	}
	public static void copy2(RefIntKlasse f, RefIntKlasse g) {
		g.x = f.x;
		g.y = f.y;
	}
  public static void copy3(RefIntKlasse f, RefIntKlasse g){
    g = f
  }
}
public static void main(String args[]) {
	RefIntKlasse p = new RefIntKlasse(5, 7);
	RefIntKlasse q = new RefIntKlasse(1, 2);
  // Ergibt das Ausgangsbild
  // HIER FOLGT NUN EINE KOPIERAKTION: ...
  //***
}
```

**Szenario 1**

Welches Bild würde sich unmittelbar vor //*** ergeben?

**Szenario 2**

Welches Bild würde sich ergeben, wenn unmittelbar vor //***

    copy1(p,q);

stehen würde? Zeichnen Sie den Zustand inklusive der Referenzen und Werte nach der Kopieraktion.

** Szenario 3**

Welches Bild würde sich ergeben, wenn unmittelbar vor //***

    copy2(p,q);

stehen würde? Zeichnen Sie die Referenzen und Werte nach der Kopieraktion.

**Szenario 4**

Welches Bild würde sich ergeben, wenn unmittelbar vor //***

    copy3(q,p);

stehen würde? Zeichnen Sie die Referenzen und Werte nach der Kopieraktion.
