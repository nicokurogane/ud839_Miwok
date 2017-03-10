package com.example.android.miwok.models;

import android.database.DefaultDatabaseErrorHandler;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * it contains a default translation and a Miwok translation of that word.
 */

public class Word {

    private String defaultTranslation;
    private String miwokTranslation;
    private int imageResourceId;
    private int soundResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int soundResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceId = NO_IMAGE_PROVIDED;
        this.soundResourceId = soundResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int soundResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceId = imageResourceId;
        this.soundResourceId = soundResourceId;
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

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    // evaluamos si tiene una imagen asociada, el valor de la expresion es devuelto por la funcion
    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getSoundResourceId() {
        return soundResourceId;
    }

    //retorna la representacion en string del objeto
    @Override
    public String toString() {
        return "Word{" +
                "defaultTranslation='" + defaultTranslation + '\'' +
                ", miwokTranslation='" + miwokTranslation + '\'' +
                ", imageResourceId=" + imageResourceId +
                ", soundResourceId=" + soundResourceId +
                '}';
    }
}
