package _EX_1_20_11_2024._EX_1_20_11_2024;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
/**
 * Unit test for simple App.
 */

/*** Rami Suri 209431477 - Muhammad Yousef 318452182 ***/
public class AppTest {
	
	ex4 tester = new ex4();
	
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Test_case_1() {
    	String Expected_result = "A";
    	double a = 28, b = 24;
    	String mod = "Regular";
    	String Actual_result = tester.Compare(a, b, mod);
        assertEquals(Expected_result, Actual_result);
    }
    @Test
    public void Test_case_2() {
    	String Expected_result = "B";
    	double a = 20, b = 24;
    	String mod = "Regular";
    	String Actual_result = tester.Compare(a, b, mod);
        assertEquals(Expected_result, Actual_result);
    }

    @Test
    public void Test_case_3() {
    	String Expected_result = "B";
    	double a = -28, b = -38;
    	String mod = "Negative";
    	String Actual_result = tester.Compare(a, b, mod);
        assertEquals(Expected_result, Actual_result);
    }
    @Test
    public void Test_case_4() {
    	String Expected_result = "A";
    	double a = -20, b = -18;
    	String mod = "Negative";
    	String Actual_result = tester.Compare(a, b, mod);
        assertEquals(Expected_result, Actual_result);
    }

    @Test
    public void Test_case_5() {
    	String Expected_result = "A";
    	double a = 2, b = 3;
    	String mod = "Reciprocal";
    	String Actual_result = tester.Compare(a, b, mod);
        assertEquals(Expected_result, Actual_result);
    }
    
    @Test
    public void Test_case_6() {
    	String Expected_result = "A";
    	double a = 100, b = 101;
    	String mod = "Reciprocal";
    	String Actual_result = tester.Compare(a, b, mod);
        assertEquals(Expected_result, Actual_result);
    }
    

    @Test
    public void Test_case_7() {
    	String Expected_result = "Error";
    	double a = 0.5, b = 0;
    	String mod = "Reciprocal";
    	String Actual_result = tester.Compare(a, b, mod);
        assertEquals(Expected_result, Actual_result);
    }
    
    
    
}
