package com.alfanthariq.timelinerecyclersample.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alfanthariq.timelinerecyclersample.Kegiatan;
import com.alfanthariq.timelinerecyclersample.R;

import java.util.List;

/**
 * Created by alfanthariq on 13/05/2018.
 */

public class TimelineAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<Kegiatan> list;
    Context context;
    final int ITEM_HEADER = 0;
    final int ITEM_SECTION = 1;

    public TimelineAdapter(Context context, List<Kegiatan> list){
        this.list = list;
        this.context = context;
    }

    @Override
    public int getItemViewType(int position){
        if (position<=0){
            return ITEM_HEADER;
        } else {
            // Here's the tweak
            // In this case, my data group by date_str. So, compare current date_str with previous date_str
            // If same, set viewType to ITEM_SECTION
            String date_str = list.get(position).getDate_str();
            String date_str_prev = list.get(position-1).getDate_str();
            if (date_str.equals(date_str_prev)) {
                return ITEM_SECTION;
            } else {
                return ITEM_HEADER;
            }
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        switch (viewType){
            case ITEM_HEADER:
                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.timeline_header, parent, false);
                return new HeaderHolder(view) {
                };
            case ITEM_SECTION:
                view = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.timeline_section, parent, false);
                return new SectionHolder(view) {
                };
            default: return null;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof SectionHolder) {
            String txt = "";
            txt = list.get(position).getTime_str();
            ((SectionHolder) holder).txt_time.setText(txt);
            txt = list.get(position).getDetail();
            ((SectionHolder) holder).txt_detail.setText(txt);
        } else if (holder instanceof HeaderHolder) {
            String txt = "";
            txt = list.get(position).getDate_str();
            ((HeaderHolder) holder).txt_title.setText(txt);
            txt = list.get(position).getDay();
            ((HeaderHolder) holder).txt_subtitle.setText(txt);
            txt = list.get(position).getTime_str();
            ((HeaderHolder) holder).txt_time.setText(txt);
            txt = list.get(position).getDetail();
            ((HeaderHolder) holder).txt_detail.setText(txt);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class SectionHolder extends RecyclerView.ViewHolder {
        TextView txt_time, txt_detail;
        SectionHolder(View view) {
            super(view);

            txt_time = view.findViewById(R.id.txt_time);
            txt_detail = view.findViewById(R.id.txt_detail);
        }
    }

    static class HeaderHolder extends RecyclerView.ViewHolder {
        TextView txt_title, txt_subtitle, txt_time, txt_detail;
        HeaderHolder(View view) {
            super(view);

            txt_title = view.findViewById(R.id.txt_title);
            txt_subtitle = view.findViewById(R.id.txt_sub_title);
            txt_time = view.findViewById(R.id.txt_time);
            txt_detail = view.findViewById(R.id.txt_detail);
        }
    }
}
