package com.example.pokemonrecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

public class pokemondesc extends AppCompatActivity {

    ImageView pimg;
    TextView pname,pdesc,ptype,pweight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemondesc);
        Bundle extras = getIntent().getExtras();
        pimg = findViewById(R.id.imageView);
        pname = findViewById(R.id.textView);
        pdesc = findViewById(R.id.textView2);
        ptype  = findViewById(R.id.textView3);
        pweight = findViewById(R.id.textView4);
        Intent i = getIntent();

        Pokemon p = i.getParcelableExtra("data");

       // Picasso.get().load(p.getImage()).into(pimg);

        pname.setText(p.getName());
        pdesc.setText(p.getHeight());
        ptype.setText(""+p.getType());
        pweight.setText(p.getWeight());
        Picasso.get().load(p.getImage()).into(pimg);
    }
}
