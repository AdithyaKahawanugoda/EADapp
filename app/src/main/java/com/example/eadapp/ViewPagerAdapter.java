package com.example.eadapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.eadapp.registration.OwnerRegistrationFragment;
import com.example.eadapp.registration.UserRegistrationFragment;

/**
 * ViewPagerAdapter Class is used to implement the tab view of the registration of the two types of users.
 */
public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    /**
     * facilitates the fragments according to the selection of tab item
     *
     * @param position
     * @return
     */
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position){
            case 0:
                return new UserRegistrationFragment();
            case 1:
                return new OwnerRegistrationFragment();
            default:
                return new UserRegistrationFragment();
        }
    }

    /**
     * Method returns the total number of items in data being held by adapter
     *
     * @return
     */
    @Override
    public int getItemCount() {
        return 2;
    }
}
