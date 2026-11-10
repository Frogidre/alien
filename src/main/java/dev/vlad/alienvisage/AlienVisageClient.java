package dev.vlad.alienvisage;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;
public final class AlienVisageClient implements ClientModInitializer {
 public static boolean enabled = true;
 @Override public void onInitializeClient() {
  KeyBinding toggle = KeyBindingHelper.registerKeyBinding(new KeyBinding("key.alienvisage.toggle", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_O, KeyBinding.Category.MISC));
  ClientTickEvents.END_CLIENT_TICK.register(client -> { while(toggle.wasPressed()) { enabled = !enabled; if(client.player != null) client.player.sendMessage(Text.literal("Alien Visage: " + (enabled ? "ON" : "OFF")), true); }});
 }
}
