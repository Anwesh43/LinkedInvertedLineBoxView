package com.example.invertedlineboxview

import android.view.View
import android.view.MotionEvent
import android.graphics.Paint
import android.graphics.Color
import android.graphics.Canvas
import android.graphics.RectF
import android.app.Activity
import android.content.Context

val colors : Array<Int> = arrayOf(
    "#f44336",
    "#673AB7",
    "#00C853",
    "#304FFE",
    "#BF360C"
).map {
    Color.parseColor(it)
}.toTypedArray()
val parts : Int = 4
val scGap : Float = 0.02f / parts
val rot : Float = 90f
val delay : Long = 20
val strokeFactor : Float = 90f
val sizeFactor : Float = 4.2f
val lSizeFactor : Float = 11.2f
val backColor : Int = Color.parseColor("#BDBDBD")
