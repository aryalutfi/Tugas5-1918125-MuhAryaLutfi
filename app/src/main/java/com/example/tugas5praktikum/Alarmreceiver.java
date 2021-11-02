package com.example.tugas5praktikum;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

public class Alarmreceiver extends BroadcastReceiver {
    MediaPlayer player;

    @Override
    public void onReceive(Context context, Intent intent){
        Toast.makeText(context, "Alarm Berbunyi !!!", Toast.LENGTH_LONG).show();
        player = MediaPlayer.create(context,R.raw.warning);
        player.start();
    }
}
