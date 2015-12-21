package com.example.cyanlauncher;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuItem;

public class CyanLaucherActivity extends SingleFragmentActivity {

	@Override
	protected Fragment creatFragment() {
		// TODO Auto-generated method stub
		return new CyanLauncherFragment();
	}
}
