package com.example.reza.daggersample;

import com.example.reza.daggersample.Model.Parent;
import com.example.reza.daggersample.Module.ParentModule;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {ParentModule.class})
public interface ParentComponent {
    Parent provideParent();
}

