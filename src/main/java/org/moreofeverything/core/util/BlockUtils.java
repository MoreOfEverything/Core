package org.moreofeverything.core.util;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class BlockUtils
{
    private BlockUtils() {}

    public static ItemBlock getItemBlockFor(Block block)
    {
        return new ItemBlock(block);
    }
}
