package org.sophia.slate_work.neoforge;

import net.neoforged.fml.common.Mod;

import org.sophia.slate_work.ExampleMod;

@Mod(ExampleMod.MOD_ID)
public final class ExampleModNeoForge {
    public ExampleModNeoForge() {
        // Run our common setup.
        ExampleMod.init();
    }
}
