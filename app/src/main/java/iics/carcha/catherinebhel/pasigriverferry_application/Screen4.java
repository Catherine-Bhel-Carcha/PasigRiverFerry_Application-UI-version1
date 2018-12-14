package iics.carcha.catherinebhel.pasigriverferry_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Screen4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);
    }
    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.pinagbuhatan) {
            i = new Intent(this, Screen6.class);
            startActivity(i);
        }
        if (v.getId() == R.id.escolta){
            i = new Intent(this, Screen6_1.class);
            startActivity(i);
        }
        if(v.getId()==R.id.about){
            i = new Intent(this, Screen6_2.class);
            startActivity(i);
        }
        if (v.getId() == R.id.pinagbuhatan) {
            i = new Intent(this, Screen6_3.class);
            startActivity(i);
        }
        if (v.getId() == R.id.escolta){
            i = new Intent(this, Screen6_4.class);
            startActivity(i);
        }
        if(v.getId()==R.id.about){
            i = new Intent(this, Screen6_5.class);
            startActivity(i);
        }
        if (v.getId() == R.id.pinagbuhatan) {
            i = new Intent(this, Screen6_6.class);
            startActivity(i);
        }
        if (v.getId() == R.id.escolta){
            i = new Intent(this, Screen6_7.class);
            startActivity(i);
        }
        if(v.getId()==R.id.about){
            i = new Intent(this, Screen6_8.class);
            startActivity(i);
        }
        if (v.getId() == R.id.pinagbuhatan) {
            i = new Intent(this, Screen6_9.class);
            startActivity(i);
        }
        if (v.getId() == R.id.escolta){
            i = new Intent(this, Screen6_10.class);
            startActivity(i);
        }
        if(v.getId()==R.id.about){
            i = new Intent(this, Screen6_11.class);
            startActivity(i);
        }
        // } else if (v.getId() == R.id.stations) {
        //    i = new Intent(getIntent().ACTION_VIEW);
        //  i.setData(Uri.parse("http://maps.google.com/maps?q=loc:" + 14.589595 + "," + 120.975579));
        //chooser = Intent.createChooser(i, "Choose A Map App");
        //startActivity(chooser);
    }



    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, MainActivity.class);
    }
}
