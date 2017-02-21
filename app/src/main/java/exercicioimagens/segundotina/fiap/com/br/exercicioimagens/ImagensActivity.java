package exercicioimagens.segundotina.fiap.com.br.exercicioimagens;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class ImagensActivity extends AppCompatActivity {

    ImageView imageView;

    int[] imagens ={
        R.drawable.um,
        R.drawable.dois,
        R.drawable.tres,
        R.drawable.quatro,
        R.drawable.cinco
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagens);

    imageView = (ImageView)findViewById(R.id.imageView);
}

    public void gerarImagem (View v){
        Random rand = new Random();
        int posImagens = rand.nextInt(5);
        imageView.setImageResource(imagens[posImagens]);
    }
}
