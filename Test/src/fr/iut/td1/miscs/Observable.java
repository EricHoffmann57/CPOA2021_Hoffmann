package fr.iut.td1.miscs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fr.iut.td1.interfaces.IObserver;

import fr.iut.td1.miscs.Observable;

public class Observable {

	//bloc de variables;
	public int num;
	
	
	//bloc de gettteurs/setteurs
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	private List<IObserver> observers;

	//bloc de constructeur
	public Observable(List<IObserver> observers) {
		System.out.println("dans constructeur observable");
		observers = new ArrayList<>();

	}

	public void notify1() {
		System.out.println("dans méthode notify1");
		for(IObserver iObserver : observers) {
	       iObserver.update(this);
		}
		Iterator<IObserver> it = this.observers.iterator();
		while(it.hasNext()) {
			it.next().update(this);
		}
		}

	public List<IObserver> getObservers() {
		return observers;
	}

	public void setObservers(List<IObserver> observers) {
		this.observers = observers;
	} 
	public void addObserver(IObserver o) {
		this.observers.add(o);
	}

}