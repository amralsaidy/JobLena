package com.joblena.app.common

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.Scroller
import androidx.annotation.Nullable
import androidx.viewpager.widget.ViewPager

class NoSwipeViewPager : ViewPager {

    constructor(context: Context) : super(context) {
        setMyScroller()
    }

    constructor(context: Context, @Nullable attrs: AttributeSet?) : super(context, attrs) {
        setMyScroller()
    }

    private fun setMyScroller() {
        try {
            val viewPager: Class<*> = ViewPager::class.java
            val scroller = viewPager.getDeclaredField("mScroller")
            scroller.isAccessible = true
            scroller[this] = MyScroller(context)
        } catch (e: IllegalAccessException) {
            e.printStackTrace()
        } catch (e: NoSuchFieldException) {
            e.printStackTrace()
        }
    }

    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
        return false
    }

    override fun onTouchEvent(ev: MotionEvent): Boolean {
        return false
    }

    private inner class MyScroller(context: Context?) : Scroller(context) {
        override fun startScroll(startX: Int, startY: Int, dx: Int, dy: Int, duration: Int) {
            super.startScroll(startX, startY, dx, dy, 350)
        }
    }
}