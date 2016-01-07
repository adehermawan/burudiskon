package com.burudiskon.burudiskon;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by adehermawan on 9/15/15.
 */
public class AdditionalForm extends Activity{

    Spinner spinnerDropDown;
    String[] cities={
            "BNI",
            "BRI",
            "BCA",
            "Mandiri"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.additional_form);

        spinnerDropDown = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,cities);
        spinnerDropDown.setAdapter(adapter);
        spinnerDropDown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int sid=spinnerDropDown.getSelectedItemPosition();
                Toast.makeText(getBaseContext(),"You have selected : "+cities[sid],Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.chk_accesories:
                if (checked) {
                    // Put some meat on the sandwich
                }else {
                    // Remove the meat
                    break;
                }
            case R.id.chk_entertainment:
                if (checked){

                }
                // Cheese me
                else{
                    break;
                }
                // I'm lactose intolerant

            // TODO: Veggie sandwich
        }
    }


}
