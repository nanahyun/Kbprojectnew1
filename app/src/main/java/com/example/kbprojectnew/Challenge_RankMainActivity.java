package com.example.kbprojectnew;



import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class Challenge_RankMainActivity extends AppCompatActivity {


    ArrayList<RankItem> rankItems;
    private ImageButton friendrank;
    private ImageButton mainpage;
    private TextView challenge_name;
    private TextView magnitude;


    private ImageButton btn_friendrank_rank;

    public ImageButton getBtn_friendrank_rank() {
        return btn_friendrank_rank;
    }

    public void setBtn_friendrank_rank(ImageButton btn_friendrank_rank) {
        this.btn_friendrank_rank = btn_friendrank_rank; }

    private TextView friend;
    private TextView num;


    private ArrayList<Challenge_RankMainActivity> arrayList;
    private Challenge_RankAdaptor challenge_rankAdaptor;
    private RecyclerView recyclerView;
    private LinearLayoutManager LinearLayoutManager;

    public Challenge_RankMainActivity(TextView magnitude, ImageButton btn_friendrank_rank, TextView friend, TextView num) {
        this.magnitude = magnitude;
        this.btn_friendrank_rank = btn_friendrank_rank;
        this.friend = friend;
        this.num = num;
    }

    public TextView getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(TextView magnitude) {
        this.magnitude = magnitude;
    }

    public TextView getFriend() {
        return friend;
    }

    public void setFriend(TextView friend) {
        this.friend = friend;
    }

    public TextView getNum() {
        return num;
    }

    public void setNum(TextView num) {
        this.num = num;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challengerankmain);



        rankItems=new ArrayList<>();
        recyclerView = (RecyclerView)findViewById(R.id.recycler_challenge_rank);
        LinearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(LinearLayoutManager);


        arrayList = new ArrayList<>();

        challenge_rankAdaptor = new Challenge_RankAdaptor(arrayList);
        recyclerView.setAdapter(challenge_rankAdaptor);




//        //Intent intent=getIntent();
//        //String friend=intent.getStringExtra("Challenge_Name");

        challenge_name=(TextView)findViewById(R.id.challenge_name);
        friendrank=(ImageButton)findViewById(R.id.btn_friendrank_rank);
        mainpage=(ImageButton)findViewById(R.id.btn_mainpage_rank);
        ImageButton starpage=(ImageButton)findViewById(R.id.btn_starpage_rank);

//        challenge_name.setText(Challenge_Name);



        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler_challenge_rank);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));

        //?????????????????? ??????
        friendrank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //?????????????????? ??????
        mainpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent Intent = new Intent(Challenge_RankMainActivity.this, ChallengeMainActivity.class);
                //Toast.makeText(Challenge_RankMainActivity.this, "????????? ???????????? ??????", Toast.LENGTH_SHORT).show();
                //startActivity(Intent);
            }
        });
        //star???????????? ??????
        starpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }


    private void createData() {

        RankItem a = new RankItem("?????????", "0/10");
        RankItem b = new RankItem("?????????", "0/10");
        RankItem c = new RankItem("?????????", "0/10");
        RankItem d = new RankItem("??????", "0/10");
        RankItem e = new RankItem("???", "0/10");
        RankItem f = new RankItem("?????????", "0/10");
        RankItem g = new RankItem("??????", "0/10");
        rankItems.add(a);
        rankItems.add(b);
        rankItems.add(c);
        rankItems.add(d);
        rankItems.add(e);
        rankItems.add(f);
        rankItems.add(g);
    }

    public class RankViewHoler {
    }
}