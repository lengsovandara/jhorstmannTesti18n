# -jhorstmannTesti18n
## Building Application
1- Configure Maven
   
    
   
2- Generate POT file
    
    mvn i18n:gettext
This command will create a .pot file (PO Template) in the src/main/po

3- Generate PO files

    mvn i18n:init -Dlocale=en
This command use to create .po files and following by language code. you can also use i18n:merge to merge existing .po files.
    
4- Generate the java Resource bundle    
    
    mvn i18n:dist
This command line tool is use to generate Java resource bundle for translation.    
    
More information: please go to https://github.com/jhorstmann/i18n
