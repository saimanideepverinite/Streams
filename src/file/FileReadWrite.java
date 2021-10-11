package file;

	import java.io.*;
	import java.util.Scanner;

	public class FileReadWrite {
	    private static void FWriter(File file) {
	        FileWriter fw= null;
	        try {
	            fw = new FileWriter(file);
	            BufferedWriter bw=new BufferedWriter(fw);
	            fw.append("File Writing is Started \n");
	            fw.flush();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        System.out.println("enter Something to be write on the File ");
	        Scanner sc=new Scanner(System.in);
	        try {
	            fw.write(sc.nextLine());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        try {
	            fw.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	//end of file writter method
	    private static boolean checkFile(File file) {
	        try {
	            if(file.createNewFile())
	            {
	                return true;
	            }
	            else if(file.exists())
	            {
	                return  true;
	            }else
	            {
	                return false;
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        return false;
	    }
	    //Main Method
	    public static void main(String[] args) {
	        File file= new File("newfile.txt");
	        if (checkFile(file))
	        {
	            FWriter(file);
	            System.out.println("contents on the File ");
	            FReader(file);
	        }
	    }
	    private static void FReader(File file) {
	        try {
	            FileReader fr=new FileReader(file);
	            BufferedReader br=new BufferedReader(fr);
	            int value;
	            while ((value= br.read())!=-1)
	            {
	                System.out.print((char)value);
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();

	        }
	    }
	}

