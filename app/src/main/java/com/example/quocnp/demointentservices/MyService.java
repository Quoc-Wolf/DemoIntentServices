package com.example.quocnp.demointentservices;

import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

public class MyService extends IntentService {

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     */
    public MyService() {
        super("Intent Services");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Toast.makeText(MyService.this, "intent services ", Toast.LENGTH_SHORT).show();
    }
}
