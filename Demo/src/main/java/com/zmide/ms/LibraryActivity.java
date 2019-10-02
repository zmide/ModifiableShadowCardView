package com.zmide.ms;

import android.app.*;
import android.os.*;

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
