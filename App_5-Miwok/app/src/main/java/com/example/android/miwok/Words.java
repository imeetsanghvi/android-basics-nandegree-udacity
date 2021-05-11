package com.example.android.miwok;

public class Words {
    private String mMiwokWord;
    private String mDefaultWord;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Words(String mMiwokWord, String mDefaultWord) {
        this.mMiwokWord = mMiwokWord;
        this.mDefaultWord = mDefaultWord;
    }

    public Words(String mMiwokWord, String mDefaultWord, int mImageResourceId) {
        this.mMiwokWord = mMiwokWord;
        this.mDefaultWord = mDefaultWord;
        this.mImageResourceId = mImageResourceId;
    }

    public String getmMiwokWord() { return mMiwokWord; }

    public String getmDefaultWord() {
        return mDefaultWord;
    }

    public int getmImageResourceId() { return mImageResourceId; }

    public boolean hasImageResourceId(){
        if(mImageResourceId == -1){
            return false;
        }
        else{return true;}
    }
}
