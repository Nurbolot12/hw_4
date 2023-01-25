package com.example.hw_4;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.hw_4.databinding.ItemLaptopBinding;

import java.util.ArrayList;

public class LaptopAdapter extends RecyclerView.Adapter<LaptopViewHolder> {

    private final ArrayList<Laptop> laptopList;
    private final OnItemClick onItemClick;

    public LaptopAdapter(ArrayList<Laptop> laptopList,OnItemClick onItemClick){
        this.laptopList = laptopList;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public LaptopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LaptopViewHolder(ItemLaptopBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LaptopViewHolder holder, int position) {
        holder.bind(laptopList.get(position));
        holder.itemView.setOnClickListener(view -> onItemClick.onClick(laptopList.get(holder.getAdapterPosition())));
    }

    @Override
    public int getItemCount() {
        return laptopList.size();
    }
}


class LaptopViewHolder extends RecyclerView.ViewHolder {
    private final ItemLaptopBinding binding;

    public LaptopViewHolder(ItemLaptopBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    void bind(Laptop laptop) {
        binding.tvName.setText(laptop.getName());
        binding.tvSpecs.setText(laptop.getSpecs());
        Glide.with(binding.ivLaptop).load(laptop.getImgLaptop()).into(binding.ivLaptop);
    }
}
interface OnItemClick{
    void onClick(Laptop laptop);
}
