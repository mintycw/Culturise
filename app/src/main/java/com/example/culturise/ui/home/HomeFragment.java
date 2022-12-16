package com.example.culturise.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.culturise.Activities;
import com.example.culturise.ActivityOfTheDay;
import com.example.culturise.MainActivity;
import com.example.culturise.R;
import com.example.culturise.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private FragmentHomeBinding m_Binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        m_Binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = m_Binding.getRoot();

        return root;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
//        ImageButton buttonChina = (ImageButton) getView().findViewById(R.id.HomeChinaButton);
//        buttonChina.setOnClickListener(this);
//        ImageButton buttonJapan = (ImageButton) getView().findViewById(R.id.HomeJapanButton);
//        buttonJapan.setOnClickListener(this);
//        ImageButton buttonTurkey = (ImageButton) getView().findViewById(R.id.HomeTurkeyButton);
//        buttonTurkey.setOnClickListener(this);
//        ImageButton buttonItaly = (ImageButton) getView().findViewById(R.id.HomeItalyButton);
//        buttonItaly.setOnClickListener(this);
//        ImageButton buttonSpain = (ImageButton) getView().findViewById(R.id.HomeSpainButton);
//        buttonSpain.setOnClickListener(this);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        m_Binding = null;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getActivity(), Activities.class);
        startActivity(intent);
//        switch (view.getId()) {
//            case R.id.HomeChinaButton:
////                intent.putExtra("culture" ,"china");
////                intent.putExtra("title" ,"Chinese Activiteiten");
//                intent.putExtra("index", 1);
//                startActivity(intent);
//                break;
//            case R.id.HomeJapanButton:
//                intent.putExtra("culture" ,"japan");
//                intent.putExtra("title" ,"Japanse Activiteiten");
//                startActivity(intent);
//                break;
//        }
    }
}

