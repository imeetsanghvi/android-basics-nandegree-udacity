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

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list_view);

        ArrayList<Words> colorsArrayList = new ArrayList<Words>();
        colorsArrayList.add(new Words("weṭeṭṭi", "Red", R.drawable.color_red));
        colorsArrayList.add(new Words("chokokki", "Green", R.drawable.color_green));
        colorsArrayList.add(new Words("ṭakaakki", "Brown", R.drawable.color_brown));
        colorsArrayList.add(new Words("ṭopoppi", "Gray", R.drawable.color_gray));
        colorsArrayList.add(new Words("kululli", "Black", R.drawable.color_black));
        colorsArrayList.add(new Words("kelelli", "White", R.drawable.color_white));
        colorsArrayList.add(new Words("ṭopiisә", "Dusty Yellow", R.drawable.color_dusty_yellow));
        colorsArrayList.add(new Words("chiwiiṭә", "Mustard Yellow", R.drawable.color_mustard_yellow));

        ArrayAdapter colorAdapter = new WordsAdapter(this, colorsArrayList);

        ListView listView = (ListView) findViewById(R.id.words_list_view);
//        GridView listView = (GridView) findViewById(R.id.list);
        listView.setAdapter(colorAdapter);

    }
}
