package net.prismclient.aether.ui.component.type.layout.grid

import net.prismclient.aether.ui.unit.UIUnit

/**
 * [UIGridUnit] is used alongside [UIGridLayout]. It defines the
 * minimum and maximum values of an element within the grid. If used
 * anywhere else, it will act like a normal [UIUnit], with another class
 * attached to it.
 *
 * @author sen
 * @since 5/21/2022
 */
class UIGridUnit(var min: UIUnit, value: Float, type: Byte) : UIUnit(value, type) {
    override fun copy(): UIGridUnit = UIGridUnit(min, value, type)
}