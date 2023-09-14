package com.zenglw.mylibrary3

import android.util.Log
import com.tencent.mmkv.MMKV

/**
 * @author：zenglingwen
 * @date：2023/9/14 20:20
 * @desc：
 */
class MyLib3 {
    companion object{
        fun testLib3() {
            Log.e(TAG, "testLib3: ", )
            MMKV.initialize("")
        }
        private const val TAG = "MyLib3"
    }

}