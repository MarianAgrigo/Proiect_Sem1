package Proiect;

import java.util.List;
import java.util.ArrayList;

public class Canal {
	
	List<Abonat> abonati=new ArrayList<>();
	public String titluVideo;
	
	public void subscribe(Abonat a)
	{
		abonati.add(a);
		
		
	}
	public void unsubscribe(Abonat a)
	{
		abonati.remove(a);
	}
	
	
	public void notificareAbonati()
	{
		for(Abonat a:abonati)
		{
			a.update();
		}
	}
	
	public void upload(String titlu)
	{
		this.titluVideo=titlu;
		notificareAbonati();
	}	
		
	
}
