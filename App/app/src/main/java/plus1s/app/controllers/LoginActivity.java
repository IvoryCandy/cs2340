package plus1s.app.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import plus1s.app.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText login_username = (EditText) findViewById(R.id.login_user);
        final EditText login_password = (EditText) findViewById(R.id.login_password);
        final Button login_login = (Button) findViewById(R.id.login_login);
        final TextView login_reg = (TextView) findViewById(R.id.login_register);

        login_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToRegster();
            }
        });

        login_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                goToMain();
            }
        });

    }

    private void goToMain() {
        Intent toMainIntent = new Intent(LoginActivity.this, MainActivity.class);
        LoginActivity.this.startActivity(toMainIntent);
    }

    private void goToRegster() {
        Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
        LoginActivity.this.startActivity(registerIntent);
    }
}