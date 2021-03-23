package com.example.maytinh;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    TextView txtPhepToan, txtKetQua;
    Button btNgoac ,btXoa, btPhanTram ,btNhan ,btCong,btChia , btTru,bt0, bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8, bt9,btCham, btBang;
    String process;
    Boolean checkBraket = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtPhepToan = findViewById(R.id.txtPhepToan);
        txtKetQua = findViewById(R.id.txtKetQua);
        btNgoac = findViewById(R.id.btNgoac);
        btXoa = findViewById(R.id.btXoa);
        btPhanTram = findViewById(R.id.btPhanTram);
        btNhan = findViewById(R.id.btNhan);
        btCong = findViewById(R.id.btCong);
        btChia = findViewById(R.id.btChia);
        btTru = findViewById(R.id.btTru);
        bt0 = findViewById(R.id.btSo0);
        bt1 = findViewById(R.id.btSo1);
        bt2 = findViewById(R.id.btSo2);
        bt3 = findViewById(R.id.btSo3);
        bt4 = findViewById(R.id.btSo4);
        bt5 = findViewById(R.id.btSo5);
        bt6 = findViewById(R.id.btSo6);
        bt7 = findViewById(R.id.btSo7);
        bt8 = findViewById(R.id.btSo8);
        bt9 = findViewById(R.id.btSo9);
        btCham = findViewById(R.id.btCham);
        btBang = findViewById(R.id.btBang);
        //xu li bt xoa nek
        btXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtKetQua.setText("");
                txtPhepToan.setText("");
            }
        });
        //xu li cac con so
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtPhepToan.getText().toString();
                txtPhepToan.setText(process +"0");
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtPhepToan.getText().toString();
                txtPhepToan.setText(process +"0");
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtPhepToan.getText().toString();
                txtPhepToan.setText(process +"1");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtPhepToan.getText().toString();
                txtPhepToan.setText(process +"2");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtPhepToan.getText().toString();
                txtPhepToan.setText(process +"3");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtPhepToan.getText().toString();
                txtPhepToan.setText(process +"4");
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtPhepToan.getText().toString();
                txtPhepToan.setText(process +"5");
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtPhepToan.getText().toString();
                txtPhepToan.setText(process +"6");
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtPhepToan.getText().toString();
                txtPhepToan.setText(process +"7");
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtPhepToan.getText().toString();
                txtPhepToan.setText(process +"8");
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtPhepToan.getText().toString();
                txtPhepToan.setText(process +"9");
            }
        });
        //xu li cac phep toan
        btCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtPhepToan.getText().toString();
                txtPhepToan.setText(process +"+");
            }
        });
        btTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtPhepToan.getText().toString();
                txtPhepToan.setText(process +"-");
            }
        });
        btNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtPhepToan.getText().toString();
                txtPhepToan.setText(process +"x");
            }
        });
        btChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtPhepToan.getText().toString();
                txtPhepToan.setText(process +"/");
            }
        });
        btCham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtPhepToan.getText().toString();
                txtPhepToan.setText(process +".");
            }
        });
        btPhanTram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtPhepToan.getText().toString();
                txtPhepToan.setText(process +"%");
            }
        });
        btNgoac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBraket){
                    process = txtPhepToan.getText().toString();
                    txtPhepToan.setText(process +")");
                    checkBraket = false;
                }else {
                    process = txtPhepToan.getText().toString();
                    txtPhepToan.setText(process +"(");
                    checkBraket = true;
                }
            }
        });
        //xu ly bt bang
        btBang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = txtPhepToan.getText().toString();
                process = process.replaceAll("x","*");
                process = process.replaceAll("%","/100");
                process = process.replaceAll("/","/");
                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);
                String finalResul = "";
                try {
                    Scriptable scope = rhino.initStandardObjects();
                    finalResul = (String) rhino.evaluateString(scope,process,"javascrip",1,null).toString();
                }catch (Exception e){
                    finalResul = "0";
                }
                txtKetQua.setText(finalResul);
            }
        });
    }
}