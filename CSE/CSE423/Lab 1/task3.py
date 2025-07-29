from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *

def draw_lines():
    glPointSize(5)  # pixel size. by default 1 thake
    glBegin(GL_LINES)

    #2
    glColor3f(0.6, 0.8, 0.7)
    glVertex2f(300,400)
    glVertex2f(200,400)

    glVertex2f(200, 400)
    glVertex2f(200, 500)

    glVertex2f(200, 500)
    glVertex2f(300, 500)

    glVertex2f(300, 500)
    glVertex2f(300, 600)

    glVertex2f(300, 600)
    glVertex2f(200, 600)

    #0
    glColor3f(0.7, 0.5, 0.2)
    glVertex2f(400, 400)
    glVertex2f(500, 400)

    glVertex2f(500, 400)
    glVertex2f(500, 600)

    glVertex2f(400, 600)
    glVertex2f(500, 600)

    glVertex2f(400, 600)
    glVertex2f(400, 400)

    #3
    glColor3f(0.9, 0.8, 0.5)
    glVertex2f(600, 400)
    glVertex2f(700, 400)

    glVertex2f(700, 400)
    glVertex2f(700, 600)

    glVertex2f(600, 500)
    glVertex2f(700, 500)

    glVertex2f(600, 600)
    glVertex2f(700, 600)

    # 0
    glColor3f(1.0, 0.8, 0.1)
    glVertex2f(800, 400)
    glVertex2f(900, 400)

    glVertex2f(900, 400)
    glVertex2f(900, 600)

    glVertex2f(800, 600)
    glVertex2f(900, 600)

    glVertex2f(800, 600)
    glVertex2f(800, 400)

    #1
    glColor3f(0.9, 0.7, 0.4)
    glVertex2f(1000, 400)
    glVertex2f(1000, 600)

    # 0
    glColor3f(0.2, 0.4, 0.3)
    glVertex2f(1100, 400)
    glVertex2f(1200, 400)

    glVertex2f(1200, 400)
    glVertex2f(1200, 600)

    glVertex2f(1100, 600)
    glVertex2f(1200, 600)

    glVertex2f(1100, 600)
    glVertex2f(1100, 400)

    #6
    glColor3f(1.0, 0.2, 0.0)
    glVertex2f(1300, 400)
    glVertex2f(1400, 400)

    glVertex2f(1400, 400)
    glVertex2f(1400, 500)

    glVertex2f(1400, 500)
    glVertex2f(1300, 500)

    glVertex2f(1300, 600)
    glVertex2f(1300, 400)

    glVertex2f(1300, 600)
    glVertex2f(1400, 600)

    # 6
    glColor3f(1.0, 0.2, 1.0)
    glVertex2f(1500, 400)
    glVertex2f(1600, 400)

    glVertex2f(1600, 400)
    glVertex2f(1600, 500)

    glVertex2f(1600, 500)
    glVertex2f(1500, 500)

    glVertex2f(1500, 600)
    glVertex2f(1500, 400)

    glVertex2f(1500, 600)
    glVertex2f(1600, 600)
    glEnd()

def iterate():
    glViewport(0, 0, 2000, 1000)
    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    glOrtho(0.0, 2000, 0.0, 1000, 0.0, 1.0)
    glMatrixMode(GL_MODELVIEW)
    glLoadIdentity()

def showScreen():
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)
    glLoadIdentity()
    iterate()
    glColor3f(1.0, 0.0, 1.0) #konokichur color set (RGB)
    draw_lines()
    glutSwapBuffers()

glutInit()
glutInitDisplayMode(GLUT_RGBA)
glutInitWindowSize(2000, 1000) #window size
glutInitWindowPosition(0, 0)
wind = glutCreateWindow(b"OpenGL Coding Practice") #window name
glutDisplayFunc(showScreen)
glutMainLoop()