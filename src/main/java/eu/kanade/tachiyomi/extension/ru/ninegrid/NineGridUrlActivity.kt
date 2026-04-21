package eu.kanade.tachiyomi.extension.ru.ninegrid

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.util.Log
import kotlin.system.exitProcess

/**
 * Springboard that accepts https://9grid.cc/series/123 links
 * and forwards them to Mihon to load the series.
 */
class NineGridUrlActivity : Activity() {

    private val tag = javaClass.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val pathSegments = intent?.data?.pathSegments
        if (pathSegments != null && pathSegments.size >= 2 && pathSegments[0] == "series") {
            val seriesId = pathSegments[1]
            val mainIntent = Intent().apply {
                action = "eu.kanade.tachiyomi.SEARCH"
                putExtra("query", "${NineGrid.SEARCH_PREFIX}$seriesId")
                putExtra("filter", packageName)
            }
            try {
                startActivity(mainIntent)
            } catch (e: ActivityNotFoundException) {
                Log.e(tag, "Could not start Mihon", e)
            }
        } else {
            Log.e(tag, "Could not parse URI from intent $intent")
        }
        finish()
        exitProcess(0)
    }
}
