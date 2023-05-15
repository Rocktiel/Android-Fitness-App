package com.example.mobilprogramlamaproje;

import static android.content.Context.MODE_PRIVATE;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.mobilprogramlamaproje.back.FragmentBackBarfixReverseGrip;
import com.example.mobilprogramlamaproje.back.FragmentBackBumbellShrug;
import com.example.mobilprogramlamaproje.back.FragmentBackDumbellRow;
import com.example.mobilprogramlamaproje.back.FragmentBackDumbellShrug;
import com.example.mobilprogramlamaproje.back.FragmentBackHyperExtension;
import com.example.mobilprogramlamaproje.back.FragmentBackLetPullDown;
import com.example.mobilprogramlamaproje.back.FragmentBackPullUp;
import com.example.mobilprogramlamaproje.back.FragmentBackSeatedCableRow;
import com.example.mobilprogramlamaproje.back.FragmentBackSuperman;
import com.example.mobilprogramlamaproje.back.FragmentBackTBarRow;
import com.example.mobilprogramlamaproje.back.FragmentBentOverTwoArmDumbellRow;
import com.example.mobilprogramlamaproje.biceps.FragmentBicepsCableChestCompression;
import com.example.mobilprogramlamaproje.biceps.FragmentBicepsCableCurl;
import com.example.mobilprogramlamaproje.biceps.FragmentBicepsConcentrationCurl;
import com.example.mobilprogramlamaproje.biceps.FragmentBicepsDumbbellPreacherCurl;
import com.example.mobilprogramlamaproje.biceps.FragmentBicepsHammerCurl;
import com.example.mobilprogramlamaproje.biceps.FragmentBicepsInclineReverseDumbbellPress;
import com.example.mobilprogramlamaproje.biceps.FragmentBicepsReverseBarbellCurl;
import com.example.mobilprogramlamaproje.biceps.FragmentBicepsScotCurlZBar;
import com.example.mobilprogramlamaproje.biceps.FragmentBicepsSeatedDumbbellCurl;
import com.example.mobilprogramlamaproje.biceps.FragmentBicepsSeatedHammerCurl;
import com.example.mobilprogramlamaproje.biceps.FragmentBicepsSingleArmCableCurl;
import com.example.mobilprogramlamaproje.bolgeler.FragmentKarinKas;
import com.example.mobilprogramlamaproje.calf.FragmentBarbellSeatedCalfRaise;
import com.example.mobilprogramlamaproje.calf.FragmentBarbellSeatedCalfRaiseOneLeg;
import com.example.mobilprogramlamaproje.calf.FragmentCalfBarbellCalfRaise;
import com.example.mobilprogramlamaproje.calf.FragmentCalfDumbbellSeatedCalfRaise;
import com.example.mobilprogramlamaproje.calf.FragmentCalfDumbbellVault;
import com.example.mobilprogramlamaproje.calf.FragmentCalfOneArmPushUps;
import com.example.mobilprogramlamaproje.calf.FragmentCalfStandingDumbbellCalfRaise;
import com.example.mobilprogramlamaproje.calf.FragmentCalfStandingDumbbellCalfRaiseOneToe;
import com.example.mobilprogramlamaproje.chest.FragmentChestBenchPress;
import com.example.mobilprogramlamaproje.chest.FragmentChestCableCrossover;
import com.example.mobilprogramlamaproje.chest.FragmentChestDeclinePress;
import com.example.mobilprogramlamaproje.chest.FragmentChestDips;
import com.example.mobilprogramlamaproje.chest.FragmentChestDumbellPullover;
import com.example.mobilprogramlamaproje.chest.FragmentChestInclineDumbellFly;
import com.example.mobilprogramlamaproje.chest.FragmentChestInclinedPushups;
import com.example.mobilprogramlamaproje.chest.FragmentChestModifiedPushups;
import com.example.mobilprogramlamaproje.chest.FragmentChestPecDeckFly;
import com.example.mobilprogramlamaproje.chest.FragmentChestPushUp;
import com.example.mobilprogramlamaproje.chest.FragmentChestSmithMachineBenchPress;
import com.example.mobilprogramlamaproje.forearm.FragmentForearmBarbellWristCurl;
import com.example.mobilprogramlamaproje.forearm.FragmentForearmReverseWristCurl;
import com.example.mobilprogramlamaproje.forearm.FragmentForearmSeatedDumbellWristCurl;
import com.example.mobilprogramlamaproje.forearm.FragmentForearmWristRotation;
import com.example.mobilprogramlamaproje.legs.FragmentLegsBulgarianSquat;
import com.example.mobilprogramlamaproje.legs.FragmentLegsDumbellLunge;
import com.example.mobilprogramlamaproje.legs.FragmentLegsDumbellSquat;
import com.example.mobilprogramlamaproje.legs.FragmentLegsHackSquat;
import com.example.mobilprogramlamaproje.legs.FragmentLegsLegExtension;
import com.example.mobilprogramlamaproje.legs.FragmentLegsLegPress;
import com.example.mobilprogramlamaproje.legs.FragmentLegsOneArmToTheSideDeadlift;
import com.example.mobilprogramlamaproje.legs.FragmentLegsOneLeggedCollapse;
import com.example.mobilprogramlamaproje.legs.FragmentLegsSquat;
import com.example.mobilprogramlamaproje.legs.FragmentLegsStandingLegCurl;
import com.example.mobilprogramlamaproje.shoulder.FragmentShoulderArnoldPress;
import com.example.mobilprogramlamaproje.shoulder.FragmentShoulderBarbellFrontRaise;
import com.example.mobilprogramlamaproje.shoulder.FragmentShoulderBarbellShoulderPress;
import com.example.mobilprogramlamaproje.shoulder.FragmentShoulderBehindTheNeckPress;
import com.example.mobilprogramlamaproje.shoulder.FragmentShoulderBentOverCableLateralRaise;
import com.example.mobilprogramlamaproje.shoulder.FragmentShoulderDumbbellFrontRaise;
import com.example.mobilprogramlamaproje.shoulder.FragmentShoulderDumbbellShoulderPress;
import com.example.mobilprogramlamaproje.shoulder.FragmentShoulderLateralRaise;
import com.example.mobilprogramlamaproje.shoulder.FragmentShoulderOneArmCableLateralRaise;
import com.example.mobilprogramlamaproje.shoulder.FragmentShoulderSeatedLateralRaise;
import com.example.mobilprogramlamaproje.shoulder.FragmentUprightRow;
import com.example.mobilprogramlamaproje.shoulder.FragmentWeightPlateFrontRaises;
import com.example.mobilprogramlamaproje.sixpack.FragmentHangingLegRaise;
import com.example.mobilprogramlamaproje.sixpack.FragmentInclineCrunch;
import com.example.mobilprogramlamaproje.sixpack.FragmentSideBridges;
import com.example.mobilprogramlamaproje.sixpack.FragmentSixpackCrunch;
import com.example.mobilprogramlamaproje.sixpack.FragmentSixpackDumbellLeanOver;
import com.example.mobilprogramlamaproje.sixpack.FragmentSixpackFingertipTouch;
import com.example.mobilprogramlamaproje.sixpack.FragmentSixpackFlutterKicks;
import com.example.mobilprogramlamaproje.sixpack.FragmentSixpackInclineLegRaise;
import com.example.mobilprogramlamaproje.sixpack.FragmentSixpackLegLowers;
import com.example.mobilprogramlamaproje.sixpack.FragmentSixpackObliqueTwists;
import com.example.mobilprogramlamaproje.triceps.FragmentTricepsBenchDips;
import com.example.mobilprogramlamaproje.triceps.FragmentTricepsCloseGripBenchPress;
import com.example.mobilprogramlamaproje.triceps.FragmentTricepsDiamondPushUp;
import com.example.mobilprogramlamaproje.triceps.FragmentTricepsDumbbellKickback;
import com.example.mobilprogramlamaproje.triceps.FragmentTricepsOneArmLyingTricepsExtension;
import com.example.mobilprogramlamaproje.triceps.FragmentTricepsOneArmReversePushdown;
import com.example.mobilprogramlamaproje.triceps.FragmentTricepsPushdown;
import com.example.mobilprogramlamaproje.triceps.FragmentTricepsRopePushDown;
import com.example.mobilprogramlamaproje.triceps.FragmentTricepsSeatedTricepsPress;
import com.example.mobilprogramlamaproje.triceps.FragmentTricepsSkullCrusher;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TrainingFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TrainingFrag extends Fragment implements MyAdapterTraining.SelectedUserTra {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TrainingFrag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TrainingFrag.
     */
    // TODO: Rename and change types and number of parameters
    public static TrainingFrag newInstance(String param1, String param2) {
        TrainingFrag fragment = new TrainingFrag();
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

    RecyclerView rv;

    Button del;
    List<antrenman> antrenmanList;

    SQLiteDatabase db;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_training, container, false);

        del=view.findViewById(R.id.deletebutton);


        pull();

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ii=getActivity().getIntent();
                String un=ii.getStringExtra("nickname");

                try{

                    db=view.getContext().openOrCreateDatabase(un,MODE_PRIVATE,null);

                }catch(Exception e){
                    e.printStackTrace();
                }

                db.execSQL("DROP TABLE IF EXISTS denemeantrenman");

                pull();
            }
        });

        return view;
    }

    public void pull(){
        Intent ii=getActivity().getIntent();
        String un=ii.getStringExtra("nickname");

        try{

            db=view.getContext().openOrCreateDatabase(un,MODE_PRIVATE,null);
            db.execSQL("CREATE TABLE IF NOT EXISTS denemeantrenman (id INTEGER PRIMARY KEY , name VARCHAR, weight VARCHAR, setsayi VARCHAR, tekrarsayi VARCHAR )");
        }catch(Exception e){
            e.printStackTrace();
        }

        rv=view.findViewById(R.id.myrecycler);

        antrenmanList= new ArrayList<>();

        Cursor cursor=db.rawQuery("SELECT * FROM denemeantrenman ",null);

        int nameIndex=cursor.getColumnIndex("name");
        int weightIndex=cursor.getColumnIndex("weight");
        int setIndex=cursor.getColumnIndex("setsayi");
        int tekrarIndex=cursor.getColumnIndex("tekrarsayi");


        while(cursor.moveToNext()) {
            String a = cursor.getString(nameIndex);
            String b = cursor.getString(weightIndex);
            String c = cursor.getString(setIndex);
            String d = cursor.getString(tekrarIndex);

            if(a.length()!=0)
            {
                antrenmanList.add(new antrenman(a,b,c,d));
            }
        }

        rv.setLayoutManager(new LinearLayoutManager(view.getContext()));
        rv.setAdapter(new MyAdapterTraining(view.getContext(),antrenmanList, (MyAdapterTraining.SelectedUserTra) this));


    }

    @Override
    public void selecteduser(antrenman ant) {
        if(ant.getName().equals("Bumbell Shrug")){
            FragmentBackBumbellShrug backBumbellShrug=new FragmentBackBumbellShrug();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,backBumbellShrug).commit();

        }
        else if(ant.getName().equals("Dumbell Row"))
        {
            FragmentBackDumbellRow dumbellRow=new FragmentBackDumbellRow();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,dumbellRow).commit();

        }
        else if(ant.getName().equals("Dumbell Shrug"))
        {
            FragmentBackDumbellShrug dumbellShrug=new FragmentBackDumbellShrug();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,dumbellShrug).commit();

        }
        else if(ant.getName().equals("Let Pull Down"))
        {
            FragmentBackLetPullDown letPullDown=new FragmentBackLetPullDown();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,letPullDown).commit();

        }
        else if(ant.getName().equals("Pull Up"))
        {
            FragmentBackPullUp pullUp=new FragmentBackPullUp();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,pullUp).commit();

        }
        else if(ant.getName().equals("Seated Cable Row"))
        {
            FragmentBackSeatedCableRow seatedCableRow=new FragmentBackSeatedCableRow();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,seatedCableRow).commit();

        }
        else if(ant.getName().equals("Hyper Extension"))
        {
            FragmentBackHyperExtension hyperExtension=new FragmentBackHyperExtension();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,hyperExtension).commit();

        }
        else if(ant.getName().equals("Bent Over Two Arm Dumbell Row"))
        {
            FragmentBentOverTwoArmDumbellRow bentOverTwoArmDumbellRow=new FragmentBentOverTwoArmDumbellRow();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,bentOverTwoArmDumbellRow).commit();

        }
        else if(ant.getName().equals("Superman"))
        {
            FragmentBackSuperman superman=new FragmentBackSuperman();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,superman).commit();

        }
        else if(ant.getName().equals("T-Bar Row"))
        {
            FragmentBackTBarRow tBarRow=new FragmentBackTBarRow();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,tBarRow).commit();

        }
        else if(ant.getName().equals("Barfix Reverse Grip"))
        {
            FragmentBackBarfixReverseGrip backBarfixReverseGrip=new FragmentBackBarfixReverseGrip();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,backBarfixReverseGrip).commit();

        }
        else if(ant.getName().equals("Bulgarian Squat"))
        {
            FragmentLegsBulgarianSquat bulgarianSquat=new FragmentLegsBulgarianSquat();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,bulgarianSquat).commit();

        }
        else if(ant.getName().equals("Dumbell Lunge"))
        {
            FragmentLegsDumbellLunge dumbellLunge=new FragmentLegsDumbellLunge();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,dumbellLunge).commit();

        }
        else if(ant.getName().equals("Dumbell Squat"))
        {
            FragmentLegsDumbellSquat dumbellSquat=new FragmentLegsDumbellSquat();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,dumbellSquat).commit();

        }
        else if(ant.getName().equals("Hack Squat"))
        {
            FragmentLegsHackSquat behindTheNeckPress=new FragmentLegsHackSquat();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,behindTheNeckPress).commit();

        }
        else if(ant.getName().equals("Leg Extension"))
        {
            FragmentLegsLegExtension legExtension=new FragmentLegsLegExtension();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,legExtension).commit();

        }
        else if(ant.getName().equals("Leg Press"))
        {
            FragmentLegsLegPress legPress=new FragmentLegsLegPress();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,legPress).commit();

        }
        else if(ant.getName().equals("One Arm To The Side Deadlift"))
        {
            FragmentLegsOneArmToTheSideDeadlift oneArmToTheSideDeadlift=new FragmentLegsOneArmToTheSideDeadlift();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,oneArmToTheSideDeadlift).commit();

        }
        else if(ant.getName().equals("One-Legged Collapse"))
        {
            FragmentLegsOneLeggedCollapse oneLeggedCollapse=new FragmentLegsOneLeggedCollapse();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,oneLeggedCollapse).commit();

        }
        else if(ant.getName().equals("Squat"))
        {
            FragmentLegsSquat squat=new FragmentLegsSquat();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,squat).commit();

        }else if(ant.getName().equals("Standing Leg Curl"))
        {
            FragmentLegsStandingLegCurl standingLegCurl=new FragmentLegsStandingLegCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,standingLegCurl).commit();

        }
        else if(ant.getName().equals("Barbell Calf Raise"))
        {
            FragmentCalfBarbellCalfRaise barbellCalfRaise=new FragmentCalfBarbellCalfRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,barbellCalfRaise).commit();

        }
        else if(ant.getName().equals("Barbell Seated Calf Raise One Leg"))
        {
            FragmentBarbellSeatedCalfRaiseOneLeg barbellSeatedCalfRaiseOneLeg=new FragmentBarbellSeatedCalfRaiseOneLeg();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,barbellSeatedCalfRaiseOneLeg).commit();

        }
        else if(ant.getName().equals("Barbell Seated Calf Raise"))
        {
            FragmentBarbellSeatedCalfRaise barbellSeatedCalfRaise=new FragmentBarbellSeatedCalfRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,barbellSeatedCalfRaise).commit();

        }
        else if(ant.getName().equals("Dumbbell Seated Calf Raise"))
        {
            FragmentCalfDumbbellSeatedCalfRaise dumbbellSeatedCalfRaise=new FragmentCalfDumbbellSeatedCalfRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,dumbbellSeatedCalfRaise).commit();

        }
        else if(ant.getName().equals("Dumbbell Vault"))
        {
            FragmentCalfDumbbellVault dumbbellVault=new FragmentCalfDumbbellVault();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,dumbbellVault).commit();

        }
        else if(ant.getName().equals("One-Arm Push-Ups"))
        {
            FragmentCalfOneArmPushUps oneArmPushUps=new FragmentCalfOneArmPushUps();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,oneArmPushUps).commit();

        }
        else if(ant.getName().equals("Standing Dumbbell Calf Raise One Toe"))
        {
            FragmentCalfStandingDumbbellCalfRaiseOneToe standingDumbbellCalfRaiseOneToe=new FragmentCalfStandingDumbbellCalfRaiseOneToe();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,standingDumbbellCalfRaiseOneToe).commit();

        }
        else if(ant.getName().equals("Standing Dumbbell Calf Raise"))
        {
            FragmentCalfStandingDumbbellCalfRaise standingDumbbellCalfRaise=new FragmentCalfStandingDumbbellCalfRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,standingDumbbellCalfRaise).commit();

        }
        else if(ant.getName().equals("Cable Chest Compression"))
        {
            FragmentBicepsCableChestCompression cableChestCompression=new FragmentBicepsCableChestCompression();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,cableChestCompression).commit();
        }
        else if(ant.getName().equals("Cable Curl"))
        {
            FragmentBicepsCableCurl cableCurl=new FragmentBicepsCableCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,cableCurl).commit();

        }
        else if(ant.getName().equals("Concentration Curl"))
        {
            FragmentBicepsConcentrationCurl concentrationCurl=new FragmentBicepsConcentrationCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,concentrationCurl).commit();

        }
        else if(ant.getName().equals("Dumbbell Preacher Curl"))
        {
            FragmentBicepsDumbbellPreacherCurl dumbbellPreacherCurl=new FragmentBicepsDumbbellPreacherCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,dumbbellPreacherCurl).commit();

        }
        else if(ant.getName().equals("Hammer Curl"))
        {
            FragmentBicepsHammerCurl hammerCurl=new FragmentBicepsHammerCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,hammerCurl).commit();

        }
        else if(ant.getName().equals("Incline Reverse Dumbbell Press"))
        {
            FragmentBicepsInclineReverseDumbbellPress inclineReverseDumbbellPress=new FragmentBicepsInclineReverseDumbbellPress();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,inclineReverseDumbbellPress).commit();

        }
        else if(ant.getName().equals("Reverse Barbell Curl"))
        {
            FragmentBicepsReverseBarbellCurl reverseBarbellCurl=new FragmentBicepsReverseBarbellCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,reverseBarbellCurl).commit();

        }
        else if(ant.getName().equals("Scot Curl Z-Bar"))
        {
            FragmentBicepsScotCurlZBar scotCurlZBar=new FragmentBicepsScotCurlZBar();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,scotCurlZBar).commit();

        }
        else if(ant.getName().equals("Seated Dumbbell Curl"))
        {
            FragmentBicepsSeatedDumbbellCurl seatedDumbbellCurl=new FragmentBicepsSeatedDumbbellCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,seatedDumbbellCurl).commit();

        }
        else if(ant.getName().equals("Seated Hammer Curl"))
        {
            FragmentBicepsSeatedHammerCurl seatedHammerCurl=new FragmentBicepsSeatedHammerCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,seatedHammerCurl).commit();

        }
        else if(ant.getName().equals("Single Arm Cable Curl"))
        {
            FragmentBicepsSingleArmCableCurl singleArmCableCurl=new FragmentBicepsSingleArmCableCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,singleArmCableCurl).commit();

        }
        else if(ant.getName().equals("Bench Press"))
        {
            FragmentChestBenchPress benchPress=new FragmentChestBenchPress();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,benchPress).commit();

        }
        else if(ant.getName().equals("Cable Crossover"))
        {
            FragmentChestCableCrossover cableCrossover=new FragmentChestCableCrossover();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,cableCrossover).commit();

        }
        else if(ant.getName().equals("Decline Press"))
        {
            FragmentChestDeclinePress declinePress=new FragmentChestDeclinePress();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,declinePress).commit();

        }
        else if(ant.getName().equals("Dips"))
        {
            FragmentChestDips dips=new FragmentChestDips();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,dips).commit();

        }
        else if(ant.getName().equals("Dumbell Pullover"))
        {
            FragmentChestDumbellPullover dumbellPullover=new FragmentChestDumbellPullover();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,dumbellPullover).commit();

        }
        else if(ant.getName().equals("Incline Dumbell Fly"))
        {
            FragmentChestInclineDumbellFly chestInclineDumbellFly=new FragmentChestInclineDumbellFly();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,chestInclineDumbellFly).commit();

        }
        else if(ant.getName().equals("Inclined Push-ups"))
        {
            FragmentChestInclinedPushups chestInclinedPushups=new FragmentChestInclinedPushups();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,chestInclinedPushups).commit();

        }
        else if(ant.getName().equals("Modified Push-ups"))
        {
            FragmentChestModifiedPushups modifiedPushups=new FragmentChestModifiedPushups();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,modifiedPushups).commit();

        }
        else if(ant.getName().equals("Pec Deck Fly"))
        {
            FragmentChestPecDeckFly pecDeckFly=new FragmentChestPecDeckFly();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,pecDeckFly).commit();

        }else if(ant.getName().equals("Push-Up"))
        {
            FragmentChestPushUp pushUp=new FragmentChestPushUp();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,pushUp).commit();

        }else if(ant.getName().equals("Smith Machine-Bench Press"))
        {
            FragmentChestSmithMachineBenchPress smithMachineBenchPress=new FragmentChestSmithMachineBenchPress();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,smithMachineBenchPress).commit();

        }
        else if(ant.getName().equals("Flutter Kicks"))
        {
            FragmentSixpackFlutterKicks flutterKicks=new FragmentSixpackFlutterKicks();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,flutterKicks).commit();
        }
        else if(ant.getName().equals("Dumbell Lean Over"))
        {
            FragmentSixpackDumbellLeanOver leanOver=new FragmentSixpackDumbellLeanOver();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,leanOver).commit();

        }
        else if(ant.getName().equals("Fingertip Touch"))
        {
            FragmentSixpackFingertipTouch fingertipTouch=new FragmentSixpackFingertipTouch();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,fingertipTouch).commit();

        }
        else if(ant.getName().equals("Hanging Leg Raise"))
        {
            FragmentHangingLegRaise hangingLegRaise=new FragmentHangingLegRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,hangingLegRaise).commit();

        }
        else if(ant.getName().equals("Incline Crunch"))
        {
            FragmentInclineCrunch fragmentInclineCrunch=new FragmentInclineCrunch();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,fragmentInclineCrunch).commit();

        }
        else if(ant.getName().equals("Incline Leg Raise"))
        {
            FragmentSixpackInclineLegRaise sixpackInclineLegRaise=new FragmentSixpackInclineLegRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,sixpackInclineLegRaise).commit();

        }
        else if(ant.getName().equals("Crunch"))
        {
            FragmentSixpackCrunch crunch=new FragmentSixpackCrunch();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,crunch).commit();

        }
        else if(ant.getName().equals("Oblique Twists"))
        {
            FragmentSixpackObliqueTwists obliqueTwists=new FragmentSixpackObliqueTwists();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,obliqueTwists).commit();

        }
        else if(ant.getName().equals("Side Bridges"))
        {
            FragmentSideBridges sideBridges=new FragmentSideBridges();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,sideBridges).commit();

        }
        else if(ant.getName().equals("Leg Lowers"))
        {
            FragmentSixpackLegLowers legLowers=new FragmentSixpackLegLowers();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,legLowers).commit();

        }
        else if(ant.getName().equals("Arnold Press"))
        {
            FragmentShoulderArnoldPress arnoldPress=new FragmentShoulderArnoldPress();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,arnoldPress).commit();

        }
        else if(ant.getName().equals("Barbell Front Raise"))
        {
            FragmentShoulderBarbellFrontRaise barbellFrontRaise=new FragmentShoulderBarbellFrontRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,barbellFrontRaise).commit();

        }
        else if(ant.getName().equals("Barbell Shoulder Press"))
        {
            FragmentShoulderBarbellShoulderPress barbellShoulderPress=new FragmentShoulderBarbellShoulderPress();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,barbellShoulderPress).commit();

        }
        else if(ant.getName().equals("Behind The Neck Press"))
        {
            FragmentShoulderBehindTheNeckPress behindTheNeckPress=new FragmentShoulderBehindTheNeckPress();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,behindTheNeckPress).commit();

        }
        else if(ant.getName().equals("Bent Over Cable Lateral Raise"))
        {
            FragmentShoulderBentOverCableLateralRaise bentOverCableLateralRaise=new FragmentShoulderBentOverCableLateralRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,bentOverCableLateralRaise).commit();

        }
        else if(ant.getName().equals("Dumbbell Front Raise"))
        {
            FragmentShoulderDumbbellFrontRaise dumbbellFrontRaise=new FragmentShoulderDumbbellFrontRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,dumbbellFrontRaise).commit();

        }
        else if(ant.getName().equals("Dumbbell Shoulder Press"))
        {
            FragmentShoulderDumbbellShoulderPress dumbbellShoulderPress=new FragmentShoulderDumbbellShoulderPress();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,dumbbellShoulderPress).commit();

        }
        else if(ant.getName().equals("Lateral Raise"))
        {
            FragmentShoulderLateralRaise lateralRaise=new FragmentShoulderLateralRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,lateralRaise).commit();

        }
        else if(ant.getName().equals("One Arm Cable Lateral Raise"))
        {
            FragmentShoulderOneArmCableLateralRaise oneArmCableLateralRaise=new FragmentShoulderOneArmCableLateralRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,oneArmCableLateralRaise).commit();

        }else if(ant.getName().equals("Seated Lateral Raise"))
        {
            FragmentShoulderSeatedLateralRaise seatedLateralRaise=new FragmentShoulderSeatedLateralRaise();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,seatedLateralRaise).commit();

        }else if(ant.getName().equals("Upright Row"))
        {
            FragmentUprightRow uprightRow=new FragmentUprightRow();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,uprightRow).commit();

        }else if(ant.getName().equals("Weight Plate Front Raises"))
        {
            FragmentWeightPlateFrontRaises weightPlateFrontRaises=new FragmentWeightPlateFrontRaises();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,weightPlateFrontRaises).commit();
        }
        else if(ant.getName().equals("Barbell Wrist Curl"))
        {
            FragmentForearmBarbellWristCurl barbellWristCurl=new FragmentForearmBarbellWristCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,barbellWristCurl).commit();
        }
        else if(ant.getName().equals("Reverse Wrist Curl"))
        {
            FragmentForearmReverseWristCurl reverseWristCurl=new FragmentForearmReverseWristCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,reverseWristCurl).commit();
        }
        else if(ant.getName().equals("Seated Dumbell Wrist Curl"))
        {
            FragmentForearmSeatedDumbellWristCurl seatedDumbellWristCurl=new FragmentForearmSeatedDumbellWristCurl();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,seatedDumbellWristCurl).commit();
        }
        else if(ant.getName().equals("Wrist Rotation"))
        {
            FragmentForearmWristRotation wristRotation=new FragmentForearmWristRotation();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,wristRotation).commit();
        }
        else if(ant.getName().equals("Bench Dips"))
        {
            FragmentTricepsBenchDips benchdips=new FragmentTricepsBenchDips();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,benchdips).commit();
        }
        else if(ant.getName().equals("Close Grip Bench Press"))
        {
            FragmentTricepsCloseGripBenchPress closegripbenchpress=new FragmentTricepsCloseGripBenchPress();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,closegripbenchpress).commit();
        }
        else if(ant.getName().equals("Diamond Push Up"))
        {
            FragmentTricepsDiamondPushUp diamondpushup=new FragmentTricepsDiamondPushUp();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,diamondpushup).commit();
        }
        else if(ant.getName().equals("One Arm Lying Triceps Extension"))
        {
            FragmentTricepsOneArmLyingTricepsExtension onearmlying=new FragmentTricepsOneArmLyingTricepsExtension();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,onearmlying).commit();
        }
        else if(ant.getName().equals("One Arm Reverse Pushdown"))
        {
            FragmentTricepsOneArmReversePushdown onearmreverse=new FragmentTricepsOneArmReversePushdown();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,onearmreverse).commit();
        }
        else if(ant.getName().equals("Rope PushDown"))
        {
            FragmentTricepsRopePushDown ropepushdown=new FragmentTricepsRopePushDown();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,ropepushdown).commit();
        }
        else if(ant.getName().equals("Seated Triceps Press"))
        {
            FragmentTricepsSeatedTricepsPress seatedTricepsPress=new FragmentTricepsSeatedTricepsPress();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,seatedTricepsPress).commit();
        }
        else if(ant.getName().equals("Skull Crusher"))
        {
            FragmentTricepsSkullCrusher skullCrusher=new FragmentTricepsSkullCrusher();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,skullCrusher).commit();
        }
        else if(ant.getName().equals("Triceps Dumbbell Kickback"))
        {
            FragmentTricepsDumbbellKickback tricepsDumbbellKickback=new FragmentTricepsDumbbellKickback();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,tricepsDumbbellKickback).commit();
        }
        else if(ant.getName().equals("Triceps Pushdown"))
        {
            FragmentTricepsPushdown tricepsPushdown=new FragmentTricepsPushdown();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragmentler,tricepsPushdown).commit();
        }
    }
}