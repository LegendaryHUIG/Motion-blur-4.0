
package com.motionblur;

import java.io.*;
import com.google.gson.*;

public class MotionBlurConfig {
    public static float intensity = 0.5f;

    private static final File CONFIG_FILE = new File(System.getProperty("user.home"), ".minecraft/config/motionblur.json");

    public static void load() {
        if (!CONFIG_FILE.exists()) return;
        try (Reader reader = new FileReader(CONFIG_FILE)) {
            JsonObject obj = JsonParser.parseReader(reader).getAsJsonObject();
            intensity = obj.get("intensity").getAsFloat();
        } catch (Exception e) { e.printStackTrace(); }
    }

    public static void save() {
        try (Writer writer = new FileWriter(CONFIG_FILE)) {
            JsonObject obj = new JsonObject();
            obj.addProperty("intensity", intensity);
            new GsonBuilder().setPrettyPrinting().create().toJson(obj, writer);
        } catch (Exception e) { e.printStackTrace(); }
    }
}
