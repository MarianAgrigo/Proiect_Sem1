package Proiect;

import java.util.List;
import java.util.ArrayList;

public class Canal {
	
	List<Abonat> abonati=new ArrayList<>();
	public String titluVideo;
	public String nume;
	
	public Canal()//constructor fara argumente Canal 
	{
		super();
		this.nume = " ";
	}
	
	public Canal(String nume) //Constructor cu argumente Canal
	{
		super();
		this.nume = nume;
	}
	
	public void subscribe(Abonat a)//Metoda prin care un abonat este adaugat la lista de urmaritori a canalului
	{
		abonati.add(a);
			
	}
	
	public void unsubscribe(Abonat a)//Metoda prin care un abonat este scos din lista de urmaritori a canalului
	{
		abonati.remove(a);
	}
	
	public int NumarAbonati()//metoda prin care este returnat numarul de abonati al canalului
	{
		 return abonati.size();
	
		   
	}
	
	public void NotificareNumarAbonati() //metoda prin care se notifica abonatii in legatura cu numarul de umaritori ai canalului
		   {int numarAbonati = abonati.size();
		   System.out.println("Canalul, "+ nume +" are " + numarAbonati + " abonati!! " );
			System.lineSeparator();
		   
	}
	
	
	public void notificareAbonati()//metoda prin care se apeleaza functia de notificare a tuturor abonatilor
	{
		for(Abonat a:abonati)
		{
			a.update();
		}
	}
	
	public void upload(String titlu)//metoda prin care se notifica abonatii in urma unui upload pe canal
	{
		this.titluVideo=titlu;
		notificareAbonati();
	}
		
	
}
