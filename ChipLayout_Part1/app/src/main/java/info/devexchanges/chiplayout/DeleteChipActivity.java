package info.devexchanges.chiplayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DeleteChipActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cross_chip);

        View deleteIcon = findViewById(R.id.delete);
        final View chipLayout = findViewById(R.id.chip_layout);
        deleteIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //gone chip layout
                //if it a list or an adapter, please remove it!
                chipLayout.setVisibility(View.GONE);
            }
        });
    }
}
