package mo.atef.amit.daythree.daysix_listviews.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import java.util.ArrayList;

import mo.atef.amit.daythree.daysix_listviews.R;
import mo.atef.amit.daythree.daysix_listviews.adapter.GridAdapter;
import mo.atef.amit.daythree.daysix_listviews.databinding.ActivityGridViewBinding;
import mo.atef.amit.daythree.daysix_listviews.model.CourseModel;

public class GridViewActivity extends AppCompatActivity {

    ActivityGridViewBinding binding;
    private ArrayList<CourseModel> coursesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_grid_view);

        coursesList=new ArrayList<CourseModel>();
        coursesList.add(new CourseModel("Android", getResources().getDrawable(R.drawable.android)));
        coursesList.add(new CourseModel("Data Structure",getResources().getDrawable(R.drawable.data_structure)));
        coursesList.add(new CourseModel("IOS",getResources().getDrawable(R.drawable.ios)));
        coursesList.add(new CourseModel("web front end",getResources().getDrawable(R.drawable.frontend)));
        coursesList.add(new CourseModel("Linux",getResources().getDrawable(R.drawable.linux)));
        coursesList.add(new CourseModel("Git",getResources().getDrawable(R.drawable.data_structure)));
        coursesList.add(new CourseModel("Machine Learning",getResources().getDrawable(R.drawable.ml)));
        coursesList.add(new CourseModel("Data Science",getResources().getDrawable(R.drawable.ds)));

        GridAdapter gridAdapter=new GridAdapter(getApplicationContext(),coursesList);
        binding.idGVcourses.setAdapter(gridAdapter);

    }
}