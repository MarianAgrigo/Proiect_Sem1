package Proiect;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testareProiect {

	@Test
	void test() {
		
		Canal unboxTherapy = new Canal("unboxTherapy");
	
		Abonat a1=new Abonat("Misu");
		Abonat a2=new Abonat ("Marian");
		
		unboxTherapy.subscribe(a1);
		unboxTherapy.subscribe(a2);
	
		a1.subscribeCanal(unboxTherapy);
		a2.subscribeCanal(unboxTherapy);
		
		int	output=unboxTherapy.NumarAbonati();
		
		assertEquals(2,output);
		

	}

}
