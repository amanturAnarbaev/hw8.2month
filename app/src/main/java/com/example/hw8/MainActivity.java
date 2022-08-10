package com.example.hw8;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer first;
    private Integer second;
    private Boolean isOperation;
    private Integer result;
    private Double result_double;
    private String symbol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        Button button_toSecondActiviry = findViewById(R.id.button_toSecondActiviry);
        button_toSecondActiviry.setAlpha(0);
        Button destroy= findViewById(R.id.destroy);
        findViewById(R.id.button_toSecondActiviry).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, SecondActivity.class);
                String text =textView.getText().toString();
                intent.putExtra("key1", text);
                startActivity(intent);
            }
        });

    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    public void onNumberClick(View view) {
        switch (view.getId()) {

//
            case R.id.bt_1:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("1");
                } else if (isOperation) {
                    textView.setText("1");
                } else {
                    textView.append("1");
                }
                break;
            case R.id.bt_2:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("2");
                } else if (isOperation) {
                    textView.setText("2");
                } else {
                    textView.append("2");
                }
                break;
            case R.id.bt_3:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("3");
                } else if (isOperation) {
                    textView.setText("3");
                } else {
                    textView.append("3");
                }
                break;
            case R.id.bt_4:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("4");
                } else if (isOperation) {
                    textView.setText("4");
                } else {
                    textView.append("4");
                }
                break;
            case R.id.bt_5:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("5");
                } else if (isOperation) {
                    textView.setText("5");
                } else {
                    textView.append("5");
                }
                break;
            case R.id.bt_6:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("6");
                } else if (isOperation) {
                    textView.setText("6");
                } else {
                    textView.append("6");
                }
                break;
            case R.id.bt_7:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("7");
                } else if (isOperation) {
                    textView.setText("7");
                } else {
                    textView.append("7");
                }
                break;
            case R.id.bt_8:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("8");
                } else if (isOperation) {
                    textView.setText("8");
                } else {
                    textView.append("8");
                }
                break;
            case R.id.bt_9:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("9");
                }else if (isOperation) {
                    textView.setText("9");
                } else {
                    textView.append("9");
                }
                break;
            case R.id.bt_0:
                if (textView.getText().toString().equals("0")) {
                    textView.setText("0");
                } else if (isOperation) {
                    textView.setText("0");
                } else {
                    textView.append("0");
                }
                break;
        }
        isOperation = false;
    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    public void onOperationClick(View view) {
        Button button_toSecondActiviry = findViewById(R.id.button_toSecondActiviry);
        switch (view.getId()) {

            case R.id.bt_ac:
                textView.setText("0");
                first = 0;
                second = 0;
                break;
            case R.id.bt_division:
                first = Integer.parseInt(textView.getText().toString());
                symbol = "/";
                break;
            case R.id.bt_multiplycation:
                first = Integer.parseInt(textView.getText().toString());
                symbol = "*";
                break;

            case R.id.bt_adding:
                first = Integer.parseInt(textView.getText().toString());
                if (symbol.equals(".")) {
                    symbol = "+";
                    break;
                } else {
                    first = Integer.parseInt(textView.getText().toString());
                    symbol = "+";
                    break;
                }
            case R.id.bt_substraction:
                first = Integer.parseInt(textView.getText().toString());
                symbol = "-";
                break;

            case R.id.bt_equals:
                button_toSecondActiviry.setAlpha(1);
                second = Integer.parseInt(textView.getText().toString());
                if (symbol.equals("+")) {
                    result = first + second;
                } else if (symbol.equals("-")) {
                    result = first - second;
                } else if (symbol.equals("/")) {
                    result_double = (first.doubleValue() / second.doubleValue());
                } else if (symbol.equals("*")) {
                    result = first * second;
                }

                if (symbol.equals("/")) {
                    textView.setText(result_double.toString());
                }else{
                    textView.setText(result.toString());}
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());

        }


        isOperation = true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
