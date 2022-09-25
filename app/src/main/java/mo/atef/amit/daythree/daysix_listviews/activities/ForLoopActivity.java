package mo.atef.amit.daythree.daysix_listviews.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

import mo.atef.amit.daythree.daysix_listviews.R;
import mo.atef.amit.daythree.daysix_listviews.model.ExclusiveOffer;

public class ForLoopActivity extends AppCompatActivity {

    ArrayList<ExclusiveOffer> offersArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_loop);

        offersArrayList=new ArrayList<>();
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.banana), "banana",1800, 20));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.orange), "orange",2000, 25));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.straubery), "strawberry",1999, 28));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.mango), "Mango",2500, 29));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.ananas), "Ananas",1850, 30));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.peach), "Peach",1400, 15));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.nb), "3nb",1350, 18));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.mshmsh), "mshmsh",1250, 16));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.watermellon), "Watermelon",1000, 6));
        offersArrayList.add(new ExclusiveOffer(getResources().getDrawable(R.drawable.carrot), "Carrot",1200, 9));


    }
}