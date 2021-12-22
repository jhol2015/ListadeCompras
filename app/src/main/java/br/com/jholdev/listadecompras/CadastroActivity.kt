package br.com.jholdev.listadecompras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.activity_main.*

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        //Definição do ouvinte do botão
        btn_inserir.setOnClickListener {
            //Pegando o valor digitado pelo usuário
            val produto = txt_produto.text.toString()

            if (produto.isNotEmpty()) {
                //Enviando o item para lista.

                //Limpando a caixa de texto
                txt_produto.text.clear()
            }else{
                //Aviso de preenchimento
                txt_produto.error = "Preencha um valor"
            }
        }

        btn_adicionar.setOnClickListener {
            //Criando a Intent explícita
            val intent = Intent(this, CadastroActivity::class.java)

            //iniciando a atividade
            startActivity(intent)
        }
    }
}