package ueb04_Zahlenliste;

// to do!!!!
// import ... korrekte LinkedList und Node oder
//            LinkedList<E> und Node<T> 

import java.util.Random;

// "Schwieriger": versuchen Sie bei dieser Aufgabe 
// die generische Version von Linked List zu verwenden. 
// "Leichter": NumberList kann nur Integer-Objekte abspeichern...

// Erstellen Sie eine Testklasse NumberList_Main, wo Sie diese
// Klasse mit ein paar Aufrufen testen. 

public class NumberList extends LinkedList {

	public NumberList() {
	}
	
	@Override
	void insertFirst(Object x) {
		if((x.getClass().getSimpleName()).equals("Integer")){
			super.insertFirst(x);
		}
	}

	@Override
	void insertLast(Object x) {
		if((x.getClass().getSimpleName()).equals("Integer")){
			super.insertLast(x);
		}
	}

	@Override
	public void setObject(int index, Object o) {
		if((o.getClass().getSimpleName()).equals("Integer")){
			super.setObject(index, o);
		}
	}
	
	public String showList(){
		String liste = "[ ";
		for(int i=0; i<size(); i++){
			if(i==size()-1){
				liste = liste + getObject(i);
			}else{
				liste = liste + getObject(i)+ ", ";
			}
		}
		return liste+" ]";
	}

	public static NumberList initRandomList(NumberList nList, int start, int ende){	
		int random = 0;
		int size = nList.size();
		for (int i = 0; i<size; i++) {
			random = start + (new Random()).nextInt(ende - start);
			nList.insertFirst(random);
		}
		return nList;
	}
	
	public static NumberList getOddNumbers(NumberList nList){
		NumberList helpList= new NumberList();
		int size = nList.size();
		for (int i = 0; i<size; i++) {
			if( (Integer) nList.getObject(i)%2 ==0){
				helpList.insertFirst(nList.getObject(i));
			}
		}
		return helpList;
	}
	
	public boolean contains(int x){
		boolean contains = false;
		for (int i = 0; i<size(); i++) {
			if( (Integer) getObject(i)==x){
				return true;
			}
		}
		return contains;
		 
	}
	public static int max(NumberList nList ){
		int max = (Integer) nList.getObject(0);
		for(int i=1; i<(nList.size()); i++){
			if(max<(Integer) nList.getObject(i)){
				max = (Integer) nList.getObject(i);
			}
		}
		return max;
	}
	
	public static int min(NumberList nList ){
		int min = (Integer) nList.getObject(0);
		for(int i=1; i<(nList.size()); i++){
			if(min>(Integer) nList.getObject(i)){
				min = (Integer) nList.getObject(i);
			}
		}
		return min;
	}
	
	public NumberList remove(int x){
		NumberList helpList = new NumberList();
		for(int i=size()-1; i>=0; i--){
			if(!(i==x)){
				helpList.insertFirst(getObject(i));
			}
		}
		return helpList;
	}
	
	
	public NumberList removeElement(int x){
		NumberList helpList = new NumberList();
		int counter = 0;
		for(int i=size()-1; i>=0; i--){
			if(!((Integer) getObject(i)==x)){
				helpList.insertFirst(getObject(i));
			}else{
				counter++;
				if(counter>1){
					helpList.insertFirst(getObject(i));
				}
			}
		}
		return helpList;
	}
}
