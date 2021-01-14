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
import com.loopbreakr.android_baisics_java_cupcake_app_starter.databinding.FragmentStartBinding;
import com.loopbreakr.android_baisics_java_cupcake_app_starter.databinding.FragmentSummaryBinding;

/**
 * [SummaryFragment] contains a summary of the order details with a button to share the order
 * via another app.
 */
public class SummaryFragment extends Fragment {

    private FragmentSummaryBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewDataBinding fragmentBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_summary, container, false);
        binding = (FragmentSummaryBinding) fragmentBinding;
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (binding != null){
            binding.sendButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    sendOrder();
                }
            });
        }
    }

    /**
     * Submit the order by sharing out the order details to another app via an implicit intent.
     */
    public void sendOrder(){
        Toast.makeText(getActivity(), "Send Order", Toast.LENGTH_SHORT).show();
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