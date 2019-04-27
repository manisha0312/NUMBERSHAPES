package com.example.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     class Number{
        int number;
        public boolean isarmstrong(){
            int orinumber,result=0,remainder;
            orinumber=number;
            while(orinumber !=0)
            {
                remainder=orinumber%10;
                result+=Math.pow(remainder,3);
                orinumber/=10;
            }
            if(result==number){
                return true;
            }
            else{
                return false;
            }
        }
        public boolean issqare(){
            double sqrroot=Math.sqrt(number);// square rootof number
            if (sqrroot==Math.floor(sqrroot))//changing double in integer
            {
            return true;
        }else{
            return false;
         }}
        public boolean istriangel(){
            int x=1;
            int triangularnumber=1;
            while (triangularnumber<number){
                x++;
                triangularnumber+=x;

            }
            if(triangularnumber==number){
                return true;
            }else {
               return false;
            }
        }
    }
    public void testNumber(View view){
        Log.i("start","button pressed");
        EditText editText=(EditText)findViewById(R.id.editText);
        if(editText.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();// CHECKING WE ENTERED NUMBER OR NOT
        }

        else{
        Number num= new Number();
        num.number=Integer.parseInt(editText.getText().toString());
        Log.i("number" ,"checking");
        String message=editText.getText().toString();// FOR  CHECKING NUMBER PRINTING THE MESSAGE
        if (num.issqare()&&num.istriangel()&& num.isarmstrong()){
            message=message+" is  triangular,  square   and  Armstrong number";

        }
        else if(num.issqare()&&num.istriangel()){
            message=message+" is  triangular and square  number";
        }
        else if(num.istriangel()&& num.isarmstrong()){
            message=message+" is  triangular  and Armstrong number";
        }
        else if(num.issqare()){
            message=message+" is square number";
        }
        else if (num.istriangel()){
            message=message+"  is triangular number";

        }
        else if(num.isarmstrong()){
            message=message+" is armstrong number";
        }
        else{
            message=message+  " is not square , triangular and armstrong number";
        }
        Toast.makeText(this,message, Toast.LENGTH_LONG).show();

//       System.out.println(num.isarmstrong());
    }}




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
