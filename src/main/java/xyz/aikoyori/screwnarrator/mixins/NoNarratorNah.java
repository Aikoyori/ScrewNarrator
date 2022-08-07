package xyz.aikoyori.screwnarrator.mixins;

import com.mojang.text2speech.Narrator;
import com.mojang.text2speech.NarratorDummy;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Narrator.class)
public interface NoNarratorNah {
    @Inject(method = "getNarrator",at = @At("HEAD"),cancellable = true,remap = false)
    private static void nonononono(CallbackInfoReturnable<Narrator> cir){
        cir.setReturnValue(new NarratorDummy());
    }

}
