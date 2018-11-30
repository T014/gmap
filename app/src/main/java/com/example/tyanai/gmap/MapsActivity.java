package com.example.tyanai.gmap;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    public ArrayList<CouponData> couponDataArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        couponDataArrayList = new ArrayList<CouponData>();

        CouponData a1 = new CouponData("35.69","139.77","a1");
        couponDataArrayList.add(a1);
        CouponData a2 = new CouponData("35.70","139.78","a2");
        couponDataArrayList.add(a2);
        CouponData a3 = new CouponData("35.71","139.79","a3");
        couponDataArrayList.add(a3);
        CouponData a4 = new CouponData("35.72","139.80","a4");
        couponDataArrayList.add(a4);
        CouponData a5 = new CouponData("35.73","139.81","a5");
        couponDataArrayList.add(a5);

        for (int i =0;i<couponDataArrayList.size();i++){
            double x =Double.parseDouble(couponDataArrayList.get(i).getAddressX());
            double y =Double.parseDouble(couponDataArrayList.get(i).getAddressY());
            LatLng n = new LatLng(x,y);
            mMap.addMarker(new MarkerOptions().position(n).title(couponDataArrayList.get(i).getStoreName()));
            //mMap.moveCamera(CameraUpdateFactory.newLatLng(n));
        }






        CameraUpdate cUpdate = CameraUpdateFactory.newLatLngZoom(
                new LatLng(35.68, 139.76), 12);
        mMap.moveCamera(cUpdate);
    }
}
