package cn.studyou.myviewdeep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.studyou.myviewdeep.view.WBottomTitleView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.wCircleView)
    WBottomTitleView wCircleView;

    private final String tag = "WMainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        wCircleView.setTextString("  今天天气不错，感觉挺好的。 ");
        Glide.with(this).load("http://img06.tooopen.com/images/20170214/tooopen_sy_198645593736.jpg").into(wCircleView);
    }
}
