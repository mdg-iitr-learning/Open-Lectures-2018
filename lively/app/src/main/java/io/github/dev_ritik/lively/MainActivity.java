package io.github.dev_ritik.lively;

import android.app.WallpaperManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                try {
                    intent = new Intent(WallpaperManager.ACTION_CHANGE_LIVE_WALLPAPER);

                    intent.putExtra(WallpaperManager.EXTRA_LIVE_WALLPAPER_COMPONENT,
                            new ComponentName(MainActivity.this,
                                    LiveTimeWallpaper.class));

                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(MainActivity.this,
                            "Unsupported device!!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
