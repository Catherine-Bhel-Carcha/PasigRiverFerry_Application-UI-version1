package iics.carcha.catherinebhel.pasigriverferry_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class Screen6_4 extends AppCompatActivity {
    float x1, y1, x2, y2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen6_4);
    }

    public boolean onTouchEvent(MotionEvent touchEvent){
        switch(touchEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                x1 = touchEvent.getX();
                y1 = touchEvent.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = touchEvent.getX();
                y2 = touchEvent.getY();
                if(x1 < x2){
                    Intent i = new Intent(this, Screen6_5.class);
                    startActivity(i);
                }else if(x1 > x2){
                    Intent i = new Intent(this, Screen6_3.class);
                    startActivity(i);
                }
                break;
        }
        return false;
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, Screen4.class);
        startService(i);
    }

    public void process(View v){
        if(v.getId()==R.id.button2) {
            startActivity(Stations.goToMaps(6));
        }
    }
}
