package com.zy.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class InputStreamTest {

	@Test
	public void testFileInputStream() {

		String content = "this is test\n";
		
		File file = new File("/Users/wanglei/我的文档/vim笔记/a.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try(FileOutputStream output = new FileOutputStream(file,true);
				FileInputStream input = new FileInputStream(file);
				){
		//true 开启append 模式
		output.write(content.getBytes());
		int byteread;
        byte[] tempbytes = new byte[100];

		while ((byteread=input.read(tempbytes))!=-1) {
			System.out.println(new String(tempbytes));
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testDataFileInputStream() {
		DataOutputStream out = null;
        try {
            File file = new File("/Users/wanglei/我的文档/vim笔记/a.txt");
            out = new DataOutputStream(new FileOutputStream(file));
            
            out.writeBoolean(true);
            out.writeByte((byte)0x41);
            out.writeChar((char)0x4243);
            out.writeShort((short)0x4445);
            out.writeInt(0x12345678);
            out.writeLong(0x0FEDCBA987654321L);
            out.writeUTF("abcdefg");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch(IOException e) {
            }
        }

	}
	
	@Test
	public void testDataInputStream() {
		 DataInputStream in = null;
	        try {
	            File file = new File("/Users/wanglei/我的文档/vim笔记/a.txt");
	            in = new DataInputStream(new FileInputStream(file));
	 
	            System.out.printf("readBoolean():%s\n", in.readBoolean());
	            System.out.printf("readByte():0x%s\n", in.readByte());
	            System.out.printf("readChar():0x%s\n", in.readChar());
	            System.out.printf("readShort():0x%s\n", in.readShort());
	            System.out.printf("readInt():0x%s\n", Integer.toHexString(in.readInt()));
	            System.out.printf("readLong():0x%s\n", Long.toHexString(in.readLong()));
	            System.out.printf("readUTF():%s\n", in.readUTF());
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (SecurityException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                in.close();
	            } catch(IOException e) {
	            }
	        }

	}

	@Test
	public void testjavaidfile(){

		System.out.println(System.getProperty("java.io.tmpdir"));
	}
}
