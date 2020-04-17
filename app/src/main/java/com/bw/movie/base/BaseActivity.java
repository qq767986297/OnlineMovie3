package com.bw.movie.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {

    private P presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        ButterKnife.bind(this);
        presenter = initPresenter();
        initView();
        initData();
    }

    public P getPresenter() {
        return presenter;
    }

    protected abstract P initPresenter();
    protected abstract int getLayout();
    protected abstract void initView();
    protected abstract void initData();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(presenter!=null){
            presenter.datachView();
            presenter=null;
        }
    }
}
