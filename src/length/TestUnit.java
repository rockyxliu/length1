package length;

import junit.framework.TestCase;

public class TestUnit extends TestCase{
	public void p_test(){
		Mile M1 = new Mile();
//		Yard Y1 = new Yard();
//		Feet F1 = new Feet();
		Inch I1 = new Inch();
		assertEquals("1760", M1.MileToYard(1));    
		assertEquals("1760*3", M1.MileToFeet(1));
		assertEquals("1760*3*12",M1.MileToInch(1));
		assertEquals("3",I1.InchToFeet(12)+2);
	}
}