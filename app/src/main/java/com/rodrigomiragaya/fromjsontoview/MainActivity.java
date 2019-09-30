package com.rodrigomiragaya.fromjsontoview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<SerieDocumental> list = new ArrayList<>();
    private RadioGroup radioGroup;
    private SeriesDocuFragment seriesDocuFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioButtonGroup);

        Gson gson = new Gson();

//        SerieDocumental serie1 = new SerieDocumental("DNI", "DNI de la persona", 21, date);
//        String json= gson.toJson(serie1);

//        String json = "{\n" +
//                "  \"descripcion\": \"DNI de la persona\",\n" +
//                "  \"nombre\": \"DNI\",\n" +
//                "  \"fecha\": \"Sep 29, 2019 4:05:29 PM\",\n" +
//                "  \"edad\": 21\n" +
//                "}";
//        SerieDocumental serieDocumetal = gson.fromJson(json, SerieDocumental.class);
//
//        String json2 = "{\n" +
//                "  \"descripcion\": \"DNI de la persona\",\n" +
//                "  \"nombre\": \"Contrato\",\n" +
//                "  \"fecha\": \"Sep 29, 2019 4:05:29 PM\",\n" +
//                "  \"edad\": 21\n" +
//                "}";
//        SerieDocumental serieDocumetal2 = gson.fromJson(json2, SerieDocumental.class);
//
//        String json3 = "{\n" +
//                "  \"descripcion\": \"DNI de la persona\",\n" +
//                "  \"nombre\": \"Monotributo\",\n" +
//                "  \"fecha\": \"Sep 29, 2019 4:05:29 PM\",\n" +
//                "  \"edad\": 21\n" +
//                "}";
//        SerieDocumental serieDocumetal3 = gson.fromJson(json3, SerieDocumental.class);
//
//        String json4 = "{\n" +
//                "  \"descripcion\": \"DNI de la persona\",\n" +
//                "  \"nombre\": \"Recibo Sueldo\",\n" +
//                "  \"fecha\": \"Sep 29, 2019 4:05:29 PM\",\n" +
//                "  \"edad\": 21\n" +
//                "}";
//        SerieDocumental serieDocumetal4 = gson.fromJson(json4, SerieDocumental.class);
//
//        String json5 = "{\n" +
//                "  \"descripcion\": \"DNI de la persona\",\n" +
//                "  \"nombre\": \"Factura Servicio\",\n" +
//                "  \"fecha\": \"Sep 29, 2019 4:05:29 PM\",\n" +
//                "  \"edad\": 21\n" +
//                "}";
//        SerieDocumental serieDocumetal5 = gson.fromJson(json5, SerieDocumental.class);
//
//        list.add(serieDocumetal);
//        list.add(serieDocumetal2);
//        list.add(serieDocumetal3);
//        list.add(serieDocumetal4);
//        list.add(serieDocumetal5);
//
//        addRadioButtons(list);
    }

    public void addRadioButtons(final List<SerieDocumental> serieDocumental){
        for (int i = 0 ; i < serieDocumental.size() ; i ++){
            RadioButton rbtn = new RadioButton(this);
            rbtn.setId(View.generateViewId());
            rbtn.setText(serieDocumental.get(i).getNombre());
            final SerieDocumental x = serieDocumental.get(i);
            rbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openSideMenu(x);
                }
            });
            radioGroup.addView(rbtn);
        }
    }

    public void openSideMenu(SerieDocumental seriedocumental){
        Toast.makeText(this,  seriedocumental.getNombre()+ " seleccionado", Toast.LENGTH_SHORT).show();

        seriesDocuFragment = new SeriesDocuFragment(seriedocumental);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentcontainer, seriesDocuFragment).commit();




    }


}
