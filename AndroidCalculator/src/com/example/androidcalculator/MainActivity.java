package com.example.androidcalculator;

import android.R.integer;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	final String LOG_TAG = "MainScreen";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final EditText number1 = (EditText) findViewById(R.id.number1);
        final EditText number2 = (EditText) findViewById(R.id.number2);
        
        final TextView result = (TextView) findViewById(R.id.result);
        
        Button addButton = (Button) findViewById(R.id.addNumbers);
        
        addButton.setOnClickListener(new OnClickListener() {
			
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{
					int num1 = Integer.parseInt(number1.getText().toString());
					int num2 = Integer.parseInt(number2.getText().toString());
					
					Integer answer = num1 + num2;
					result.setText(answer.toString());
				}catch (Exception e) {
                    Log.e(LOG_TAG, "Failed to add numbers", e);
				
				}
			}
		});
        Button subtractButton = (Button) findViewById(R.id.subtractNumbers);
        
        subtractButton.setOnClickListener(new OnClickListener() {
			
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{
					int num1 = Integer.parseInt(number1.getText().toString());
					int num2 = Integer.parseInt(number2.getText().toString());
					
					Integer answer = num1 - num2;
					result.setText(answer.toString());
				}catch (Exception e) {
                    Log.e(LOG_TAG, "Failed to subtract numbers", e);
				 }
			}
		});
        Button multiplyButton = (Button) findViewById(R.id.multiplyNumbers);
        
        multiplyButton.setOnClickListener(new OnClickListener() {
			
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{
					int num1 = Integer.parseInt(number1.getText().toString());
					int num2 = Integer.parseInt(number2.getText().toString());
					
					Integer answer = num1 * num2;
					result.setText(answer.toString());
				}catch (Exception e) {
                    Log.e(LOG_TAG, "Failed to multiply numbers", e);
				 }
				
			}
		});
        Button divideButton = (Button) findViewById(R.id.divideNumbers);
        
        divideButton.setOnClickListener(new OnClickListener() {
			
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				try{
					Float num1 = Float.parseFloat(number1.getText().toString());
					Float num2 = Float.parseFloat(number2.getText().toString());
					
					Float answer = num1 / num2;
					result.setText(answer.toString());
				}catch (Exception e) {
                    Log.e(LOG_TAG, "Failed to divide numbers", e);
				 }
			}
		});
        
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
