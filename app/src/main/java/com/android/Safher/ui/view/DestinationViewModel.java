package com.android.Safher.ui.view;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DestinationViewModel extends ViewModel {

        private MutableLiveData<String> destination = new MutableLiveData<>();

        public void setDestination(String destination) {
            this.destination.setValue(destination);
        }

        public LiveData<String> getDestination() {
            return destination;
        }


}
