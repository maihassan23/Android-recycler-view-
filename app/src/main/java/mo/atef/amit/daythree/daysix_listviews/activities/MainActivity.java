package mo.atef.amit.daythree.daysix_listviews.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import mo.atef.amit.daythree.daysix_listviews.R;
import mo.atef.amit.daythree.daysix_listviews.databinding.ActivityMainBinding;
import mo.atef.amit.daythree.daysix_listviews.views.fragments.ExclusiveOfferFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main);
        initAppBar();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(binding.frameItems.getId(), ExclusiveOfferFragment.newInstance()).commit();

    }

    private void initAppBar() {
        setSupportActionBar(binding.detailToolbar);
        assert getSupportActionBar()!=null;
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }
}