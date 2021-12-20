package br.com.jholdev.listadecompras

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

//Cria a classe MainActivity com "Herança" do AppCompatActivity().
class MainActivity : AppCompatActivity() {
    //Metodo de criação da tela
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Implementação do adaptador
        val produtosAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)

        //Definindo o adaptador na lista
        list_view_produtos.adapter = produtosAdapter


        list_view_produtos.setOnItemLongClickListener {
                adapterView: AdapterView<*>,
                view: View,
                position: Int,
                id: Long ->
            //Buscando o item clicado
            val item = produtosAdapter.getItem(position)

            //Removendo o item clicado da lista
            produtosAdapter.remove(item)

            //Retorno indicando que o click foi realiado com sucesso
            true
        }
    }
}

