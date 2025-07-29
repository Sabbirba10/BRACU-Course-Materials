from OpenGL.GL import *
from OpenGL.GLUT import *
from OpenGL.GLU import *
import time
import math
import numpy as np

def draw_points(x,y):
    glPointSize(5)
    glBegin(GL_POINTS)
    glVertex2f(x,y)
    glEnd()

def find_zone(x1,y1,x2,y2):
    dy = y2 - y1
    dx = x2 - x1
    if (abs(dx)>=abs(dy)): # Zone 0,3,4,7
        if (dx>=0 and dy>=0):
            return 0 # Zone 0
        elif (dx<=0 and dy>=0):
            return 3 # Zone 3
        elif (dx<=0 and dy<=0):
            return 4 # Zone 4
        else:
            return 7 # Zone 7
    else: # abs(dx) < abs(dy) represents Zone 1,2,5,6
        if (dx>=0 and dy>=0):
            return 1 # Zone 1
        elif (dx <= 0 and dy >= 0):
            return 2  # Zone 2
        elif (dx<=0 and dy<=0):
            return 5 # Zone 5
        else: # Zone 6
            return 6


def convert_to_zone0(zone,x,y):
    if zone == 0:
        return x,y
    elif zone == 1:
        return y,x
    elif zone == 2:
        return y,-x
    elif zone == 3:
        return -x,y
    elif zone == 4:
        return -x,-y
    elif zone == 5:
        return -y,-x
    elif zone == 6:
        return -y,x
    elif zone == 7:
        return x,-y


def convert_zone0_to_original_zone(zone,x,y):
    if zone == 0:
        return x,y
    elif zone == 1:
        return y,x
    elif zone == 2:
        return -y,x
    elif zone == 3:
        return -x,y
    elif zone == 4:
        return -x,-y
    elif zone == 5:
        return -y,-x
    elif zone == 6:
        return y,-x
    elif zone == 7:
        return x,-y


def midpoint_line(x1,y1,x2,y2,zone):   #(120, 150, 120, 60)
    dx = x2 - x1
    dy = y2 - y1
    d = (2 * dy) - dx
    del_E = 2 * dy
    del_NE = 2 * (dy - dx)
    x = x1
    y = y1

    while x <= x2:
        org_pointX, org_pointY = convert_zone0_to_original_zone(zone,x,y)
        draw_points(org_pointX, org_pointY)
        if (d>=0):
            x = x + 1
            y = y + 1
            d = d + del_NE
        else:
            x = x + 1
            d = d + del_E


def draw_line(x1,y1,x2,y2):
    dx = x2 - x1
    dy = y2 - y2

    zone = find_zone(x1,y1,x2,y2)

    newX1, newY1 = convert_to_zone0(zone,x1,y1)
    newX2, newY2 = convert_to_zone0(zone,x2,y2)

    midpoint_line(newX1,newY1,newX2,newY2,zone)

#==========================================================================
def Circlepoints(x, y,x0, y0):
    draw_points(x0 + x, y0 + y)
    draw_points(x0 + y, y0 + x)
    draw_points(x0 - x, y0 + y)
    draw_points(x0 - y, y0 + x)
    draw_points(x0-y, y0-x)
    draw_points(x0-x, y0-y)
    draw_points(x0+x, y0-y)
    draw_points(x0+y, y0-x)

def midPointCircleAlgorithm(x0, y0, radius):
  #Initial d
  d=1-radius
  x=0
  y=radius
  Circlepoints(x,y, x0,y0)

  while x < y:

      if d<0:
          #IF EAST
          d=d+2*x+3
          x=x+1
      else:
          #IF SOUTH
          d=d+2*x-2*y+5
          x=x+1
          y=y-1
      Circlepoints(x,y,x0,y0)


def draw_circle(x, y, r):
    midPointCircleAlgorithm(x, y, r)

#AnonXArka

#facial expressions

def happy():
    glColor3f(1, 0.5, 0)
    #face
    draw_line(80, 380, 80, 80)
    draw_line(80, 80, 420, 80)
    draw_line(420, 80, 420, 380)
    draw_line(80,380,420,380)

    draw_circle(200, 300, 20)  # left eye
    draw_circle(300,300,20)    #right eye

    draw_line(160, 185, 200, 150)  # mouth
    draw_line(200, 150, 300, 150)
    draw_line(300, 150,340, 185)
    draw_line(340, 185, 160, 185)
    time.sleep(1)

def sad():
    glColor3f(1, 0.5, 0)

    # face
    draw_line(80, 380, 420, 380)
    draw_line(80, 380, 80, 80)
    draw_line(80, 80, 420, 80)
    draw_line(420, 80, 420, 380)

    draw_circle(200, 300, 20)  # left eye
    draw_circle(300, 300, 20)  # right eye

    draw_line(200, 150, 300, 150)  #mouth
    draw_line(200,150,180,130)
    draw_line(300, 150, 320, 130)

