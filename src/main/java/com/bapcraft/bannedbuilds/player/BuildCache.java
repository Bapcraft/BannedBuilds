package com.bapcraft.bannedbuilds.player;

import java.util.UUID;

/**
 * @author Kyle Posluns
 */
public interface BuildCache<T extends BlockPos> extends Iterable<T> {

    UUID getOwner();

    void cache(T pos);

    void purge();

}
