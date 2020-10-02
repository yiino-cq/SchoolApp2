package com.caraquri.android.scool.app3.ui;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.caraquri.android.scool.app3.R;
import com.caraquri.android.scool.app3.databinding.MainFragmentBinding;

public class MainFragment extends Fragment {

  public MainFragment() {
    super(R.layout.main_fragment);
  }

  @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

    MainFragmentBinding binding = MainFragmentBinding.bind(view);
    binding.lifecycle.setOnClickListener(v -> open(new LifecycleFragment()));
    binding.livedata.setOnClickListener(v -> open(new LiveDataFragment()));
    binding.viewmodel.setOnClickListener(v -> open(new ViewModelFragment()));
    binding.room.setOnClickListener(v -> open(new RoomFragment()));
  }

  private void open(Fragment fragment) {
    getParentFragmentManager().beginTransaction()
        .replace(R.id.container, fragment)
        .addToBackStack(null)
        .commit();
  }
}
