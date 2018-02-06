package com.example.android.take6;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Greta on 2018-02-03.
 */

public class CustomToast extends AppCompatActivity {

    // Method for displaying custom toast
    public void toast (String toast_text) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,(ViewGroup)findViewById(R.id.custom_toast));
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.BOTTOM, 0,150);
        ImageView image = layout.findViewById(R.id.toast_image);{
            image.setImageResource(R.drawable.bullred);
      TextView textV = layout.findViewById(R.id.toast);
        textV.setText(toast_text);

        toast.setView(layout);
        toast.show();
    }
}}
