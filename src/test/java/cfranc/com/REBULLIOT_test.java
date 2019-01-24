package cfranc.com;

import org.junit.*;
import static org.junit.Assert.*;

public class REBULLIOT_test {	
	
	@Test
	public void test(){  
		 Markov m = new Markov();
		 m.readFile("test.txt");
		 Couple p = new Couple("il", "etait"); 
		 assertEquals(4,m.couples.size());
	    }  


 	@Test
	public void test2(){  
	 Markov m = new Markov();
	 m.readFile("test2.txt");
	 Couple p = Markov.randomElement(m.couples.keySet());
	 String res = m.generateText(p, 3);
		assertNotNull(res);
		System.out.println(res);
   }  
     
	@Test 
	public void testHashCode() {
		Couple p = new Couple("salut","salut");
		int result = p.hashCode();
		int expResult = "salut".hashCode()*2;
		assertEquals(expResult,result);
		
	}
}

	
