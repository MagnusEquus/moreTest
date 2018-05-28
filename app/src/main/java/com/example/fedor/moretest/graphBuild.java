package com.example.fedor.moretest;

import android.graphics.Color;

import com.jjoe64.graphview.ValueDependentColor;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;

public class graphBuild {

    public int[] barData1 = new int[8];
    int barG;

    public BarGraphSeries<DataPoint> graphBuild(int[] barData1, final int barG) {   
        BarGraphSeries<DataPoint> series1 = new BarGraphSeries<>(new DataPoint[]{
                new DataPoint(0, barData1[0]),
                new DataPoint(1, barData1[1]),
                new DataPoint(2, barData1[2]),
                new DataPoint(3, barData1[3]),
                new DataPoint(4, barData1[4]),
                new DataPoint(5, barData1[5]),
                new DataPoint(6, barData1[6]),
                new DataPoint(7, barData1[7])
        });
        series1.setValueDependentColor(new ValueDependentColor<DataPoint>() {
            @Override
            public int get(DataPoint data) {
                if ((int) data.getX() != barG) {
                    return Color.rgb(228, 39, 55);
                } else {
                    return Color.rgb(128, 139, 255);
                }

            }
        });
        series1.setSpacing(5);
        return series1;
    }
}
