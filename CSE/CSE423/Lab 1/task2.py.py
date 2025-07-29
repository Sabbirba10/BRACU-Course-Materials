from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *

def draw_points():
    glPointSize(5) #pixel size. by default 1 thake
    glBegin(GL_POINTS)
    glColor3f(0.0,1.0,0.0)
    glVertex2f(580,430) #jekhane show korbe pixel
    glEnd()

def draw_triangle():
    glPointSize(5)
    glBegin(GL_TRIANGLES)
    glColor3f(1.0,0.0,0.0)
    glVertex2f(400,700)
    glVertex2f(550,900)
    glVertex2f(700,700)
    glEnd()

def draw_rectangle():
    #box
    glPointSize(5)
    glBegin(GL_TRIANGLES)
    glColor3f(1.0, 1.0, 0.0)
    glVertex2f(400,400)
    glVertex2f(700,400)
    glVertex2f(700, 700)

    glVertex2f(400,400)
    glVertex2f(700,700)
    glVertex2f(400,700)

    #door
    glColor3f(0.0,0.0,1.0)
    glVertex2f(500,400)
    glVertex2f(600,500)
    glVertex2f(500,500)

    glVertex2f(500,400)
    glVertex2f(600,500)
    glVertex2f(600,400)

    #windows
    glVertex2f(600,550)
    glVertex2f(650,550)
    glVertex2f(650,600)

    glVertex2f(600,550)
    glVertex2f(650, 600)
    glVertex2f(600, 600)

    glVertex2f(600, 550)
    glVertex2f(650, 550)
    glVertex2f(650, 600)

    #window1
    glVertex2f(500, 550)
    glVertex2f(500, 600)
    glVertex2f(450, 550)

    glVertex2f(450, 550)
    glVertex2f(500, 600)
    glVertex2f(450, 600)
    glEnd()

def iterate():
    glViewport(0, 0, 1000, 1000)
    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    glOrtho(0.0, 1000, 0.0, 1000, 0.0, 1.0)
    glMatrixMode(GL_MODELVIEW)
    glLoadIdentity()

def showScreen():
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)
    glLoadIdentity()
    iterate()
    draw_rectangle()
    draw_triangle()
    draw_points()
    glutSwapBuffers()

glutInit()
glutInitDisplayMode(GLUT_RGBA)
glutInitWindowSize(1000, 1000) #window size
glutInitWindowPosition(0, 0)
wind = glutCreateWindow(b"OpenGL Coding Practice") #window name
glutDisplayFunc(showScreen)
glutMainLoop()