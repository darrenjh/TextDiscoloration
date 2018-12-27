package com.yang.textdiscoloration;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.AppCompatTextView;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;

public class TextDiscolorView extends AppCompatTextView {
    private int endTextIndex=0;

    public TextDiscolorView(Context context) {
        super(context);
    }

    public TextDiscolorView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void start(){
        SpannableString spanString = new SpannableString(getText());
        ForegroundColorSpan span = new ForegroundColorSpan(Color.RED);
        endTextIndex++;
        spanString.setSpan(span, 0, endTextIndex, Spannable.SPAN_EXCLUSIVE_INCLUSIVE);
        setText(spanString);
        if(endTextIndex<getText().length()){
            postDelayed(new Runnable() {
                @Override
                public void run() {
                    start();
                }
            },50);
        }
    }
}
