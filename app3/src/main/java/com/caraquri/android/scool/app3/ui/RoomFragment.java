package com.caraquri.android.scool.app3.ui;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.caraquri.android.scool.app3.R;
import com.caraquri.android.scool.app3.databinding.RoomFragmentBinding;

class RoomFragment extends Fragment {

  private RoomViewModel viewModel;

  public RoomFragment() {
    super(R.layout.room_fragment);
  }

  @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    RoomFragmentBinding binding = RoomFragmentBinding.bind(view);

    viewModel = new ViewModelProvider(this).get(RoomViewModel.class);

    binding.button.setOnClickListener(v -> viewModel.insert(
        binding.inputFirst.getText().toString(),
        binding.inputSecond.getText().toString()
    ));
  }
}
