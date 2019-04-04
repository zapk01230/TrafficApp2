package sdu.cs.eakkapod.trafficapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AboutApp extends AppCompatActivity {

    //ประกาศตัวแปล
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);
    }

    public void clickBack(View view) {
        finish();
    }//End clickBack() Method

    public void playSound(View view) {
        mediaPlayer = MediaPlayer.create(this, R.raw.eakeak);
        mediaPlayer.start();
    }//end playSound()

    public void cilckFB(View view) {
        Intent fbIntent = new Intent(Intent.ACTION_VIEW);
        fbIntent.setData(Uri.parse("https://www.facebook.com/profile.php?id=100002030964886"));
        startActivity(fbIntent);
    }//end cilckFB()

    public void cilckMobile(View view) {
        Intent mobileIntent = new Intent(Intent.ACTION_DIAL);
        mobileIntent.setData(Uri.parse("tel:0874740009"));
        startActivity(mobileIntent);
    }//end cilckMobile()

    public void cilckMap(View view) {
        Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:13.776327, 100.510671(มหาวิทยาลัยสวนดุสิต)");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
      //mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }//end cilckMap()
}//end class
