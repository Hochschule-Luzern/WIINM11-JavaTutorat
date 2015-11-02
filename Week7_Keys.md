# Lösungen Vorbereitung Zwischenprüfungen

### Aufgabe 1

![](/images/Aufgabe1_key.png)

### Aufgabe 2

![](/images/Aufgabe2_key.png)

### Aufgabe 3

![](/images/Aufgabe3_key.png)

### Aufgabe 4

1. Definition Mathis: Ein Objekt ist ein individuelles Exemplar von einem Gegenstand, einer Person oder von einem Begriff der realen oder der Vorstellungswelt und wird durch sein Zustand, sein Verhalten und seine Identität beschrieben.
2. Vererbung ist die Weitergabe von Zuständen (Daten) und Verhalten (Methoden) von einer Klasse an eine hierarchisch untergeordnete Klasse.
3. Klassen existieren nur als Software-Code:
Definiert durch den Klassen-Code.
Beschreiben die Eigenschaften (Zustand, Verhalten, Identität) der assoziierten Instanzen.
Objekte existieren nur während der Software-Ausführung:
Im Software-Code sind sie nur durch Namen, die die Laufzeit-Objekte bezeichnen, sichtbar.

### Aufgabe 5

**Main**

```java
public class Main {

	public static void main(String[] args) {

		//Aufgabe 1

		Student max = new Student();
		max.setName("Max");
		max.setMatnr(1);
		System.out.println("Studentenname: " + max.getName() + ", Matrikelnummer: " + max.getMatnr() + ".");

		//Aufgabe 2

		Student paul = new Student("Paul", 2);
		System.out.println("Studentename: " + paul.getName() + ", Matrikelnummer: " + paul.getMatnr() + "." + "\n");

		//Aufgabe 3

		Student[] studenten = new Student[10];
		//Schritt 1: Erzeugen...
		for (int i = 0; i < 10; i++) {
			studenten[i] = new Student("Student"+(i+1), i+1);
		}
		//Konsolenausgabe
		printArray(studenten);

		//Aufgabe 4
		//Max und Paul dem Studenten-Array hinzufügen
		studenten [0] = max;
		studenten [1] = paul;
		//Konsolenausgabe
		printArray(studenten);

		//Aufgabe 5: Student mit Matrikelnummer 3 aus Array entfernen.
		int matnr = 3;
		for (int i = 0; i < studenten.length; i++) {
			if (studenten[i].getMatnr() == matnr) {
				studenten[i] = null;
			}
		}
		//Konsolenausgabe
		printArray(studenten);
	}

	/** Methode printArray, um Studenten-Array auf Konsole auszugeben. */
	public static void printArray(Student[] studenten){

		for (int i = 0; i < studenten.length; i++) {
			if(studenten[i] != null){
				System.out.println("Studentenname: " + studenten[i].getName() + ", Matrikelnummer: " + studenten[i].getMatnr() + ".");
			}
		}

    // Oder mit foreach loop:
    for (Student s: studenten) {
      System.out.println("Studentenname: " + s.getName() + ", Matrikelnummer: " + s.getMatnr() + ".");
    }
	}
}
```

**Student**

```java
public class Student {

	private String name;
	private int matnr;

	public Student() {
	}

	public Student(String name, int matnr) {
		this.name = name;
		this.matnr = matnr;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setMatnr(int matnr) {
		this.matnr = matnr;
	}

	public int getMatnr() {
		return matnr;
	}

}
```

### Aufgabe 6

**Szenario 1**

![](/images/Aufgabe6_Szenario1.png)

**Szenario 2**

![](/images/Aufgabe6_Szenario2.png)

**Szenario 3**

![](/images/Aufgabe6_Szenario3.png)

**Szenario 4**

![](/images/Aufgabe6_Szenario4.png)
