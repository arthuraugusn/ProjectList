package com.example.projectlist.ui.card

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.example.projectlist.model.Details

@Composable
fun DetailsContent(){
    val employes = remember {
        Details.EmployDetailsList
    }
    LazyColumn(contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)){
        items(employes){ EmployeeCard(emp = it)}
    }
}