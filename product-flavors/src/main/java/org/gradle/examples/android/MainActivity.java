package org.gradle.examples.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.apache.commons.lang.StringUtils;

import org.gradle.examples.android.MonetizationType;
import org.gradle.examples.android.product.LabelProvider;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

        TextView text = new TextView(this);
        text.setText("Hello World of " + LabelProvider.getVersion() + " " + StringUtils.capitalize("android") + "!");
        
        if(BuildConfig.monetizationType == MonetizationType.FREE) { 
            text.append("\n\nYou have 30 days to evaluate this product."); 
        }
        else if(BuildConfig.monetizationType == MonetizationType.PRO) { 
            text.append("\n\nFully registered version with license key " + LabelProvider.getKey() + "."); 
        }
                
        setContentView(text);
	}
}