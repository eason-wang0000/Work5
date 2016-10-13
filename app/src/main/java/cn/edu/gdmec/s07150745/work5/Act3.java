package cn.edu.gdmec.s07150745.work5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Act3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act3);
        Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setText("单击");
        btn3.setOnClickListener(new OuterClass());
    }
    class OuterClass implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Toast.makeText(Act3.this,"已单击我...",Toast.LENGTH_SHORT).show();
            System.out.println("已单击我...");
        }
    }
}
