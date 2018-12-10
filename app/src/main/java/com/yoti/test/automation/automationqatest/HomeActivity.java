package com.yoti.test.automation.automationqatest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private final String[] mItems = new String[]{"area", "book", "business", "case", "child", "company",
            "country", "day", "eye", "fact", "family", "government", "group", "hand", "home", "job",
            "life", "lot", "man", "money", "month", "mother", "Mr", "night", "number", "part",
            "people", "place", "point", "problem", "program", "question", "right", "room", "school",
            "state", "story", "student", "study", "system", "thing", "time", "water", "way", "week",
            "woman", "word", "work", "world",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RecyclerView list = findViewById(R.id.home_list);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(new RecyclerView.Adapter<StringViewHolder>() {
            @NonNull
            @Override
            public StringViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
                View v = LayoutInflater.from(viewGroup.getContext()).inflate(
                        android.R.layout.simple_list_item_1, viewGroup, false);
                return new StringViewHolder(v);
            }

            @Override
            public void onBindViewHolder(@NonNull StringViewHolder viewHolder, int i) {
                viewHolder.text.setText(mItems[i]);
            }

            @Override
            public int getItemCount() {
                return mItems.length;
            }
        });

        Button logout = findViewById(R.id.home_button_logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private class StringViewHolder extends RecyclerView.ViewHolder {
        public TextView text;

        public StringViewHolder(View view) {
            super(view);
            text = view.findViewById(android.R.id.text1);
        }
    }
}
