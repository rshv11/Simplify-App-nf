package com.example.homepage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

import androidx.core.app.NotificationCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView card1, card2, card3, card4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1= (CardView) findViewById(R.id.c1);
        card2= (CardView) findViewById(R.id.c2);
        card3= (CardView) findViewById(R.id.c3);
        card4= (CardView) findViewById(R.id.c4);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch(v.getId())
        {
            case R.id.c1 :
                i=new Intent(this,SetReminder.class);
                startActivity(i);
                break;

            case R.id.c2:
                i=new Intent(this,MoodTracker.class);
                startActivity(i);
                break;
            case R.id.c3:
            i=new Intent(this,GroceryList.class);
            startActivity(i);
            break;
            case R.id.c4:
                i=new Intent(this,Notes.class);
                startActivity(i);
                break;
        }
    }
}
