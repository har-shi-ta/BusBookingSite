package com.example.pizzahut;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class ChoiceActivity extends TabActivity  
{
	
				@Override
				public void onCreate(Bundle bundle )
					{	
					super.onCreate(bundle);
					
					setContentView(R.layout.choice);
					
             TabHost tabHost=(TabHost)findViewById(android.R.id.tabhost);

				TabSpec tab1=tabHost.newTabSpec("about us");
				//tab1.setIndicator("MARGHERITA SMALL");
				tab1.setIndicator("",getResources().getDrawable(R.drawable.ph4));//TabWidget
				tab1.setContent(new Intent(this,MarSmallActivity.class));//FrameLayout
				
				
                    TabSpec tab2=tabHost.newTabSpec("Contact  Us");
                    tab2.setIndicator("MARGHERITA MEDIUM");
                    tab2.setContent(new Intent(this,MarMediumActivity.class));
                    
                    
                    TabSpec tab3=tabHost.newTabSpec("Gallery");
                    tab3.setIndicator("MARGHERITA LARGE");
                    tab3.setContent(new Intent(this,MarLargeActivity.class));
                    
                    
                    TabSpec tab4=tabHost.newTabSpec("Services");//tabs
                    tab4.setIndicator("MARGHERITA JUMBO");
                    tab4.setContent(new Intent(this,MarJumboActivity.class));//tabcontent

                    
                    tabHost.addTab(tab1);
                    tabHost.addTab(tab2);
                    tabHost.addTab(tab3);
                    tabHost.addTab(tab4);
                    
					}
				

			/*	@Override
				public boolean onCreateOptionsMenu(Menu menu) {
						MenuInflater inflater=getMenuInflater();
					inflater.inflate(R.menu.mymenu, menu);
				return super.onCreateOptionsMenu(menu);
				}
				
				
				
				
				
				@Override
				public boolean onMenuItemSelected(int featureId, MenuItem item) 
				{
					
					switch(item.getItemId())
					{
					case R.id.setting:
						Intent intent=new Intent(FlashActivity.this,SettingActivity.class);
						startActivity(intent);
						break;
					}
				return super.onMenuItemSelected(featureId, item);
				}*/
	
}
