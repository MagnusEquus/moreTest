package com.example.fedor.moretest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class Act2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        View btnOut = findViewById(R.id.btnOut);
        final int[] barData  = new int[8];
        final int[] barData2 = new int[8];
        int[] res;
        btnOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Measument> mes=new ArrayList<>();
                RequestThread rThread = new RequestThread(new Push(GET,labNum, labAuth,taskNum,mes));
                rThread.start();
                while (rThread.isAlive())
                {

                }
                rThread=new getResults(GET,labNum, labAuth,taskNum);
                List<Results> res=rThread.start();
                while (rThread.isAlive())
                {

                }
                Intent mintent2=new Intent();
                mintent2.putExtra("keyG",res.mTarget);
                mintent2.putExtra("keyG2",res.eTarget);
                mintent2.putExtra("keyB",res.measurments);
                mintent2.putExtra("keyB2",res.errors);
                setResult(RESULT_OK, mintent2);
                finish();
            }
        });
    }
}
