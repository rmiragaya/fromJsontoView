package com.rodrigomiragaya.fromjsontoview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SeriesDocuFragment extends Fragment {

    private TextView title;
    private SerieDocumental serieDocumental;

    public SeriesDocuFragment(SerieDocumental serieDocumental) {
        this.serieDocumental = serieDocumental;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.series_docu_fragment,container,false);
        title = view.findViewById(R.id.tituloSerieDocuFragmentId);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        title.setText(serieDocumental.getNombre());
    }
}
