package org.gradle.examples.android.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.gradle.examples.android.common.Utils;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("Hello World of " + Utils.capitalize("android") + "!");
        setContentView(text);
	}
}