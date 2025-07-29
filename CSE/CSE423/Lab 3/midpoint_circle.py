from OpenGL.GL import *
from OpenGL.GLUT import *
import math

def draw_points(x, y):
    glPointSize(1)
    glBegin(GL_POINTS)
    glVertex2f(x, y)
    glEnd()

def iterate():
    glViewport(0, 0, 700, 700)
    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    glOrtho(-400, 400, -400, 400, 0, 1.0)
    glMatrixMode(GL_MODELVIEW)
    glLoadIdentity()

def points(x, y, x_1, y_1):  # circlepoints
    draw_points(x + x_1, y + y_1)
    draw_points(y + x_1, x + y_1)
    draw_points(y + x_1, -x + y_1)
    draw_points(x + x_1, -y + y_1)
    draw_points(-x + x_1, -y + y_1)
    draw_points(-y + x_1, -x + y_1)
    draw_points(-y + x_1, x + y_1)
    draw_points(-x + x_1, y + y_1)

def midpoint_circle(x_1, y_1, r):
    d_init = 1 - r
    x = 0
    y = r
    points(x, y, x_1, y_1)
    while x < y:
        if d_init < 0:  # E
            d_init = d_init + 2 * x + 3
            x += 1
        else:
            d_init = d_init + 2 * x - 2 * y + 5
            x += 1
            y -= 1
        points(x, y, x_1, y_1)

def diagonals(x, y, r):
    midpoint_circle(x, y, r)  # outer circle
    
    # Four cardinal direction circles
    midpoint_circle(x + (r / 2), y, r / 2)  # right_inner_circle
    midpoint_circle(x, y + (r / 2), r / 2)  # upper_inner_circle
    midpoint_circle(x, y - (r / 2), r / 2)  # lower_inner_circle
    midpoint_circle(x - (r / 2), y, r / 2)  # left_inner_circle
    
    # Four diagonal circles
    x0 = x + (math.sin(math.radians(45)) * (r / 2))
    y0 = y + (math.sin(math.radians(45)) * (r / 2))
    midpoint_circle(x0, y0, r / 2)  # right_upper diagonal
    
    x0 = x + (math.sin(math.radians(45)) * (r / 2))
    y0 = y - (math.sin(math.radians(45)) * (r / 2))
    midpoint_circle(x0, y0, r / 2)  # right_lower_diagonal
    
    x0 = x - (math.sin(math.radians(45)) * (r / 2))
    y0 = y - (math.sin(math.radians(45)) * (r / 2))
    midpoint_circle(x0, y0, r / 2)  # left_lower_diagonal
    
    x0 = x - (math.sin(math.radians(45)) * (r / 2))
    y0 = y + (math.sin(math.radians(45)) * (r / 2))
    midpoint_circle(x0, y0, r / 2)  # left_upper_diagonal

def screen():
    glColor3f(1, 0.4, 0.6)
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)
    glLoadIdentity()
    iterate()
    diagonals(0, 0, 325)  # Centered at (0,0) to match the ortho projection
    glutSwapBuffers()

# Initialize GLUT
glutInit()
glutInitDisplayMode(GLUT_RGBA)
glutInitWindowSize(768, 768)
glutInitWindowPosition(0, 0)
glutCreateWindow(b"Circle Pattern")
glutDisplayFunc(screen)
glutMainLoop()