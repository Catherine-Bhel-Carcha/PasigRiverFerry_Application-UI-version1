package iics.carcha.catherinebhel.pasigriverferry_application;

import android.content.Intent;
import android.net.Uri;

public class Stations {

    public static Intent goToMaps(int id){
        Intent i = null, chooser = null;
        String x="",y="";
        i = new Intent(Intent.ACTION_VIEW);
        /*
        Plaza Mexico - 14.5930748,120.9729613
        Escolta - 14.5930748,120.9729613
        Lawton - 14.5930748,120.9729613
        PUP - 14.5945725,120.9982848

        Sta Ana - 14.5840029,121.0116593
        Lambingan - 14.5840029,121.0116593
        Valenzuela - 14.5764049,121.0202962
        Hulo - 14.5702404,121.0267198

        Guadalupe - 14.5676733,121.0353446
        Maybunga - 14.5731442,121.0760079
        San Joaquin - 14.5595225,121.0613023
        Pinagbuhatan - 14.5574227,121.0828688
         */
        switch(id){
            case 1:
                x="14.5930748";
                y="120.9729613";
                break;
            case 2:
                x="14.5930748,";
                y="120.9729613";
                break;
            case 3:
                x="14.5930748";
                y="120.9729613";
                break;
            case 4:
                x="14.5945725";
                y="120.9982848";
                break;
            case 5:
                x="14.5840029";
                y="121.0116593";
                break;
            case 6:
                x="14.5840029";
                y="121.0116593";
                break;
            case 7:
                x="14.5764049";
                y="121.0202962";
                break;
            case 8:
                x="14.5702404";
                y="121.0267198";
                break;
            case 9:
                x="14.5676733";
                y="121.0353446";
                break;
            case 10:
                x="14.5731442";
                y="121.0760079";
                break;
            case 11:
                x="14.5595225";
                y="121.0613023";
                break;
            case 12:
                x="14.5574227";
                y="121.0828688";
                break;
        }

        i.setData(Uri.parse("geo:?q=loc:"+x+","+y+"(Marikina Sports Center)"));
        chooser = Intent.createChooser(i, "Choose Your Map App");

        return chooser;
    }
}
