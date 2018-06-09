package e.alfaleh.k.fahad.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button validateButton = findViewById(R.id.button2);
        validateButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText pass = findViewById(R.id.editText7);
                String validateMessage;
                TextView validate = findViewById(R.id.textView);
                if (Validator.valid(pass.getText().toString()) == 5) {
                    validateMessage = "Strong";
                } else {
                    validateMessage = "Weak";
                }

                validate.setText(validateMessage);
            }

        });
    }
}
