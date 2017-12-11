package totem_soft.scrollflags;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setToolbar(@NonNull String title) {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(title);
        setSupportActionBar(toolbar);
    }

    public void showFlagEnterAlwaysBehavior(View view) {
        startScrollActivity(EnterAlwaysActivity.class);
    }

    public void showFlagEnterAlwaysCollapsedBehavior(View view) {
        startScrollActivity(EnterAlwaysCollapsedActivity.class);
    }

    public void showFlagExitUntilCollapsedBehavior(View view) {
        startScrollActivity(ExitUntilCollapsedActivity.class);
    }

    public void showFlagScrollBehavior(View view) {
        startScrollActivity(ScrollActivity.class);
    }

    public void showFlagSnapBehavior(View view) {
        startScrollActivity(SnapActivity.class);
    }

    private void startScrollActivity(Class<?> activity) {
        startActivity(new Intent(this, activity));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
