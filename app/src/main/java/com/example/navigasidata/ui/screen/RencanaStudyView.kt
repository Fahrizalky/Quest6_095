package com.example.navigasidata.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.example.navigasidata.R
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

    var listData: MutableList<String> = mutableListOf(choosenDropdown, pilihanKelas)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color =  colorResource(id = R.color.primary))
    ){

    }


}