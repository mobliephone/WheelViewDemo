package com.itheima.wheelpickerdemo.wheelpicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.itheima.wheelpicker.WheelPicker;
import com.itheima.wheelpicker.widgets.WheelDatePicker;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private WheelPicker wheelPicker;
    private WheelDatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wheelPicker = (WheelPicker) findViewById(R.id.wheelId);
        datePicker = (WheelDatePicker) findViewById(R.id.wheelDateId);

        List<String> list = new ArrayList<>();
        list.add("100");
        list.add("200");
        list.add("300");
        list.add("400");

        wheelPicker.setData(list);

        datePicker.setYearStart(2000);
        datePicker.setYearEnd(2018);
    }
}
