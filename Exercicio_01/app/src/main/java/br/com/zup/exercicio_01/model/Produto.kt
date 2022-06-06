package br.com.zup.exercicio_01.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Produto(
    private var nome: String,
    private var quantidade:Double,
    private var valorProduto:Double,
) : Parcelable{

    fun getNomeProduto() = this.nome
    fun getQuantidade() = this.quantidade
    fun getValorProduto() = this.valorProduto
}