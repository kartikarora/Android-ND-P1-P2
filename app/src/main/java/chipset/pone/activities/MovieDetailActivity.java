package chipset.pone.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import chipset.pone.R;
import chipset.pone.fragments.MovieDetailFragment;
import chipset.pone.resources.Constants;

public class MovieDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        String id = String.valueOf(getIntent().getLongExtra(Constants.EXTRA_MOVIE_ID, 550));
        boolean local = getIntent().getBooleanExtra(Constants.EXTRA_LOCAL, false);

        getSupportFragmentManager().beginTransaction().replace(R.id.movie_detail_frame, MovieDetailFragment.newInstance(id, local)).commit();
    }
}
