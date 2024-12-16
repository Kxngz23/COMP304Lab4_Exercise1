package com.giovanni.giovannikirlew_comp304lab4_ex1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.giovanni.giovannikirlew_comp304lab4_ex1.ui.theme.Giovannikirlew_COMP304Lab4_Ex1Theme
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Giovannikirlew_COMP304Lab4_Ex1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MapScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MapScreen(modifier: Modifier = Modifier) {
    LocalContext.current

    // Initial map position (San Francisco as an example)
    val sanFrancisco = LatLng(37.7749, -122.4194)
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(sanFrancisco, 12f)
    }

    GoogleMap(
        modifier = modifier.fillMaxSize(),
        cameraPositionState = cameraPositionState
    ) {
        // Adding a marker on the map
        Marker(
            state = MarkerState(position = sanFrancisco),
            title = "San Francisco",
            snippet = "Marker in San Francisco"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MapScreenPreview() {
    Giovannikirlew_COMP304Lab4_Ex1Theme {
        MapScreen()
    }
}
