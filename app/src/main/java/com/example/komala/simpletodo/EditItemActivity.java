package com.example.komala.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import static com.example.komala.simpletodo.R.id.editText;

public class EditItemActivity extends AppCompatActivity {

    Integer position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String item = getIntent().getStringExtra("item");
        position = getIntent().getIntExtra("position", 0);
        EditText editText = (EditText) findViewById(R.id.editText);
        editText.setText(item);
        editText.setSelection(item.length());
    }

    public void onSubmit(View v) {
        EditText etName = (EditText) findViewById(editText);
        Intent data = new Intent();
        data.putExtra("item", etName.getText().toString());
        data.putExtra("position", position);
        setResult(1, data);
        finish();
    }
}
