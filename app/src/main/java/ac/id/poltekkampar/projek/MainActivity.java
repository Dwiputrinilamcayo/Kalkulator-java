package ac.id.poltekkampar.projek;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import ac.id.poltekkampar.projek.R;


public class MainActivity extends AppCompatActivity {

    public String str ="";
    Character Nilam = 'q';
    int i,num,numtemp;
    EditText showResult;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showResult = (EditText)findViewById(R.id.Layar);

    }
    public void btn1Clicked(View v){
        insert(1);

    }

    public void btn2Clicked(View v){
        insert(2);

    }
    public void btn3Clicked(View v){
        insert(3);

    }
    public void btn4Clicked(View v){
        insert(4);

    }
    public void btn5Clicked(View v){
        insert(5);

    }
    public void btn6Clicked(View v){
        insert(6);
    }
    public void btn7Clicked(View v){
        insert(7);

    }
    public void btn8Clicked(View v){
        insert(8);

    }
    public void btn9Clicked(View v){
        insert(9);

    }
    public void btnplusClicked(View v){
        perform();
        Nilam = '+';

    }

    public void btnminusClicked(View v){
        perform();
       Nilam = '-';

    }
    public void btndivideClicked(View v){
        perform();
        Nilam = '/';

    }
    public void btnmultiClicked(View v){
        perform();
        Nilam = '*';

    }
    public void btnequalClicked(View v){
        calculate();

    }

    public void btnclearClicked(View v){
        reset();
    }
    private void reset() {
        // TODO Auto-generated method stub
        str ="";
        Nilam ='q';
        num = 0;
        numtemp = 0;
        showResult.setText("");
    }
    private void insert(int j) {
        // TODO Auto-generated method stub
        str = str+Integer.toString(j);
        num = Integer.valueOf(str).intValue();
        showResult.setText(str);

    }
    private void perform() {
        // TODO Auto-generated method stub
        str = "";
        calculateNoShow();
        numtemp = num;

    }
    private void calculate() {
        // TODO Auto-generated method stub
        if(Nilam == '+')
            num = numtemp+num;
        else if(Nilam == '-')
            num = numtemp-num;
        else if(Nilam == '/')
            num = numtemp/num;
        else if(Nilam == '*')
            num = numtemp*num;
        showResult.setText(""+num);
    }

    private void calculateNoShow() {
        // TODO Auto-generated method stub
        if(Nilam == '+')
            num = numtemp+num;
        else if(Nilam == '-')
            num = numtemp-num;
        else if(Nilam == '/')
            num = numtemp/num;
        else if(Nilam == '*')
            num = numtemp*num;
    }
}