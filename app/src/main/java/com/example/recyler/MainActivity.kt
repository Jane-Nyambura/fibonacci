package com.example.recyler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class MainActivity : AppCompatActivity() {
    lateinit var rvNumbers:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rvNumbers=findViewById<RecyclerView>(R.id.rvNumbers)

rvNumbers.layoutManager=
LinearLayoutManager(baseContext,)
var numbersAdapter=fibonashiNumbersAdapter(fibonacci(maxNumber=100))
rvNumbers.adapter=numbersAdapter
}
}


fun fibonacci(maxNumber:Int): MutableList<BigInteger> {
    var count=0;
    var firstNumber=0.toBigInteger()
    var secondNumber=1.toBigInteger()
    var sum = 0.toBigInteger()
    var fiboNumbers= mutableListOf<BigInteger>()
    while(count<=maxNumber){
        println(firstNumber)
        sum = firstNumber + secondNumber
        firstNumber = secondNumber
        secondNumber = sum
        count ++
        fiboNumbers.add(firstNumber)
    }
    return fiboNumbers
}
























