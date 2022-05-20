package Proiect;

public class Abonat {
	
	private String nume;
	private Canal canal= new Canal("c1");
	
	public Abonat(String nume)//constructorul clasei Abonat
	{
		super();
		this.nume = nume;
	}
	
	public void update()//Metoda prin care un abonat este notificat atunci cand pe canal este incarcat un nou videoclip
	{
		System.out.println("Salut, "+ nume +" ,am incarcat un video!" + " -> " +canal.titluVideo);
		System.lineSeparator();
	}

	public void subscribeCanal(Canal ch)
	{
		canal=ch;
	}

	
}
