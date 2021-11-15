package mx.edu.utng.cardviewgds0343;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class UsuarioAdaptador extends RecyclerView.Adapter<UsuarioAdaptador.ViewHolder>{
    //Declarar una lista necesaria como estructura de datos para el conjunto de items
    private List<Usuarios> usuarioList;
    private Context context; //Declarar un contexto para los Activities de item

    //Crear un constructor
        public UsuarioAdaptador(List<Usuarios> usuarioList, Context context) {
        this.usuarioList = usuarioList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            //Pasar la tarjeta en un inflate para que se muestre en el Recycler
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.tarjeta_usuario, parent, false);
            return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            //Se manipulan objetos
        holder.tvNombre.setText(usuarioList.get(position).getNombre());
        holder.tvEmail.setText(usuarioList.get(position).getEmail());
            //Para en manejo de las imagenes utilizaremos una libreria denominada Glide
            //Debemos acceder a internet
        Glide.with(context)
                .load(usuarioList.get(position).getFoto())
                .circleCrop()
                .into(holder.imgFoto);
    }

    @Override
    public int getItemCount() {
        return usuarioList.size();
    }

    //Clase interna para el contenido de cada tarjeta
    public static class ViewHolder extends RecyclerView.ViewHolder{
        //Declaración de los objetos visuales, parecido al onCreate
        private ImageView imgFoto;
        private TextView tvNombre;
        private TextView tvEmail;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = itemView.findViewById(R.id.img_foto);
            tvNombre=itemView.findViewById(R.id.tv_nombre);
            tvEmail=itemView.findViewById(R.id.tv_email);



        }
    }
}
