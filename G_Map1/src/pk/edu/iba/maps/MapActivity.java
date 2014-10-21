package pk.edu.iba.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MapActivity extends Activity {
    private GoogleMap mMap;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);
     //   mMap=((SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
    }
}
