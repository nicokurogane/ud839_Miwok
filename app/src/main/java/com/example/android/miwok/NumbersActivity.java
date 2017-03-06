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
import android.widget.ListView;

import com.example.android.miwok.adapters.WordAdapter;
import com.example.android.miwok.models.Word;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    ArrayList<Word> words;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        words = new ArrayList<Word>();

        // add words the arraylist, passing an in-line object
        words.add(new Word("one","lutti"));
        words.add(new Word("two","ottiko"));
        words.add(new Word("three","tolookosu"));
        words.add(new Word("four","oyyisa"));
        words.add(new Word("five","massokka"));
        words.add(new Word("six","temmokka"));
        words.add(new Word("seven","kenekaku"));
        words.add(new Word("eight","kawinta"));
        words.add(new Word("nine","wo'e"));
        words.add(new Word("ten","na'aacha"));




       /*el listview se llena con la data del arrayadapter, inserta data hasta que se acaba o se termine el espacio en pantalla.
        *luego cuando el usuario mueve la pantalla para ver la data que falta, el listview manda en "scrapview" los
        *listview que no se ven, y aquellos que se agregan, utilizan un view
        */
        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listview = (ListView) findViewById(R.id.list);
        listview.setAdapter(itemsAdapter);


    }
}
