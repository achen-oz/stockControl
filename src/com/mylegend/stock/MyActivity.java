package com.mylegend.stock;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MyActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void doItemLookUp(View view) {
        Intent intent = new Intent(this, ItemLookUpActivity.class);
        startActivity(intent);
    }
}
