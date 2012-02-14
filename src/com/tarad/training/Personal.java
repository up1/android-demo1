package com.tarad.training;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Personal extends Activity {

	private int count = 0;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		// Reference to widget in main.xml file
		final TextView textView1 = (TextView) this.findViewById(R.id.textView1);
		final Button button1 = (Button) this.findViewById(R.id.button1);

		// Button click listener
		button1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Personal.this.count++;
				String msg = String.format(getString(R.string.message_format),Personal.this.count);
				textView1.setText(msg);
			}
		});
	}
}