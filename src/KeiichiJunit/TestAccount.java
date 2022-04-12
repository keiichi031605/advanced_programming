package KeiichiJunit;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import week4.Account;
import week4.DepositAccount;

public class TestAccount {
	Account a;


	@Before
	public void setUp() throws Exception {
		a = new DepositAccount("A1","Keiichi", 2000.00);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		assertEquals(2000.0, a.getBalance(), 0);
	}	
	@Test
	public void test2( ) {
		assertEquals("A1", a.getID());
	}
//	@Test
//	public void test3() {
//		assertEquals(100.0, a.add(100.0), 0);
//	}
	@Test
	public void test4( ) {
		assertEquals("A1", a.getID());
	}
}
