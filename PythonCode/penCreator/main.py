# A program to create a project file of a user entered name and if web dev is selected
# it creates index.html , css/style.css,scripts/main.js
# getting user input for project name ,directories needed and their sub-directories if any
# creating a directory for the project
# creating the index.html file
# creating css and css/style.css
# creating js and js/main.js
# on completion it a link and script tags to link to the html

import os


project_path="/Users/eugeneikonya/Desktop/WorkStation/web_dev"
project_name=""
dir_home=""

def getUserInput():
    project_name = input("Enter The Name of the pen" )
    dir_home = project_path + "/" + project_name
    print("The name of your pen is : " + dir_home)
    return dir_home


def getDirectory():
    current_directory=os.getcwd()
    print("The directory is : " + current_directory )

def changePath():
    getDirectory()
    os.chdir( project_path )
    getDirectory()

def createDirectory(dir_name_path):
    print("The directory name will be : " + dir_name_path)
    os.mkdir(dir_name_path)

def deleteDirectory(dir_name_path):
    os.remove(dir_name_path)
    print("file deleted")

def run_app():
    home_dir_path=getUserInput()
    changePath()
    createDirectory(home_dir_path)

deleteDirectory("/Users/eugeneikonya/Desktop/WorkStation/web_dev/we")
# run_app()
