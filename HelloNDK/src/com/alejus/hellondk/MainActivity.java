package com.alejus.hellondk;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
	//Library and JNI (Java Native Interface) method
	static {
		System.loadLibrary("hellondk");
	}
	
	native int suma(int number1, int number2);
    native int resta(int number1, int number2);
	
    TextView textMethod1, textMethod2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textMethod1 = (TextView) findViewById(R.id.textViewMethod1);
		textMethod2 = (TextView) findViewById(R.id.textViewMethod2);
        
		textMethod1.setText("Suma: " + suma(1, 5));
		textMethod2.setText("Resta: " + resta(1, 5));
	}
}
