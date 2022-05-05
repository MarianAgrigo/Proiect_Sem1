package Proiect;

public class Abonat {
	
	private String nume;
	private Canal canal= new Canal();
	
	public Abonat(String nume) {
		super();
		this.nume = nume;
	}
	
	public void update()
	{
		System.out.println("Salut, "+ nume +" ,am incarcat un video!" + " -> " +canal.titluVideo);
		System.lineSeparator();
	}

	public void subscribeCanal(Canal ch)
	{
		canal=ch;
	}

	
}
