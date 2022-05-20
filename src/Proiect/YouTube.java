package Proiect;

public class YouTube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Canal unboxTherapy = new Canal("unboxTherapy");
	
		
		Canal GeorgeBuhnici=new Canal("GeorgeBuhnici");
		
		Abonat a1=new Abonat("Misu");
		Abonat a2=new Abonat ("Marian");
		
		
	
		
		unboxTherapy.subscribe(a1);
		unboxTherapy.subscribe(a2);
	
		a1.subscribeCanal(unboxTherapy);
		a2.subscribeCanal(unboxTherapy);
		
		unboxTherapy.upload("Iphone 13 mini");
		unboxTherapy.NotificareNumarAbonati();
		int out=unboxTherapy.NumarAbonati();
		System.out.println(out);

		
		
		
		
		
		
		
		

	}

}
