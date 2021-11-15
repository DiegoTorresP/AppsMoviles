package mx.edu.utng.cardviewgds0343;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //Declarar un Recycler y un Adaptador
    RecyclerView recyclerUsuarios;
    UsuarioAdaptador usuarioAdaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarElementos();

    }

    private void inicializarElementos() {
        recyclerUsuarios = findViewById(R.id.recycler_view);
        recyclerUsuarios.setLayoutManager(new LinearLayoutManager(this));
        //Se declara la lista sin datos
        List<Usuarios> usuariosList = new ArrayList<>();
        //cargar los datos en la lista por medio de un ciclo for
        for(int i=0;i<20;i++){
            usuariosList.add(new Usuarios(i,"Nombre "+i,"Apellido","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNdoC6NhVkbqjFNlxMViSr-F6vbMSNyNzsNw&usqp=CAU"
            ,"email@gmail.com"));
            Log.d("MSG","Se ha creado el objeto"+i);
        }//fin del for

        //Preparando el objeto Adaptador con la lista y contexto
        usuarioAdaptador = new UsuarioAdaptador(usuariosList,this);
        //Se utiliza el adaptador
        recyclerUsuarios.setAdapter(usuarioAdaptador);
        Log.d("MSG","El tamaño de la lista es: "+usuariosList.size());
    }
}