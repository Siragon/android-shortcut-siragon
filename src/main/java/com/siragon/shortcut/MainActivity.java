package com.siragon.shortcut;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.siragon.com.ve"));
        startActivity(browserIntent);
        finish();
        System.exit(0);
    }
    private static final String BASE64_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAnLrNL86jqKuGncwX1WVC+0AnmlPVN9g5m2XRb9PgGICeziS2+X8bafZ98kCPRkpCQGONrWpZlWNd6T7osU+ee+eJ1CVN8lv1WdGjDYhZh1fgWaPE7d7EA745oqNRokVxpEPTwiOtZ+xb//8bw22WuhVbEjSU01mEunc1WniKYRA/ysU+QNT3LScdU7us0d8FeZnGKD7TP18Ca7lobZfl1HPz4LOblRVoKAykjWH6Euud2p056btdWEul9EO1Sq5WIE94kOdIRlm8KsmiIQvmGJ7K1co6NRmZHht4rYkDKDWFsyqbo+wRXLkV690cYjdfvfnfr3hYjf1PtKKfluFYaQIDAQAB";
}

