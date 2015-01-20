package uno.anchor.blink;

import android.app.Application;

import com.parse.Parse;


/**
 * Created by ashleymartis on 15-01-19.
 */
public class BlinkApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
    // Enable Local Datastore.
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "qhTT5UnQdylMgZZ9x2Zv5KQnCi9EyYgzKJVLnNSC", "7jPCKeupsGfkTd0Y2xfuGbSpOxGD1keqlF2BqOTb");



    }
}
