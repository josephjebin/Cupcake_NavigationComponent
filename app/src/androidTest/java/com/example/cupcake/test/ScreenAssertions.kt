package com.example.cupcake.test

import androidx.navigation.NavController
import org.junit.Assert.assertEquals

fun NavController.assertCurrentRouteName(expectedRoute: String) {
    assertEquals(expectedRoute, currentBackStackEntry?.destination?.route)
}