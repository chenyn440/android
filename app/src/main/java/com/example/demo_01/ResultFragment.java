package com.example.demo_01;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class ResultFragment extends Fragment {


    public ResultFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_result, container, false);
    }

    public void showResult(int id) {
        int images[] = {R.drawable.icon1, R.drawable.icon2, R.drawable.icon3};
        ImageView imageView = (ImageView) getView().findViewById(R.id.imageView);
        imageView.setImageResource(images[id]);
    }

}

