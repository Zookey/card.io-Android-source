package io.card.payment;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.card.payment.ui.ActivityHelper;

public class EntryDataActivity extends Activity {

    private boolean useApplicationTheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        useApplicationTheme = getIntent().getBooleanExtra(CardIOActivity.EXTRA_KEEP_APPLICATION_THEME, false);
        ActivityHelper.setActivityTheme(this, useApplicationTheme);
        setContentView(R.layout.cio_add_manual_card);
    }
}
