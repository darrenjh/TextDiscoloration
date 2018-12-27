package com.yang.textdiscoloration;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class OneByOneTextView extends AppCompatTextView {
    private int count;
    private int endTextIndex=0;
    private String text;

    public OneByOneTextView(Context context) {
        super(context);
    }

    public OneByOneTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void startText(String text){
        this.text=text;
        this.count=text.length();
        start();
    }

    public void start(){
        endTextIndex++;
        String newText=text.substring(0,endTextIndex);
        setText(newText);
        if(endTextIndex<count){
            postDelayed(new Runnable() {
                @Override
                public void run() {
                    start();
                }
            },50);
        }
    }


}
