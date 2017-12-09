package com.qaagility.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class calcTest{
  public void testSlow(){
    System.out.println("Slow");
  }
  
  public void testSlower(){
    System.out.println("Slower");
  }
  
  public void testFast(){
    System.out.println("Fast");
  }
  
  @Test
  public void testCalc(){
    //assertEquals("Result",9,9);
    assertEquals("Result",18,new calc().mul());
    //System.out.println("TestCalc =" +9*9);
  }
  
  @Test
  public void testCalcFail(){
    //assertEquals("Result",9,9);
    assertEquals("Result",10,new calc().mul());
    //System.out.println("TestCalc =" +9*9);
}
}
