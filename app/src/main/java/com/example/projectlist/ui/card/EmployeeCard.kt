package com.example.projectlist.ui.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projectlist.model.Product

@Composable
fun EmployeeCard(emp: Product){
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = 2.dp,
        backgroundColor = Color.LightGray,
        shape = RoundedCornerShape(corner = CornerSize(16.dp))

    ) {

        Row(modifier = Modifier.padding(20.dp)) {
            Column(modifier = Modifier.weight(1f),
                Arrangement.Center) {
                Text(
                    text = emp.productName,
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                    )
                )
                Text(
                    text = "Price :- "+emp.productPrice.toString(),
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 15.sp
                    )
                )

                Text(
                    text = "Description :- "+emp.productDescription,
                    style = TextStyle(
                        color = Color.Black,
                        fontSize = 15.sp
                    )
                )
            }
            Image(painter = painterResource(emp.imageId), contentDescription = "Profile Image",
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .padding(8.dp)
                    .size(110.dp)
                    .clip((CircleShape)  ))
        }
    }
}