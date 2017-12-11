package totem_soft.scrollflags;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * @author Antonina
 */
public class EnterAlwaysActivity extends MainActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flag_enter_always);

        setToolbar("EnterAlways");
    }
}