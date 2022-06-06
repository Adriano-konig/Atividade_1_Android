package br.com.zup.exercicio_2.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Tabuada(
    private var numero: Int
) :Parcelable{
    fun getNumero() = this.numero
}