package com.example.hw_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw_4.databinding.FragmentBlankBinding;

import java.util.ArrayList;

public class BlankFragment extends Fragment implements OnItemClick {
    private final ArrayList<Laptop> laptopList = new ArrayList<>();

    private FragmentBlankBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentBlankBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        LaptopAdapter adapter = new LaptopAdapter(laptopList, this);
        binding.rvLaptops.setAdapter(adapter);
    }

    private void loadData() {
        laptopList.add(new Laptop("acer", "4 гига 4 ядра игровая видеокарта", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cf/Acer_Aspire_6920.jpg/220px-Acer_Aspire_6920.jpg"));
        laptopList.add(new Laptop("asus", "6гига 8 ядра слабая видеокарта", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/ASUS_Eee_White_Alt-small.png/220px-ASUS_Eee_White_Alt-small.png"));
        laptopList.add(new Laptop("hp", "16гига 32 ядра очень мощная видеокарта", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/HP_ProBook_6560b.png/250px-HP_ProBook_6560b.png"));
        laptopList.add(new Laptop("lenovo", "4 гига 2 ядра", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png/220px-Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png"));
        laptopList.add(new Laptop("lenovo", "4 гига 2 ядра", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png/220px-Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png"));
        laptopList.add(new Laptop("lenovo", "4 гига 2 ядра", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png/220px-Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png"));
        laptopList.add(new Laptop("lenovo", "4 гига 2 ядра", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png/220px-Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png"));
        laptopList.add(new Laptop("lenovo", "4 гига 2 ядра", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png/220px-Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png"));
        laptopList.add(new Laptop("lenovo", "4 гига 2 ядра", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png/220px-Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png"));
        laptopList.add(new Laptop("lenovo", "4 гига 2 ядра", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png/220px-Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png"));
        laptopList.add(new Laptop("lenovo", "4 гига 2 ядра", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png/220px-Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png"));
        laptopList.add(new Laptop("lenovo", "4 гига 2 ядра", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png/220px-Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png"));
        laptopList.add(new Laptop("lenovo", "4 гига 2 ядра", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png/220px-Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png"));
        laptopList.add(new Laptop("lenovo", "4 гига 2 ядра", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png/220px-Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png"));
        laptopList.add(new Laptop("lenovo", "4 гига 2 ядра", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png/220px-Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png"));
        laptopList.add(new Laptop("aser", "4 гига 2 ядра", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png/220px-Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png"));
        laptopList.add(new Laptop("hp", "4 гига 2 ядра", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png/220px-Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png"));
        laptopList.add(new Laptop("lenovo", "4 гига 2 ядра", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png/220px-Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png"));
        laptopList.add(new Laptop("aser", "4 гига 2 ядра", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png/220px-Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png"));
        laptopList.add(new Laptop("asus", "4 гига 2 ядра", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png/220px-Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png"));
        laptopList.add(new Laptop("macbook", "4 гига 2 ядра", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png/220px-Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png"));
        laptopList.add(new Laptop("lenovo", "4 гига 2 ядра", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png/220px-Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png"));
        laptopList.add(new Laptop("hp", "4 гига 2 ядра", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png/220px-Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png"));
        laptopList.add(new Laptop("aser", "4 гига 2 ядра", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png/220px-Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png"));
        laptopList.add(new Laptop("asus", "4 гига 2 ядра", "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png/220px-Lenovo_ThinkPad_X1_Ultrabook_%28Nov_16%2C_2012%29.png"));

    }

    @Override
    public void onClick(Laptop laptop) {
        DetailFragment detailFragment = new DetailFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("laptop", laptop);
        detailFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, detailFragment).addToBackStack(null).commit();
    }
}