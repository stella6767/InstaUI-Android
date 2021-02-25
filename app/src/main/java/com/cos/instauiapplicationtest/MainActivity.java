package com.cos.instauiapplicationtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity2";

    private RecyclerView rvUserList1, rvUserList2;
    private UserAdapter userAdapter;
    private UserAdapter2 userAdapter2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<User> users = new ArrayList<>();
        for (int i=1; i<4; i++) {
            users.add(new User(i));
        }
        userAdapter = new UserAdapter(users);
        userAdapter2 = new UserAdapter2(users);

        LinearLayoutManager horizonalManager= new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        rvUserList1 = findViewById(R.id.rv_user_list1);
        rvUserList1.setLayoutManager(horizonalManager);
        rvUserList1.setAdapter(userAdapter);


        LinearLayoutManager manager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rvUserList2 = findViewById(R.id.rv_user_list2);
        rvUserList2.setLayoutManager(manager);
        rvUserList2.setAdapter(userAdapter2);




    }
}