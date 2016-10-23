package com.ymr.com.fragmenttest;

import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OneFragment.OnFragmentInteractionListener {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        one.setOnClickListener(listener);
        two.setOnClickListener(listener);
        three.setOnClickListener(listener);
        four.setOnClickListener(listener);
    }


    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.one:
                    OneFragment fragmentone = new OneFragment();
                    android.app.FragmentManager fm = getFragmentManager();
                    android.app.FragmentTransaction ft = fm.beginTransaction();
                    ft.add(R.id.content_container,fragmentone,"firstfragment");
                    ft.commit();
                    break;
                case R.id.two:
                    break;
                case R.id.three:
                    break;
                case R.id.four:
                    break;
            }
        }
    };

    @Override
    public void onFragmentInteraction(View view) {
        Snackbar.make(one, "SnackbarTest", Snackbar.LENGTH_LONG).show();
    }
}
