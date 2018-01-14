package com.example.cslab.criminal;

import android.support.v4.app.Fragment;

/**
 * Created by CSLab on 2018/1/14.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    protected Fragment createFragment(){
        return  new CrimeListActivity();

    }
}
