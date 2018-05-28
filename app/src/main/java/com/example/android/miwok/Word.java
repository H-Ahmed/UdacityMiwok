package com.example.android.miwok;

public class Word {

    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    private static final int NO_IMAGE_PROVIDER = -1;

    /**
     * Image resource ID for the word
     */
    private int mImageResourceID = NO_IMAGE_PROVIDER;

    /**
     * Audio resource ID for the word
     */
    private int mAudioResourceId;

    /**
     * Create n new Word object
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param audioResourceId    is the audio resource ID
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create n new Word object
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageResourceID    is the drawable resource ID for the image
     * @param audioResourceId    is the audio resource ID
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mAudioResourceId = audioResourceId;
    }

    /**
     *
     * @return the default translation of the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     *
     * @return the Miwok translation of the word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * @return the image resource ID for the word
     */
    public int getImageResourceID() {
        return mImageResourceID;
    }

    /**
     * @return whether or not there is an image for this word
     */
    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDER;
    }

    /**
     * @return the image resource ID for the word
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    /**
     *
     * @return the string representation of the {@link Word} object.
     */
    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceID=" + mImageResourceID +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
