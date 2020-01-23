package com.crazy.notesandtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import static com.crazy.notesandtutorial.ui.tools.ToolsFragment.EXTRA_LINK;
import static com.crazy.notesandtutorial.ui.tools.ToolsFragment.EXTRA_NAME;

public class PDFviewerActivity extends AppCompatActivity {
TextView textView;
PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfviewer);
        textView=findViewById(R.id.textviewpdf);
        pdfView=findViewById(R.id.pdfview);
        Intent intent = getIntent();
        String Url = intent.getStringExtra(EXTRA_LINK);
        String Name = intent.getStringExtra(EXTRA_NAME);
        getSupportActionBar().setTitle(Name);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        new pdfstream().execute(Url);

    }
    public class pdfstream extends AsyncTask<String,Void, InputStream>{

        @Override
        protected InputStream doInBackground(String... strings) {
            InputStream inputStream= null;
            try{
                URL url=new URL(strings[0]);
                HttpURLConnection urlConnection=(HttpURLConnection)url.openConnection();
                if(urlConnection.getResponseCode()==200){
                    inputStream= new BufferedInputStream(urlConnection.getInputStream());
                }
            }catch (IOException e){
                return null;
            }return inputStream;
        }

        @Override
        protected void onPostExecute(InputStream inputStream) {
            pdfView.fromStream(inputStream).load();
        }
    }
}
