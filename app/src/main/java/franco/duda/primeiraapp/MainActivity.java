package franco.duda.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//a classe main Activity eh a principal do app
public class MainActivity extends AppCompatActivity {  // Declaração da classe MainActivity que estende AppCompatActivity

    @Override // no metodo oncreate() eh chamado quando a atividade eh criada
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //constroe os elemento de interface definidos o arquivo xml
        Button btnEnviar= findViewById(R.id.btnEnviar); //obtem o botao atraves do id do botao enviar, referencia o botao
        btnEnviar.setOnClickListener(new View.OnClickListener() { //defini o que vai acontecer quando o botao for clicado // Configura um listener de clique para o botão
            @Override
            public void onClick(View v) { //eh executado quando o batao eh clicado
                EditText etDigiteAqui =   findViewById(R.id.etDigiteAqui); //Referencia o campo de texto pelo ID etDigiteAqui
                String textoDigitado = etDigiteAqui.getText().toString();   // Obtém o texto digitado no campo de texto
                Intent i = new Intent(MainActivity.this,NextActivity.class);  // Cria um novo objeto Intent para iniciar NextActivity
                i.putExtra("texto",textoDigitado);// Adiciona o texto digitado como dado extra no Intent
                startActivity(i); // Inicia NextActivity com o Intent configurado
            }

        });
    }
}