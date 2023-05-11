package com.example.mobilprogramlamaproje;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.mobilprogramlamaproje.calculationfragments.Bazal_metabolizma_hizi;
import com.example.mobilprogramlamaproje.calculationfragments.Gunluk_kalori_ihtiyaci;
import com.example.mobilprogramlamaproje.calculationfragments.Gunluk_protein_ihtiyaci;
import com.example.mobilprogramlamaproje.calculationfragments.Vucut_kitle_indeksi;
import com.example.mobilprogramlamaproje.calculationfragments.Yag_orani;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Calculation#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Calculation extends Fragment
{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Calculation() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Calculation.
     */
    // TODO: Rename and change types and number of parameters
    public static Calculation newInstance(String param1, String param2) {
        Calculation fragment = new Calculation();
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
    Button bazalhız,protein,yag,kalori,vucut;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_calculation, container, false);

        bazalhız=view.findViewById(R.id.BazalMetabolizmaHızı);
        protein=view.findViewById(R.id.Gunluk_protein_ihtiyaci);
        yag=view.findViewById(R.id.yag_orani);
        kalori=view.findViewById(R.id.Gunluk_Kalori_ihtiyaci);
        vucut=view.findViewById(R.id.vucut_kitle_indeksi);
        bazalhız.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent11 = new Intent(getActivity().getApplication(), Bazal_metabolizma_hizi.class);
                startActivity(intent11);
            }
        });

        protein.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent12 = new Intent(getActivity().getApplication(), Gunluk_protein_ihtiyaci.class);
                startActivity(intent12);
            }
        });

        yag.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent13 = new Intent(getActivity().getApplication(), Yag_orani.class);
                startActivity(intent13);
            }
        });

        kalori.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent14 = new Intent(getActivity().getApplication(), Gunluk_kalori_ihtiyaci.class);
                startActivity(intent14);
            }
        });

        vucut.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent15 = new Intent(getActivity().getApplication(), Vucut_kitle_indeksi.class);
                startActivity(intent15);
            }
        });


        return view;
    }
}