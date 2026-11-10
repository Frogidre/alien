# Alien Visage — Fabric 1.21.11

**This is a model-and-build prototype, not a finished player replacement mod.**

Included:
- Alien texture and custom 3D geometry with a separate jaw bone.
- Jaw talk animation asset.
- Fabric client entrypoint and O toggle keybind.
- GitHub Actions build workflow.

Not yet implemented:
- Connecting the geometry to Minecraft's player renderer. The alien does not yet replace the player model in-game.
- Reading voice activity from Simple Voice Chat. The jaw animation is an asset only and does not yet react to speech.
- In-game testing/verification.

Build:
1. Upload the contents of this folder to a GitHub repository.
2. Open Actions and run **Build Fabric mod**.
3. Download `alien-visage-jar` from the workflow artifacts.

Requires Java 21. Minecraft Java 1.21.11 + Fabric.
