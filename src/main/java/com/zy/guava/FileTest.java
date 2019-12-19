package com.zy.guava;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import org.junit.Test;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.google.common.io.MoreFiles;
import com.google.common.io.RecursiveDeleteOption;

public class FileTest {
	
	private String sourcePath = "/Users/wanglei/Downloads/jpg的副本";
	private String sourcePath2 = "/Users/wanglei/Downloads/jpg/团队1.JPG";

	@Test
	public void testNioDeleteFile() throws IOException {
		java.nio.file.Files.deleteIfExists(Paths.get(sourcePath));
		java.nio.file.Files.delete(Paths.get(sourcePath));
	}
	
	@Test
	public void testGuavaDeleteFiles() throws IOException {
		//允许不安全的删除
		MoreFiles.deleteRecursively(Paths.get(sourcePath),RecursiveDeleteOption.ALLOW_INSECURE);
	}
	
	@Test
	public void testReadFile() throws IOException {
		List<String> list = Files.readLines(new File(sourcePath2), Charsets.UTF_8);
		System.out.println(list.size());
	}
	
}
