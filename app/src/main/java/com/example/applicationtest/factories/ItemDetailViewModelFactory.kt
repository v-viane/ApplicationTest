package com.example.applicationtest.factories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.applicationtest.database.entities.Character
import com.example.applicationtest.models.Item
import com.example.applicationtest.viewmodels.ItemDetailViewModel

@Suppress("UNCHECKED_CAST")
class ItemDetailViewModelFactory (private val characterId : Int?) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ItemDetailViewModel(characterId!!) as T
    }
}