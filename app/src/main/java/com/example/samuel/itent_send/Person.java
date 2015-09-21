package com.example.samuel.itent_send;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by user05 on 2015/9/21.
 */
public class Person implements Parcelable{
    private int age;
    private String name;
    private Person(Parcel parcel){
        age = parcel.readInt();
        name = parcel.readString();
    }
    public Person(){

    }
    public static final  Parcelable.Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel source) {
            return new Person(source);
        }

        @Override
        public Person[] newArray(int i) {
            return new Person[i];
        }
    };
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel desc, int i) {
        desc.writeInt(age);
        desc.writeString(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
