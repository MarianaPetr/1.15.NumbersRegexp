/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.testng.annotations.*;
import static org.testng.Assert.*;

import java.io.ByteArrayInputStream;

public class NumberCounterTest {
    @Test public void checkCount1() {
        NumberCounter classUnderTest = new NumberCounter();
        assertEquals(classUnderTest.CoutnNumbers("basjgdahsgdf"), 0, "Count for 0 numbers");;
    }
    
    @Test public void checkCount2() {
        NumberCounter classUnderTest = new NumberCounter();
        assertEquals(classUnderTest.CoutnNumbers("1234567890"), 10, "Count for 10 numbers");;
    }
    
    @Test public void checkCount3() {
        NumberCounter classUnderTest = new NumberCounter();
        System.setIn(new ByteArrayInputStream("AllillA12".getBytes()));
        assertEquals(classUnderTest.CoutnNumbers(classUnderTest.askForString()), 2, "Count for 2 numbers");;
    }
           
    @Test public void countForNulled(){
    	NumberCounter classUnderTest = new NumberCounter();
   	    assertEquals(classUnderTest.CoutnNumbers(null), 0, "Count for 0 numbers in null");    	
   }
   
   @Test public void countForEmptyString(){
	   NumberCounter classUnderTest = new NumberCounter();
       assertEquals(classUnderTest.CoutnNumbers(""), 0, "Count for 0 numbers in empty string");  	
  }
  
}