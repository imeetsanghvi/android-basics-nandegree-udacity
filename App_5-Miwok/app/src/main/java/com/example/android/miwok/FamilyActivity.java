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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list_view);

        ArrayList<Words> familyMembersArrayList = new ArrayList<Words>();
        familyMembersArrayList.add(new Words("әpә", "Father", R.drawable.family_father));
        familyMembersArrayList.add(new Words("әṭa", "Mother", R.drawable.family_mother));
        familyMembersArrayList.add(new Words("angsi", "Son", R.drawable.family_son));
        familyMembersArrayList.add(new Words("tune", "Daughter", R.drawable.family_daughter));
        familyMembersArrayList.add(new Words("taachi", "Older Brother", R.drawable.family_older_brother));
        familyMembersArrayList.add(new Words("chalitti", "Younger Brother", R.drawable.family_younger_brother));
        familyMembersArrayList.add(new Words("teṭe", "Older Sister", R.drawable.family_older_sister));
        familyMembersArrayList.add(new Words("kolliti", "Younger Sister", R.drawable.family_younger_sister));
        familyMembersArrayList.add(new Words("ama", "Grandmother", R.drawable.family_grandmother));
        familyMembersArrayList.add(new Words("paapa", "Grandfather", R.drawable.family_grandfather));

        ArrayAdapter familyAdapter = new WordsAdapter(this, familyMembersArrayList);

//        ArrayAdapter colorAdapter = new ColorAdapter(this, colorsArrayList);

        ListView listView = (ListView) findViewById(R.id.words_list_view);
//        GridView listView = (GridView) findViewById(R.id.list);
        listView.setAdapter(familyAdapter);

    }
}
