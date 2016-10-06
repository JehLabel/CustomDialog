package android.ritual.customdialog;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by androidritual.com on 06/10/2016.
 */
public class DialogClass {
    Context c;
    View dialoglayout;

    public DialogClass(Context c){
        this.c = c;
        ShowDialog();
    }

    private void ShowDialog(){
        LayoutInflater inflater = LayoutInflater.from(c);
        dialoglayout = inflater.inflate(R.layout.dialog_layout, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(c);
        /*
        builder.setTitle("Custom Dialog");
        builder.setMessage("This Your Message");
        builder.setPositiveButton("Send", new DialogInterface.OnClickListener() {
            public void onClick(final DialogInterface dialog, int id) {
            }
        });
        */
        builder.setNegativeButton("Close", null);
        builder.setView(dialoglayout);
        builder.show();
    }

}
