package com.mostafa_anter.builditbigger;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.javaJokes.Joker;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    // R2 used inside annotation :)
    @OnClick({R2.id.tell_joke})
    public void doAction(View view){
        switch (view.getId()){
            case R.id.tell_joke:
                Toast.makeText(getActivity(), new Joker().getJoke(), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
