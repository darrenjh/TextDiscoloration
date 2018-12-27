package com.yang.textdiscoloration;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yang.textdiscoloration.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    public static final String TAG=MainActivity.class.getSimpleName();

    private ActivityMainBinding binding;
    private static final String text="The Tibetan plateau is a quarter of China. Much of it is extremely remote and inhospitable. Its southern border runs through the world's highest mountain range, the formidable Himalayas. Its central part is a windswept and freezing wilderness, the size of western Europe. But this challenging place is home to incredible wildlife. There are more large creatures here than anywhere else in China. Tibet has been a province of China for more than fifty years, Yet, it has a unique character, shaped by over a thousand years of Tibetan Buddhism. This obscure and archaic-looking religion. has produced one of the most enlightened cultures on Earth.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.textView1.setText(text);
        binding.textView1.start();
        binding.textView2.startText(text);
    }
}
