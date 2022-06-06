package br.com.zup.exercicio_01.home

import PRODUTO
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import br.com.zup.exercicio_01.MainActivity2
import br.com.zup.exercicio_01.R
import br.com.zup.exercicio_01.databinding.ActivityHomeBinding
import br.com.zup.exercicio_01.model.Produto

class HomeActivity : AppCompatActivity() {

    private lateinit var editTextNomeProduto: EditText
    private val editTextQuantidade: EditText by lazy { findViewById(R.id.etValorDoProduto) }
    private val editTextValor: EditText by lazy { findViewById(R.id.etQuantidade) }
    private var btnCalcularValores: Button? = null

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)

        setContentView(binding.root)

        initViews()

        binding.etValorDoProduto

        btnCalcularValores?.setOnClickListener {
            enviarDados()
            limparCampos()
        }
    }

    private fun initViews() {
        editTextNomeProduto = findViewById(R.id.etNomeProduto)
        btnCalcularValores = findViewById(R.id.botaoCalculo)
    }

    private fun enviarDados(){
    val nomeProduto = binding.etNomeProduto.text.toString()
    val quantidade = binding.etQuantidade.text.toString()
    val valores = binding.etValorDoProduto.text.toString()

    if (nomeProduto.isNotEmpty() && nomeProduto != null
    && quantidade.isNotEmpty()
    && valores.isNotEmpty()
    )
    {
        val produto = Produto(
            nomeProduto,
            quantidade.toDouble(),
            valores.toDouble()
        )
        val intent = Intent(this, MainActivity2::class.java).apply {
            putExtra(PRODUTO, produto)
        }
        startActivity(intent)
    }else
    {
        binding.etNomeProduto.error = "campo obrigatorio!"
        binding.etQuantidade.error = "campo obrigatorio!"
        binding.etValorDoProduto.error = "campo obrigatorio!"
    }
}
 private fun limparCampos(){
     binding.etNomeProduto.text.clear()
     binding.etQuantidade.text.clear()
     binding.etValorDoProduto.text.clear()

}
}