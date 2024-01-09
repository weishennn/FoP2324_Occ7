package lab7;

import java.io.*;
public class L7Q5 {
    public static void main(String[] args) {
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.dat"));
            int input = inputStream.readInt();
            int [] index = new int[input];
            String [] name = new String[input];
            int [] age = new int[input];
            char [] gender = new char[input];
            int indexTemp;

            for (int i=0; i<input;i++){
                index[i]=i;
                name[i]= inputStream.readUTF();
                age[i]=inputStream.readInt();
                gender[i]=inputStream.readChar();
            }
            for(int i =0;i<index.length;i++){
                for(int j=i+1;j<index.length;j++){
                    if(name[index[i]].compareTo(name[index[j]])>0){
                        indexTemp = index[i];
                        index[i]=index[j];
                        index[j]=indexTemp;
                    }
                }
            }

            for(int i =0;i<index.length;i++) {
                System.out.printf("%s ,%d ,%c \n", name[index[i]], age[index[i]], gender[index[i]]);
            }
            inputStream.close();
        }catch (IOException e){
            System.out.println("Problem with file output");
        }
    }
}