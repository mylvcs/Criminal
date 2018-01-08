package com.nuaa.wmy.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by wmy on 2018/1/7.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
