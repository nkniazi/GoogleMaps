package pk.edu.iba.maps;




import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;

import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;


public class MapActivity extends FragmentActivity {

	private static final LatLng IBA_MAIN = new LatLng(24.9413316,67.113855);
	private static final LatLng IBA_CITY = new LatLng(24.8667021, 67.0253697);
	//private static final LatLng IBA = new LatLng(40.7057, -73.9964);
	private SupportMapFragment mapFragment;
	private GoogleMap map;
	private Button btnLocation;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);  
        mapFragment = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map));
        map = mapFragment.getMap();
        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        
        map.addMarker(new MarkerOptions().position(new LatLng(24.9413316, 67.113855)).title("Iba main campus karachi"));
        
        map.addPolyline((new PolylineOptions()).add(IBA_MAIN, IBA_CITY).width(5).color(Color.BLUE)
				.geodesic(true));
// move camera to zoom on map
map.moveCamera(CameraUpdateFactory.newLatLngZoom(IBA_MAIN,15));
// map.moveCamera(CameraUpdateFactory.zoomTo(15));
      
    }

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
	}
	
	
}
