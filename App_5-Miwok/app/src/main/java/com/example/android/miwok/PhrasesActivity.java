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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list_view);

//        ArrayList<FamilyMembers> familyMembersArrayList = new ArrayList<FamilyMembers>();

        ArrayList<Words> phrasesArrayList = new ArrayList<Words>();

        phrasesArrayList.add(new Words("minto wuksus", "Where are you going?"));
        phrasesArrayList.add(new Words("tinnә oyaase'nә", "What is your name?"));
        phrasesArrayList.add(new Words("oyaaset...", "My name is..."));
        phrasesArrayList.add(new Words("michәksәs?", "How are you feeling?"));
        phrasesArrayList.add(new Words("kuchi achit", "I’m feeling good"));
        phrasesArrayList.add(new Words("әәnәs'aa?", "Are you coming?"));
        phrasesArrayList.add(new Words("hәә’ әәnәm", "Yes, I’m coming."));
        phrasesArrayList.add(new Words("әәnәm", "I’m coming"));
        phrasesArrayList.add(new Words("yoowutis", "Let’s go"));
        phrasesArrayList.add(new Words("әnni'nem", "Come here"));

        ArrayAdapter phrasesAdapter = new WordsAdapter(this, phrasesArrayList);


//        ArrayAdapter colorAdapter = new ColorAdapter(this, colorsArrayList);

        ListView listView = (ListView) findViewById(R.id.words_list_view);
//        GridView listView = (GridView) findViewById(R.id.list);
        listView.setAdapter(phrasesAdapter);

    }
}
