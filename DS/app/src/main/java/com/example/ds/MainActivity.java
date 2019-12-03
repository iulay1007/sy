package com.example.ds;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.math.BigDecimal;


@RequiresApi(api = Build.VERSION_CODES.M)
public class MainActivity extends AppCompatActivity implements View.OnClickListener, MainActivity1 {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;
    Button button16;
    Button button17;
    Button button18;
    TextView TV;
    String strre="";
    boolean flag=true;
    boolean flagf=true;
    boolean jia=false;
    boolean jian=false;
    boolean cheng=false;
    boolean chu=false;
    double a,b,f,g;
    int iresult=0;
    double result=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button5=(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button8=(Button) findViewById(R.id.button8);
        button9=(Button) findViewById(R.id.button9);
        button10=(Button) findViewById(R.id.button10);
        button11=(Button) findViewById(R.id.button11);
        button12=(Button) findViewById(R.id.button12);
        button13=(Button) findViewById(R.id.button13);
        button14=(Button) findViewById(R.id.button14);
        button15=(Button) findViewById(R.id.button15);
        button16=(Button) findViewById(R.id.button16);
        button17=(Button) findViewById(R.id.button17);
        button18=(Button) findViewById(R.id.button18);
        TV=(TextView) findViewById(R.id.TV);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {
    String str = TV.getText().toString();
    String strre=TV.getText().toString();

      try {
          switch (v.getId()) {
              case R.id.button16:
                  if (str.startsWith("="))
                      str = "";
                  str = (str + "0");
                  TV.setText(str);
                  flag = false;
                  break;

              case R.id.button12:
                  if (str.startsWith("="))
                      str = "";
                  str = (str + "1");
                  TV.setText(str);
                  flag = false;
                  break;

              case R.id.button13:
                  if (str.startsWith("="))
                      str = "";
                  str = (str + "2");
                  TV.setText(str);
                  flag = false;
                  break;

              case R.id.button14:
                  if (str.startsWith("="))
                      str = "";
                  str = (str + "3");
                  TV.setText(str);
                  break;

              case R.id.button8:
                  if (str.startsWith("="))
                      str = "";
                  str = (str + "4");
                  TV.setText(str);
                  flag = false;
                  break;

              case R.id.button9:
                  if (str.startsWith("="))
                      str = "";
                  str = (str + "5");
                  TV.setText(str);
                  flag = false;
                  break;

              case R.id.button10:
                  if (str.startsWith("="))
                      str = "";
                  str = (str + "6");
                  TV.setText(str);
                  flag = false;
                  break;

              case R.id.button4:
                  if (str.startsWith("="))
                      str = "";
                  str = (str + "7");
                  TV.setText(str);
                  flag = false;
                  break;

              case R.id.button5:
                  if (str.startsWith("="))
                      str = "";
                  str = (str + "8");
                  TV.setText(str);
                  flag = false;
                  break;

              case R.id.button6:
                  if (str.startsWith("="))
                      str = "";
                  str = (str + "9");
                  TV.setText(str);
                  flag = false;
                  break;

              case R.id.button2:
                  TV.setText("");
                  flag = true;
                  break;

              case R.id.button1:
                  try {
                      TV.setText(str.substring(0, str.length() - 1));
                      if (str.length() == 0)
                          flag = true;
                  } catch (Exception e) {
                      TV.setText("");
                  }
                  flag = false;
                  break;

              case R.id.button15:
               /* if(flag){
                    TV.setText("");
                }
                if(flagf=false)
                {
                    try{  TV.setText(str.substring(0,str.length()-1));
                        if(str.length()==0)
                            flag=true;
                }catch (Exception e){ TV.setText("");
                    }*/
                  if (strre.startsWith("="))
                      str = strre.substring(1, str.length());
                  str = (str + "+");
                  TV.setText(str);
                  break;
              //  flagf=false;

              case R.id.button11:
                  if (strre.startsWith("="))
                      str = strre.substring(1, str.length());
                  str = (str + "-");
                  TV.setText(str);
                  break;

              case R.id.button7:
                  if (strre.startsWith("="))
                      str = strre.substring(1, str.length());
                  str = (str + "x");
                  TV.setText(str);
                  break;

              case R.id.button3:
                  if (strre.startsWith("="))
                      str = strre.substring(1, str.length());
                  str = (str + "÷");
                  TV.setText(str);
                  break;

              case R.id.button17:
                  str = (str + ".");
                  TV.setText(str);
                  break;

              case R.id.button18:

                  // if(str startsWith(String +));
                  jia = str.contains("+");
                  jian = str.contains("-");
                  cheng = str.contains("x");
                  chu = str.contains("÷");

                  //  if(strre.startsWith("="))
                  //  strre=strre.substring(1,str.length());


                  if (cheng || chu) {
                      if (cheng == true) {
                          a = Double.parseDouble(str.substring(0, str.indexOf("x")));
                          b = Double.parseDouble(str.substring(str.indexOf("x") + 1, str.length()));
                          result = a * b;
                          iresult = (int) result;
                          if (iresult == result) {
                              strre = "=" + String.valueOf(iresult);
                              TV.setText(strre);

                          } else {
                              strre = "=" + String.valueOf(result);
                              TV.setText(strre);
                          }
                      } else if (chu == true) {
                          a = Double.parseDouble(str.substring(0, str.indexOf("÷")));
                          b = Double.parseDouble(str.substring(str.indexOf("÷") + 1, str.length()));
                          if (b == 0) {
                              TV.setText("0不能做除数");
                              break;
                          }
                          result = a / b;
                          iresult = (int) result;
                          if (iresult == result) {
                              strre = "=" + String.valueOf(iresult);
                              TV.setText(strre);


                          } else {
                              strre = "=" + String.valueOf(result);
                              TV.setText(strre);
                          }
                      }
                  } else if (jia == true) {
                      a = Double.parseDouble(str.substring(0, str.indexOf("+")));
                      b = Double.parseDouble(str.substring(str.indexOf("+"), str.length()));
                      result = a + b;
                      iresult = (int) result;
                      if (iresult == result) {
                          strre = "=" + String.valueOf(iresult);
                          TV.setText(strre);

                      } else {
                          strre = "=" + String.valueOf(result);
                          TV.setText(strre);
                      }
                  } else if (jian == true) {
                      if (str.startsWith("-")) {
                          f = Double.parseDouble(str.substring(0, str.lastIndexOf("-")));
                          g = Double.parseDouble(str.substring(str.lastIndexOf("-") + 1, str.length()));
                          // BigDecimal c = new BigDecimal(Double.toString(f));
                          // BigDecimal d = new BigDecimal(Double.toString(g));
                          //BigDecimal e = c.subtract(d);

                          double tresult;
                          tresult = f - g;
                          iresult=(int)tresult;
                          //tresult = e.doubleValue();
                          //iresult = e.intValue();
                         if (iresult == tresult) {
                              strre = "=" + String.valueOf(iresult);
                              TV.setText(strre);

                          } else {
                          strre = "=" + String.valueOf(tresult);
                          TV.setText(strre);
                      } }else {
                          f = Double.parseDouble(str.substring(0, str.indexOf("-")));
                          g = Double.parseDouble(str.substring(str.indexOf("-") + 1, str.length()));
                          //  BigDecimal c = new BigDecimal(Double.toString(f));
                          //   BigDecimal d = new BigDecimal(Double.toString(g));
                          //  BigDecimal e = c.subtract(d);
                          double tresult;
                          tresult = f - g;
                          iresult=(int)tresult;
                          //tresult = e.doubleValue();
                          // iresult = e.intValue();
                       if (iresult == tresult) {
                              strre = "=" + String.valueOf(iresult);
                              TV.setText(strre);

                          } else {
                          strre = "=" + String.valueOf(tresult);
                          TV.setText(strre);
                      }


                      }
          }

      }}catch (Exception e){TV.setText("error"); }
    }}
