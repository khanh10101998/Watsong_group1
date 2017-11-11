package hongkhanh.watsong_group1;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import hongkhanh.watsong_group1.adapter.Adapter_viewpager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ViewPager viewPager;
    Adapter_viewpager adapter_viewpager;
    Button btn_fragment1,btn_fragment2,btn_fragment3;
    ImageView btn_history, btn_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initControl();
        initData();
        initEvent();
        initDisplay();
    }

    private void initDisplay() {
        viewPager.setCurrentItem(1);

    }

    private void initEvent() {
        adapter_viewpager = new Adapter_viewpager(getSupportFragmentManager());
        viewPager.setAdapter(adapter_viewpager);
        adapter_viewpager.notifyDataSetChanged();
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                btn_fragment1.setBackgroundResource(R.drawable.circle_default);
                btn_fragment2.setBackgroundResource(R.drawable.circle_default);
                btn_fragment3.setBackgroundResource(R.drawable.circle_default);
                switch (position){
                    case 0:
                        btn_fragment1.setBackgroundResource(R.drawable.circle_on);
                        break;
                    case 1:
                        btn_fragment2.setBackgroundResource(R.drawable.circle_on);
                        break;
                    case 2:
                        btn_fragment3.setBackgroundResource(R.drawable.circle_on);
                        break;
                    default:
                        break;
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initData() {

    }

    private void initControl() {
        btn_fragment1 = (Button)    findViewById(R.id.btn_fragment1);
        btn_fragment2 = (Button)    findViewById(R.id.btn_fragment2);
        btn_fragment3 = (Button)    findViewById(R.id.btn_fragment3);
        btn_history   = (ImageView) findViewById(R.id.btn_history);
        btn_search    = (ImageView) findViewById(R.id.btn_search);
        viewPager     = (ViewPager) findViewById(R.id.viewPager);
        btn_fragment1.setOnClickListener(this);
        btn_fragment2.setOnClickListener(this);
        btn_fragment3.setOnClickListener(this);
        btn_history.setOnClickListener(this);
        btn_search.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btn_history:
                viewPager.setCurrentItem(0);
                break;
            case R.id.btn_search:
                viewPager.setCurrentItem(2);
                break;
            case R.id.btn_fragment1:
                viewPager.setCurrentItem(0);
                break;
            case R.id.btn_fragment2:
                viewPager.setCurrentItem(1);
                break;
            case R.id.btn_fragment3:
                // TODO: 08/11/2017   
                break;
            default:
                break;
        }
    }
}
