package com.example.mycase2;

import androidx.cardview.widget.CardView;

import com.example.mycase2.Models.Notes;

public interface NotesClickListener {

    void onClick (Notes notes);
    void onLongClick (Notes notes, CardView cardView);
}
