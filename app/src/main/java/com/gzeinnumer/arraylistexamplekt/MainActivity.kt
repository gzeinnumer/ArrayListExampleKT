package com.gzeinnumer.arraylistexamplekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        type1()
        type2()
        type3()
        type4()
        type5()
        type6()

        looping()
    }

    private fun type1() {
        val list: MutableList<String> = mutableListOf()
        list.add("Add1")
    }

    private fun type2() {
        var listNumbers: MutableList<Int> = mutableListOf(10, 15, 20)
        // Result: 10, 15, 20

        listNumbers.add(1000)
        // Result: 10, 15, 20, 1000

        listNumbers.add(1, 250)
        // Result: 10, 250, 15, 20, 1000

        listNumbers.removeAt(0)
        // Result: 250, 15, 20, 1000

        listNumbers.remove(20)
        // Result: 250, 15, 1000

    }

    private fun type3() {
        val list = listOf("orange", "apple")
        list.toMutableList().add("grape")

        val list_1 = listOf("orange", "apple")
        val list_2 = listOf("banana", "strawberry")
        val newList = list_1 + list_2 // [orange, apple, banana, strawberry]
    }

    private fun type4() {
        var list1 = ArrayList<Int>()
        var list2  = list1.toMutableList()
        list2.add(1)
    }

    private fun type5() {
        val list = arrayListOf("list items here")
        list.add("what you want to add")
    }

    private fun type6() {
        val list = arrayListOf<String>()
        list.add("Item 1")
        list.add("Item 2")
    }

    private fun looping() {

        val list = listOf("orange", "apple")

        for(i in list){
            Log.d(TAG, "looping: $i")
        }
    }
}