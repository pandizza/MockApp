package com.example.mockapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FieldDataAdapter extends RecyclerView.Adapter<FieldDataAdapter.FieldDataViewHolder>
{
    private Context context;
    List<FieldDataClass> fieldDataList;

    public FieldDataAdapter(Context _context, List<FieldDataClass> _fieldDataList){
        context = _context;
        fieldDataList = _fieldDataList;
    }

    @NonNull
    @Override
    public FieldDataAdapter.FieldDataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_field_data, null);
        return new FieldDataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FieldDataAdapter.FieldDataViewHolder holder, int position) {
        FieldDataClass fieldData = fieldDataList.get(position);

        //Binding data to view
        holder.tv_podatak_1.setText(fieldData.getPodatak_1());
        holder.tv_podatak_2.setText(fieldData.getPodatak_2());
        holder.et_field_data_value.setText(fieldData.getField_data_value());

    }

    @Override
    public int getItemCount() {
        return fieldDataList.size();
    }

    public class FieldDataViewHolder extends RecyclerView.ViewHolder {

        TextView tv_podatak_1, tv_podatak_2;
        EditText et_field_data_value;

        public FieldDataViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_podatak_1 = itemView.findViewById(R.id.tv_podatak_1);
            tv_podatak_2 = itemView.findViewById(R.id.tv_podatak_2);
            et_field_data_value = itemView.findViewById(R.id.et_field_data_value);

        }
    }
}
