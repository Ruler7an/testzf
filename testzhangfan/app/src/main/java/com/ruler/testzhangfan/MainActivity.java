package com.ruler.testzhangfan;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.ruler.testzhangfan.adapter.VpFgAdapter;
import com.ruler.testzhangfan.fragment.AttentionFragment;
import com.ruler.testzhangfan.fragment.HomeFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tab)
    TabLayout mTab;
    @BindView(R.id.vp)
    ViewPager mVp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new AttentionFragment());
        VpFgAdapter vpFgAdapter = new VpFgAdapter(getSupportFragmentManager(), fragments);
        mVp.setAdapter(vpFgAdapter);
        mTab.setupWithViewPager(mVp);
        mTab.getTabAt(0).setText("校门");
        mTab.getTabAt(1).setText("关注");
    }
}
