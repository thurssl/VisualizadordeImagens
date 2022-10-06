package br.ulbra.visualizadordeimagens;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imgfoto;
    Button btR34, btR35;
    TextView txtInformacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imgfoto = (ImageView) findViewById(R.id.imgfoto);

        btR34 = (Button) findViewById(R.id.btGtrR34);

        btR35 = (Button) findViewById(R.id.btR35);

        txtInformacao = (TextView) findViewById(R.id.txtInformacao);

        btR34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgfoto.setImageResource(R.drawable.g1);
                txtInformacao.setText("Gordinho 1");
            }
        });

        btR35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgfoto.setImageResource(R.drawable.g2);
                txtInformacao.setText("Gordinho 2");
            }
        });

    }


}



