package com.zenglw.mylibrary

import android.util.Log
import com.zenglw.mylibrary2.MyLib2

/**
 * @author：zenglingwen
 * @date：2023/9/14 20:20
 * @desc：
 */
public class MyLib1 {
    companion object{
        fun testLib1(): String {
            Log.e(TAG, "testLib1: ", )
            MyLib2.testLib2()
            return "testlib1"
        }
        private const val TAG = "MyLib1"
    }

}