package com.zeglami.androidphpmysql;

import android.content.Context;
import android.content.SharedPreferences;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * Created by hamidze on 4/13/2018.
 */


public class SharedPrefManager {
    private static SharedPrefManager mInstance;
  //  private RequestQueue mRequestQueue;
    private static Context mCtx;
    private static final String SHARED_REF_NAME="mysharedref12";
    private static final String KEY_USERNAME="username";
    private static final String KEY_USER_EMAIL="useremail";
    private static final String KEY_USER_ID="userid";



    private SharedPrefManager(Context context) {
        mCtx = context;
      //  mRequestQueue = getRequestQueue();
    }


    public static synchronized SharedPrefManager getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new SharedPrefManager(context);
        }
        return mInstance;
    }
    public  boolean userLogin(int id, String username, String email){
        SharedPreferences sharedPreferences =mCtx.getSharedPreferences(SHARED_REF_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putInt(KEY_USER_ID,id);
        editor.putString(KEY_USER_EMAIL,email);
        editor.putString(KEY_USERNAME,username);
        editor.apply();

    return true;
 }

 public boolean isLogged(){
  SharedPreferences sharedPreferences =mCtx.getSharedPreferences(SHARED_REF_NAME,Context.MODE_PRIVATE);
  if(sharedPreferences.getString(KEY_USERNAME,null)!=null){
        return true;


 }else{ return false;}

}


    public boolean logout(){

        SharedPreferences sharedPreferences =mCtx.getSharedPreferences(SHARED_REF_NAME,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.clear();
        editor.apply();
        return true;


    }


    public String getUsername(){
  SharedPreferences sharedPreferences =mCtx.getSharedPreferences(SHARED_REF_NAME,Context.MODE_PRIVATE);
  return sharedPreferences.getString(KEY_USERNAME,null);




    }
public String getEmail(){
    SharedPreferences sharedPreferences =mCtx.getSharedPreferences(SHARED_REF_NAME,Context.MODE_PRIVATE);
    return sharedPreferences.getString(KEY_USER_EMAIL,null);

}

}
