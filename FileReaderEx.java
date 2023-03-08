package com.ktg.io;
import java.io.*;
class FileReaderEx
{
public static void main(String args[])throws IOException
{
FileReader fr1=new FileReader("ktg1.txt");//FNFE
int i=fr1.read();//size 3 abc -1
while(i !=-1)//eof the file ==> -1
{
System.out.println((char)i);
i=fr1.read();
}
}}