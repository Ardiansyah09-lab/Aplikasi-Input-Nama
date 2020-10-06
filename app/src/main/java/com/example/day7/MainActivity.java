package com.example.day7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText TextNama, TextAlamat;
    TextView Hasil1, Hasil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextNama=(EditText)findViewById(R.id.TxtNama);
        TextAlamat=(EditText)findViewById(R.id.TxtAlamat);
        Hasil1=(TextView)findViewById(R.id.label2);
        Hasil2=(TextView)findViewById(R.id.label1);

    }

    public void TampilkanNama(View view) {
        if (view.getId()== R.id.BtnTampil){
            Hasil1.setText(TextNama.getText().toString());
            Hasil2.setText(TextAlamat.getText().toString());
        }

        else if(view.getId()==R.id.Btn_Tampil){
            Hasil1.setText("");
            Hasil2.setText("");
            TextNama.setText("");
            TextAlamat.setText("");
        }
    }
}
