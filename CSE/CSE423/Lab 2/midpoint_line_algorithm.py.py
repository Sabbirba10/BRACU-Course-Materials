from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *

def draw_points(x, y):
    glPointSize(5)  # pixel size. by default 1 thake
    glBegin(GL_POINTS)
    glVertex2f(x, y)  # jekhane show korbe pixel
    glEnd()

def iterate():
    glViewport(0, 0, 500, 500)
    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    glOrtho(0.0, 500, 0.0, 500, 0.0, 1.0)
    glMatrixMode(GL_MODELVIEW)
    glLoadIdentity()

def find_zone(dx, dy):
    zone = 0
    if abs(dy) > abs(dx):
        if dx >= 0 and dy >= 0:
            zone = 1
        elif dx <= 0 and dy >= 0:
            zone = 2
        elif dx <= 0 and dy <= 0:
            zone = 5
        elif dx >= 0 and dy <= 0:
            zone = 6
    else:
        if dx >= 0 and dy >= 0:
            zone = 0
        elif dx <= 0 and dy >= 0:
            zone = 3
        elif dx <= 0 and dy <= 0:
            zone = 4
        elif dx >= 0 and dy <= 0:
            zone = 7
    return zone

def zone_convert(x, y, zone):
    new_x = x
    new_y = y
    if zone == 1:
        new_x = y
        new_y = x
    elif zone == 2:
        new_x = -y
        new_y = x
    elif zone == 3:
        new_x = -x
        new_y = y
    elif zone == 4:
        new_x = -x
        new_y = -y
    elif zone == 5:
        new_x = -y
        new_y = -x
    elif zone == 6:
        new_x = -y
        new_y = x
    elif zone == 7:
        new_x = x
        new_y = -y
    return new_x, new_y

def midpoint_algo(x1, y1, x2, y2):
    dx = x2 - x1
    dy = y2 - y1
    zone = find_zone(dx, dy)

    zone0_start_points = zone_convert(x1, y1, zone)
    x = zone0_start_points[0]
    y = zone0_start_points[1]

    zone0_end_points = zone_convert(x2, y2, zone)
    x2 = zone0_end_points[0]
    y2 = zone0_end_points[1]

    dx = x2 - x
    dy = y2 - y
    d_old = 2 * dy - dx
    d_NE = 2 * (dy - dx)
    d_E = 2 * dy

    while x <= x2:
        original_zone_points = zone_convert(x, y, zone)
        draw_points(original_zone_points[0], original_zone_points[1])

        if d_old < 0:
            d_old = d_old + d_E
            x += 1
        else:
            d_old = d_old + d_NE
            x += 1
            y += 1

