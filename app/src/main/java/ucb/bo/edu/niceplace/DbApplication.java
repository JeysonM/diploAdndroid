package ucb.bo.edu.niceplace;

/**
 * Created by jeysonmirabal on 14/11/17.
 */
import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class DbApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);

        RealmConfiguration configuration = new RealmConfiguration.Builder()
                .name("MyDatabase.realm")
                .build();

        Realm.setDefaultConfiguration(configuration);
    }

}
