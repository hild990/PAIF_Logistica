package br.com.hildeberto_76360.paif_logistica;

import android.widget.Button;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by logonrm on 15/09/2017.
 */

public interface PAIF_Service {

    @GET("/cep/{cep}")
    Call<Logradouro> pesquisarCEP(
            @Path(value = "cep") String cep);

}
