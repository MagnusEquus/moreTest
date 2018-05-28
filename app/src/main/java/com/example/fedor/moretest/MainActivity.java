package com.example.fedor.moretest;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.jjoe64.graphview.GraphView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ListView lstV;
    String labAut;
    int tskNum;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.content.Intent intent = getIntent();
        RequestThread rThread = new RequestThread(new GetResults(...))
        rThread.start()
        List<Results> lr = rThread.getResults();
        String[] valuesMas = intent.getStringArrayExtra("valuesNames"); //Сюда приходят ключи
        java.util.TreeMap<String, double[]> labData = (java.util.TreeMap<String, double[]>) intent.getSerializableExtra("data");
        View btn1 = findViewById(R.id.btn1);
        for (aaa:lr) {
            //добаляет график
        }
        lstV=findViewById(R.id.lstV);
        ArrayList<Map<String,Object>> data = new ArrayList<Map<String,Object>>();
        Map<String,Object> map;
        String[] from={"name","graph1","graph2","btn"};
        int[] to={};
        Adapter ad1=new Adapter(this.getApplicationContext(),data,R.layout.activity_main,from,to);
        ad1.setViewBinder(new Binder());
        lstV.setAdapter(ad1);
        btn1.setOnClickListener(onClick);
    }

    android.view.View.OnClickListener onClick = new android.view.View.OnClickListener() {
        public void onClick(android.view.View view) {
            Intent mintent = new Intent(MainActivity.this,Act2.class);
            mintent.putExtra("labAut", labAut);
            mintent.putExtra("taskNum", tskNum);
            startActivityForResult(mintent, 1);
        }

    };

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==1)
        {
            if (resultCode==RESULT_OK)
            {
                GraphView graph1= new GraphView();
                graph1.addSeries(graphBuild(data.getIntArrayExtra("keyB"),data.getIntExtra("keyG", 0)));
                barG = data.getIntExtra("keyG", 0);
                barG2 = data.getIntExtra("keyG2", 0);
                barData1 = data.getIntArrayExtra("keyB");
                barData2 = data.getIntArrayExtra("keyB2");
        }
            }
        }
    }
    class Binder implements SimpleAdapter.ViewBinder {

        @Override
        public boolean setViewValue(View view, Object data, String textRepresentation) {
            return false;
        }
    }