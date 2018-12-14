package iics.carcha.catherinebhel.pasigriverferry_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, CustomService.class);
        startService(i);
    }
    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.fare) {
            i = new Intent(this, Screen2.class);
        }
        if (v.getId() == R.id.stations){
            i = new Intent(this, Screen4.class);
        }
        if(v.getId()==R.id.about){
            i = new Intent(this, Screen8.class);
        }
        startActivity(i);
        // } else if (v.getId() == R.id.stations) {
        //    i = new Intent(getIntent().ACTION_VIEW);
        //  i.setData(Uri.parse("http://maps.google.com/maps?q=loc:" + 14.589595 + "," + 120.975579));
        //chooser = Intent.createChooser(i, "Choose A Map App");
        //startActivity(chooser);
    }
    @Override
    public void onBackPressed(){
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }
}