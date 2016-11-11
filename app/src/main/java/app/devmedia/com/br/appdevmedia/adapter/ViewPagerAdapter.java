package app.devmedia.com.br.appdevmedia.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bruno.braga on 10/11/2016.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    private List<Fragment> fragments = new ArrayList<>();
    private List<String> titulos = new ArrayList<>();

    @Override
    public Fragment getItem(int position) {

        return fragments.get(position);
    }

    @Override
    public int getCount() {

        return fragments.size();
    }

    public void addFragment(Fragment fragment, String titulo) {
        fragments.add(fragment);
        titulos.add(titulo);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titulos.get(position);
    }


}
