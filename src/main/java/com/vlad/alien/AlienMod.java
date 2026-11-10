
package com.vlad.alien;

import net.fabricmc.api.ModInitializer;

public class AlienMod implements ModInitializer {
    public static final String MOD_ID = "alien";

    @Override
    public void onInitialize() {
        System.out.println("Alien mod loaded!");
    }
}
