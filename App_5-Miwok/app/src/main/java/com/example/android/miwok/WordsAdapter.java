package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordsAdapter extends ArrayAdapter {
    public WordsAdapter(Activity context, ArrayList<Words> wordsArrayList) {
        super(context, 0, wordsArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_view, parent, false);
        }

        Words current_words = (Words) getItem(position);
        TextView miwok_word = (TextView) listItemView.findViewById(R.id.miwok_word);
        TextView default_word = (TextView) listItemView.findViewById(R.id.default_word);

        miwok_word.setText(current_words.getmMiwokWord());
        default_word.setText(current_words.getmDefaultWord());

        ImageView icon = (ImageView) listItemView.findViewById(R.id.image);
        if (current_words.hasImageResourceId())
        {
            icon.setImageResource(current_words.getmImageResourceId());
        }
        else{
            icon.setVisibility(View.GONE);
        }

        return listItemView;
    }
}