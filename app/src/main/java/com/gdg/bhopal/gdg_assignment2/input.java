package com.gdg.bhopal.gdg_assignment2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class input extends AppCompatActivity {

    ResponseAdapter res;
    Button b1,b2;
    RecycleListView resRCV;
    ArrayList<feed> iList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        b1 = (Button)findViewById(R.id.wapas);
        b2 = (Button)findViewById(R.id.submit);

        iList = new ArrayList<feed>();
        feed gf = (feed) getIntent().getSerializableExtra("resp");
        iList.add(gf);
        res = new ResponseAdapter(this, iList);
        resRCV = (RecyclerView) findViewById(R.id.recycler);
        resRCV.setlayoutManager(new LinearLayoutManager(getApplicationContext()));
        resRCV.setAdapter(res);
        res.notifyDataSetChanged();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(input.this,form.class);
                startActivity(i);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent j = new Intent(input.this,sucess.class);
                startActivity(j);

            }
        });

    }

}

