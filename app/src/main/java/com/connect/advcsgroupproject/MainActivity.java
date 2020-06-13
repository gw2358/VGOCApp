package com.connect.advcsgroupproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button)findViewById(R.id.about);
        Button c = (Button)findViewById(R.id.schedule);
        Button d = (Button)findViewById(R.id.music);
        Button e = (Button)findViewById(R.id.info);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MoreInfo.class);
                startActivity(intent);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/presentation/d/13eYTE4kXt9N-U4VV_3BU3daN_MOUhDTK5_dPPamd34Y/edit?usp=sharing"));
                startActivity(browserIntent);
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://soundcloud.com/seattle-vgoc"));
                startActivity(browserIntent);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AppInfo.class);
                startActivity(intent);
            }
        });
    }
}
