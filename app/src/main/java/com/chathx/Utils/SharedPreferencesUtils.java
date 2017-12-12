package com.chathx.Utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * User: 张亚博
 * Date: 2017-12-12 18:32
 * Description：
 */
public class SharedPreferencesUtils {
    private static SharedPreferencesUtils spUtils;
    private final SharedPreferences user;

    public SharedPreferencesUtils(Context context) {
        user = context.getApplicationContext().getSharedPreferences("User", Context.MODE_PRIVATE);
    }
    public static SharedPreferencesUtils getInstance(Context context){
        if (spUtils==null) {
            synchronized (SharedPreferencesUtils.class){
                if (spUtils==null) {
                    spUtils = new SharedPreferencesUtils(context);
                }
            }
        }
        return spUtils;
    }

    public void putString(String key,String value){
        SharedPreferences.Editor edit = user.edit();
        edit.putString(key,value);
        edit.commit();

    }
    public String getString(String key,String defaultValue){
        return user.getString(key, defaultValue);
    }
    public void putBoolean(String key,boolean value){
        SharedPreferences.Editor edit = user.edit();
        edit.putBoolean(key,value);
        edit.commit();
    }

    public boolean getBoolean(String key,boolean defaultValue){
        return user.getBoolean(key,defaultValue);
    }

    /**
     * 保存int类型值
     * @param key
     * @param defaultValue
     */
    public void putInt(String key,int defaultValue){
        SharedPreferences.Editor edit = user.edit();
        edit.putInt(key,defaultValue);
        edit.commit();

    }

    /**
     * 获取int类型值
     * @param key
     * @param defaultValue
     * @return
     */
    public int getInt(String key,int defaultValue){
       return user.getInt(key,defaultValue);
    }



}
