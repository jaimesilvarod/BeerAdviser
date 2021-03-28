package co.edu.unipiloto.beeradviser;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer (View view){
        //Obtengo una referencia del TextView
        TextView brands = (TextView)findViewById(R.id.brands);
        //Obtengo una referencia del Spinner
        Spinner color = (Spinner)findViewById(R.id.color);
        String beerType = String.valueOf(color.getSelectedItem());
        //Según el item seleccionado voy a mostrar las marcas
        BeerExpert manager = new BeerExpert();
        String marcas = manager.getBrands(beerType);
        brands.setText(marcas);
    }
}