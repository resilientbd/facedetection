package com.faisal.facedetection.example;


import com.faisal.facedetection.example.databinding.FragmentExampleBinding;
import com.faisal.facedetection.ui.home.ui.home.FaceDetectionFragmentFace;
import com.faisal.facedetection.ui.home.ui.home.FaceDetectionFragmentViewModel;
import com.faisal.facedetection.util.googlevision.CameraPreview;
import com.faisal.facedetection.util.googlevision.GraphicOverlay;


public class ExampleFragmentFace extends FaceDetectionFragmentFace {
    FragmentExampleBinding mBinding;
    private FaceDetectionFragmentViewModel detectionFragmentViewModel;
    @Override
    protected void startNybfaceUI() {
        mBinding = (FragmentExampleBinding) getViewDataBinding();
        detectionFragmentViewModel = getActivityViewModel();
        detectionFragmentViewModel.getAllPermissions(getActivity());
        detectionFragmentViewModel.isActiveFrontCamera.postValue(false);
    }

    @Override
    protected GraphicOverlay getGraphicsOverLay() {
        return mBinding.graphicsOverlay;
    }

    @Override
    protected CameraPreview getCameraPreview() {
        return mBinding.preview;
    }

    @Override
    public int setLayoutId() {
        return R.layout.fragment_example;
    }
}
