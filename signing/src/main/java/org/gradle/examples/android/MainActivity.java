package org.gradle.examples.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.apache.commons.lang.StringUtils;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("Hello World of " + StringUtils.capitalize("android") + "!");
        setContentView(text);
	}
}