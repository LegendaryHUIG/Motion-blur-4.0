
package com.motionblur;

import net.fabricmc.api.ClientModInitializer;

public class MotionBlurMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("MotionBlur Mod fully loaded");
        MotionBlurRenderer.init();
        MotionBlurConfig.load();
    }
}
