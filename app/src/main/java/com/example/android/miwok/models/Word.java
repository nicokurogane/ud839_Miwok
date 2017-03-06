package com.example.android.miwok.models;

import android.database.DefaultDatabaseErrorHandler;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * it contains a default translation and a Miwok translation of that word.
 */

public class Word {

    private String defaultTranslation;
    private String miwokTranslation;


    public Word(String defaultTranslation, String miwokTranslation)
    {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation   = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
    }
}
