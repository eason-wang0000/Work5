package cn.edu.gdmec.s07150745.work5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setText("单击");
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"已单击我...",Toast.LENGTH_SHORT).show();
        System.out.println("已单击我...");
    }
}
