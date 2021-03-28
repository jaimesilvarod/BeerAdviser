package co.edu.unipiloto.beeradviser;

import android.widget.ListView;

public class BeerExpert {

    public String getBrands(String a){
        switch (a){
            case "Light":
                return "Jack Rose - Gato Black";
            case "Amber":
                return "Jack Black - Cat Black";
            case "Brown":
                return "Four Points - Sheraton";
            case "Dark":
                return "Colgate - Palmolive";
            default:return "Error";
        }
    }

}
