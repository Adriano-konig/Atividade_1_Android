package br.com.zup.exercicio_2.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import br.com.zup.exercicio_2.MainActivity2
import br.com.zup.exercicio_2.R
import br.com.zup.exercicio_2.databinding.ActivityMainBinding
import br.com.zup.exercicio_2.model.TABUADA
import br.com.zup.exercicio_2.model.Tabuada

class MainActivity : AppCompatActivity() {
    
    private lateinit var editNumero: EditText
    private var btnCalcularTabuada: Button? = null
    
    private lateinit var binding: ActivityMainBinding
            
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        initView()

        binding.edTextoValor

        btnCalcularTabuada?.setOnClickListener{
            enviarDados()
            limparCampos()
        }
    }

    private fun initView(){
        editNumero = findViewById(R.id.edTextoValor)
        btnCalcularTabuada = findViewById(R.id.botaoCalcularTabuada)
    }

    private fun enviarDados(){
        val editarValor = binding.edTextoValor.text.toString()

    if(editarValor.isNotEmpty() && editarValor != null){
        val tabuada = Tabuada(
            editarValor.toInt()
        )
        val intent = Intent(this, MainActivity2::class.java).apply {
            putExtra(TABUADA, tabuada)
        }
        startActivity(intent)
    }else
    {
        binding.edTextoValor.error = "campo obrigatorio!"
    }
    }

    private fun limparCampos(){
        binding.edTextoValor.text.clear()


    }
}

