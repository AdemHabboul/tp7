package tp77;

public class Ustensile {
	protected int annee;

	public Ustensile(int a){

	this.annee=a;	}

public double calculerValeur() {

	        int age=2024-annee;

	        if (age<50){

	            return 0;

	        }

	        return age-50;

	    }

}
