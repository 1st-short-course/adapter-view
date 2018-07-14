package com.example.rathana.adapterdemo.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rathana.adapterdemo.Fruit;
import com.example.rathana.adapterdemo.R;

import java.util.List;

public class FruitAdapter extends BaseAdapter {

    private List<Fruit> fruits;
    public FruitAdapter(List<Fruit> fruits){
        this.fruits=fruits;
    }

    @Override
    public int getCount() {
        return this.fruits.size();
    }

    @Override
    public Object getItem(int position) {
        return this.fruits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, final ViewGroup parent) {
        View view=null;
        if(convertView==null)
            view= LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.custom_item_layout,parent,false);
        else
            view=convertView;

        /*
        * bind data into item*/
        final Fruit fruit=this.fruits.get(position);
        ImageView thumb=view.findViewById(R.id.thumb);
        TextView title=view.findViewById(R.id.title);
        ImageView btnFavorite=view.findViewById(R.id.btnFavorite);

        /*set event to each view*/
        btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(parent.getContext(), fruit.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });

        thumb.setImageResource(fruit.getThumb());
        title.setText(fruit.getTitle());
        return view;
    }
}
