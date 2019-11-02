package keyfun.app.chartdemo.ui.main

import android.annotation.SuppressLint
import android.content.Context
import com.github.mikephil.charting.components.MarkerView
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.highlight.Highlight
import com.github.mikephil.charting.utils.MPPointF
import keyfun.app.chartdemo.R
import kotlinx.android.synthetic.main.custom_marker_view.view.*

@SuppressLint("ViewConstructor")
class XYMarkerView(context: Context) :
    MarkerView(context, R.layout.custom_marker_view) {

    // runs every time the MarkerView is redrawn, can be used to update the
    // content (user-interface)
    override fun refreshContent(e: Entry, highlight: Highlight?) {
        tvContent.text = String.format("x: %s, y: %s", e.x, e.y)
        super.refreshContent(e, highlight)
    }

    override fun getOffset(): MPPointF {
        return MPPointF((-(width / 2)).toFloat(), (-height).toFloat())
    }
}
