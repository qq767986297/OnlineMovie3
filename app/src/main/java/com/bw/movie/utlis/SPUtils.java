package com.bw.movie.utlis;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Time: 2020/4/11
 * Author: 王冠华
 * Description:
 */
public class SPUtils {
    public static  void putString(Context context,String name,String key,String values){
        SharedPreferences sp = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = sp.edit();
        edit.putString(key,values);
        edit.commit();
    }
    public static String getString(Context context,String name,String key){
        SharedPreferences sp = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        return sp.getString(key,"");
    }
}
