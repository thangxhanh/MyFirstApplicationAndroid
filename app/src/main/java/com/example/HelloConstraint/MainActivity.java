package com.example.HelloConstraint;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button buttonZero;
    private Button buttonCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        buttonZero = (Button) findViewById(R.id.button_zero);
        buttonCount = (Button) findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if(mCount % 2 == 1) {
            view.setBackgroundColor(Color.parseColor("#03FF00"));
        } else {
            view.setBackgroundColor(Color.parseColor("#FF03DAC5"));
        }
        if(mCount == 1) {
            buttonZero.setBackgroundColor(Color.parseColor("#FE01FF"));
        }
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    public void setZero(View view) {
        mCount = 0;
        view.setBackgroundColor(Color.parseColor(R.color.gray);
        buttonCount.setBackgroundColor(R.color.purple_200);
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}