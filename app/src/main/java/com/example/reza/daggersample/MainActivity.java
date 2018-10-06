package com.example.reza.daggersample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.reza.daggersample.Model.Parent;
import com.example.reza.daggersample.Module.ParentModule;

public class MainActivity extends AppCompatActivity {

    Parent parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ParentComponent component = DaggerParentComponent.builder().parentModule(new ParentModule("Dad", "Reza", 24)).build();
        parent = component.provideParent();
        if (parent != null)
            Toast.makeText(this, parent.getChildname() + "->" + parent.getChildAge(), Toast.LENGTH_SHORT).show();

    }
}
