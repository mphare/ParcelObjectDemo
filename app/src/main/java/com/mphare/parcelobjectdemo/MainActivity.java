package com.mphare.parcelobjectdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity
{

  EditText mEtName;
  EditText mEtAge;
  EditText mEtAddress;
  EditText mEtCourse;
  Button   mBtnOK;

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mEtName = (EditText) findViewById(R.id.et_sname);
    mEtAge = (EditText) findViewById(R.id.et_sage);
    mEtAddress = (EditText) findViewById(R.id.et_saddress);
    mEtCourse = (EditText) findViewById(R.id.et_scourse);
    mBtnOK = (Button) findViewById(R.id.btn_ok);

    mBtnOK.setOnClickListener(new View.OnClickListener()
    {
      @Override public void onClick(View v)
      {
        Student student = new Student(mEtName.getText().toString(), Integer.parseInt(mEtAge.getText().toString()),
                                      mEtAddress.getText().toString(), mEtCourse.getText().toString());

        Intent intent = new Intent(getBaseContext(), StudentViewActivity.class);
        intent.putExtra("student", student);
        startActivity(intent);
      }
    });

  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }
}
