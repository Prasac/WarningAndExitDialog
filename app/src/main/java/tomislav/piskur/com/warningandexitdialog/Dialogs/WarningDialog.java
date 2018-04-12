package tomislav.piskur.com.warningandexitdialog.Dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

/**
 * Created by srs on 20.09.2017.
 */

public class WarningDialog extends DialogFragment{

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder= new AlertDialog.Builder(getActivity());
        builder.setTitle("Warning");
        builder.setMessage("Something went wrong!");
        builder.setIconAttribute(android.R.attr.alertDialogIcon);
        builder.setNeutralButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
              //  dismiss();
            }
        });
        AlertDialog dialog = builder.create();
        //return builder.create();
        return dialog;

    }
}
