package Taluk;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Check1 {
	Frage1 f1;

	@Test
	public void test1() {
		f1 = new Frage1();
		double alpha = (1 + Math.sqrt(5))/2;
		double beta = (1 - Math.sqrt(5))/2;
		if (Math.round(Math.pow(alpha, 10) - Math.pow(beta, 10)) != f1.lukasRec(10)) {
			fail("Not yet implemented");
		}
	}
	
	@Test
	public void test2() {
		f1 = new Frage1();
		double alpha = (1 + Math.sqrt(5))/2;
		double beta = (1 - Math.sqrt(5))/2;
		if (Math.round(Math.pow(alpha, 19) - Math.pow(beta, 19)) != f1.lukasRec(19)){
			fail("Not yet implemented");
		}
	}

}
