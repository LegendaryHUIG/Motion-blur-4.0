
package com.motionblur.mixin;

import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.client.render.GameRenderer;

@Mixin(GameRenderer.class)
public class FrameRenderMixin {
    // Pseudo hook: call MotionBlurRenderer.render() at end of frame render
}
