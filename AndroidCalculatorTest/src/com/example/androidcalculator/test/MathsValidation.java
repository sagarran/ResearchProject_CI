package com.example.androidcalculator.test;

import com.example.androidcalculator.MainActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;
import com.example.androidcalculator.R;

public class MathsValidation extends ActivityInstrumentationTestCase2<MainActivity> {
	
	private TextView result;
	private static final String NUMBER_24 = "2 4 ENTER ";
	private static final String NUMBER_74 = "7 4 ENTER ";
	private static final String ADD_RESULT = "98";
	private static final String MULTIPLY_RESULT = "1776";

	public MathsValidation(){
		super("com.example.androidcalculator", MainActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		MainActivity mainActivity = getActivity();
		result = (TextView) mainActivity.findViewById(R.id.result);
	}
	
	public void testAddValues() {

		   sendKeys(NUMBER_24);
		   // now on value2 entry
		   sendKeys(NUMBER_74);
		   // now on Add button
		   sendKeys("ENTER");
		// get result
		   String mathResult = result.getText().toString();
		   assertTrue("Add result should be 98 " + ADD_RESULT + " but was "
	                 + mathResult.toString(), mathResult.equals(ADD_RESULT));
	}
	
	public void testMultiplyValues() {
        sendKeys(NUMBER_24 + NUMBER_74 + " DPAD_RIGHT ENTER");

        String mathResult = result.getText().toString();
        assertTrue("Multiply result should be " + MULTIPLY_RESULT + " but was "
                + mathResult.toString(), mathResult.equals(MULTIPLY_RESULT));
    }
}


