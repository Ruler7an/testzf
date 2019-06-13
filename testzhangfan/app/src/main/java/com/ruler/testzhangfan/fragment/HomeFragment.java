package com.ruler.testzhangfan.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ruler.testzhangfan.R;
import com.ruler.testzhangfan.adapter.HomeAdapter;
import com.ruler.testzhangfan.bean.HomeBean;
import com.ruler.testzhangfan.model.ImpHomeModel;
import com.ruler.testzhangfan.presenter.ImpHomePresenter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements com.ruler.testzhangfan.view.View {


    private RecyclerView mRvHome;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        View view = getView();
        mRvHome = view.findViewById(R.id.rv_home);
        initData();
        initView();
    }

    private void initView() {
        ArrayList<HomeBean> list = new ArrayList<>();
        mRvHome.setLayoutManager(new LinearLayoutManager(getContext()));
        HomeAdapter adapter = new HomeAdapter();

    }

    private void initData() {
        ImpHomePresenter impHomePresenter = new ImpHomePresenter(new ImpHomeModel(), this);
        impHomePresenter.getdata();
    }

    @Override
    public void onSuccess(ArrayList<HomeBean> ok) {

    }

    @Override
    public void onFail(String no) {

    }
}
