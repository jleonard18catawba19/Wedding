package net.androidbootcamp.wedding;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] planner = {"Check List", "Guest List", "Vendors", "Budget"};

        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.wedding, planner));


    }

    // click event for listview control called planner
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(MainActivity.this, checkList.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this,guestList.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, VendorsList.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, Budget.class));
                break;

        }
    }
}