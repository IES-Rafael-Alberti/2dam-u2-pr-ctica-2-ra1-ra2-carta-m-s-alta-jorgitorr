package com.jorgearceruiz97.`2dam-u2-pr-ctica-2-ra1-ra2-carta-m-s-alta-jorgitorr`

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jorgearceruiz97.`2dam-u2-pr-ctica-2-ra1-ra2-carta-m-s-alta-jorgitorr`.ui.theme._2damu2prctica1ra1ra2saludoycontadoresjorgitorrTheme
import com.jorgearceruiz97.a2dam_u2_pr_ctica_1_ra1_ra2_saludo_y_contadores_jorgitorr.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _2damu2prctica1ra1ra2saludoycontadoresjorgitorrTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    visualizacion()
                }
            }
        }
    }

    //con el lambda lo que le introduzco por parametros es la variable que voy a modificar
    //@Preview(showBackground = true)
    @Composable
    fun botonesYCartas(reiniciar:(Baraja)->Unit){
        val context = LocalContext.current
        context.resources.getIdentifier("c1", "drawable", context.packageName)

        Image(
            painter = painterResource(id = R.drawable.c1),
            contentDescription = stringResource(id = R.string.c1)
        )
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 40.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally){

            Row {
                Button(onClick = { Baraja.dameCarta() } , modifier = Modifier.padding(horizontal = 5.dp)) {
                    Text(text = "Dame Carta")
                }
                Button(onClick = { reiniciar } , modifier = Modifier.padding(horizontal = 5.dp)) {
                    Text(text = "Reiniciar")
                }
            }

        }
    }


    @Preview(showBackground = true)
    @Composable
    fun visualizacion(){
        botonesYCartas(reiniciar = {
            Baraja.crearBaraja()
            Baraja.barajar() })
    }


    /*fun recuperarId(Carta: carta){
        val context = LocalContext.current

        context.resources.getIdentifier("nombreRecurso", "drawable", context.packageName)
    }*/







}




