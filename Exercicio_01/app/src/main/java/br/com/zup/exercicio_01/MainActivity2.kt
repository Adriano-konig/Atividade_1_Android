package br.com.zup.exercicio_01

import PRODUTO
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.MenuItem
import android.widget.Button
import androidx.core.os.bundleOf
import br.com.zup.exercicio_01.databinding.ActivityHomeBinding
import br.com.zup.exercicio_01.databinding.ActivityMain2Binding
import br.com.zup.exercicio_01.home.HomeActivity
import br.com.zup.exercicio_01.model.Produto

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    private var btnCalcularValores2: Button? = null

    private var buscarClassePrincipal = HomeActivity()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("Informação valor Total")

        recuperarExibirDados()
        initView2()


        btnCalcularValores2?.setOnClickListener{
            voltarTelaPrincipal()
        }


    }
    private fun initView2(){
        btnCalcularValores2 = findViewById(R.id.botaoCalculo)

    }

    private fun recuperarExibirDados(){
        val produto = intent.getParcelableExtra<Produto>(PRODUTO)

        if (produto != null){
            val valorTotal = calculo(
                produto.getQuantidade(),
                    produto.getValorProduto()
            )
            exibirvalor(valorTotal)
        }
    }

    private fun calculo(
        quantidade: Double,
        valor:Double
    ):Double{
        return (quantidade * valor)
    }

    private fun exibirvalor(
        valorTotal: Double
    ){
        binding.textView3.text = valorTotal.toString()
    }

    private fun voltarTelaPrincipal(){
        val intent = Intent(this, HomeActivity::class.java).apply {
        }
        startActivity(intent)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }



}