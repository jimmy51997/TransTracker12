package com.example.prince.transtracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class InvestPage extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invest_page);

        Spinner spinCity = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(InvestPage.this,android.R.layout.simple_expandable_list_item_1,getResources().getStringArray(R.array.City));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinCity.setAdapter(myAdapter);

        spinCity.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        if(position==1) {
            Spinner spinLocality = (Spinner) findViewById(R.id.spinner2);
            ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(InvestPage.this, android.R.layout.simple_expandable_list_item_1, getResources().getStringArray(R.array.localityPatna));
            myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinLocality.setAdapter(myAdapter2);
        }

        if(position==2) {
            Spinner spinLocality = (Spinner) findViewById(R.id.spinner2);
            ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(InvestPage.this, android.R.layout.simple_expandable_list_item_1, getResources().getStringArray(R.array.localityMuzzafpur));
            myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinLocality.setAdapter(myAdapter2);
        }

        if(position==3) {
            Spinner spinLocality = (Spinner) findViewById(R.id.spinner2);
            ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(InvestPage.this, android.R.layout.simple_expandable_list_item_1, getResources().getStringArray(R.array.localityGaya));
            myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinLocality.setAdapter(myAdapter2);
        }

        if(position==4) {
            Spinner spinLocality = (Spinner) findViewById(R.id.spinner2);
            ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(InvestPage.this, android.R.layout.simple_expandable_list_item_1, getResources().getStringArray(R.array.localityNalanda));
            myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinLocality.setAdapter(myAdapter2);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
