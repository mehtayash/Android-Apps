package com.prototype.newshunt;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by ymehta on 10/05/15.
 */
public class CategoryActivity extends ActionBarActivity {

    GridView catGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categorylayout);


        Bundle bundleObject = getIntent().getExtras();

        // Get ArrayList Bundle
        ArrayList<Boolean> list = (ArrayList<Boolean>) bundleObject.getSerializable("key");
        catGrid = (GridView)findViewById(R.id.gridCategoriesFirst);
        final ArrayList<Item> gridArray = new ArrayList<Item>();
        ArrayList<Item> catArray = new ArrayList<Item>();
        CustomGridCategoryAdapter customGridAdapter;


        Bitmap art = BitmapFactory.decodeResource(this.getResources(), R.drawable.artnculture);
        Bitmap edu = BitmapFactory.decodeResource(this.getResources(), R.drawable.education_final);
        Bitmap ent = BitmapFactory.decodeResource(this.getResources(), R.drawable.entertainment);
        Bitmap fin = BitmapFactory.decodeResource(this.getResources(), R.drawable.finance_final);
        Bitmap food = BitmapFactory.decodeResource(this.getResources(), R.drawable.food4);
        Bitmap health = BitmapFactory.decodeResource(this.getResources(), R.drawable.health_final);
        Bitmap pol = BitmapFactory.decodeResource(this.getResources(), R.drawable.politics3);
        Bitmap shop = BitmapFactory.decodeResource(this.getResources(), R.drawable.shopping_final);
        Bitmap sport = BitmapFactory.decodeResource(this.getResources(), R.drawable.sports_final);
        Bitmap tech = BitmapFactory.decodeResource(this.getResources(), R.drawable.technology_final);
        Bitmap travel = BitmapFactory.decodeResource(this.getResources(), R.drawable.travel_final);
        Bitmap others = BitmapFactory.decodeResource(this.getResources(), R.drawable.others_final);

        gridArray.add(new Item(ent, "Entertainment"));
        gridArray.add(new Item(edu, "Education"));
        gridArray.add(new Item(art, "Art t & Culture"));
        gridArray.add(new Item(fin, "Finance"));
        gridArray.add(new Item(health, "Health"));
        gridArray.add(new Item(travel, "Travel"));
        gridArray.add(new Item(pol, "Politics"));
        gridArray.add(new Item(shop, "Shopping"));
        gridArray.add(new Item(sport, "Sports"));
        gridArray.add(new Item(tech, "Technology"));
        gridArray.add(new Item(others, "Others"));
        gridArray.add(new Item(food, "Food"));

        for(int i=0; i < 12; i++) {
            if (list.get(i)) {
                catArray.add(gridArray.get(i));
            }
        }

        customGridAdapter = new CustomGridCategoryAdapter(this, R.layout.grid_item_layout, catArray);
        catGrid.setAdapter(customGridAdapter);

        catGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Item item = (Item) parent.getItemAtPosition(position);
                String category=item.getTitle();
                Toast.makeText(getApplicationContext(),category.toString(),Toast.LENGTH_LONG).show();
            }
        });


    }
}
