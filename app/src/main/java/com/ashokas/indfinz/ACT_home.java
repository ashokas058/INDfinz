package com.ashokas.indfinz;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import static com.ashokas.indfinz.INDUtility.CLS_utils.strSymbolRs;

public class ACT_home extends AppCompatActivity implements View.OnClickListener {
    TextView txtViewActBarMember,txtViewNetworthAmnt;
    ImageView imgViewActBarSearch;
    View viewactionBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lyt_home_main);
        viewactionBar=initCustomActionBar();
        initViewActionBarComponents(viewactionBar);
        setViewClickListeners();
        initViewComponents();
        loadSampleDataToViews();



    }
    private View initCustomActionBar(){
        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.lyt_home_appbar);
        getSupportActionBar().setElevation(0);
        return getSupportActionBar().getCustomView();
    }
    private void initViewActionBarComponents(View view){
        txtViewActBarMember=view.findViewById(R.id.tag_home_actbar_member_expand);
        imgViewActBarSearch=view.findViewById(R.id.tag_home_actbar_srch);
    }
    private void setViewClickListeners(){
        imgViewActBarSearch.setOnClickListener(this);
        txtViewActBarMember.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "working", Toast.LENGTH_SHORT).show();
    }
    private void initViewComponents(){
        txtViewNetworthAmnt=findViewById(R.id.tag_home_networth_amnt);
    }
    private void loadSampleDataToViews(){
        txtViewNetworthAmnt.setText(strSymbolRs+"0");
    }
}
