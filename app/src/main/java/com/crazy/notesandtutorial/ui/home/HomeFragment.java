package com.crazy.notesandtutorial.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.crazy.notesandtutorial.NotesActivity;
import com.crazy.notesandtutorial.R;

public class HomeFragment extends Fragment implements View.OnClickListener {

CardView ntse;
    CardView kvpy;
    CardView jee;
    CardView gre;
    CardView gate;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        ntse = root.findViewById(R.id.c1);
        kvpy = root.findViewById(R.id.c2);
        jee = root.findViewById(R.id.c3);
        gre = root.findViewById(R.id.c4);
        gate = root.findViewById(R.id.c5);
        ntse.setOnClickListener(this);

        kvpy.setOnClickListener(this);
        jee.setOnClickListener(this);
        gre.setOnClickListener(this);
        gate.setOnClickListener(this);


        return root;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.c1:
                Intent i=new Intent(getActivity(), NotesActivity.class);
                i.putExtra("loadsPosition","ntse");
                i.putExtra("name","NTSE");
                startActivity(i);
                break;
            case R.id.c2:
                Intent ie=new Intent(getActivity(), NotesActivity.class);
                ie.putExtra("loadsPosition","kvpy");
                ie.putExtra("name","KVPY");
                startActivity(ie);
                break;
            case R.id.c3:
                Intent iee=new Intent(getActivity(), NotesActivity.class);
                iee.putExtra("loadsPosition","jee");
                iee.putExtra("name","JEE(MAINS/ADVANCED)");
                startActivity(iee);
                break;
            case R.id.c4:
                Intent ier=new Intent(getActivity(), NotesActivity.class);
                ier.putExtra("loadsPosition","gre");
                ier.putExtra("name","GRE");
                startActivity(ier);
                break;
            case R.id.c5:
                Intent irr=new Intent(getActivity(), NotesActivity.class);
                irr.putExtra("loadsPosition","gate");
                irr.putExtra("name","GATE");
                startActivity(irr);
                break;
        }
    }
}