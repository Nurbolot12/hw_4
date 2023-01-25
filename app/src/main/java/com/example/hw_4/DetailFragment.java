package com.example.hw_4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.hw_4.databinding.FragmentDetailBinding;

public class DetailFragment extends Fragment {
    private FragmentDetailBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDetailBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getData();
    }

    private void getData() {

        if (getArguments() != null) {

         Laptop result = (Laptop) getArguments().getSerializable("laptop");
            binding.tvNameDetail.setText(result.getName());
            binding.tvSpecsDetail.setText(result.getSpecs());
            Glide.with(requireContext()).load(result.getImgLaptop()).into(binding.ivLaptopDetail);
        }
    }
}