package cn.edu.gdmec.s07150745.work5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Act2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setText("单击");
        btn2.setOnClickListener(new OuterClass("已单击我..."));
    }
}
class OuterClass implements View.OnClickListener{
    private String str="已单击我....";
    public OuterClass(String str){
        super();
        this.str=str;
    }
    @Override
    public void onClick(View v) {
        System.out.println(str);
    }
}