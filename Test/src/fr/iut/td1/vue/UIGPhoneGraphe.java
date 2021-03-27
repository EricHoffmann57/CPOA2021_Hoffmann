package fr.iut.td1.vue;

import fr.iut.td1.interfaces.IObserver;
import fr.iut.td1.miscs.Observable;
		


	public class UIGPhoneGraphe implements IObserver{
       
	private int num;
	
	private int getNum() {
		return num;
	}
	
	
	public UIGPhoneGraphe(int num) {
	System.out.println("Je suis un écran Iphone");
		this.num = num;
	}
		
      @Override
      public void update(Observable obj){
    	  System.out.println("dans méthode update de Iphone N°");
      }

	
	} 