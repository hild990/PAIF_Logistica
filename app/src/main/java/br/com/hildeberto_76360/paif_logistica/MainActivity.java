package br.com.hildeberto_76360.paif_logistica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private EditText etCep;
    private TextView tvCep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etCep = (EditText) findViewById(R.id.etCep);
        tvCep = (TextView) findViewById(R.id.tvCep);
    }

    public void pesquisarCEP(View v){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://correiosapi.apphb.com/cep/76873274")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PAIF_Service service = retrofit.create(PAIF_Service.class);

        service.pesquisarCEP(etCep.getText().toString())
                .enqueue(new Callback<Logradouro>() {
                    @Override
                    public void onResponse(Call<Logradouro> call, Response<Logradouro> response) {
                        tvCep.setText(response.body().getBairro());

                    }

                    @Override
                    public void onFailure(Call<Logradouro> call, Throwable t) {
                        Toast.makeText(MainActivity.this,
                                "Ocorreu um erro na requisição", Toast.LENGTH_SHORT).show();
                    }


                });

    }
}
