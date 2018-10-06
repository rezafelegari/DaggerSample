package com.example.reza.daggersample.Module;

import com.example.reza.daggersample.Model.Child;
import com.example.reza.daggersample.Model.Parent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ParentModule {

    String child_name;
    int child_age;
    String parent_name;

    public ParentModule(String parent_name, String child_name, int child_age) {
        this.child_name = child_name;
        this.child_age = child_age;
        this.parent_name = parent_name;
    }

    @Provides
    @Singleton
    Parent provideParent() {
        return new Parent(parent_name,provideChild());
    }

    @Provides
    @Singleton
    Child provideChild() {
        return new Child(child_name,child_age);
    }


}
