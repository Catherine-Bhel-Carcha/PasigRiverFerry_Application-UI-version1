package iics.carcha.catherinebhel.pasigriverferry_application;

import android.content.Intent;
import android.net.Uri;

public class Stations {

    public static Intent goToMaps(int id){
        Intent i = null, chooser = null;
        String x="",y="",station="";
        i = new Intent(Intent.ACTION_VIEW);
        switch(id){
            case 1:
                x="14.594773";
                y="120.975160";
                station="Plaza Mexico Ferry Station";
                break;
            case 2:
                x="14.596405";
                y="120.977540";
                station="Escolta River Ferry";
                break;
            case 3:
                x="14.595715";
                y="120.981331";
                station="Lawton Ferry Station";
                break;
            case 4:
                x="14.596064";
                y="121.010735";
                station="PUP Ferry Station";
                break;
            case 5:
                x="14.582287";
                y="121.011606";
                station="Sta Ana Ferry Station";
                break;
            case 6:
                x="14.587360";
                y="121.018405";
                station="Lambingan Ferry Station";
                break;
            case 7:
                x="14.573918";
                y="121.025738";
                station="Valenzuela Ferry Station";
                break;
            case 8:
                x="14.568004";
                y="121.033768";
                station="Hulo Ferry Station";
                break;
            case 9:
                x="14.568016";
                y="121.047925";
                station="Guadalupe Ferry Station";
                break;
            case 10:
                x="14.578643";
                y="121.081192";
                station="Maybunga Ferry Station";
                break;
            case 11:
                x="14.554595";
                y="121.073859";
                station="San Joaquin Ferry Station";
                break;
            case 12:
                x="14.559894";
                y="121.0844066";
                station="Pinagbuhatan Ferry Station";
                break;
        }

        i.setData(Uri.parse("geo:?q=loc:"+x+","+y+" ("+station+")"));
        chooser = Intent.createChooser(i, "Choose Your Map App");

        return chooser;
    }
}
