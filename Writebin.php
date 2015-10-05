<?php
        $filename = "C:/Users/Fortesys/Desktop/AhmadFauzi.bin";
        $myfile = fopen($filename, "wb") or die("Unable to open file!");
        $a = "Name: AHMAD FAUZI BIN AHMAD SOFI\n";
        fwrite($myfile, $a);
        $b = "Matrix: 2014444074\n";
        fwrite($myfile, $b);
        $c = "Age: 26\n";
        fwrite($myfile, $c);
        $d = "Email: paskal889@gmail.com\n";
        fwrite($myfile, $d);
        $e = "Mobile Phone : 019-5663029\n";
        fwrite($myfile, $e);
        $f = "Student : UITM SHAH ALAM\n";
        fwrite($myfile, $f);
        fclose($myfile);
        echo 'Writing Binary File Done';
                

