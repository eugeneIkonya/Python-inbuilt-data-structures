#define GL_SILENCE_DEPRECATION
#include <GLFW/glfw3.h>

#define SCREEN_WIDTH 900
#define SCREEN_HEIGHT 1000

class line{
    GLFWwindow *window;
    
    void initWindow(){
        glfwInit();
        window = glfwCreateWindow( SCREEN_WIDTH, SCREEN_HEIGHT, "Hello World", NULL, NULL );
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
        GLfloat lineVertices[] =
        {
            200, 100, 0,
            100, 300, 0
        };
        while ( !glfwWindowShouldClose( window ) )
        {
            glClear( GL_COLOR_BUFFER_BIT );
            
            glEnable( GL_LINE_SMOOTH );
            glEnable( GL_LINE_STIPPLE );
            glPushAttrib( GL_LINE_BIT );
            glLineWidth( 10 );
            glLineStipple( 1, 0x00FF );
            glEnableClientState( GL_VERTEX_ARRAY );
            glVertexPointer( 3, GL_FLOAT, 0, lineVertices );
            glDrawArrays( GL_LINES, 0, 2 );
            glDisableClientState( GL_VERTEX_ARRAY );
            glPopAttrib( );
            glDisable( GL_LINE_STIPPLE );
            glDisable( GL_LINE_SMOOTH );
            
            glfwSwapBuffers( window );
            
            glfwPollEvents( );
        }
    }
    void cleanUp(){
        glfwTerminate( );
        
    }
    
public:
    void drawLine(){
        initWindow();
        mainLoop();
        cleanUp();
    }
};


