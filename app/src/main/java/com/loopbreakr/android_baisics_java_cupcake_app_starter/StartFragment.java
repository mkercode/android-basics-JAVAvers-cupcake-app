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

import com.loopbreakr.android_baisics_java_cupcake_app_starter.databinding.FragmentStartBinding;
/**
 * This is the first screen of the Cupcake app. The user can choose how many cupcakes to order.
 */
public class StartFragment extends Fragment {

    // Binding object instance corresponding to the fragment_start.xml layout
    // This property is non-null between the onCreateView() and onDestroyView() lifecycle callbacks,
    // when the view hierarchy is attached to the fragment.
    private FragmentStartBinding binding= null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewDataBinding fragmentBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_start, container, false);
        binding = (FragmentStartBinding) fragmentBinding;
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (binding != null) {
            binding.orderOneCupcake.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    orderCupcake(1);
                }
            });

            binding.orderSixCupcakes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    orderCupcake(6);
                }
            });
            binding.orderTwelveCupcakes.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    orderCupcake(12);
                }
            });
        }
    }

    /**
     * Start an order with the desired quantity of cupcakes and navigate to the next screen.
     */
    public void orderCupcake(int quantity) {
        Toast.makeText(getActivity(), "Ordered " + quantity + " cupcake(s)", Toast.LENGTH_SHORT).show();
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