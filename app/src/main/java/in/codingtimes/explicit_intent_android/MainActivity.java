package in.codingtimes.explicit_intent_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText uid,pwd;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        uid=findViewById(R.id.editTextTextEmailAddress);
        pwd=findViewById(R.id.editTextTextPassword);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if((uid.getText().toString()).equals("admin")&&(pwd.getText().toString()).equals("admin"))
                {
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    intent.putExtra("uid","admin");
                    startActivity(intent);
                    finish();
                    return;
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Wrong Credentials", Toast.LENGTH_SHORT).show();
                }
                if(count>2)
                    Toast.makeText(MainActivity.this, "Username is admin and Password is admin", Toast.LENGTH_LONG).show();
            }
        });
    }
}
