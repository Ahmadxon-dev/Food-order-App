package com.example.foodorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class secondActivity extends AppCompatActivity {
    private Button saladheart;
    private TextView saladPrice;
    private Button riseheart;
    private boolean rise_boolean = false;
    private TextView risePrice;
    private Button chickenheart;
    private boolean chicken_boolean=false;
    private TextView chickenPrice;
    private Button shavermaheart;
    private boolean shaverma_boolean = false;
    private TextView shavermaPrice;
    private TextView totalSum;
    private TextView allItems;
    private Double totalSumCalculating=0.00;
    private int allItemscounter=0;
    private boolean salad_boolean = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        totalSum =(TextView) findViewById(R.id.total_sum);
        allItems = (TextView) findViewById(R.id.item_numbers);

//        --------------------------------rise---------------------------------------------
        riseheart = (Button) findViewById(R.id.rise_heart);
        risePrice=findViewById(R.id.rise_price);
        final Double rise_price_double = Double.parseDouble(risePrice.getText().toString());
        riseheart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rise_boolean=!rise_boolean;
                if (rise_boolean==true){
                    riseheart.setBackgroundResource(R.drawable.heart_colored);
                    allItemscounter ++;
                    allItems.setText(Integer.toString(allItemscounter));
                    totalSumCalculating+=rise_price_double;
                    totalSum.setText(Double.toString(totalSumCalculating));
                }else{
                    riseheart.setBackgroundResource(R.drawable.heart);
                    allItemscounter--;
                    allItems.setText(Integer.toString(allItemscounter));
                    totalSumCalculating-=rise_price_double;
                    totalSum.setText(Double.toString(totalSumCalculating));
                }
            }
        });




//       ----------------------------salad----------------------------------------------------------------------------
        saladheart = (Button) findViewById(R.id.salad_heart);
        saladPrice = findViewById(R.id.salad_price);
        final Double salad_price = Double.parseDouble(saladPrice.getText().toString());
        saladheart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                salad_boolean=!salad_boolean;
                if (salad_boolean==true){
                    saladheart.setBackgroundResource(R.drawable.heart_colored);
                    allItemscounter ++;
                    allItems.setText(Integer.toString(allItemscounter));
                    totalSumCalculating+=salad_price;
                    totalSum.setText(Double.toString(totalSumCalculating));
//                    totalSumCalculating+=st;
                }else{
                    saladheart.setBackgroundResource(R.drawable.heart);
                    allItemscounter--;
                    allItems.setText(Integer.toString(allItemscounter));
                    totalSumCalculating-=salad_price;
                    totalSum.setText(Double.toString(totalSumCalculating));

                }
            }
        });


        chickenheart = (Button) findViewById(R.id.chicken_heart);
        chickenPrice = (TextView) findViewById(R.id.chicken_price);
        final Double chicken_price_double = Double.parseDouble(chickenPrice.getText().toString());
        chickenheart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chicken_boolean=!chicken_boolean;
                if (chicken_boolean==true){
                    chickenheart.setBackgroundResource(R.drawable.heart_colored);
                    allItemscounter ++;
                    allItems.setText(Integer.toString(allItemscounter));
                    totalSumCalculating+=chicken_price_double;
                    totalSum.setText(Double.toString(totalSumCalculating));
                }else{
                    chickenheart.setBackgroundResource(R.drawable.heart);
                    allItemscounter--;
                    allItems.setText(Integer.toString(allItemscounter));
                    totalSumCalculating-=chicken_price_double;
                    totalSum.setText(Double.toString(totalSumCalculating));
                }
            }
        });

        shavermaheart = (Button) findViewById(R.id.shaverma_heart);
        shavermaPrice = (TextView) findViewById(R.id.shaverma_price);
        final Double shaverma_price_double = Double.parseDouble(shavermaPrice.getText().toString());
        shavermaheart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shaverma_boolean=!shaverma_boolean;
                if (shaverma_boolean==true){
                    shavermaheart.setBackgroundResource(R.drawable.heart_colored);
                    allItemscounter ++;
                    allItems.setText(Integer.toString(allItemscounter));
                    totalSumCalculating+=shaverma_price_double;
                    totalSum.setText(Double.toString(totalSumCalculating));
                }else{
                    shavermaheart.setBackgroundResource(R.drawable.heart);
                    allItemscounter--;
                    allItems.setText(Integer.toString(allItemscounter));
                    totalSumCalculating-=shaverma_price_double;
                    totalSum.setText(Double.toString(totalSumCalculating));
                }
            }
        });


    }
}
