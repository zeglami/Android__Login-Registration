package com.zeglami.androidphpmysql;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {


    private TextView textViewUsername, textViewUserEmail;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        if (!SharedPrefManager.getInstance(this).isLogged()){
            finish();
            startActivity(new Intent(this,LoginActivity.class));
        }

        textViewUsername=(TextView)findViewById(R.id.textViewUsername);
        textViewUserEmail=(TextView)findViewById(R.id.textViewUserEmail);
        textViewUserEmail.setText(SharedPrefManager.getInstance(this).getEmail());
        textViewUsername.setText(SharedPrefManager.getInstance(this).getUsername());


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       switch (item.getItemId()){
           case R.id.menuLogout:
               SharedPrefManager.getInstance(this).logout();
               finish();
               startActivity(new Intent(this,LoginActivity.class));
               break;
           case R.id.menuSettings:
               Toast.makeText(this,"I will code it later, stay tuned ",Toast.LENGTH_LONG).show();
               break;
       }
       return true;
    }
}
