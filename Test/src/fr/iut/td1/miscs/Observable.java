package fr.iut.td1.miscs;

import java.util.ArrayList;
import java.util.List;

import fr.iut.td1.interfaces.IObserver;

public class Observable {

	//Bloc de variables
	private int num;
	
	private List<IObserver> observers;

	//Bloc de getter/setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public List<IObserver> getObservers() {
		return observers;
	}
	
	public void setObservers(List<IObserver> observers) {
		this.observers = observers;
	}

	//Bloc de constructeurs
	public Observable() {
		System.out.println("Dans constructeur observable");
		observers = new ArrayList<>();
	}

	public void notify1() {
		System.out.println("dans méthode notify1");
		/*for (IObserver iObserver : observers) {
			//Parcourir une collection
		}*/
		java.util.Iterator<IObserver> it = this.observers.iterator();
		
		while (it.hasNext()) {
			it.next().update(this);
		}
	}

	//ajouter un observer à ma liste d'osberver
	public void addObserver(IObserver o) {
		this.observers.add(o);
	}
	

}
