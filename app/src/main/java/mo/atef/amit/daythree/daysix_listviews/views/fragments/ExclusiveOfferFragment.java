package mo.atef.amit.daythree.daysix_listviews.views.fragments;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import mo.atef.amit.daythree.daysix_listviews.R;
import mo.atef.amit.daythree.daysix_listviews.activities.MainActivity;
import mo.atef.amit.daythree.daysix_listviews.adapter.ExclusiveRecyclerAdapter;
import mo.atef.amit.daythree.daysix_listviews.databinding.ExclusiveOfferFragmentBinding;
import mo.atef.amit.daythree.daysix_listviews.model.ExclusiveOffer;

public class ExclusiveOfferFragment extends Fragment {

    ExclusiveOfferFragmentBinding binding;
    ArrayList<ExclusiveOffer> offersArrayList;
    private ExclusiveRecyclerAdapter mAdapter;

    public static ExclusiveOfferFragment newInstance() {
        return new ExclusiveOfferFragment();
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e("fragment","onCreateView");
        binding= DataBindingUtil.inflate(inflater, R.layout.exclusive_offer_fragment,container,false);
//        binding.rvExclusiveOffers
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
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e("fragment","onViewCreated");
        populateRecyclerView(offersArrayList);
    }

    private void populateRecyclerView(ArrayList<ExclusiveOffer> offersArrayList) {
        mAdapter= new ExclusiveRecyclerAdapter(getActivity(),offersArrayList);
        RecyclerView.LayoutManager mLayoutManager=new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        binding.rvExclusiveOffers.setLayoutManager(mLayoutManager);
        binding.rvExclusiveOffers.setItemAnimator(new DefaultItemAnimator());
        binding.rvExclusiveOffers.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
        Log.e("fragment","populatedList");
    }
}