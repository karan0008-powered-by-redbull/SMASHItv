package com.example.smashitvmvvm.ui.base

/**
 * Created by karanjeet on 22/10/19
 */
interface MvpPresenter<V : MvpView> {
    fun onAttach(view : V)
    fun onDetach()
}