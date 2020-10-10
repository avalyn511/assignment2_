package ca.dal.cs.csci3130.a2;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class PopUpBox extends Activity implements View.OnClickListener{
    PopupWindow box;
    LinearLayout layout;
    TextView text;
    LinearLayout.LayoutParams p;
    LinearLayout main;
    Button button;
    boolean click = true;

    @Override
    public void onCreate(Bundle state){
        super.onCreate(state);
        box = new PopupWindow(this);
        layout = new LinearLayout(this);
        main = new LinearLayout(this);
        button = new Button(this);
        button.setText("Close");
        button.setOnClickListener(new onClickListener() {
            public void onClick(android.view.View v){
                if(click){
                    box.dismiss();
                    click = true;
                }
                else{
                    box.showAtLocation(layout, Gravity.BOTTOM, 10, 10);
                    box.update(75, 75, 300, 80);
                    click = false;
                }
            }
        });
        text.setText("Hello World");
        layout.addView(text);
        box.setContentView(layout);
        main.addView(button, p);
        setContentView(main);
    }

    @Override
    public void onClick(View v) {

    }
}
