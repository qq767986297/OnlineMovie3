package com.bw.movie.base;

import java.lang.ref.WeakReference;

/**
 * Time: 2020/4/17
 * Author: 王冠华
 * Description:
 */
public abstract class BasePresenter<V extends IBaseView> {

    private  WeakReference<V> vWeakReference;

    public BasePresenter(V v) {
        vWeakReference = new WeakReference<>(v);
        initModel();
    }

    protected abstract void initModel();
    public V getView(){
        if(vWeakReference!=null){
            return vWeakReference.get();
        }
        return null;
    }
    public void datachView(){
        if(vWeakReference!=null){
            vWeakReference.clear();
            vWeakReference=null;
        }
    }
}
