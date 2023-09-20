package com.example.idea_generator;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import androidx.appcompat.app.AppCompatActivity;

        import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // Arrays containing possible themes and mediums
    private final String[] themes = {"witchcraft", "halloween", "christmas", "epic",
            "nature", "flowers", "miniature", "painting within painting", "game", "festival", "market"};

    private final String[] mediums = {"watercolor", "pencils", "charcoal", "graphite", "acrylic",
            "crayons", "markers", "highlighters", "poster colors", "pastels"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI elements
        Button generateIdeaButton = findViewById(R.id.generateIdeaButton);
        final TextView themeTextView = findViewById(R.id.themeTextView);
        final TextView mediumTextView = findViewById(R.id.mediumTextView);

        // Add click listener to the button
        generateIdeaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();

                // Generate random theme and medium
                String randomTheme = themes[random.nextInt(themes.length)];
                String randomMedium = mediums[random.nextInt(mediums.length)];

                // Update TextViews with generated theme and medium
                themeTextView.setText("Theme: " + randomTheme);
                mediumTextView.setText("Medium: " + randomMedium);
            }
        });
    }
}
