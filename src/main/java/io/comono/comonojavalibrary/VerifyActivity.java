package io.comono.comonojavalibrary;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class VerifyActivity extends AppCompatActivity {

    String hosturl = "https://ecocomonoreact.azurewebsites.net/customer-details?";

    Bundle extras = getIntent().getExtras();
    String param1 = extras.getString("workitemId");
    String param2 = extras.getString("customerName");
    String param3 = extras.getString("customerEmail");
    String param4 = extras.getString("branchCode");
    String param5 = extras.getString("segmentId");
    String param6 = extras.getString("address");
    String param7 = extras.getString("landmark");
    String param8 = extras.getString("state");
    String param9 = extras.getString("lga");
    String param10 = extras.getString("createdBy");
    String param11 = extras.getString("customerImage");
    String param12 = extras.getString("Latitude");
    String param13 = extras.getString("Longitude");

    String postparam =
            hosturl + "workitemId=" + param1 + "&customerName=" + param2 + "&customerEmail=" + param3 + "&branchCode=" + param4 + "&segmentId=" + param5 + "&address=" + param6 + "&landmark=" + param7 + "&state=" + param8 + "&lga=" + param9 + "&createdBy=" + param10 + "&customerImage=" + param11 + "&Latitude=" + param12 + "&Longitude=" + param13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_verify);

        WebView w = findViewById(R.id.web_view);

        w.loadUrl(postparam);

        w.getSettings().setJavaScriptEnabled(true);

        w.setWebViewClient(new WebViewClient());

    }
}