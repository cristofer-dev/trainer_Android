package io.cristofer.trainerandroid;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AgregarTarea();
    }

    public void AgregarTarea(){
        FloatingActionButton btn_add = (FloatingActionButton) findViewById(R.id.btn_plus);
        btn_add.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

            }
        });
    }
}