def crying():
    glColor3f(1, 0.5, 0)

    # face
    draw_line(80, 380, 420, 380)
    draw_line(80, 380, 80, 80)
    draw_line(80, 80, 420, 80)
    draw_line(420, 80, 420, 380)

    draw_circle(200, 300, 20)  # left eye
    draw_circle(300, 300, 20)  # right eye

    draw_line(200, 150, 300, 150)  # mouth
    draw_line(200, 150, 180, 130)
    draw_line(300, 150, 320, 130)


    glColor3f(0.53, 0.81, 0.98)
    for y in range(280,76,-5):
        x1=190
        draw_points(x1,y)
        draw_points(x1+10, y)
        draw_points(x1+20, y)

        x2 = 290
        draw_points(x2, y)
        draw_points(x2 + 10, y)
        draw_points(x2 + 20, y)
        time.sleep(0.05)
        glutSwapBuffers()



def neutral():
    glColor3f(1, 0.5, 0)
    # draw_circle(240,240,190)
    draw_line(150, 300, 200, 300)  # left eye
    draw_line(300, 300, 350, 300)  #right eye

    # face
    draw_line(80, 380, 420, 380)
    draw_line(80, 380, 80, 80)
    draw_line(80, 80, 420, 80)
    draw_line(420, 80, 420, 380)

    draw_circle(200, 300, 20)  # left eye
    draw_circle(300, 300, 20)  # right eye

    draw_line(200, 150, 300, 150)  #mouth

def laughing():
    glColor3f(1, 0.5, 0)
    # draw_circle(240,240,190)
    draw_line(150,300,200,300)  # left eye
    draw_line(150,300,130, 270)
    draw_line(200,300,230,270)

    draw_line(300, 300, 350, 300)  #right eye
    draw_line(300, 300, 280, 270)
    draw_line(350, 300, 380, 270)

    # face
    draw_line(80, 380, 420, 380)
    draw_line(80, 380, 80, 80)
    draw_line(80, 80, 420, 80)
    draw_line(420, 80, 420, 380)

    # draw_circle(200, 300, 20)  # left eye
    # draw_circle(300, 300, 20)  # right eye


    draw_line(200, 150, 300, 150)  # mouth
    draw_line(330, 185, 300, 150)
    draw_line(195, 150, 160, 185)
    draw_line(160, 185, 330, 185)


def smirk():
    glColor3f(1, 0.5, 0)
    # draw_circle(240,240,190)
    draw_line(150, 300, 200, 300)  # left eye
    draw_line(300, 300, 350, 300)  # right eye

    # face
    draw_line(80, 380, 420, 380)
    draw_line(80, 380, 80, 80)
    draw_line(80, 80, 420, 80)
    draw_line(420, 80, 420, 380)

    draw_circle(200, 300, 20)  # left eye
    draw_circle(300, 300, 20)  # right eye

    draw_line(190, 170, 300, 140)  # mouth
def remove(fx1,fy1,fx2,fy2,fx3,fy3,fx4,fy4,ex1,ey1,r1,ex2,ey2,r2,mx1,my1,mx2,my2,mx3,my3,mx4,my4):
    glColor3f(0, 0, 0)
    # face
    draw_line(fx1, fy1, fx2,fy2)
    draw_line(fx2, fy2, fx3, fy3)
    draw_line(fx3, fy3, fx4, fy4)
    draw_line(fx4, fy4, fx1, fy1)


    draw_circle(ex1, ey1, r1)  # left eye
    draw_circle(ex2, ey2, r2)  # right eye

    draw_line(mx1, my1, mx2, my2)  # mouth
    draw_line(mx2, my2, mx3, my3)
    draw_line(mx3, my3,mx4, my4)
    draw_line(mx4, my4, mx1, my1)

def  rotate(theta):
    remove(80,380,80,80,420,80,420,380,200,300,20,300,300,20,160,185,200,150,300,150,340,185)
    a = math.cos(math.radians(theta)) #cos theta
    b = math.sin(math.radians(theta)) #sin theta

    r = np.array([[a, -b, 0],
                  [b, a, 0],
                  [0, 0, 1]])
    v1 = np.array([[-170],  # for corners anti clock wise
                   [150],
                   [1]])
    v2 = np.array([[-170],
                   [-150],
                   [1]])
    v3 = np.array([[170],
                   [-150],
                   [1]])
    v4 = np.array([[170],
                   [150],
                   [1]])
    # rotation
    v11 = np.matmul(r, v1)
    v22 = np.matmul(r, v2)
    v33 = np.matmul(r, v3)
    v44 = np.matmul(r, v4)
    glColor3f(1, 0.5, 0)
    x11 = v11[0][0] + 250
    y11 = v11[1][0] + 230
    x22 = v22[0][0] + 250
    y22 = v22[1][0] + 230
    x33 = v33[0][0] + 250
    y33 = v33[1][0] + 230
    x44 = v44[0][0] + 250
    y44 = v44[1][0] + 230

    draw_line(x11, y11, x22, y22)  # face
    draw_line(x22, y22, x33, y33)
    draw_line(x33, y33, x44, y44)
    draw_line(x44, y44, x11, y11)
