package net.prismclient.aether.ui.component.type.layout.grid

import net.prismclient.aether.ui.component.type.layout.container.UIContainer
import net.prismclient.aether.ui.component.type.layout.styles.UIContainerSheet
import net.prismclient.aether.ui.unit.UIUnit
import net.prismclient.aether.ui.unit.util.AUTO
import net.prismclient.aether.ui.unit.util.INITIAL

/**
 * As the names suggests, [UIGridLayout] lays the components in a
 * grid like fashion. Configure the [rows] and [columns] variables
 * to decide how to lay out the grid. This acts like a css grid layout.
 *
 * @author sen
 * @since 5/21/2022
 */
class UIGridLayout(style: String) : UIContainer<UIContainerSheet>(style) {
    /**
     * Equivalent to grid-template-columns in css
     */
    var columns: MutableList<UIUnit> = mutableListOf()

    /**
     * Equivalent to grid-template-rows in css
     */
    var rows: MutableList<UIUnit> = mutableListOf()

    override fun updateLayout() {
        // Insert default values if rows and columns are empty
        if (rows.isEmpty())
            rows.add(UIUnit(0f, INITIAL))
        if (columns.isEmpty())
            columns.add(UIUnit(0f, INITIAL))
    }
}