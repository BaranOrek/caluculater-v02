package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //TextView resultBar = findViewById(R.id.resultText);
    private Button zeroBtn;
    private TextView controlBar;
    private TextView resultBar;
    private Button oneBtn;
    private Button twoBtn;
    private Button threeBtn;
    private Button fourBtn;
    private Button fiveBtn;
    private Button sixBtn;
    private Button sevenBtn;
    private Button eightBtn;
    private Button nineBtn;
    private Button discardBtn;
    private Button clearBtn;
    private Button dotBtn;
    private Button equalBtn;
    private Button crossBtn;
    private Button minusBtn;
    private Button plusBtn;
    private Button divisionBtn;
    private int crosslength;
    private Double value1;
    private Double value2;
    private Double value3;
    private Double value4;
    private Double valueCheck;
    private CharSequence currentText;
    private int operation;
    private int checkk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controlBar = findViewById(R.id.controlText);
        resultBar = findViewById(R.id.resultText);
        resultBar.setText(null);
        zeroBtn = findViewById(R.id.button0);
        oneBtn = findViewById(R.id.button1);
        twoBtn = findViewById(R.id.button2);
        threeBtn = findViewById(R.id.button3);
        fourBtn = findViewById(R.id.button4);
        fiveBtn = findViewById(R.id.button5);
        sixBtn = findViewById(R.id.button6);
        sevenBtn = findViewById(R.id.button7);
        eightBtn = findViewById(R.id.button8);
        nineBtn = findViewById(R.id.button9);
        discardBtn = findViewById(R.id.discard);
        clearBtn = findViewById(R.id.buttonClr);
        dotBtn = findViewById(R.id.buttonDot);
        equalBtn = findViewById(R.id.buttonequal);
        crossBtn = findViewById(R.id.buttonCross);
        minusBtn = findViewById(R.id.buttonMinus);
        plusBtn = findViewById(R.id.buttonPlus);
        divisionBtn = findViewById(R.id.buttonDivide);


        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int textlength = controlBar.length();
                if (textlength == 0 && !resultBar.getText().toString().isEmpty()) {
                    controlBar.setText("0");
                    resultBar.setText(null);
                } else if (textlength ==0) {
                    controlBar.append("0");
                }else if (textlength < 20) {
                    controlBar.append("0");
                }
                minusBtn.setEnabled(true);
                plusBtn.setEnabled(true);
                divisionBtn.setEnabled(true);
                crossBtn.setEnabled(true);
                equalBtn.setEnabled(true);
            }
        });

        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int textlength = controlBar.length();
                if (textlength == 0 && !resultBar.getText().toString().isEmpty()) {
                    controlBar.setText("1");
                    resultBar.setText(null);
                } else if (textlength ==0) {
                    controlBar.append("1");
                }else if (textlength < 20) {
                    controlBar.append("1");
                }
                minusBtn.setEnabled(true);
                plusBtn.setEnabled(true);
                divisionBtn.setEnabled(true);
                crossBtn.setEnabled(true);
                equalBtn.setEnabled(true);
            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int textlength = controlBar.length();
                if (textlength == 0 && !resultBar.getText().toString().isEmpty()) {
                    controlBar.setText("2");
                    resultBar.setText(null);
                } else if (textlength ==0) {
                    controlBar.append("2");
                }else if (textlength < 20) {
                    controlBar.append("2");
                }
                minusBtn.setEnabled(true);
                plusBtn.setEnabled(true);
                divisionBtn.setEnabled(true);
                crossBtn.setEnabled(true);
                equalBtn.setEnabled(true);
            }
        });

        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int textlength = controlBar.length();
                if (textlength == 0 && !resultBar.getText().toString().isEmpty()) {
                    controlBar.setText("3");
                    resultBar.setText(null);
                } else if (textlength ==0) {
                    controlBar.append("3");
                }else if (textlength < 20) {
                    controlBar.append("3");
                }
                minusBtn.setEnabled(true);
                plusBtn.setEnabled(true);
                divisionBtn.setEnabled(true);
                crossBtn.setEnabled(true);
                equalBtn.setEnabled(true);
            }
        });

        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int textlength = controlBar.length();
                if (textlength == 0 && !resultBar.getText().toString().isEmpty()) {
                    controlBar.setText("4");
                    resultBar.setText(null);
                } else if (textlength ==0) {
                    controlBar.append("4");
                }else if (textlength < 20) {
                    controlBar.append("4");
                }
                minusBtn.setEnabled(true);
                plusBtn.setEnabled(true);
                divisionBtn.setEnabled(true);
                crossBtn.setEnabled(true);
                equalBtn.setEnabled(true);
            }
        });

        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int textlength = controlBar.length();
                if (textlength == 0 && !resultBar.getText().toString().isEmpty()) {
                    controlBar.setText("5");
                    resultBar.setText(null);
                } else if (textlength ==0) {
                    controlBar.append("5");
                }else if (textlength < 20) {
                    controlBar.append("5");
                }
                minusBtn.setEnabled(true);
                plusBtn.setEnabled(true);
                divisionBtn.setEnabled(true);
                crossBtn.setEnabled(true);
                equalBtn.setEnabled(true);
            }
        });

        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int textlength = controlBar.length();
                if (textlength == 0 && !resultBar.getText().toString().isEmpty()) {
                    controlBar.setText("6");
                    resultBar.setText(null);
                } else if (textlength ==0) {
                    controlBar.append("6");
                }else if (textlength < 20) {
                    controlBar.append("6");
                }
                minusBtn.setEnabled(true);
                plusBtn.setEnabled(true);
                divisionBtn.setEnabled(true);
                crossBtn.setEnabled(true);
                equalBtn.setEnabled(true);
            }
        });

        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int textlength = controlBar.length();
                if (textlength == 0 && !resultBar.getText().toString().isEmpty()) {
                    controlBar.setText("7");
                    resultBar.setText(null);
                } else if (textlength ==0) {
                    controlBar.append("7");
                }else if (textlength < 20) {
                    controlBar.append("7");
                }
                minusBtn.setEnabled(true);
                plusBtn.setEnabled(true);
                divisionBtn.setEnabled(true);
                crossBtn.setEnabled(true);
                equalBtn.setEnabled(true);
            }
        });

        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int textlength = controlBar.length();
                if (textlength == 0 && !resultBar.getText().toString().isEmpty()) {
                    controlBar.setText("8");
                    resultBar.setText(null);
                } else if (textlength ==0) {
                    controlBar.append("8");
                }else if (textlength < 20) {
                    controlBar.append("8");
                }
                minusBtn.setEnabled(true);
                plusBtn.setEnabled(true);
                divisionBtn.setEnabled(true);
                crossBtn.setEnabled(true);
                equalBtn.setEnabled(true);
            }
        });

        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int textlength = controlBar.length();
                if (textlength == 0 && !resultBar.getText().toString().isEmpty()) {
                    controlBar.setText("9");
                    resultBar.setText(null);
                } else if (textlength ==0) {
                    controlBar.append("9");
                }else if (textlength < 20) {
                    controlBar.append("9");
                }
                minusBtn.setEnabled(true);
                plusBtn.setEnabled(true);
                divisionBtn.setEnabled(true);
                crossBtn.setEnabled(true);
                equalBtn.setEnabled(true);

            }
        });

        dotBtn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                if (controlBar.length() == 0 || controlBar.getText().toString().equals("-") || controlBar.getText().toString().equals("+") ||
                        controlBar.getText().toString().equals("/") || controlBar.getText().toString().equals("x")) {
                    controlBar.append("0.");

                } else if (controlBar.length() < 20) {
                    controlBar.append(".");

                }
                dotBtn.setEnabled(false);
            }


        });

        equalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int textlength = controlBar.length();

                if (textlength == 0) {
                    controlBar.setText(null);
                } else if (textlength < 20) {
                    if (controlBar.getText().toString().contains("x")) {

                        switch (operation) {

                            case 1:
                                value3 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                value2 *= value3;
                                value1 += value2;
                                resultBar.setText(value1.toString());
                                controlBar.setText(null);
                                Log.i("aaa", value1.toString());
                                operation = 0;
                                break;

                            case 2:
                                value3 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                value2 *= value3;
                                value1 -= value2;
                                resultBar.setText(value1.toString());
                                Log.i("aaa", value1.toString());
                                controlBar.setText(null);
                                operation = 0;
                                break;
                            case 3:
                                value3 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                value2 *= value3;
                                value1 = value2;
                                resultBar.setText(value1.toString());
                                controlBar.setText(null);
                                Log.i("aaa", value1.toString());
                                operation = 0;
                                break;
                            case 4:
                                value2 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                value1 *= value2;
                                resultBar.setText(value1.toString());
                                controlBar.setText(null);
                                operation = 0;
                        }

                    } else if (controlBar.getText().toString().contains("/")) {

                        switch (operation) {

                            case 1:
                                value3 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                value2 /= value3;
                                value1 += value2;
                                resultBar.setText(value1.toString());
                                controlBar.setText(null);
                                Log.i("aaa", value1.toString());
                                operation = 0;
                                break;

                            case 2:
                                value3 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                value2 /= value3;
                                value1 += value2;
                                resultBar.setText(value1.toString());
                                controlBar.setText(null);
                                Log.i("aaa", value1.toString());
                                operation = 0;
                                break;

                            case 3:
                                value3 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                value2 /= value3;
                                value1 = value2;
                                resultBar.setText(value1.toString());
                                controlBar.setText(null);
                                Log.i("aaa", value1.toString());
                                operation = 0;
                                break;

                            case 4:
                                value2 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                value1 /= value2;
                                resultBar.setText(value1.toString());
                                controlBar.setText(null);
                                operation = 0;
                        }

                    } else if (controlBar.getText().toString().contains("+") && controlBar.getText().toString().contains("-")) {
                        if (textlength == 2) {
                            resultBar.setText(value1.toString());
                        } else if (textlength > 2) {
                            value2 = Double.parseDouble(controlBar.getText().subSequence(1, textlength).toString());
                            value1 += value2;
                            resultBar.setText(value1.toString());
                            controlBar.setText(null);
                        }
                    } else if (controlBar.getText().toString().contains("+")) {
                        if (textlength == 1) {
                            resultBar.setText(value1.toString());
                            controlBar.setText(null);
                        } else if (textlength > 1) {
                            value2 = Double.parseDouble(controlBar.getText().subSequence(1, textlength).toString());
                            value1 += value2;
                            resultBar.setText(value1.toString());
                            controlBar.setText(null);
                        }
                    } else if (controlBar.getText().toString().contains("-") && textlength == 2) {
                        controlBar.append("1");
                        valueCheck = Double.parseDouble(controlBar.getText().subSequence(1, controlBar.length()).toString());
                        currentText = controlBar.getText();
                        controlBar.setText(currentText.subSequence(0, currentText.length() - 1));
                        if (valueCheck < 0) {
                            resultBar.setText(value1.toString());
                            controlBar.setText(null);
                        } else {
                            value2 = Double.parseDouble(controlBar.getText().subSequence(1, textlength).toString());
                            value1 -= value2;
                            resultBar.setText(value1.toString());
                            controlBar.setText(null);
                        }

                    } else if (controlBar.getText().toString().contains("-") && textlength == 1) {
                        resultBar.setText(value1.toString());
                        controlBar.setText(null);
                    } else if (controlBar.getText().toString().contains("-")) {
                        value2 = Double.parseDouble(controlBar.getText().subSequence(1, textlength).toString());
                        value1 -= value2;
                        resultBar.setText(value1.toString());
                        controlBar.setText(null);
                    }


                }


            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int textlength = controlBar.length();
                if (textlength == 0) {
                    controlBar.setText("-");
                    minusBtn.setEnabled(false);

                } else if (controlBar.getText().toString().equals("-") || controlBar.getText().toString().equals("+")
                        || controlBar.getText().toString().equals("x") || controlBar.getText().toString().equals("/")) {
                    controlBar.append("-");
                    minusBtn.setEnabled(false);
                } else if (textlength < 20) {
                    if (resultBar.getText().toString().isEmpty()) {
                        value1 = Double.parseDouble(controlBar.getText().toString());
                        resultBar.append(value1.toString());
                        value2 = (double) 0;
                        controlBar.setText(null);
                        controlBar.append("-");
                    } else if (controlBar.getText().toString().contains("x")) {

                        switch (operation) {

                            case 1:
                                value3 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                resultBar.append("x" + value3 + ")");
                                controlBar.setText("-");
                                value2 *= value3;
                                value1 += value2;
                                Log.i("aaa", value1.toString());
                                operation = 0;
                                break;

                            case 2:
                                value3 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                resultBar.append("x" + value3 + ")");
                                controlBar.setText("-");
                                value2 *= value3;
                                value1 -= value2;
                                Log.i("aaa", value1.toString());
                                operation = 0;
                                break;

                            case 3:
                                value3 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                resultBar.append("x" + value3 + ")");
                                value2 *= value3;
                                value1 = value2;
                                controlBar.setText("-");
                                Log.i("aaa", value1.toString());
                                operation = 0;
                                break;

                            case 4:
                                value2 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                value1 *= value2;
                                resultBar.setText(value1.toString());
                                controlBar.setText(null);
                                operation = 0;
                        }

                    } else if (controlBar.getText().toString().contains("/")) {

                        switch (operation) {

                            case 1:
                                value3 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                resultBar.append("x" + value3 + ")");
                                controlBar.setText("-");
                                value2 /= value3;
                                value1 += value2;
                                Log.i("aaa", value1.toString());
                                operation = 0;
                                break;

                            case 2:
                                value3 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                resultBar.append("/" + value3 + ")");
                                controlBar.setText("-");
                                value2 /= value3;
                                value1 -= value2;
                                Log.i("aaa", value1.toString());
                                operation = 0;
                                break;

                            case 3:
                                value3 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                resultBar.append("/" + value3 + ")");
                                value2 /= value3;
                                value1 = value2;
                                controlBar.setText("+");
                                Log.i("aaa", value1.toString());
                                operation = 0;
                                break;

                            case 4:
                                value2 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                value1 /= value2;
                                resultBar.setText(value1.toString());
                                controlBar.setText(null);
                                operation = 0;
                        }

                    } else if (!resultBar.getText().toString().isEmpty() && controlBar.getText().toString().contains("+")) {
                        int cText = controlBar.length();
                        value2 = Double.parseDouble(controlBar.getText().toString().subSequence(1, cText).toString());
                        resultBar.append("+" + "(" + value2 + ")");
                        value1 += value2;
                        controlBar.setText(null);
                        controlBar.append("-");
                    } else if (!resultBar.getText().toString().isEmpty()) {
                        Log.i("bbb", resultBar.getText().toString());
                        value2 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                        value1 -= value2;
                        resultBar.append(controlBar.getText());
                        controlBar.setText("-");
                        value2 = null;
                    }
                }


            }
        });

        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int textlength = controlBar.length();
                if (textlength == 0 && resultBar.length() == 0) {
                    controlBar.setText(null);
                } else if (textlength == 0 && resultBar.length() > 0) {
                    controlBar.setText("+");
                    plusBtn.setEnabled(false);
                } else if (textlength < 20) {
                    if (resultBar.getText().toString().isEmpty()) {
                        value1 = Double.parseDouble(controlBar.getText().toString());
                        resultBar.append(value1.toString());
                        controlBar.setText(null);
                        controlBar.append("+");
                        plusBtn.setEnabled(false);
                    } else if (controlBar.getText().toString().contains("x")) {

                        switch (operation) {

                            case 1:
                                value3 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                resultBar.append("x" + value3 + ")");
                                controlBar.setText("-");
                                value2 *= value3;
                                value1 += value2;
                                Log.i("aaa", value1.toString());
                                operation = 0;
                                break;

                            case 2:
                                value3 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                resultBar.append("x" + value3 + ")");
                                controlBar.setText("-");
                                value2 *= value3;
                                value1 -= value2;
                                Log.i("aaa", value1.toString());
                                operation = 0;
                                break;

                            case 3:
                                value3 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                resultBar.append("x" + value3 + ")");
                                value2 *= value3;
                                value1 = value2;
                                controlBar.setText("+");
                                Log.i("aaa", value1.toString());
                                operation = 0;
                                break;

                            case 4:
                                value2 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                value1 *= value2;
                                resultBar.setText(value1.toString());
                                controlBar.setText(null);
                                operation = 0;
                        }

                    } else if (controlBar.getText().toString().contains("/")) {

                        switch (operation) {

                            case 1:
                                value3 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                resultBar.append("x" + value3 + ")");
                                controlBar.setText("-");
                                value2 /= value3;
                                value1 += value2;
                                Log.i("aaa", value1.toString());
                                operation = 0;
                                break;

                            case 2:
                                value3 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                resultBar.append("/" + value3 + ")");
                                controlBar.setText("-");
                                value2 /= value3;
                                value1 -= value2;
                                Log.i("aaa", value1.toString());
                                operation = 0;
                                break;

                            case 3:
                                value3 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                resultBar.append("/" + value3 + ")");
                                value2 /= value3;
                                value1 = value2;
                                controlBar.setText("+");
                                Log.i("aaa", value1.toString());
                                operation = 0;
                                break;

                            case 4:
                                value2 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                                value1 /= value2;
                                resultBar.setText(value1.toString());
                                controlBar.setText(null);
                                operation = 0;
                        }

                    } else if (!resultBar.getText().toString().isEmpty() && controlBar.getText().toString().contains("-")
                            && controlBar.getText().toString().contains("+")) {

                        int cText = controlBar.length();
                        value2 = Double.parseDouble(controlBar.getText().toString().subSequence(1, cText).toString());
                        resultBar.append("+" + "(" + value2 + ")");
                        value1 += value2;
                        controlBar.setText(null);
                        controlBar.append("+");
                        plusBtn.setEnabled(false);
                        value2 = null;

                    } else if (!resultBar.getText().toString().isEmpty() && controlBar.getText().toString().contains("-")) {

                        int cText = controlBar.length();
                        value2 = Double.parseDouble(controlBar.getText().toString().subSequence(1, cText).toString());
                        value1 -= value2;
                        resultBar.append(controlBar.getText());
                        controlBar.setText(null);
                        controlBar.append("+");
                        plusBtn.setEnabled(false);
                        value2 = null;

                    } else if (!resultBar.getText().toString().isEmpty()) {
                        value2 = Double.parseDouble(controlBar.getText().toString());
                        value1 += value2;
                        resultBar.append(controlBar.getText());
                        controlBar.setText("+");
                        plusBtn.setEnabled(false);
                        value2 = null;
                    }

                }
            }
        });

        crossBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int textlength = controlBar.length();
                if (textlength == 0 && !resultBar.getText().toString().isEmpty()){
                    resultBar.setText(value1.toString());
                    controlBar.setText("x");
                    operation = 4;
                }else if (textlength == 0){
                    controlBar.setText(null);
                } else if (textlength < 20) {
                    if (resultBar.getText().toString().isEmpty()) {
                        value2 = Double.parseDouble(controlBar.getText().toString());
                        controlBar.setText("x");
                        resultBar.setText("(" + value2.toString());
                        operation = 3;
                    }  else if (!resultBar.getText().toString().isEmpty()) {

                        if (controlBar.getText().toString().contains("x")) {

                            value3 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                            value2 *= value3;
                            resultBar.append("x" + value3);
                            controlBar.setText("x");
                            Log.i("value1", value2.toString());
                        } else if (controlBar.getText().toString().contains("/")) {

                            value3 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                            value2 /= value3;
                            resultBar.append("/" + value3);
                            controlBar.setText("x");
                            Log.i("value2", value2.toString());
                        } else if (controlBar.getText().toString().contains("+")) {

                            value2 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                            Log.i("valueeee", value2.toString());
                            controlBar.setText(null);
                            resultBar.append("+" + "(" + value2);
                            controlBar.setText("x");
                            operation = 1;

                        } else if (controlBar.getText().toString().contains("-")) {

                            value2 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                            Log.i("valueeee", value2.toString());
                            controlBar.setText(null);
                            resultBar.append("-" + "(" + value2);
                            controlBar.setText("x");
                            operation = 2;
                        }


                    }

                }
                divisionBtn.setEnabled(false);
                crossBtn.setEnabled(false);
                plusBtn.setEnabled(false);
                equalBtn.setEnabled(false);


            }
        });

        divisionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int textlength = controlBar.length();
                if (textlength == 0 && !resultBar.getText().toString().isEmpty()){
                    Log.i("bububu" , "klklklk");
                    resultBar.setText(value1.toString());
                    controlBar.setText("/");
                    operation = 4;
                }else if (textlength == 0){
                    controlBar.setText(null);
                } else if (textlength < 20) {
                    if (resultBar.getText().toString().isEmpty()) {
                        value1 = Double.parseDouble(controlBar.getText().toString());
                        controlBar.setText("/");
                        resultBar.setText("(" + value1.toString());

                    } else if (!resultBar.getText().toString().isEmpty()) {

                        if (controlBar.getText().toString().contains("x")) {

                            value3 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                            value2 *= value3;
                            resultBar.append("x" + value3);
                            controlBar.setText("/");
                            Log.i("value1", value2.toString());
                        } else if (controlBar.getText().toString().contains("/")) {

                            value3 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                            value2 /= value3;
                            resultBar.append("/" + value3);
                            controlBar.setText("/");
                            Log.i("value1", value2.toString());
                        } else if (controlBar.getText().toString().contains("+")) {

                            value2 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                            Log.i("valueeee", value2.toString());
                            controlBar.setText(null);
                            resultBar.append("+" + "(" + value2);
                            controlBar.setText("/");
                            operation = 1;

                        } else if (controlBar.getText().toString().contains("-")) {

                            value2 = Double.parseDouble(controlBar.getText().toString().subSequence(1, controlBar.length()).toString());
                            Log.i("valueeee", value2.toString());
                            controlBar.setText(null);
                            resultBar.append("+" + "(" + value2);
                            controlBar.setText("/");
                            operation = 2;

                        }
                    }

                }

                divisionBtn.setEnabled(false);
                crossBtn.setEnabled(false);
                plusBtn.setEnabled(false);
                equalBtn.setEnabled(false);
            }
        });

        discardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (controlBar.length() != 0) {
                    currentText = controlBar.getText();
                    controlBar.setText(currentText.subSequence(0, currentText.length() - 1));
                    currentText = controlBar.getText();
                    if (controlBar.getText().toString().isEmpty() || !currentText.toString().contains(".")) {
                        dotBtn.setEnabled(true);
                    } else if (controlBar.getText().toString().isEmpty() || !currentText.toString().contains("x")) {
                        crossBtn.setEnabled(true);
                    } else if (controlBar.getText().toString().isEmpty() || !currentText.toString().contains("/")) {
                        divisionBtn.setEnabled(true);
                    } else if (controlBar.getText().toString().isEmpty() || !currentText.toString().contains("+")) {
                        plusBtn.setEnabled(true);
                    } else if (controlBar.getText().toString().isEmpty() || !currentText.toString().contains("-")) {
                        minusBtn.setEnabled(true);
                    }
                } else {
                    controlBar.setText(null);
                }


            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (controlBar.length() != 0 || resultBar.length() != 0) {
                    controlBar.setText(null);
                    resultBar.setText(null);
                    value1 = null;
                    value2 = null;
                }
                dotBtn.setEnabled(true);
                minusBtn.setEnabled(true);
                crossBtn.setEnabled(true);
                plusBtn.setEnabled(true);
                divisionBtn.setEnabled(true);
            }
        });


    }


}
