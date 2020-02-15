package com.example.fragments.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragments.R;
import com.example.fragments.model.MovieModel;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private List<MovieModel> moviesList;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title, year, genre;
        public RelativeLayout viewBackground, viewForeground;

        MyViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.title);
            genre = view.findViewById(R.id.genre);
            year = view.findViewById(R.id.year);
        }
    }
    public Adapter(List<MovieModel> moviesList) {
        this.moviesList = moviesList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movies_list, parent, false);
        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MovieModel movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
    }
    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public void removeItem(int position) {
        moviesList.remove(position);
        // notify the item removed by position
        // to perform recycler view delete animations
        // NOTE: don't call notifyDataSetChanged()
//        notifyItemRemoved(position);
        notifyItemChanged(position);
    }

    public void restoreItem(MovieModel item, int position) {
        moviesList.add(position, item);
        // notify item added by position
        notifyItemInserted(position);
    }

    /*
    *
    * The fetch command can be done at any point before the merge, i.e., you can swap the order of the fetch and the checkout, because fetch just goes over to the named remote (origin) and says to it: "gimme everything you have that I don't", i.e., all commits on all branches. They get copied to your repository, but named origin/branch for any branch named branch on the remote.

At this point you can use any viewer (git log, gitk, etc) to see "what they have" that you don't, and vice versa. Sometimes this is only useful for Warm Fuzzy Feelings ("ah, yes, that is in fact what I want") and sometimes it is useful for changing strategies entirely ("whoa, I don't want THAT stuff yet").

Finally, the merge command takes the given commit, which you can name as origin/master, and does whatever it takes to bring in that commit and its ancestors, to whatever branch you are on when you run the merge. You can insert 
    *
    * */
}