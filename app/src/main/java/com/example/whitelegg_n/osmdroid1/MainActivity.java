package com.example.whitelegg_n.osmdroid1;

import android.app.Activity;
import android.os.Bundle;
import android.preference.PreferenceManager;

import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //important! set your user agent to prevent getting banned from the osm servers
        Configuration.getInstance().load(this, PreferenceManager.getDefaultSharedPreferences(this));

        setContentView(R.layout.activity_main);
        MapView mv = (MapView)findViewById(R.id.map1);
        mv.setTileSource(TileSourceFactory.CYCLEMAP);
        mv.getController().setZoom(14);
        mv.getController().setCenter(new GeoPoint(40.1, 22.5));
    }
}
