package com.loopbreakr.android_baisics_java_cupcake_app_starter;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.loopbreakr.android_baisics_java_cupcake_app_starter.databinding.FragmentFlavorBinding;
import com.loopbreakr.android_baisics_java_cupcake_app_starter.databinding.FragmentPickupBinding;
import com.loopbreakr.android_baisics_java_cupcake_app_starter.databinding.FragmentStartBinding;

/**
 * [PickupFragment] allows the user to choose a pickup date for the cupcake order.
 */
public class PickupFragment extends Fragment {

    // Binding object instance corresponding to the fragment_pickup.xml layout
    // This property is non-null between the onCreateView() and onDestroyView() lifecycle callbacks,
    // when the view hierarchy is attached to the fragment.
    private FragmentPickupBinding binding= null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewDataBinding fragmentBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_pickup, container, false);
        binding = (FragmentPickupBinding) fragmentBinding;
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (binding != null){
            binding.nextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    goToNextScreen();
                }
            });
        }
    }

    /**
     * Navigate to the next screen to see the order summary.
     */
    public void goToNextScreen(){
        Toast.makeText(getActivity(), "Next", Toast.LENGTH_SHORT).show();
    }

    /**
     * This fragment lifecycle method is called when the view hierarchy associated with the fragment
     * is being removed. As a result, clear out the binding object.
     */
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}