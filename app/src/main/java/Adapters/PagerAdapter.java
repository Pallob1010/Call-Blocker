package Adapters;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.widget.Toast;

import java.util.ArrayList;

public class PagerAdapter extends FragmentStatePagerAdapter {

    ArrayList<String>Title=new ArrayList<>();
    ArrayList<Fragment>uFragment=new ArrayList<>();


    public PagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);



    }

    public void AddTab(Fragment fragment,String title){
        Title.add(title);
        uFragment.add(fragment);


    }
    @Override
    public Fragment getItem(int i) {
        return  uFragment.get(i);

    }

    @Override
    public int getCount() {
        return uFragment.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return Title.get(position);
    }

}
