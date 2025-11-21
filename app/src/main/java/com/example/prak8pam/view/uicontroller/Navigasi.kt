package com.example.prak8pam.view.uicontroller

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.prak8pam.model.DataJK.JenisK
import com.example.prak8pam.model.Siswa
import com.example.prak8pam.view.FormIsian
import com.example.prak8pam.viewmodel.SiswaViewModel


enum class Navigasi {
	Formulir,
	Detail
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SiswaApp(
	//edit 1 : parameter viewModel
	modifier: Modifier,
	viewModel: SiswaViewModel = viewModel(),
	navController: NavHostController = rememberNavController()
){
	Scaffold { isiRuang ->
		//edit 2: tambahkan variable uiState
		val uiState = viewModel.statusUI.collectAsState()
		NavHost(
			navController = navController,
			startDestination = Navigasi.Formulir.name,

			modifier = Modifier.padding( isiRuang)){
			composable(route = Navigasi.Formulir.name){
				val konteks = LocalContext.current
				FormIsian(
					pilihanJK = JenisK,
					OnSubmitButtonClicked = {
						viewModel.setSiswa(it)
						navController.navigate(Navigasi.Detail.name)
					}
				)
			}
			composable(route = Navigasi.Detail.name){
				TampilSiswa(
					statusUiSiswa = uiState.value,
					onBackButtonClicked = {
						cancelAndBackToFormulir(navController)
					}
				)
			}
		}

	}
}

@Composable
fun TampilSiswa(statusUiSiswa: Siswa, onBackButtonClicked: () -> Unit) {
	TODO("Not yet implemented")
}

fun cancelAndBackToFormulir(
	navController: NavController
) {
	navController.popBackStack(Navigasi.Formulir.name, inclusive = false)
}