#========================================
    eye1 = np.array([[200],
                     [300],
                     [1]])
    eye2 = np.array([[300],
                     [300],
                     [1]])
    eye1_x = (((x11 + x44) - 360) / 2)
    eye1_y = (((y11 + y22) - 350) / 2)
    eye2_x = (((x11 + x44) - 360) / 2)
    eye2_y = ((y11 + y22) - 400 / 2)
    t1 = np.array([[1, 0, eye1_x],
                   [0, 1, eye1_y],
                   [0, 0, 1]])
    t2 = np.array([[1, 0, eye2_x],
                   [0, 1, eye2_y],
                   [0, 0, 1]])

    e11 = np.matmul(t1, eye1)
    e22 = np.matmul(t2, eye2)
    ex1 = e11[0][0]
    ey1 = e11[1][0]
    ex2 = e22[0][0]
    ey2 = e22[1][0]
#=================================================
    m1 = np.array([[-90],  # for corners anti clock wise
                   [-45],
                   [1]])
    m2 = np.array([[-50],
                   [-80],
                   [1]])
    m3 = np.array([[50],
                   [-80],
                   [1]])
    m4 = np.array([[90],
                   [-45],
                   [1]])
    m11 = np.matmul(r, m1)
    m22 = np.matmul(r, m2)
    m33 = np.matmul(r, m3)
    m44 = np.matmul(r, m4)

    mx11 = m11[0][0] + 250
    my11 = m11[1][0] + 230
    mx22 = m22[0][0] + 250
    my22 = m22[1][0] + 230
    mx33 = m33[0][0] + 250
    my33 = m33[1][0] + 230
    mx44 = m44[0][0] + 250
    my44 = m44[1][0] + 230

    draw_line(mx11, my11, mx22, my22)  # mouth
    draw_line(mx22, my22, mx33, my33)
    draw_line(mx33, my33, mx44, my44)
    draw_line(mx44, my44, mx11, my11)
#==================================================
    if theta==45:
        draw_circle(ex1, ey1, 20) #eye
        draw_circle(ex2, ey2, 20)
    else:
        ex1=ex1-120
        ey1= ey1-150
        ex2= ex2-120
        ey2= ey2-570
        draw_circle(ex1, ey1, 20)  # eye
        draw_circle(ex2, ey2, 20)

    time.sleep(1) #1 sec pause
    glutSwapBuffers()
    remove(x11,y11,x22,y22,x33,y33,x44,y44,ex1,ey1,20,ex2,ey2,20,mx11,my11,mx22,my22,mx33,my33,mx44,my44)
    happy()
    time.sleep(1)  # 1 sec pause
    glutSwapBuffers()
    #remove(80, 380, 80, 80, 420, 80, 420, 380, 200, 300, 20, 300, 300, 20, 160, 185, 200, 150, 300, 150, 340, 185)
    rotate(-theta)





def iterate():
    glViewport(0, 0, 500, 500)
    glMatrixMode(GL_PROJECTION)
    glLoadIdentity()
    glOrtho(0.0, 500, 0.0, 500, 0.0, 1.0)
    glMatrixMode(GL_MODELVIEW)
    glLoadIdentity()


def showScreen():
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT)
    glLoadIdentity()
    iterate()
    glColor3f(1.0, 1.0, 0.0) #konokichur color set (RGB)
    #call the draw methods here



    print("################\nFacial expression based on current emotion: 1 ) Happy \n 2) Sad \n 3) Crying 4) Neutral 5) Laughing 6) Smirk 7) Rotating Joker Face trying to more laugh (Animated) ")

    x = int(input("What's your emotion right now? Enter : "))
    if x == 1:
        happy()
    elif x == 2:
        sad()
    elif x == 3:
        crying()
    elif x == 4:
        neutral()
    elif x == 5:
        laughing()
    elif x ==6:
        smirk()

    elif x==7:
        happy()
        time.sleep(1)
        glutSwapBuffers()
        rotate(45)
        glutSwapBuffers()

    else:
        print("try again")




    glutSwapBuffers()



glutInit()
glutInitDisplayMode(GLUT_RGBA)
glutInitWindowSize(500, 500) #window size
glutInitWindowPosition(0, 0)
wind = glutCreateWindow(b"OpenGL Coding Practice") #window name
glutDisplayFunc(showScreen)

glutMainLoop()