package com.example.login;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);

            EditText username = (EditText) findViewById(R.id.username);

            MaterialButton regbtn = (MaterialButton) findViewById(R.id.signupbtn);

            regbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String username1 = username.getText().toString();
                    Toast.makeText(MainActivity.this, "USERNAME IS " + username1, Toast.LENGTH_SHORT).show();
                }
            });




            return insets;
        });
    }
}