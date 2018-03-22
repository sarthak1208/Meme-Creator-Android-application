package com.dellexample1.memecreator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomPictureFragment extends Fragment {
    private static TextView textView;
    private static TextView textView2;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_layout_fragment,container,false);
        textView = (TextView) view.findViewById(R.id.textView);
        textView2 = (TextView) view.findViewById(R.id.textView2);
        return view;
    }

    public void setMemeText(String top,String bottom){
        textView.setText(top);
        textView2.setText(bottom);
    }
}

