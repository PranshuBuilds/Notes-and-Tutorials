package com.crazy.notesandtutorial;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder  {
    LinearLayout linearLayout;
    TextView mName;
    TextView mLink;
    ImageView mDownload;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        mName = itemView.findViewById(R.id.name);
        mLink = itemView.findViewById(R.id.link);
        mDownload = itemView.findViewById(R.id.down);
        linearLayout=itemView.findViewById(R.id.lay);
    }
}