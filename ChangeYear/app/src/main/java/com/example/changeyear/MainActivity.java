package com.example.changeyear;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends Activity {
    EditText editNamDuongLich;
    TextView textViewAmLich;
    Button btnChuyenDoi;

    String[] can = {"Canh", "Tân", "Nhâm", "Quý", "Giáp", "Ất", "Bính", "Đinh", "Mậu", "Kỷ"};
    String[] chi = {"Thân", "Dậu", "Tuất", "Hợi", "Tý", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNamDuongLich = findViewById(R.id.editNamDuongLich);
        textViewAmLich = findViewById(R.id.textView5);
        btnChuyenDoi = findViewById(R.id.button1);

        btnChuyenDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int namDuong = Integer.parseInt(editNamDuongLich.getText().toString().trim());
                    int indexCan = namDuong % 10;
                    int indexChi = namDuong % 12;
                    String namAm = can[indexCan] + " " + chi[indexChi];
                    textViewAmLich.setText(namAm);
                }catch (NumberFormatException e){
                    textViewAmLich.setText("Vui lòng nhập số hợp lệ");
                }
            }
        });

    }
}