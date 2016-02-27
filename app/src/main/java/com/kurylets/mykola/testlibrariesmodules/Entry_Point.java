package com.kurylets.mykola.testlibrariesmodules;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import com.kurylets.mykola.holder.Holder;
import com.kurylets.mykola.logic.Logic;

public class Entry_Point extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry__point);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        m_Hold = new Holder();
        m_Hold.Load();

        m_Log = new Logic(m_Hold.GetVal());

        m_Text = (EditText)findViewById(R.id.edit_text);
        m_Btn = (Button)findViewById(R.id.button);

        m_Btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Double val = Double.parseDouble(m_Text.getText().toString());
                double newVal = m_Log.Calc(val);
                m_Hold.SetVal(newVal);
                val = m_Hold.GetVal();
                m_Text.setText(val.toString());
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_entry__point, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private Logic m_Log;
    private Holder m_Hold;

    private Button m_Btn;
    private EditText m_Text;
}
