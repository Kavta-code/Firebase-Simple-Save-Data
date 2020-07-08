package com.example.simplefirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase mDatabase;
    private DatabaseReference mDatabaseReference;
    public EditText name, age;
    public Button insert;
    User user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText)findViewById(R.id.editTextName);
        age = (EditText)findViewById(R.id.editTextAge);
        insert = (Button)findViewById(R.id.buttonInsert);
      // FirebaseDatabase mDatabase = FirebaseDatabase.getInstance();
      // DatabaseReference  mDatabaseReference = mDatabase.getReference();
      // mDatabaseReference = mDatabase.getReference().child("name");
       // mDatabaseReference.setValue("Donald Duck");
       // user = new User("mock donald",25);
      /*  user = new User(name.getText().toString(),age.getText().toString());
        mDatabaseReference = mDatabase.getReference().child("user");
        mDatabaseReference.setValue(user);*/

       /* FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World!");*/
        mDatabase = FirebaseDatabase.getInstance();

        mDatabaseReference = mDatabase.getReference("Users");

       insert.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
              /* FirebaseDatabase mDatabase = FirebaseDatabase.getInstance();
               user = new User(name.getText().toString(),age.getText().toString());
               mDatabaseReference = mDatabase.getReference("Users");*/
               user = new User(name.getText().toString(),age.getText().toString());
               mDatabaseReference.child("Users 01").setValue(user);
               //mDatabaseReference.setValue(user);
               Toast.makeText(MainActivity.this,"Data Inserted",Toast.LENGTH_SHORT).show();
           }
       });

    }


}