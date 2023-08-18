package com.ug.edadcanina;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.ug.edadcanina.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        ActivityMainBinding binding =
                ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



                //setContentView(R.layout.activity_main);

        EditText  ageEdit =findViewById(R.id.age_edit);
        Button button = findViewById(R.id.button);
        TextView resultText = findViewById(R.id.result_text);


        Log.d("MainActivity","ActivityCreate");
        binding.buttoncal.setOnClickListener(new OnClickListener()

               // button.setOnClickListener(new OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                String age = ageEdit.getText().toString();
                if(!age.isEmpty()) {
                    int ageInt = Integer.parseInt(age);
                    int result = ageInt * 7;
                    String resultString = "Si fuera perro, tu edad sería " + result + " años";
                    resultText.setText(resultString);
                }else {
                    Log.d("MainActivity","el campo edad está vacío");

                    Toast.makeText(MainActivity.this, "Debes insertar una edad", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
