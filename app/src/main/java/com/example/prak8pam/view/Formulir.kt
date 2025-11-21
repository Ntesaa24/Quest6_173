package com.example.prak8pam.view

import com.example.prak8pam.R
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.DividerDefaults.Thickness
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.graphics.Color


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
	pilihanJK: List<String>,
	OnSubmitButtonClicked : (MutableList<String>) -> Unit,
	modifier: Modifier = Modifier

){
	//edit 2 tambahkan 4 variable dibawah ini
	var txtNama by rememberSaveable {mutableStateOf("")}
	var txtAlamat by remember {mutableStateOf("")}
	var txtGender by remember {mutableStateOf("")}
	var listData: MutableList<String> = mutableListOf(txtNama,txtAlamat,txtGender)

