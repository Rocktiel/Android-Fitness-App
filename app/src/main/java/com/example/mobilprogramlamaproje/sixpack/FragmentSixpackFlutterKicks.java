package com.example.mobilprogramlamaproje.sixpack;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.mobilprogramlamaproje.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentSixpackFlutterKicks#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentSixpackFlutterKicks extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentSixpackFlutterKicks() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentFlutterKicks.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentSixpackFlutterKicks newInstance(String param1, String param2) {
        FragmentSixpackFlutterKicks fragment = new FragmentSixpackFlutterKicks();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    View view;
    VideoView vv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_flutter_kicks, container, false);
        vv=view.findViewById(R.id.videoflutterkicks);

        String videoPath="android.resource://" +"com.example.mobilprogramlamaproje"+ "/" + R.raw.video;


        Uri uri=Uri.parse(videoPath);
        vv.setVideoURI(uri);
        MediaController media=new MediaController(view.getContext());
        vv.setMediaController(media);
        media.setAnchorView(vv);

        return view;
    }
}