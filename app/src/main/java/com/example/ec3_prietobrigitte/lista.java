package com.example.ec3_prietobrigitte;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.ec3_prietobrigitte.databinding.ActivityListaBinding;

import java.util.ArrayList;

public class lista extends AppCompatActivity {
    private ActivityListaBinding binding;
    private AndroidAdapter androidAdapter = new AndroidAdapter();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.rvandroid.setLayoutManager(
                new LinearLayoutManager(getApplicationContext())
        );
        binding.rvandroid.setAdapter(androidAdapter);
        androidAdapter.setData(getData());
    }
        private ArrayList<ruta> getData(){
            ArrayList<ruta> list = new ArrayList<>();
            list.add(new ruta(list.size() +1,
                    R.drawable.i1,
                    "12/10/2023 13:40",
                    2));

            list.add(new ruta(list.size() +1,
                    R.drawable.i1,
                    "12/10/2023 13:40",
                    2));

            list.add(new ruta(list.size() +1,
                    R.drawable.i1,
                    "12/10/2023 13:40",
                    2));

            list.add(new ruta(list.size() +1,
                    R.drawable.i1,
                    "12/10/2023 13:40",
                    2));

            list.add(new ruta(list.size() +1,
                    R.drawable.i1,
                    "12/10/2023 13:40",
                    2));

            list.add(new ruta(list.size() +1,
                    R.drawable.i1,
                    "12/10/2023 13:40",
                    2));

            list.add(new ruta(list.size() +1,
                    R.drawable.i1,
                    "12/10/2023 13:40",
                    2));

            list.add(new ruta(list.size() +1,
                    R.drawable.i1,
                    "12/10/2023 13:40",
                    2));

            list.add(new ruta(list.size() +1,
                    R.drawable.i1,
                    "12/10/2023 13:40",
                    2));
            list.add(new ruta(list.size() +1,
                    R.drawable.i1,
                    "12/10/2023 13:40",
                    2));

            return list;
    }
}
