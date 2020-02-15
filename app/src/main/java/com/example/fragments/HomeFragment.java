package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragments.adapter.Adapter;
import com.example.fragments.model.MovieModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class HomeFragment extends Fragment {

    private List<MovieModel> movieList = new ArrayList<>();
    private Adapter mAdapter;
    private RecyclerView recyclerview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.homelayout, viewGroup, false);
        recyclerview = (RecyclerView) view.findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerview.setLayoutManager(layoutManager);


        mAdapter = new Adapter(movieList);
        recyclerview.setAdapter(mAdapter);
        prepareMovieData();

        return view;
    }

    private void prepareMovieData() {
        MovieModel movie = new MovieModel("Mad Max: Fury Road", "Action & Adventure", "2015");
        movieList.add(movie);
        movie = new MovieModel("Inside Out", "Animation, Kids & Family", "2015");
        movieList.add(movie);
        movie = new MovieModel("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        movieList.add(movie);
        movie = new MovieModel("Shaun the Sheep", "Animation", "2015");
        movieList.add(movie);
        movie = new MovieModel("The Martian", "Science Fiction & Fantasy", "2015");
        movieList.add(movie);
        movie = new MovieModel("Mission: Impossible Rogue Nation", "Action", "2015");
        movieList.add(movie);
        movie = new MovieModel("Up", "Animation", "2009");
        movieList.add(movie);
        movie = new MovieModel("Star Trek", "Science Fiction", "2009");
        movieList.add(movie);
        movie = new MovieModel("The LEGO MovieModel", "Animation", "2014");
        movieList.add(movie);
        movie = new MovieModel("Iron Man", "Action & Adventure", "2008");
        movieList.add(movie);
        movie = new MovieModel("Aliens", "Science Fiction", "1986");
        movieList.add(movie);
        movie = new MovieModel("Chicken Run", "Animation", "2000");
        movieList.add(movie);
        movie = new MovieModel("Back to the Future", "Science Fiction", "1985");
        movieList.add(movie);
        movie = new MovieModel("Raiders of the Lost Ark", "Action & Adventure", "1981");
        movieList.add(movie);
        movie = new MovieModel("Goldfinger", "Action & Adventure", "1965");
        movieList.add(movie);
        movie = new MovieModel("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        movieList.add(movie);
        mAdapter.notifyDataSetChanged();
    }

}