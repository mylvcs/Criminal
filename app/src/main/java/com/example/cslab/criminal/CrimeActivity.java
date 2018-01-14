package com.example.cslab.criminal;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity{

    public static final String EXTRA_CRIME_ID= "com.bignerdranch.android.criminalintent.crime_id";
    public static Intent newIntent(Context packageContext, UUID crimeId){
        Intent intent = new Intent(packageContext,CrimeActivity.class);
        return intent;
    }
    protected Fragment createFragment(){
        return new CrimeFragment();

    }
}
