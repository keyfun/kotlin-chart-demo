package keyfun.app.chartdemo.ui.main

import androidx.lifecycle.ViewModel
import com.github.mikephil.charting.data.BarEntry

class MainViewModel : ViewModel() {

    val maxCount = 31

    fun getBarValues(): ArrayList<BarEntry> {
        val values = java.util.ArrayList<BarEntry>()
        for (i in 0 until maxCount) {
            val multi = 1000
            val value = (Math.random() * 1000).toFloat() + multi / 3
            values.add(BarEntry(i.toFloat(), value))
        }
        return values
    }
}
