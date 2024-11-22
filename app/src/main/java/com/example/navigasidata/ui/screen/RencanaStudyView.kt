package com.example.navigasidata.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.navigasidata.model.Mahasiswa
import com.example.navigasidata.model.RencanaStudy

@Composable
fun RencanaStudyView(
    mahasiswa: Mahasiswa,
    onSubmitButtonCliked: (MutableList<String>) -> Unit,
    onBackButtonCliked: () -> Unit
){
    var choosenDropdown by remember {
        mutableStateOf("")
    }

    var  checked by remember {
        mutableStateOf("")
    }

    var pilihanKelas by remember {
        mutableStateOf("")
    }

}