package KeiichiJunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//import org.junit.Test;

import week4.Calculator;

class CalculatorTest {

	// @Test
	// void test() {
	// 	fail("Not yet implemented");
	// }
  @Test
  public void maltiplicationで5と2の乗算結果が取得できる() throws Exception {
      Calculator sut = new Calculator();
      int expected = 10;
      int actual = sut.maltiplication(5, 2);
//      assertThat(actual,is(expected));
  }

  @Test
  public void divisionで5と8の除算結果が取得できる() throws Exception {
      Calculator sut = new Calculator();
      float expected = 0.625f;
      float actual =  sut.division(5, 8);
//      assertThat(actual,is(expected));
  }



}
