package com.github.quiltservertools.ledger.actions

import net.minecraft.nbt.CompoundTag

class ItemDespawnActionType : ItemPickUpActionType() {
    override val identifier = "item-despawn"

    // The item was logged at the end of its lifetime, so it would despawn again on the next tick
    override fun getRespawnTag(): CompoundTag = super.getRespawnTag().apply { putShort("Age", 0) }
}
