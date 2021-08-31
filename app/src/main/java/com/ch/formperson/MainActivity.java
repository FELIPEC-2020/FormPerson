package com.ch.formperson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtDocument;
    private EditText txtName;
    private EditText txtLastName;
    private Button btnSave;
    private ArrayList<Person> listPersons = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtDocument = findViewById(R.id.txtDocument);
        txtName = findViewById(R.id.txtName);
        txtLastName = findViewById(R.id.txtLastName);
        btnSave = findViewById(R.id.btnSave);
        btnSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnSave){
            addPerson();
        }
    }

    private void addPerson(){
        String document = txtDocument.getText().toString();
        String name = txtName.getText().toString();
        String lastName = txtLastName.getText().toString();

        Person objPerson = new Person(document, name, lastName);
        listPersons.add(objPerson);
        cleanRecords();
        Toast.makeText(getApplicationContext(),
                "Toast por defecto", Toast.LENGTH_SHORT);
    }

    private void cleanRecords(){
        txtDocument.getText().clear();
        txtName.getText().clear();
        txtLastName.getText().clear();
    }
}