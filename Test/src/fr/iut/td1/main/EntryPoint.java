package fr.iut.td1.main;


import fr.iut.td1.modele.Bilan;
import fr.iut.td1.vue.UIWindows;
import fr.iut.td1.vue.UIPhone;
import fr.iut.td1.interfaces.IObserver;

public class EntryPoint {

	public static void main(String[] args) {
		System.out.println("HELLO WORLD");
		System.out.println("---------------------------");
		//Création bilan
		Bilan bilan = new Bilan();
		bilan.setNum(1);
		System.out.println("---------------------------");
		//Création graphe
		IObserver graphe = new UIWindows(1);
		IObserver graphe1 = new UIPhone(2);
		//J'ajoute mon graphe en observateur
		//bilan est observé par UIGraphes
		bilan.addObserver(graphe);
		bilan.addObserver(graphe1);
		//Bilan envoie l'ordre de changement aux observateurs
		bilan.setChange();
	}
}
