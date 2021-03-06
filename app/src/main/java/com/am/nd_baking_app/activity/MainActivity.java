package com.am.nd_baking_app.activity;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.am.nd_baking_app.R;
import com.am.nd_baking_app.fragment.RecipesFragment;
import com.am.nd_baking_app.model.Recipe;

public class MainActivity extends AppCompatActivity implements RecipesFragment.OnRecipeClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onRecipeSelected(Recipe recipe) {
        Intent intent = new Intent(MainActivity.this, RecipeActivity.class);
        intent.putExtra(RecipeActivity.RECIPE_KEY, recipe);
        startActivity(intent);
    }
}
