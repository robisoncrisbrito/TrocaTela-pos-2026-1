package br.edu.utfpr.trocatela

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LancamentoActivity : AppCompatActivity() {

    private lateinit var etCod: EditText
    private lateinit var etQtd: EditText
    private lateinit var etValor: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lancamento)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        etCod = findViewById(R.id.etCod)
        etQtd = findViewById(R.id.etQtd)
        etValor = findViewById(R.id.etValor)
    }

    fun btConfirmarOnClick(view: View) {

    }

    fun btListarOnClick(view: View) {

    }
}