package com.example.razli.demolition;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

public class HomeActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview);

        Observable<String> observable = Observable.just("Reactive extensions is cool!");

        Consumer<String> onNextAction = new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                textView.setText("Received: " + s);
            }
        };

        observable.subscribe(onNextAction);
    }
}
