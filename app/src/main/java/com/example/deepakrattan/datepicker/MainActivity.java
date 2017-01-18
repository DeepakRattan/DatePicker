package com.example.deepakrattan.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    private DatePicker datePicker;
    private TextView txtDate, txtCurrentTime;
    int day, month, year, min, hour;
    private TimePicker timePicker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //findViewByID

        /*datePicker = (DatePicker) findViewById(R.id.datePicker);
        txtDate = (TextView) findViewById(R.id.txtDate);
        txtDate.setText(currentDate());*/

        timePicker = (TimePicker) findViewById(R.id.timePicker);
        txtCurrentTime = (TextView) findViewById(R.id.txtCurrentTime);
        txtCurrentTime.setText(currentTime());
    }

    public String currentDate() {
        StringBuilder stringBuilder = new StringBuilder();
        day = datePicker.getDayOfMonth();
        month = datePicker.getMonth() + 1;
        year = datePicker.getYear();

        stringBuilder.append("Current Date : " + day + "/" + month + "/" + year);
        return stringBuilder.toString();

    }

    public String currentTime() {
        StringBuilder stringBuilder = new StringBuilder();
        min = timePicker.getCurrentMinute();
        hour = timePicker.getCurrentHour();

        stringBuilder.append("Current Time : " + hour + ":" + min);
        return stringBuilder.toString();

    }


}
