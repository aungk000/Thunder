package me.aungkooo.networkservice;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import me.aungkooo.thunder.NetworkListener;
import me.aungkooo.thunder.Thunder;

public class MainActivity extends AppCompatActivity implements NetworkListener
{
    @BindView(R.id.layout_activity_main)
    LinearLayout layoutActivityMain;

    private Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        snackbar = Snackbar.make(layoutActivityMain, "No network available", Snackbar.LENGTH_INDEFINITE);
        snackbar.getView().setBackgroundColor(getColor(R.color.colorPrimary));

        Thunder.with(this).listen(this);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Thunder.with(this).start();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Thunder.with(this).stop();
    }

    @Override
    public void onNetworkAvailable() {
        snackbar.dismiss();
    }

    @Override
    public void onNetworkUnavailable() {
        if(!snackbar.isShown())
        {
            snackbar.show();
        }
    }
}
