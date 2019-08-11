package tw.org.iii.appps.brad21;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private Fragment[] fs = new Fragment[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);

        fs[0] = new P1();
        fs[1] = new P2();
        fs[2] = new P3();

        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

    }

    public void gotoPage1(View view) {
        viewPager.setCurrentItem(0);
    }

    public void gotoPage2(View view) {
        viewPager.setCurrentItem(1);
    }

    public void gotoPage3(View view) {
        viewPager.setCurrentItem(2);
    }

    private class MyPagerAdapter extends FragmentStatePagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fs[position];
        }

        @Override
        public int getCount() {
            return fs.length;
        }
    }


}
