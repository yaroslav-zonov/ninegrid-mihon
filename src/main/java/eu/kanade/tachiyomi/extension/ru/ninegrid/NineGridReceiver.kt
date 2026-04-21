package eu.kanade.tachiyomi.extension.ru.ninegrid

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

/**
 * Empty receiver — Mihon scans for packages with this intent-filter action
 * to discover installed extensions.
 */
class NineGridReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        // No-op: Mihon uses PackageManager to find this, doesn't send broadcasts
    }
}
