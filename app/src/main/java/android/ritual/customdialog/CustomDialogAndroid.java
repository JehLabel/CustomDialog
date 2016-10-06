package android.ritual.customdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CustomDialogAndroid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog_android);
        new DialogClass(CustomDialogAndroid.this);
    }
}
