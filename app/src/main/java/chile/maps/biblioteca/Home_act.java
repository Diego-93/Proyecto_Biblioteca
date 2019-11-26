package chile.maps.biblioteca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Home_act extends AppCompatActivity {

    private ViewFlipper vf;
    private int[] images = {R.drawable.a, R.drawable.b, R.drawable.c};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_act);

        vf = (ViewFlipper)findViewById(R.id.slider);

        for(int i = 0; i<images.length ;i++)
        {
            Instrucciones(images[i]);
        }
    }



    // estas son las instrucciones de mi slider.
    public void Instrucciones(int i)
    {
        ImageView view = new ImageView(this); // obtengo mis imagenes.
        view.setBackgroundResource(i);

        vf.addView(view); // añado mis imagenes.
        vf.setFlipInterval(2800); // velocidad de desplazamiento.
        vf.setAutoStart(true); //inicia de forma automatica.

        // sentido del slider.
        vf.setInAnimation(this, android.R.anim.slide_in_left);
        vf.setOutAnimation(this, android.R.anim.slide_out_right);
    }













    public void info(View v)
    {
        Intent i = new Intent(this, Info_act.class);
        startActivity(i);
    }


    public void Libros(View view)
    {
        String[] datos = {"Farenheit", "Revival", "Tesla"};
        Intent i = new Intent(this, Libros_act.class);
        i.putExtra("libros", datos);
        startActivity(i);
    }

}
