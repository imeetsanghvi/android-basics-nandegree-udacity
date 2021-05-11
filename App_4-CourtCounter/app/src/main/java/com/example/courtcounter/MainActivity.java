package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView team_a_text_view, team_b_text_view;

    Button three_team_a, two_team_a, one_team_a;
    Button three_team_b, two_team_b, one_team_b;
    Button reset_score;

    int team_a_score = 0;
    int team_b_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize_objects();
        initialize_onclick_listeners();
        display();
    }


    private void initialize_objects() {
        team_a_text_view = (TextView) findViewById(R.id.team_a_score);
        team_b_text_view = (TextView) findViewById(R.id.team_b_score);

        three_team_a = (Button) findViewById(R.id.team_a_three_score);
        three_team_b = (Button) findViewById(R.id.team_b_three_score);

        two_team_a = (Button) findViewById(R.id.team_a_two_score);
        two_team_b = (Button) findViewById(R.id.team_b_two_score);

        one_team_a = (Button) findViewById(R.id.team_a_free_throw_score);
        one_team_b = (Button) findViewById(R.id.team_b_free_throw_score);

        reset_score = (Button) findViewById(R.id.reset_score);
    }


    private void initialize_onclick_listeners() {

        three_team_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team_a_score = team_a_score + 3;
                display();
            }
        });

        three_team_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team_b_score = team_b_score + 3;
                display();
            }

        });

        two_team_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team_a_score = team_a_score + 2;
                display();
            }
        });
        two_team_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team_b_score = team_b_score + 2;
                display();
            }
        });

        one_team_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team_a_score = team_a_score + 1;
                display();
            }
        });

        one_team_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team_b_score = team_b_score + 1;
                display();
            }
        });

        reset_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                team_a_score = 0;
                team_b_score = 0;
                display();
            }
        });
    }

    private void display() {

        team_a_text_view.setText(String.valueOf(team_a_score));
        team_b_text_view.setText(String.valueOf(team_b_score));

    }


}