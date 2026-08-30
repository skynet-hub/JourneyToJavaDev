package dev.magobolesaomako.Core2D;

import org.lwjgl.Version;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.opengl.GL;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11C.*;
import static org.lwjgl.system.MemoryUtil.NULL;

public class Window {
    private int width, height;
    private String title;

    private static Window window = null;

    private static long glfwWindow;

    private Window(){
        this.width = 1920;
        this.height = 1080;
        this.title = "Mario";
    }

    public static Window get(){
        if (Window.window == null){
            Window.window = new Window();
        }

        return Window.window;
    }

    public void run(){
        System.out.println("Hello GLFW " + Version.getVersion() + "!");

        init();
        loop();
    }

    private void init(){

        // set up an error callback. It will print to standard System.err
        GLFWErrorCallback.createPrint(System.err).set();

        if (!glfwInit()){
            throw new IllegalStateException("Unsble to initialize GLFW");
        }

        // Configure GLFW
        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        glfwWindowHint(GLFW_MAXIMIZED, GLFW_TRUE);

        // Let us create the window
        glfwWindow = glfwCreateWindow(this.width, this.height, this.title, NULL, NULL);
        if (glfwWindow == NULL){
            throw new IllegalStateException("Failed to create GLFW window");
        }

        // Make OpenGL context current
        glfwMakeContextCurrent(glfwWindow);
        //Enable V-sync
        glfwSwapInterval(1);

        glfwShowWindow(glfwWindow);


        // This line is critical for LWJGL's interoperation with GLFW's
        // OpenGL context, or any context that is managed externally.
        // LWJGL detects the context that is current in the current thread,
        // creates the GLCapabilities instance and makes the OpenGL
        // bindings available for use.
        GL.createCapabilities();
    }

    public void loop(){
        while (!glfwWindowShouldClose(glfwWindow)){
            // Poll Events
            glfwPollEvents();
            // Set the clear color
            glClearColor(1.0f, 0.0f, 0.0f, 0.0f);

            glfwSwapBuffers(glfwWindow);
            glClear(GL_COLOR_BUFFER_BIT);
        }
    }
}
