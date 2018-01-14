package com.example.cslab.criminal;

import android.support.v4.app.Fragment;

public class CrimeActivity extends SingleFragmentActivity{

    protected Fragment createFragment(){
        return new CrimeFragment();

    }
}
