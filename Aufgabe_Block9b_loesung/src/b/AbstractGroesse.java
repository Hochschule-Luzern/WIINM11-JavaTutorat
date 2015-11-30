package b;

import a.Groesse;

public class AbstractGroesse implements Comparable<Groesse>, Groesse {

	@Override
	public int laenge() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int hoehe() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int breite() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public int compareTo(Groesse obj) {
		// TODO Auto-generated method stub
		 if(obj.laenge() > this.laenge()){ return 1;}
		 else if(obj.laenge() < this.laenge()){return -1;}
		 else{
			 return 0;
		 }
	}

}
