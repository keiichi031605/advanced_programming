package KeiichiJunit;

import week4.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAccount {
	Account a;


	@Before
	public void setUp() throws Exception {
		a = new DepositAccount("A1","Suneo", 2300.00);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(2300.0, a.getBalance(),0);
	}
}
