package me.oyio.app.android.freshthing.view.things.dummy

import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object ThingsContent {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<DummyItem> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, DummyItem> = HashMap()

    private val COUNT = 25

    init {
        // Add some sample items.
        for (i in 1..COUNT) {
            addItem(createDummyItem(i.toString()))
        }
    }

    fun addItem(s: String) {
        addItem(createDummyItem(s))
    }

    fun addItem(item: DummyItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    private fun createDummyItem(title: String): DummyItem {
        return DummyItem(title, title, title)
    }

    /**
     * A dummy item representing a piece of content.
     */
    class DummyItem(val id: String, val content: String, val details: String) {

        override fun toString(): String {
            return content
        }
    }
}
