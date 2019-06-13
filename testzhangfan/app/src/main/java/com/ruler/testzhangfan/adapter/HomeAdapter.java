package com.ruler.testzhangfan.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ruler.testzhangfan.R;
import com.ruler.testzhangfan.bean.HomeBean;

import java.util.ArrayList;

/**
 * name:SailCheung
 * date:2019-06-13
 * time:上午 11:45
 * year:2019
 * project_name:testzhangfan
 */
public class HomeAdapter extends RecyclerView.Adapter {
    private Context context;
    private ArrayList<HomeBean> list;

    public HomeAdapter(Context context, ArrayList<HomeBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 1) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.item1, null, false);
            ViewHolder1 viewHolder1 = new ViewHolder1(inflate);
            return viewHolder1;
        }
        if (itemViewType == 2) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.item2, null, false);
            ViewHolder2 viewHolder2 = new ViewHolder2(inflate);
            return viewHolder2;
        }
        if (itemViewType == 3) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.item3, null, false);
            ViewHolder3 viewHolder3 = new ViewHolder3(inflate);
            return viewHolder3;
        }
        if (itemViewType == 4) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.item4, null, false);
            ViewHolder4 viewHolder4 = new ViewHolder4(inflate);
            return viewHolder4;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int itemViewType = viewHolder.getItemViewType();
        if (itemViewType == 1) {

        }
        if (itemViewType == 2) {

        }
        if (itemViewType == 3) {

        }
        if (itemViewType == 4) {

        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position % 2 == 0) {
            return 1;
        } else if (position % 2 == 1) {
            return 2;
        } else if (position % 2 == 2) {
            return 3;
        } else {
            return 4;
        }
    }

    class ViewHolder1 extends RecyclerView.ViewHolder {
        public ViewHolder1(@NonNull View itemView) {
            super(itemView);
        }
    }

    class ViewHolder2 extends RecyclerView.ViewHolder {
        public ViewHolder2(@NonNull View itemView) {
            super(itemView);
        }
    }

    class ViewHolder3 extends RecyclerView.ViewHolder {
        public ViewHolder3(@NonNull View itemView) {
            super(itemView);
        }
    }

    class ViewHolder4 extends RecyclerView.ViewHolder {
        public ViewHolder4(@NonNull View itemView) {
            super(itemView);
        }
    }
}
