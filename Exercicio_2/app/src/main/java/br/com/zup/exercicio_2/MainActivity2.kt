package br.com.zup.exercicio_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import br.com.zup.exercicio_2.databinding.ActivityMain2Binding
import br.com.zup.exercicio_2.model.TABUADA
import br.com.zup.exercicio_2.model.Tabuada

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    private var btnRecalcular: Button? = null
    private lateinit var numeroTabuada: TextView
    private lateinit var numeroTabuada1: TextView
    private lateinit var numeroTabuada2: TextView
    private lateinit var numeroTabuada3: TextView
    private lateinit var numeroTabuada4: TextView
    private lateinit var numeroTabuada5: TextView
    private lateinit var numeroTabuada6: TextView
    private lateinit var numeroTabuada7: TextView
    private lateinit var numeroTabuada8: TextView
    private lateinit var numeroTabuada9: TextView
    private lateinit var numeroTabuada10: TextView

    private var resultado1:Int = 0
    private var resultado2:Int = 0
    private var resultado3:Int = 0
    private var resultado4:Int = 0
    private var resultado5:Int = 0
    private var resultado6:Int = 0
    private var resultado7:Int = 0
    private var resultado8:Int = 0
    private var resultado9:Int = 0
    private var resultado10:Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle("Resultado")

        recuperarExibirDados()
       //calculo(numero = 2)
    }

    private fun initView2(){
        numeroTabuada = findViewById(R.id.numerTabuada)
        numeroTabuada = findViewById(R.id.numerTabuada1)
        numeroTabuada = findViewById(R.id.numerTabuada2)
        numeroTabuada = findViewById(R.id.numerTabuada3)
        numeroTabuada = findViewById(R.id.numerTabuada4)
        numeroTabuada = findViewById(R.id.numerTabuada5)
        numeroTabuada = findViewById(R.id.numerTabuada6)
        numeroTabuada = findViewById(R.id.numerTabuada7)
        numeroTabuada = findViewById(R.id.numerTabuada8)
        numeroTabuada = findViewById(R.id.numerTabuada9)
        numeroTabuada = findViewById(R.id.numerTabuada10)
    }


    private fun recuperarExibirDados(){
        val tabuada = intent.getParcelableExtra<Tabuada>(TABUADA)

        if (tabuada != null){
            val resultado = calculo(
                tabuada.getNumero()
            )
            exibirResultado(resultado)
        }

    }

    private fun calculo(
       numero : Int):Int{
        resultado1 = numero * 1
        resultado2 = numero * 2
        resultado3 = numero * 3
        resultado4 = numero * 4
        resultado5 = numero * 5
        resultado6 = numero * 6
        resultado7 = numero * 7
        resultado8 = numero * 8
        resultado9 = numero * 9
        resultado10 = numero * 10

        return (numero * 1)

}

    private fun exibirResultado(resultado:Int){
        binding.numerTabuada.text = resultado.toString()
        binding.numerTabuada1.text = resultado.toString()
        binding.numerTabuada2.text = resultado.toString()
        binding.numerTabuada3.text = resultado.toString()
        binding.numerTabuada4.text = resultado.toString()
        binding.numerTabuada5.text = resultado.toString()
        binding.numerTabuada6.text = resultado.toString()
        binding.numerTabuada7.text = resultado.toString()
        binding.numerTabuada8.text = resultado.toString()
        binding.numerTabuada9.text = resultado.toString()
        binding.numerTabuada10.text = resultado.toString()
        binding.numerTabuada1.text = resultado.toString()
        binding.resultado1.text = resultado1.toString()
        binding.resultado2.text = resultado2.toString()
        binding.resultado3.text = resultado3.toString()
       binding.resultado4.text = resultado4.toString()
        binding.resultado5.text = resultado5.toString()
        binding.resultado6.text = resultado6.toString()
        binding.resultado7.text = resultado7.toString()
        binding.resultado8.text = resultado8.toString()
        binding.resultado9.text = resultado9.toString()
        binding.resultado10.text = resultado10.toString()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            this.finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}
