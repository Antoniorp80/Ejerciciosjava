#Ejerciciosjava Tema 3

##1. Show all the jpg pictures in the current directory.

´´´ console
ls *.jpg
´´´

##2. Display all the files in the directory /usr/bin starting with letter “j”.

´´´console
ls /usr/bin a*
´´´

##3. Show all the files in the directory /usr/bin starting with the letter “k”, with an “a”
in the 3rd place.

´´´ console
ls /usr/bin k?a
´´´

##4. Show all the files in the directory /bin ending with “n”.

'''console
ls /usr/bin *n
'''

##5. Display all the files in the directory /etc and all the files in every subdirectory
recursively.

´´´console
tree /etc
´´´

##6. In your home directory, create another directory named test. Copy the file gzip from
the directory /bin to test. Create a duplicate of gzip named gzip2 inside test.

´´´ console
mkdir /home/test
cp usr/bin/gzip /test
cp /test/gzip gzip2
´´´

##7. Change the name of the directory test to test2. Create test3 at the same level in
the directory tree as test2 and move all the files from test2 to test3. Delete test2.

´´´ console
move /test test2
mkdir /test3
move /test2/* /test3
rm /test2
´´´

##8. Create an empty file named “*?Hello all?*”. Can you? Is it a good idea to name a file
this way? Explain your answer.
Sí se puede.
No es buena idea porque a la hora de buscarlo va a ser muy complicado por lo que implican los comodines que contiene.

##9. Create a directory named multimedia_test and copy all the content from the
directory multimedia into it. Then, create two files in multimedia/video/, one
named films.txt and another named actors.txt. Edit the file films.txt and write
the title of your favourite movie. Then, create another file in multimedia_test/video/,
also named films.txt. Edit this file and now write the titles of your five favourite movies.
Copy of all the content of multimedia into multimedia_test ensuring that
only most recently modified versions of files remain.To check that
everything is ok, check if multimedia_test/video contains the empty file
actors.txt and the file films.txt contains 5 titles and not 1.


##10. Delete the directory multimedia/pictures/others. The system must ask for
confirmation.

no te deja borrarlo porque es un directorio con ficheros dentro, hay que hacer un borrado recursivo.

##11. Move the file films.txt, which is in multimedia/video, to the directory above,
at the same time renaming the file to my_films.txt.

´´´ console
mv /home/alumno/multimedia/video/ films.txt ../my_films.txt
´´´
