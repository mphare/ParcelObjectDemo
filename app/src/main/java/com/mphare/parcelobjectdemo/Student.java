package com.mphare.parcelobjectdemo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by mphare on 6/30/2015.
 */
public class Student implements Parcelable
{
  String mSName;
  String mSAddress;
  int    mSAge;
  String mSCourse;

  @Override
  public int describeContents()
  {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags)
  {
    dest.writeString(mSName);
    dest.writeInt(mSAge);
    dest.writeString(mSAddress);
    dest.writeString(mSCourse);
  }

  public Student(String sName, int sAge, String sAddress, String sCourse)
  {
    this.mSName = sName;
    this.mSAddress = sAddress;
    this.mSAge = sAge;
    this.mSCourse = sCourse;
  }

  private Student(Parcel in)
  {
    this.mSName = in.readString();
    this.mSAge = in.readInt();
    this.mSAddress = in.readString();
    this.mSCourse = in.readString();
  }

  public static final Parcelable.Creator<Student> CREATOR = new Parcelable.Creator<Student>()
  {
    @Override
    public Student createFromParcel(Parcel source)
    {
      return new Student(source);
    }

    @Override
    public Student[] newArray(int size)
    {
      return new Student[size];
    }
  };
}
