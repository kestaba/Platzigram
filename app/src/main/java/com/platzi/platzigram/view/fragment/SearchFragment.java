package com.platzi.platzigram.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.platzi.platzigram.R;
import com.platzi.platzigram.adapter.PictureAdapterRecyclerView;
import com.platzi.platzigram.model.Picture;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {

    private int numberOfColums = 2;

    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        showToolbar("", false, view);

        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.pictureSearchRecycler);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), numberOfColums);

        picturesRecycler.setLayoutManager(gridLayoutManager);

        PictureAdapterRecyclerView picturesAdapterRecyclerView =
                new PictureAdapterRecyclerView(buildPictures(), R.layout.cardview_picture, getActivity());

        picturesRecycler.setAdapter(picturesAdapterRecyclerView);

        return view;
    }

    public ArrayList<Picture> buildPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("https://img.difoosion.com/wp-content/blogs.dir/28/files/2016/06/fondo5.jpg", "Ana", "4 días", "23 Me gusta"));
        pictures.add(new Picture("https://img.difoosion.com/wp-content/blogs.dir/28/files/2016/06/fondo1.jpg", "Karina", "7 días", "908 Me gusta"));
        pictures.add(new Picture("https://img.difoosion.com/wp-content/blogs.dir/28/files/2016/06/fondo2.jpg", "Bran", "1 semana", "53 Me gusta"));
        pictures.add(new Picture("https://img.difoosion.com/wp-content/blogs.dir/28/files/2016/06/fondo3.jpg", "Sofi", "2 semanas", "143 Me gusta"));
        pictures.add(new Picture("https://img.difoosion.com/wp-content/blogs.dir/28/files/2016/06/fondo4.jpg", "Michi", "4 meses", "186 Me gusta"));

        return pictures;
    }

    public void showToolbar(String tittle, boolean upButton, View view) {
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

}