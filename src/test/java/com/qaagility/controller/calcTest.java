package com.qaagility.controller;

import org.juint.Test;
import static org.junit.Assert.assertEquals;

public class calcTest{
  public void testSlow(){
    Syste.out.println("Slow");
  }
  
  public void testSlower(){
    Syste.out.println("Slower");
  }
  
  public void testFast(){
    Syste.out.println("Fast");
  }
  
  @Test
  public void testCalc(){
    assertEquals("Result",9,9);
    //Syste.out.println("TestCalc =" +9*9);
  }
  
}
