package com.example.a123.homelvoe.fragment;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a123.homelvoe.R;

/**
 * Created by 123 on 2016/8/9.
 */
public class HomepageFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
       View view=  inflater.inflate(R.layout.fragmenthomepage,null);

        return view;
    }
}
