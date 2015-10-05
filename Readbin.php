<?php
$filename = "C:/Users/Fortesys/Desktop/AhmadFauzi.bin";
$myfile = fopen($filename, "rb") or die("Unable to open file!");
$theData = fread($myfile,filesize($filename));
fclose($myfile);
//echo bin2hex($theData);
echo $theData;