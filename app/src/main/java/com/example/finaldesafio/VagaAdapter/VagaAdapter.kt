import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.finaldesafio.R
import com.google.android.material.button.MaterialButton
import java.io.Serializable

class VagaAdapter(
    private val vagas: List<Vaga>,
    private val onclickListener:(Vaga)-> Unit
) : RecyclerView.Adapter<VagaAdapter.VagaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VagaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_vaga, parent, false)
        return VagaViewHolder(view)
    }
    data class Vaga(
        val cargo: String,
        val localizacao: String,
        val salario: String,
        val anunciante: String,
        val email: String,
        val telefone: String,
        val dataInicio: String,
        val dataTermino: String
    ): Serializable
    override fun onBindViewHolder(holder: VagaViewHolder, position: Int) {
        val vaga = vagas[position]
        holder.bind(vaga)
    }

    override fun getItemCount(): Int {
        return vagas.size
    }

    inner class VagaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textViewCargo: TextView = itemView.findViewById(R.id.textViewCargo)
        private val textViewLocalizacao: TextView = itemView.findViewById(R.id.textViewLocalizacao)
        private val textViewSalario: TextView = itemView.findViewById(R.id.textViewSalario)
        private val textViewAnunciante: TextView = itemView.findViewById(R.id.textViewAnunciante)
        private val textViewEmail: TextView = itemView.findViewById(R.id.textViewEmail)
        private val textViewTelefone: TextView = itemView.findViewById(R.id.textViewTelefone)
        private val textViewDataInicio: TextView = itemView.findViewById(R.id.textViewDataInicio)
        private val textViewDataTermino: TextView = itemView.findViewById(R.id.textViewDataTermino)
        private val botaoVerVaga: MaterialButton = itemView.findViewById(R.id.botaoVerVaga)



        fun bind(vaga: Vaga) {
            textViewCargo.text = vaga.cargo
            textViewLocalizacao.text = vaga.localizacao
            textViewSalario.text = vaga.salario
            textViewAnunciante.text = vaga.anunciante
            textViewEmail.text = vaga.email
            textViewTelefone.text = vaga.telefone
            textViewDataInicio.text = vaga.dataInicio
            textViewDataTermino.text = vaga.dataTermino

            botaoVerVaga.setOnClickListener {
                // Ação a ser executada quando o botão "Ver vaga" for clicado //
            onclickListener (vaga)
            }
        }
    }
}