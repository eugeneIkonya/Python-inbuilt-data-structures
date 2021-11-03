#define GL_SILENCE_DEPRECATION
#include <iostream>
#include <GL/glew.h>
#include <GLFW/glfw3.h>
#define WIDTH 900
#define HEIGHT 1000

class Star{
public:
    GLFWwindow *window;
    void initWindow(){
        glfwInit();
        window = glfwCreateWindow( WIDTH, HEIGHT, "Star", NULL, NULL );
        if(!window){
            cleanUp();
        }
        
        glfwMakeContextCurrent(window);
        glViewport( 0.0f, 0.0f, WIDTH, HEIGHT );
        glMatrixMode( GL_PROJECTION );
        glLoadIdentity();
        glOrtho(0, WIDTH, 0,HEIGHT, 0, 1);
        glMatrixMode( GL_MODELVIEW );
        glLoadIdentity();

    }
    void mainLoop(){
        GLfloat vertices[] = {
            185,100,0,
            300,180,0,
            415,100,0,
            370,220,0,
            450,275,0,
            345,275,0,
            300,400,0,
            255,275,0,
            150,275,0,
            230,220,0,
        };
        
        glPolygonMode(GL_FRONT_AND_BACK, GL_LINE);
        
        while (!glfwWindowShouldClose(window)) {
            glClear(GL_COLOR_BUFFER_BIT);
            glEnableClientState(GL_VERTEX_ARRAY);
            glVertexPointer(3, GL_FLOAT, 0, vertices);
            glDrawArrays(GL_POLYGON, 0, 10);
            glDisableClientState(GL_VERTEX_ARRAY);
            glfwSwapBuffers(window);
            
            glfwPollEvents();
        }
    }
    void cleanUp(){
        glfwTerminate();
    }
    

    void drawStar(){
        initWindow();
        mainLoop();
        cleanUp();
    }
};
