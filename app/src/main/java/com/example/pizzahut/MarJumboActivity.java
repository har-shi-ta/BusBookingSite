

package com.example.pizzahut;  


import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
  
public class MarJumboActivity extends Activity {  
    
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.jumbo);  
  
        
  //    final EditText  edittext=(EditText)findViewById(R.id.text);  
        final ImageView image =(ImageView)findViewById(R.id.image1);  
  
     
       image.setOnClickListener(new OnClickListener(){  
  
           @Override  
            public void onClick(View arg0) {  
        	  // openDiler();
          // }
          // protected void openDiler()
        //   {
              
        	   // String num=edittext.getText().toString();  
                //Intent callIntent = new Intent(Intent.ACTION_CALL); 
                Intent callIntent = new Intent(Intent.ACTION_CALL); 
                callIntent.setData(Uri.parse("tel:8888888888"));  
              //callIntent.setData(Uri.parse("tel:"+num)); 
                startActivity(callIntent);  
            }  
              
        });  
    }  
  
   /* @Override  
    public boolean onCreateOptionsMenu(Menu menu) {  
       getMenuInflater().inflate(R.menu.main, menu);  
        return true;  
    }  */
      
}