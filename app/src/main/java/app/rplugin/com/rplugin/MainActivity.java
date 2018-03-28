package app.rplugin.com.rplugin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String test = "<span style=\"font-size: 18px; color: #ff0000;\">主标题大字</span><br><span style=\"font-size: 14px; color: #ffffff;\">副标题文字</span>";
    TextView testss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testss = findViewById(R.id.testss);
        testss.setText(Html.fromHtml(test));
    }
}
