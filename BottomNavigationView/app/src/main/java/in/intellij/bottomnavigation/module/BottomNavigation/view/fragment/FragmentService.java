package in.intellij.bottomnavigation.module.BottomNavigation.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import in.intellij.bottomnavigation.R;

/**
 * Created by Intellij Amiya on 18/3/18.
 * Who Am I- https://stackoverflow.com/users/3395198/
 * A good programmer is someone who looks both ways before crossing a One-way street.
 * Kindly follow https://source.android.com/setup/code-stylei
 */

public class FragmentService extends Fragment {

    public FragmentService() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_service, container, false);
        return rootView;

    }

}
