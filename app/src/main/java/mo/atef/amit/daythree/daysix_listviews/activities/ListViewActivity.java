package mo.atef.amit.daythree.daysix_listviews.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import mo.atef.amit.daythree.daysix_listviews.R;
import mo.atef.amit.daythree.daysix_listviews.databinding.ActivityListViewBinding;

public class ListViewActivity extends AppCompatActivity {

    ActivityListViewBinding binding;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_list_view);
        String names[]={"Ahmed Samy", "Mohamed Adel", "Abdelrahman Mohamed", "Yara Sherif", "Aya Eyad", "Moshera","Mai"};
        arrayAdapter=new ArrayAdapter<String>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                names);
        binding.listView.setAdapter(arrayAdapter);

    }
}