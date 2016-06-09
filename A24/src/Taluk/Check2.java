package Taluk;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Check2 {
	Frage1 f1;
	@Test
	public void test1() {
		f1 = new Frage1();
		if (25*Math.pow(f1.fiboArr(10), 2) !=
		2*Math.pow(f1.lukasRec(11), 2) -
		Math.pow(f1.lukasRec(10), 2) +
		2*Math.pow(f1.lukasRec(9), 2)) fail("Not yet implemented");
	}

	@Test
	public void test2() {
		f1 = new Frage1();
		if (25*Math.pow(f1.fiboArr(19), 2) !=
		2*Math.pow(f1.lukasRec(20), 2) -
		Math.pow(f1.lukasRec(19), 2) +
		2*Math.pow(f1.lukasRec(18), 2)) fail("Not yet implemented");
	}
}
