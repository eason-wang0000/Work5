package cn.edu.gdmec.s07150745.work5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Act4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act4);
        Button btn4 = (Button) findViewById(R.id.btn4);
        btn4.setText("单击");
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Act4.this,"已单击我...",Toast.LENGTH_SHORT).show();
                System.out.println("已单击我...");
            }
        });
    }
}