def showScreen():
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)
    glLoadIdentity()
    iterate()
    glColor3f(0.0, 1.0, 0.0)
    
    # Draw the second last digit of student ID
    if student_id[-2] == "0":
        midpoint_algo(100, 200, 100, 400)
        midpoint_algo(100, 400, 200, 400)
        midpoint_algo(200, 400, 200, 200)
        midpoint_algo(100, 200, 200, 200)
    elif student_id[-2] == "1":
        midpoint_algo(150, 200, 150, 400)
    elif student_id[-2] == "2":
        midpoint_algo(100, 400, 200, 400)
        midpoint_algo(200, 400, 200, 300)
        midpoint_algo(100, 200, 100, 300)
        midpoint_algo(100, 200, 200, 200)
        midpoint_algo(100, 300, 200, 300)
    elif student_id[-2] == "3":
        midpoint_algo(100, 400, 200, 400)
        midpoint_algo(200, 400, 200, 200)
        midpoint_algo(100, 200, 200, 200)
        midpoint_algo(100, 300, 200, 300)
    elif student_id[-2] == "4":
        midpoint_algo(100, 300, 100, 400)
        midpoint_algo(100, 300, 200, 300)
        midpoint_algo(200, 400, 200, 200)
    elif student_id[-2] == "5":
        midpoint_algo(100, 400, 200, 400)
        midpoint_algo(200, 300, 200, 200)
        midpoint_algo(100, 200, 200, 200)
        midpoint_algo(100, 300, 200, 300)
        midpoint_algo(100, 300, 100, 400)
    elif student_id[-2] == "6":
        midpoint_algo(100, 400, 200, 400)
        midpoint_algo(200, 300, 200, 200)
        midpoint_algo(100, 200, 200, 200)
        midpoint_algo(100, 300, 200, 300)
        midpoint_algo(100, 200, 100, 400)
    elif student_id[-2] == "7":
        midpoint_algo(100, 400, 200, 400)
        midpoint_algo(200, 400, 200, 200)
    elif student_id[-2] == "8":
        midpoint_algo(100, 400, 200, 400)
        midpoint_algo(200, 400, 200, 200)
        midpoint_algo(100, 200, 200, 200)
        midpoint_algo(100, 300, 200, 300)
        midpoint_algo(100, 200, 100, 400)
    elif student_id[-2] == "9":
        midpoint_algo(100, 400, 200, 400)
        midpoint_algo(200, 400, 200, 200)
        midpoint_algo(100, 200, 200, 200)
        midpoint_algo(100, 300, 200, 300)
        midpoint_algo(100, 300, 100, 400)
    
    # Draw the last digit of student ID
    if student_id[-1] == "0":
        midpoint_algo(250, 200, 250, 400)
        midpoint_algo(250, 400, 350, 400)
        midpoint_algo(350, 400, 350, 200)
        midpoint_algo(250, 200, 350, 200)
    elif student_id[-1] == "1":
        midpoint_algo(300, 200, 300, 400)
    elif student_id[-1] == "2":
        midpoint_algo(250, 400, 350, 400)
        midpoint_algo(350, 400, 350, 300)
        midpoint_algo(250, 200, 250, 300)
        midpoint_algo(250, 200, 350, 200)
        midpoint_algo(250, 300, 350, 300)
    elif student_id[-1] == "3":
        midpoint_algo(250, 400, 350, 400)
        midpoint_algo(350, 400, 350, 200)
        midpoint_algo(250, 200, 350, 200)
        midpoint_algo(250, 300, 350, 300)
    elif student_id[-1] == "4":
        midpoint_algo(250, 300, 250, 400)
        midpoint_algo(250, 300, 350, 300)
        midpoint_algo(350, 400, 350, 200)
    elif student_id[-1] == "5":
        midpoint_algo(250, 400, 350, 400)
        midpoint_algo(350, 300, 350, 200)
        midpoint_algo(250, 200, 350, 200)
        midpoint_algo(250, 300, 350, 300)
        midpoint_algo(250, 300, 250, 400)
    elif student_id[-1] == "6":
        midpoint_algo(250, 400, 350, 400)
        midpoint_algo(350, 300, 350, 200)
        midpoint_algo(250, 200, 350, 200)
        midpoint_algo(250, 300, 350, 300)
        midpoint_algo(250, 200, 250, 400)
    elif student_id[-1] == "7":
        midpoint_algo(250, 400, 350, 400)
        midpoint_algo(350, 400, 350, 200)
    elif student_id[-1] == "8":
        midpoint_algo(250, 400, 350, 400)
        midpoint_algo(350, 400, 350, 200)
        midpoint_algo(250, 200, 350, 200)
        midpoint_algo(250, 300, 350, 300)
        midpoint_algo(250, 200, 250, 400)
    elif student_id[-1] == "9":
        midpoint_algo(250, 400, 350, 400)
        midpoint_algo(350, 400, 350, 200)
        midpoint_algo(250, 200, 350, 200)
        midpoint_algo(250, 300, 350, 300)
        midpoint_algo(250, 300, 250, 400)
    
    glutSwapBuffers()

# Get student ID input
student_id = input("Please Enter Your Student ID: ")

# Initialize GLUT
glutInit()
glutInitDisplayMode(GLUT_RGBA)
glutInitWindowSize(500, 500)  # window size
glutInitWindowPosition(0, 0)
wind = glutCreateWindow(b"Midpoint Line Algo")  # window name
glutDisplayFunc(showScreen)
glutMainLoop()