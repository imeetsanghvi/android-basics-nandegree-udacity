/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list_view);

        ArrayList<Words> Word_Class = new ArrayList<Words>();
        Word_Class.add(new Words("Lutti", "One", R.drawable.number_one));
        Word_Class.add(new Words("Lutti", "Two", R.drawable.number_two));
        Word_Class.add(new Words("Lutti", "Three", R.drawable.number_three));
        Word_Class.add(new Words("Lutti", "Four", R.drawable.number_four));
        Word_Class.add(new Words("Lutti", "Five", R.drawable.number_five));
        Word_Class.add(new Words("Lutti", "Six", R.drawable.number_six));
        Word_Class.add(new Words("Lutti", "Seven", R.drawable.number_seven));
        Word_Class.add(new Words("Lutti", "Eight", R.drawable.number_eight));
        Word_Class.add(new Words("Lutti", "Nine", R.drawable.number_nine));
        Word_Class.add(new Words("Lutti", "Ten", R.drawable.number_ten));

        ArrayAdapter adapter = new WordsAdapter(this, Word_Class);

        ListView listView = (ListView) findViewById(R.id.words_list_view);
//        GridView listView = (GridView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
