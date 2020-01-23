package com.crazy.notesandtutorial.ui.books;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.crazy.notesandtutorial.R;
import com.crazy.notesandtutorial.NotesActivity;

public class BooksFragment extends Fragment implements View.OnClickListener {

    CardView english;
    CardView physics;
    CardView chemistry;
    CardView hindi;
    CardView maths;
    CardView bio;
    CardView engeeniring;
    CardView commerce;
    CardView accounting;
    CardView law;
    CardView medical;
    CardView arts;
    CardView civilservices;
    CardView currentaffairs;
    CardView banking;
    CardView gk;
    CardView nda;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        english = root.findViewById(R.id.bs0);
        physics = root.findViewById(R.id.bs1);
        chemistry = root.findViewById(R.id.bs2);
        hindi = root.findViewById(R.id.bs3);
        maths = root.findViewById(R.id.bs4);
        bio = root.findViewById(R.id.bs5);
        engeeniring = root.findViewById(R.id.bg1);
        commerce = root.findViewById(R.id.bg2);
        accounting = root.findViewById(R.id.bg3);
        law = root.findViewById(R.id.bg4);
        medical = root.findViewById(R.id.bg5);
        arts = root.findViewById(R.id.bg6);
        civilservices = root.findViewById(R.id.bp1);
        currentaffairs = root.findViewById(R.id.bp2);
        banking = root.findViewById(R.id.bp3);
        gk = root.findViewById(R.id.bp4);
        nda = root.findViewById(R.id.bp5);

        english.setOnClickListener(this);
        physics.setOnClickListener(this);
        chemistry.setOnClickListener(this);
        hindi.setOnClickListener(this);
        maths.setOnClickListener(this);
        bio.setOnClickListener(this);
        engeeniring.setOnClickListener(this);
        commerce.setOnClickListener(this);
        accounting.setOnClickListener(this);
        law.setOnClickListener(this);
        medical.setOnClickListener(this);
        arts.setOnClickListener(this);
        civilservices.setOnClickListener(this);
        currentaffairs.setOnClickListener(this);
        banking.setOnClickListener(this);
        gk.setOnClickListener(this);
        nda.setOnClickListener(this);

        return root;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bs0:
                Intent ir = new Intent(getActivity(), NotesActivity.class);
                ir.putExtra("loadsPosition", "english");
                ir.putExtra("name", "ENGLISH");
                startActivity(ir);
                break;
            case R.id.bs1:
                Intent i = new Intent(getActivity(), NotesActivity.class);
                i.putExtra("loadsPosition", "physics");
                i.putExtra("name", "PHYSICS");
                startActivity(i);
                break;
            case R.id.bs2:
                Intent ie = new Intent(getActivity(), NotesActivity.class);
                ie.putExtra("loadsPosition", "chemistry");
                ie.putExtra("name", "CHEMISTRY");
                startActivity(ie);
                break;
            case R.id.bs3:
                Intent iee = new Intent(getActivity(), NotesActivity.class);
                iee.putExtra("loadsPosition", "hindi");
                iee.putExtra("name", "HINDI");
                startActivity(iee);
                break;
            case R.id.bs4:
                Intent ier = new Intent(getActivity(), NotesActivity.class);
                ier.putExtra("loadsPosition", "maths");
                ier.putExtra("name", "MATHS");
                startActivity(ier);
                break;
            case R.id.bs5:
                Intent irr = new Intent(getActivity(), NotesActivity.class);
                irr.putExtra("loadsPosition", "bio");
                irr.putExtra("name", "BIOLOGY");
                startActivity(irr);
                break;
            case R.id.bg1:
                Intent i1 = new Intent(getActivity(), NotesActivity.class);
                i1.putExtra("loadsPosition", "engineering");
                i1.putExtra("name", "ENGINEERING");
                startActivity(i1);
                break;
            case R.id.bg2:
                Intent ie1 = new Intent(getActivity(), NotesActivity.class);
                ie1.putExtra("loadsPosition", "commerce");
                ie1.putExtra("name", "COMMERCE");
                startActivity(ie1);
                break;
            case R.id.bg3:
                Intent iee1 = new Intent(getActivity(), NotesActivity.class);
                iee1.putExtra("loadsPosition", "accounting");
                iee1.putExtra("name", "ACCOUNTING");
                startActivity(iee1);
                break;
            case R.id.bg4:
                Intent ier1 = new Intent(getActivity(), NotesActivity.class);
                ier1.putExtra("loadsPosition", "law");
                ier1.putExtra("name", "LAW");
                startActivity(ier1);
                break;
            case R.id.bg5:
                Intent irr1 = new Intent(getActivity(), NotesActivity.class);
                irr1.putExtra("loadsPosition", "medical");
                irr1.putExtra("name", "MEDICAL");
                startActivity(irr1);
                break;
            case R.id.bg6:
                Intent i2 = new Intent(getActivity(), NotesActivity.class);
                i2.putExtra("loadsPosition", "arts");
                i2.putExtra("name", "ARTS");
                startActivity(i2);
                break;
            case R.id.bp1:
                Intent ie2 = new Intent(getActivity(), NotesActivity.class);
                ie2.putExtra("loadsPosition", "civilservices");
                ie2.putExtra("name", "CIVIL SERVICES");
                startActivity(ie2);
                break;
            case R.id.bp2:
                Intent iee2= new Intent(getActivity(), NotesActivity.class);
                iee2.putExtra("loadsPosition", "currentaffairs");
                iee2.putExtra("name", "CURRENT AFFAIRS");
                startActivity(iee2);
                break;
            case R.id.bp3:
                Intent ier2 = new Intent(getActivity(), NotesActivity.class);
                ier2.putExtra("loadsPosition", "banking");
                ier2.putExtra("name", "BANKING PREPARATION");
                startActivity(ier2);
                break;
            case R.id.bp4:
                Intent irr2 = new Intent(getActivity(), NotesActivity.class);
                irr2.putExtra("loadsPosition", "gk");
                irr2.putExtra("name", "GENERAL KNOWLEDGE");
                startActivity(irr2);
                break;
            case R.id.bp5:
                Intent irr3 = new Intent(getActivity(), NotesActivity.class);
                irr3.putExtra("loadsPosition", "nda");
                irr3.putExtra("name", "NDA/CDS");
                startActivity(irr3);
                break;
        }
    }
}