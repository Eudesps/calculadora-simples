package com.example.calculadorasimples

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    private lateinit var numeroOne: TextInputLayout
    private lateinit var editNumero1: TextInputEditText

    private lateinit var numeroTwo: TextInputLayout
    private lateinit var editNumero2: TextInputEditText

    private lateinit var botaoSomar: Button
    private lateinit var botaoSubtrair: Button
    private lateinit var botaoMultiplicar: Button
    private lateinit var botaoDividir: Button
    private lateinit var botaocalcular: Button
    private lateinit var textoSinalOperacao: TextView
    private lateinit var sinalDaOperacao: String

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inicializarComponentesInterface()
        botaoSomar.setOnClickListener{
            sinalDaOperacao = "somar"
            textoSinalOperacao.text = "SOMAR"
        }
        botaoSubtrair.setOnClickListener {
            sinalDaOperacao = "subtrair"
            textoSinalOperacao.text = "SUBTRAIR"
        }
        botaoMultiplicar.setOnClickListener {
            sinalDaOperacao = "multiplicar"
            textoSinalOperacao.text = "MLTIPLICAR"
        }
        botaoDividir.setOnClickListener {
            sinalDaOperacao = "dividir"
            textoSinalOperacao.text = "DIVIDIR"
        }
        botaocalcular.setOnClickListener {
            calcular()
        }
    }

    private fun inicializarComponentesInterface() {
        numeroOne = findViewById(R.id.text_input_numero1)
        editNumero1 = findViewById(R.id.text_numero1)

        numeroTwo = findViewById(R.id.text_input_numero2)
        editNumero2 = findViewById(R.id.text_numero2)
        textoSinalOperacao = findViewById(R.id.textSinalEscolhido)

        //Iniciando todos os botões da interface
        botaoSomar = findViewById(R.id.buttonSomar)
        botaoSubtrair = findViewById(R.id.buttonSubtrair)
        botaoMultiplicar = findViewById(R.id.buttonMultiplicar)
        botaoDividir = findViewById(R.id.buttonDividir)
        botaocalcular = findViewById(R.id.buttonCalcularResultado)
    }

    private fun calcular(){
        val numero1String = editNumero1.text.toString()
        val numero2String = editNumero2.text.toString()
        val numeroDouble1 = numero1String.toDouble()
        val numeroDouble2 = numero2String.toDouble()
        when (sinalDaOperacao) {
            "somar" -> {
                val resultado = numeroDouble1 + numeroDouble2
                val resultadoText = resultado.toString()
                val textoResultado = findViewById<TextView>(R.id.textResultado)
                textoResultado.text = resultadoText
            }
            "subtrair" -> {
                val resultado = numeroDouble1 - numeroDouble2
                val resultadoText = resultado.toString()
                val textoResultado = findViewById<TextView>(R.id.textResultado)
                textoResultado.text = resultadoText
            }
            "multiplicar" -> {
                val resultado = numeroDouble1 * numeroDouble2
                val resultadoText = resultado.toString()
                val textoResultado = findViewById<TextView>(R.id.textResultado)
                textoResultado.text = resultadoText
            }
            "dividir" -> {
                val resultado = numeroDouble1 / numeroDouble2
                val resultadoText = resultado.toString()
                val textoResultado = findViewById<TextView>(R.id.textResultado)
                textoResultado.text = resultadoText
            }
        }
    }
}