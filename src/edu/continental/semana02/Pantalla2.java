package edu.continental.semana02;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Pantalla2 extends Activity implements android.view.View.OnClickListener{
	
	EditText txttallaP;
	EditText txtpeso;
	Button btnprocesar;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pantalla2);
		
		txttallaP = (EditText) findViewById(R.id.inputtalla);
		txtpeso = (EditText) findViewById(R.id.inputpeso);
		btnprocesar = (Button) findViewById(R.id.btnProcesar);
		
		btnprocesar.setOnClickListener(this);
		}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pantalla2, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (v == btnprocesar)
		{
			Double talla =Double.parseDouble(txttallaP.getText().toString());
			Double peso =Double.parseDouble(txtpeso.getText().toString());
			
			Double imc =peso / (talla*talla);
			
			Toast.makeText(this, "El resultado es: " +imc , Toast.LENGTH_SHORT).show();
		}
	}
	
	
}
