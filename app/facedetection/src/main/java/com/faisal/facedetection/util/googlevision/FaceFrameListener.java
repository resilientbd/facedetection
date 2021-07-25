package com.faisal.facedetection.util.googlevision;

import android.graphics.Bitmap;

public interface FaceFrameListener {
        void onFacesDetects(Bitmap bitmap);
    }