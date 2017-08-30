package com.example.chapa.entregable1u1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar sk_br;
    private TextView prog;
    private TextView txtRes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sk_br=(SeekBar)findViewById(R.id.seekBar);
        txtRes=(TextView)findViewById(R.id.txt_res);
        prog=(TextView)findViewById(R.id.progreso);


        sk_br.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                prog.setText(progress+"");
                int n=sk_br.getProgress();
                txtRes.setText(getTabla(n));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private String getTabla(int n){
        String cad=n+"\n";
        for (int i=1;i<11;i++){
            cad=cad+n+" x "+i+" = "+(n*i)+"\n";
        }
        return cad;
    }


}
