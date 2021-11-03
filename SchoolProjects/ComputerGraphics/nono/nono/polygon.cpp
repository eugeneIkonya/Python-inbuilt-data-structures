#define GL_SILENCE_DEPRECATION
#include <iostream>
#include <GL/glew.h>
#include <GLFW/glfw3.h>
#define SCREEN_WIDTH 900
#define SCREEN_HEIGHT 1000

class Polygon{
    GLFWwindow *window;
public:
    void initWindow(){
        glfwInit();
        window = glfwCreateWindow( SCREEN_WIDTH, SCREEN_HEIGHT, "Polygon", NULL, NULL );
        if(!window){
            cleanUp();
        }
        
        glfwMakeContextCurrent(window);
        glViewport( 0.0f, 0.0f, SCREEN_WIDTH, SCREEN_HEIGHT );
        glMatrixMode( GL_PROJECTION );
        glLoadIdentity();
        glOrtho(0, SCREEN_WIDTH, 0, SCREEN_HEIGHT, 0, 1);
        glMatrixMode( GL_MODELVIEW );
        glLoadIdentity();
        
    }
    void mainLoop(){
        GLfloat vertices[] = {
            150, 100, 0,
            450, 100, 0,
            450, 300, 0,
            300,400,0,
            150, 300, 0,
        };
        
        glPolygonMode(GL_FRONT_AND_BACK, GL_FILL);
        
        while (!glfwWindowShouldClose(window)) {
            glClear(GL_COLOR_BUFFER_BIT);
            
            glEnableClientState(GL_VERTEX_ARRAY);
            glVertexPointer(3, GL_FLOAT, 0, vertices);
            glDrawArrays(GL_POLYGON, 0, 5);
            glDisableClientState(GL_VERTEX_ARRAY);
            
            glfwSwapBuffers(window);
            
            glfwPollEvents();
        }
    }
    void cleanUp(){
        glfwTerminate();
    }
    
    void drawPolygon(){
        initWindow();
        mainLoop();
        cleanUp();
    }
};
