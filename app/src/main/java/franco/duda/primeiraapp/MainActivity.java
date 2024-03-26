package franco.duda.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//a classe main Activity eh a principal do app
public class MainActivity extends AppCompatActivity {

    @Override // no metodo oncreate() eh chamado quando a atividade eh criada
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //constroe os elemento de interface
        Button btnEnviar= findViewById(R.id.btnEnviar); //obtem o botao atraves do id do botao enviar
        btnEnviar.setOnClickListener(new View.OnClickListener() { //defini o que vai acontecer quando o botao for clicado
            @Override
            public void onClick(View v) { //eh executado quando o batao eh clicado
                EditText etDigiteAqui =   findViewById(R.id.etDigiteAqui);
                String textoDigitado = etDigiteAqui.getText().toString();
                Intent i = new Intent(MainActivity.this,NextActivity.class);
                i.putExtra("texto",textoDigitado);
                startActivity(i);
            }

        });
    }
}