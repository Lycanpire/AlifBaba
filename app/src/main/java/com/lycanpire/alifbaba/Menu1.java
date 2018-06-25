package com.lycanpire.alifbaba;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.lycanpire.alifbaba.R;

public class Menu1 extends Fragment {
    ListView list;

    String[] itemname ={
            "Crispy Fry Chicken",
            "Crispy Fry Paneer",
            "Mughlai Chicken Black Pepper",
            "Crispy Chicken Burger",
            "Chicken Stew Spice Mix",
            "Crispy Chicken Popcorn",
            "Crispy Chicken Pizza",
            "Mughlai Chicken Tandoori Gravy"
    };

    Integer[] imgid={
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
            R.drawable.pic6,
            R.drawable.pic7,
            R.drawable.pic8,

    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
View view=inflater.inflate(R.layout.fragment_menu_1, container, false);

        CustomAdapter adapter=new CustomAdapter(getActivity(), itemname, imgid);
        list=(ListView) view.findViewById(R.id.myListView);
        list.setAdapter(adapter);

        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return view;

    }



    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles

        getActivity().setTitle("Our Products");


    }


}