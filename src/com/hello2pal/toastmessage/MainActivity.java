package com.hello2pal.toastmessage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button btnToast;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		btnToast = (Button) findViewById(R.id.btn_toast);

		btnToast.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				/*
				 * First, instantiate a Toast object with one of the makeText()
				 * methods. This method takes three parameters: the application
				 * Context, the text message, and the duration for the toast. It
				 * returns a properly initialized Toast object. You can display
				 * the toast notification with show(), as shown in the following
				 * below implementation:
				 */

				Context context = getApplicationContext(); // the application
															// Context,
				CharSequence text = "Welcome to Hello2Pal"; // the text message,
				int duration = Toast.LENGTH_LONG; // the duration for the toast.

				Toast toast = Toast.makeText(context, text, duration); // instantiate a Toast 
																	   //object with one 
																	   //	of the makeText()
				toast.show();
			}
		});
	}
}
