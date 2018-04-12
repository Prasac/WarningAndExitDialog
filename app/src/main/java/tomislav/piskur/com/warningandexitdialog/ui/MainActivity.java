package tomislav.piskur.com.warningandexitdialog.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import tomislav.piskur.com.warningandexitdialog.Dialogs.ExitDialog;
import tomislav.piskur.com.warningandexitdialog.R;
import tomislav.piskur.com.warningandexitdialog.Dialogs.WarningDialog;

public class MainActivity extends AppCompatActivity {

    private static final String WARNING_DIALOG_TAG = "warning.tag";
    private Button btnExit, btnWarning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitWidgets();

        setUpListeners();
    }

    private void setUpListeners() {
        btnWarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WarningDialog warningDialog = new WarningDialog();
                warningDialog.show(getSupportFragmentManager(), WARNING_DIALOG_TAG);
                // ođe moramo izabrati getSupportFragmentManager jerbo smo uzimali iz support librarya v4 ili v7
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExitDialog exitDialog = new ExitDialog();
                exitDialog.show(getSupportFragmentManager(), "exd");
            }
        });
    }

    private void InitWidgets() {
        btnExit = (Button) findViewById(R.id.btnExit);
        btnWarning = (Button) findViewById(R.id.btnWarning);
    }
}
