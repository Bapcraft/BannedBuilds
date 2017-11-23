package com.bapcraft.bannedbuilds.tracking;

import com.treyzania.jzania.data.TimedQueue;

import java.util.UUID;
import java.util.WeakHashMap;

/**
 * @author Kyle Posluns
 */
public class BuildCache {

    private final WeakHashMap<UUID, TimedQueue<BlockPos>> cache;

    private final long cacheTime;

    public BuildCache(long cacheTime) {
        this.cache = new WeakHashMap<>();
        this.cacheTime = cacheTime;
    }

    public void cache(UUID player, BlockPos pos) {
        verify(player).add(pos);
    }

    private TimedQueue<BlockPos> verify(UUID player) {
        if (!cache.containsKey(player) || cache.get(player) == null) {
            cache.put(player, new TimedQueue<>(this.cacheTime));
            System.out.println("New cache created for: " + player.toString());
        }
        return cache.get(player);
    }



}
