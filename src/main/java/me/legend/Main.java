package me.legend;

import me.legend.GraphicsManager.GraphicsManager;
import me.legend.Interfaces.KeypressListener;
import me.legend.Interfaces.Renderable;

public class Main {
    public static void main(String... args){
        Application application = new Application(1280, 720);
        application.setKeypressListener(new keyCallBack());
        application.setRenderLoop(new RenderLoop());
        application.init();
    }
}

class keyCallBack implements KeypressListener {
    @Override
    public void keyPressed(int keycode) {
        System.out.println("Keycode: " + keycode);
    }
}

class RenderLoop implements Renderable {
    @Override
    public void render(GraphicsManager graphics) {
        graphics.colour(1, 1, 1);
        graphics.drawLine(0, 400, 1280, 400);
    }
}