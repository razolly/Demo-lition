package com.example.razli.demolition;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

public class HomeActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview);

        // TODO continue from this link: https://blog.danlew.net/2014/09/15/grokking-rxjava-part-1/

        Disposable disposable = Observable.just("Hello me!")
                .map(s -> s + " - Raz")
                .subscribe(s -> textView.setText(s));
    }
}
