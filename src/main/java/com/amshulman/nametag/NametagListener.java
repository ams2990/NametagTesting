package com.amshulman.nametag;

import java.math.BigInteger;
import java.util.Random;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.kitteh.tag.AsyncPlayerReceiveNameTagEvent;

public class NametagListener implements Listener {

    private final Random random = new Random();

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onEvent(AsyncPlayerReceiveNameTagEvent event) {
        event.setTag(new BigInteger(82, random).toString(36).toUpperCase());
    }
}
