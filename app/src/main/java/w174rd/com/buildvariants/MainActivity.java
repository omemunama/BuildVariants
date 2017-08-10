package w174rd.com.buildvariants;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView apiUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiUrl = (TextView) findViewById(R.id.url_api);

        apiUrl.setText(BuildConfig.M_API_URL);
    }
}
