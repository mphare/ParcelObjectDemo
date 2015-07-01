package com.mphare.parcelobjectdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class StudentViewActivity extends Activity
{

  TextView mTvName;
  TextView mTvAge;
  TextView mTvAddress;
  TextView mTvCourse;

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_student);

    Student student = getIntent().getParcelableExtra("student");
    mTvName = (TextView) findViewById(R.id.tv_sname);
    mTvAge = (TextView) findViewById(R.id.tv_sage);
    mTvAddress = (TextView) findViewById(R.id.tv_saddress);
    mTvCourse = (TextView) findViewById(R.id.tv_scourse);

    if (student != null)
    {
      mTvName.setText("Name: " + student.mSName);
      mTvAge.setText("Name: " + student.mSAge);
      mTvAddress.setText("Name: " + student.mSAddress);
      mTvCourse.setText("Name: " + student.mSCourse);

    }
  }

}
