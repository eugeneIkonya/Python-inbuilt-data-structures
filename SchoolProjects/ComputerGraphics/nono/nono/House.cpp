#define GL_SILENCE_DEPRECATION
#include <iostream>
#include <GL/glew.h>
#include <GLFW/glfw3.h>
#define SCREEN_WIDTH 900
#define SCREEN_HEIGHT 1000

class House{
    GLFWwindow *window;
    const float PI = 3.14;
public:
    void initWindow(){
        glfwInit();
        window = glfwCreateWindow( SCREEN_WIDTH, SCREEN_HEIGHT, "House", NULL, NULL );
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
    void circle(GLfloat rx,GLfloat ry, GLfloat centerX, GLfloat centerY){
        glBegin(GL_TRIANGLE_FAN);
        for(int i=0;i<=1000;i++){
            float angle = 2*3.14 * i/1000;
            float x  = rx*cos(angle);
            float y  = ry*sin(angle);
            glVertex2f(x+centerX, y+centerY);
        
            
        }
        glEnd();
    }
    void semiCircle(float radius,float centerX,float centerY,GLfloat startAngle, float endAngle,float step){
       // How far is the next point i.e it should be small value
        glBegin(GL_LINE_STRIP);
            for(float angle=startAngle;angle<=endAngle; angle+=step){
            
              float rad  = PI*angle/180;
              float x  = centerX+radius*cos(rad);
              float y  = centerY+radius*sin(rad);
            
                glLineWidth(10);
              glVertex2f(x,y);

           }
       glEnd();
    }
    void mainLoop(){
   
        
        glPolygonMode(GL_FRONT_AND_BACK, GL_LINE);
        
        while (!glfwWindowShouldClose(window)) {
            glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
            glClear(GL_COLOR_BUFFER_BIT);
            
            //House frame
            glLineWidth(2);
            glBegin(GL_POLYGON);
            glColor3f(0.392, 0.584, 0.929);
            glVertex2f(200,100);
            glVertex2f(700, 100);
            glVertex2f(700, 400);
            glVertex2f(800, 400);
            glVertex2f(800, 500);
            glVertex2f(100, 500);
            glVertex2f(100, 400);
            glVertex2f(200, 400);
            glEnd();
            
            //drawing windows
            
            //window 1
            glBegin(GL_POLYGON);
            glColor3f(0.420, 0.557, 0.137);
            glVertex2f(250, 250);
            glVertex2f(350, 250);
            glVertex2f(350, 350);
            glVertex2f(250, 350);
            glEnd();
            
            glLineWidth(3);
            //window 1 lines
            glBegin(GL_LINES);
            glColor3f(0.392, 0.584, 0.929);
            glVertex2f(250, 300);
            glVertex2f(350, 300);
            glEnd();
            
            glBegin(GL_LINES);
            glVertex2f(300, 350);
            glVertex2f(300, 250);
            glEnd();
            
            //window2
            glColor3f(0.420, 0.557, 0.137);
            glBegin(GL_POLYGON);
            glVertex2f(550, 250);
            glVertex2f(650, 250);
            glVertex2f(650, 350);
            glVertex2f(550, 350);
            glEnd();
            
            //window 2 lines
            glBegin(GL_LINES);
            glColor3f(0.392, 0.584, 0.929);
            glVertex2f(550, 300);
            glVertex2f(650, 300);
            glEnd();
            
            glBegin(GL_LINES);
            glVertex2f(600, 350);
            glVertex2f(600, 250);
            glEnd();
            
            //door
            glBegin(GL_POLYGON);
            glVertex2f(400, 100);
            glVertex2f(500, 100);
            glVertex2f(500, 350);
            glVertex2f(400, 350);
            glEnd();
            
            //door Knob
            glPointSize(20);
            glBegin(GL_POINTS);
            glVertex2f(480, 225);
            glEnd();
            
            //drawing the circle
            glColor3f(0.392, 0.584, 0.929);
            semiCircle(200, 450, 500,0.0f,180,5);
            
            //cresent moon
            glLineWidth(3);
            glColor3f(1.000, 0.843, 0.000);
            circle(100, 100, 700, 850);
            glColor3f(0.282, 0.820, 0.800);
            semiCircle(100, 700, 850,-270.0f,-25,5);
            glColor3f(1.0f, 1.0f, 1.0f);
            circle(100, 100, 750, 900);
            glColor3f(0.282, 0.820, 0.800);
            semiCircle(100, 751, 901,-205.0f,-65,5);
            
            glfwSwapBuffers(window);
            
            glfwPollEvents();
        }
    }
    void cleanUp(){
        glfwTerminate();
    }
    
    void drawHouse(){
        initWindow();
        mainLoop();
        cleanUp();
    }
};
