package com.zmide.demo;

import android.app.Activity;
import android.os.Bundle;
import com.zmide.ms.CardView;
import com.zmide.ms.R;

public class LibraryActivity extends Activity 
{
	private CardView mCardView;

	private void initView()
	{
		mCardView = findViewById(R.id.CardView);
	}
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.library);
		initView();
		mCardView.setShadowColor(0x03000000);
    }
}
