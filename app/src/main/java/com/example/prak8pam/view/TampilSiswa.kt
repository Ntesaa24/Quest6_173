package com.example.pertemuan8.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.prak8pam.R
import com.example.prak8pam.model.Siswa

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
	//edit 1 : parameter statusUiSiswa
	statusUiSiswa: Siswa,
	onBackButtonClicked:()->Unit
){
	//edit 2 : items Pair
	val items = listOf(
		Pair(stringResource(id=R.string.nama_lengkap), statusUiSiswa.nama),
		Pair(stringResource(id=R.string.jenis_kelamin), statusUiSiswa.gender),
		Pair(stringResource(id=R.string.alamat), statusUiSiswa.alamat)
	)
	Scaffold (modifier = Modifier,
		topBar = {
			TopAppBar(
				title = {Text(text = stringResource(id=R.string.tampil), color = Color.White)},
				colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(id=R.color.pink_pastel))
			)
		}){ isiRuang->
		Column (
			modifier = Modifier.padding(isiRuang),
			verticalArrangement = Arrangement.SpaceBetween
		)
