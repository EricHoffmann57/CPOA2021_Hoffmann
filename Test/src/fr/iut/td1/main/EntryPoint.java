package fr.iut.td1.main;
import fr.iut.td1.miscs.Observable;
import fr.iut.td1.modele.Bilan;
import fr.iut.td1.vue.UIGraphes;

public class EntryPoint {

	public static void main (String[] args) {
		
		System.out.println("HELLO WORLD");
		Observable observable  = new Observable();
		System.out.println("___________________");
		Bilan bilan = new Bilan();
		bilan.setNum(1);
		System.out.println("--------------------");
		//création du graphe
		IObserver graphe = new UIGraphes(1);
		IObserver graphe2 = new UIPhoneGraphe(2);
		IObserver graphe3 = new  UIWindowsGraphe(3)
		//Je rajoute mon graphe en tant qu'observateur
		//bilan est observé par UIGraphe
		observable.addObserver(graphe);
		//bilan envoie l'ordre de changements aux observateurs
		bilan.setChange();
	}
	
}
